package pack3;

import pack3.Ex24Outer.Inner;

public class Ex24Main {

	public static void main(String[] args) {
		// 내부 클래스 연습용
		Ex24Outer outer = new Ex24Outer();
		outer.aa();
		outer.bb();
		//outer.cc();   // cc 메소드는 inner이므로 보이지 않음
		
		System.out.println();
		//Inner inner = new Inner();  // 자체적으로 new 할 수 없음   // 내부 클래스는 독립적인 인스턴스 불가
		
		// 아래의 소스는 수행은 가능하나 현실적으로 사용하지 않는다.
//		Ex24Outer.Inner inner = outer.new Inner(); // Outer 클래스의 내부 클래스는 닷을 사용하여 접근 가능
//		inner.cc();
		
		System.out.println("%%%%%%%%%%%%%");
		outer.aa();
	}

}
