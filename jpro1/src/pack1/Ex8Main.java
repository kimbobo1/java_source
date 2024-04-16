package pack1;

import java.time.LocalDate;

public class Ex8Main {

	public static void main(String[] args) {
		//싱글톤 패턴 연습
		Ex8SingletonClass s1 = new Ex8SingletonClass();
		System.out.println(s1.kor);
		
		Ex8SingletonClass s2 = new Ex8SingletonClass();
		System.out.println(s2.kor);
		
		System.out.println(s1 + " " + s2);
		System.out.println(s1.hashCode()+" "+ s2.hashCode()); //16진수로 찍을거면 hashcode
		
		System.out.println();
		Ex8SingletonClass s3 = Ex8SingletonClass.getInstance();
		System.out.println(s3.kor);
		
		Ex8SingletonClass s4 = Ex8SingletonClass.getInstance();
		System.out.println(s4.kor);
		
		System.out.println(s3.hashCode()+" "+ s4.hashCode());
		
		System.out.println("날짜 출력 싱글톤 사용 예");
		LocalDate mynow = LocalDate.now(); //스태틱 타입   대문자가없어 final이 아니다~
		LocalDate mynow2 = LocalDate.now();
		System.out.println(mynow.hashCode()+ " "+ mynow2.hashCode());
		System.out.println(mynow2.getYear());
		
		System.out.println();
		


	}

}
