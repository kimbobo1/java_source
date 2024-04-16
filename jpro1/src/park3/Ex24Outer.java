package park3;

import java.awt.Frame;
import java.awt.event.WindowAdapter;

//내부 클래스
//클래스의 멤버로 필드,메소드,클래스를 사용할수 있다.
//추가적으로 특정 클래스 내에서 클래스를 선언 해서 사용할수 있는데 이를 내부 클래스라고 한다.
//내부 클래스는 독립적으로 인스턴스 할수없다. 내부 클래스를 포함한 외부 클래스에 의해 통제된다.

public class Ex24Outer {
	private int a;
	private Inner inner;
	
	public Ex24Outer() {
		System.out.println("Outer 생성자");
		a=10;
		inner = new Inner();// 내부 클래스는 외부 클래스를 통해 인스턴스 한다.
	}
	public void aa() {
		System.out.println("외부에 있는 aa 메소드 실행");
		bb();  //aa와 동급 메소드 호출
		inner.cc(); //cc메소드는 내부 클래스의 멤버 
		System.out.println("1outer의 a :" + a+ ",inner b:"+inner.b);
	}
	public void bb() {
		System.out.println("외부의 있는 bb 메소드 처리");
	}
	
	public class Inner{//내부 클래스
		private int b;
		
		public Inner() {
			System.out.println("Inner 생성자");
			b = 20;
		}
		public void cc() {
			System.out.println("내부의 있는 cc 메소드 처리");
			bb(); //내부 클래스는 외부 클래스의 멤버를 자유롭게 호출 가능하다.  
			System.out.println("2outer의 a :" + a+ ",inner b:"+ b);
		
		}
		public class InnerInner{//내부클래스 내에서 다시 내부 클래스를 선언 가능
			
		}
		
	}
	public class Inner2 extends Frame{
		
	}
	public class Inner3 extends WindowAdapter{
		
	}

}
