package pack1;

public class Ex2Main {

	public static void main(String[] args) {
		// getter, setter 연습
		System.out.println("프로그램을 실행하다가...");
		
		// Ex2Car 객체를 만들기
		System.out.println();
		Ex2Car tom = new Ex2Car();
		tom.showData();       // 기본 속도는 10, 생성자 부분 speed = 10 
		System.out.println("이름은 " + tom.irum);
		tom.irum = "미스터 톰";   // private이 아니므로 접근 가능
		System.out.println("이름은 " + tom.irum);
		
		System.out.println("\n겟터, 셋터 확인");
		//tom.speed = 80;   // private이므로 접근 불가, 보안 강화를 이유로 -> Ex2Car의 abcd 함수 참조(외부에서 speed에 접근을 가능케 함)
		tom.setSpeed(80);  // abcd()는 public이라 접근이 가능 -> 값을 80을 할당하여 private 변수인 speed 값을 변경
		//tom.abcd(80, 123)  예를 들어, 비밀번호에 의해 수정 결정
		tom.showData();   // 속도 값이 80으로 변경된 것을 확인할 수 있음.
		System.out.println("속도는 " + tom.getSpeed()); 
		int result = tom.getSpeed();
		System.out.println("속도는 " + result); 
		
		System.out.println("\n");
		
	}

}
