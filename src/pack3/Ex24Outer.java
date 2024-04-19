package pack3;

import java.awt.Frame;
import java.awt.event.WindowAdapter;

// 내부 클래스
// 클래스에 멤버로 필드와 메소드, 클래스를 사용할 수 있다.
// 추가적으로 특정 클래스 내에서 클래스를 선언해서 사용할 수 있는데 이를 내부 클래스라고 한다.
// 내부 클래스는 독립적으로 인스턴스할 수 없다. 내부 클래스를 포함한 외부 클래스에 의해 통제된다.
public class Ex24Outer {
	private int a;
	private Inner inner;  // 포함관계처럼 넣어줌
	
	public Ex24Outer() {
		System.out.println("Outer 생성자");
		a = 10;
		inner = new Inner();  // Outer 생성자를 통해 내부에 Inner 생성자 호출 가능 // 내부 클래스는 외부 클래스를 통해 인스턴스한다.
	}
	
	public void aa() {
		System.out.println("외부에 있는 aa 메소드 실행");
		bb();  // aa() 메소드와 동급 메소드 호출.
		inner.cc();  // cc() 메소드는 내부 클래스의 멤버, 객체 변수의 이름을 통해 호출
		System.out.println("1. Outer의 a : " + a + ", Inner의 b : " + inner.b);
	}
	
	public void bb() {
		System.out.println("외부에 있는 bb 메소드 처리");
	}
	
	public class Inner {  // 내부 클래스
		private int b;
		
		public Inner() {
			System.out.println("Inner 생성자");
			b = 20;
		}
		
		public void cc() {
			System.out.println("내부 클래스에 있는 cc 메소드 처리");
			bb();  // outer의 bb는 자유롭게 호출 가능, 내부 클래스는 외부 클래스의 멤버를 자유롭게 호출 가능
			System.out.println("2. Outer의 a : " + a + ", Inner의 b : " + b); 
		}
		
		public class InnerInner {   // 내부 클래스에서 다시 내부 클래스를 선언 가능
			
		}
	}
	
	// 내부 클래스의 수 만큼 extends를 사용할 수 있다.
	public class Inner2 extends Frame {   // 내부 클래스
		
	}
	
	public class Inner3 extends WindowAdapter {
		
	}
}
