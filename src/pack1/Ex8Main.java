package pack1;

import java.time.LocalDate;

public class Ex8Main {

	public static void main(String[] args) {
		// 싱클톤 패턴 연습
		Ex8SingletonClass s1 = new Ex8SingletonClass();
		System.out.println(s1.kor);
		
		Ex8SingletonClass s2 = new Ex8SingletonClass();
		System.out.println(s2.kor);
		
		System.out.println(s1 + " " + s2);   // 주소가 다르다. new 하면 인스턴스가 달라지므로 주소가 다르다.
		System.out.println(s1.hashCode() + " " + s2.hashCode());
		
		System.out.println();
		Ex8SingletonClass s3 = Ex8SingletonClass.getInstance();  //Ex8SingletonClass 클래스에서 자체적으로 new 하고 객체 변수 반환
		System.out.println(s3.kor);
		
		Ex8SingletonClass s4 = Ex8SingletonClass.getInstance();  
		System.out.println(s4.kor);
		
		System.out.println(s3.hashCode() + " " + s4.hashCode());  // 같은 객체를 참조
		
		System.out.println("날짜 출력 싱글톤 사용 예");
		LocalDate mynow = LocalDate.now();
		LocalDate mynow2 = LocalDate.now();
		System.out.println(mynow.hashCode() + " " + mynow2.hashCode());
		System.out.println(mynow2.getYear());
		
	}

}
