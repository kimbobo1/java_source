package pack3;

//자동차가 가져야할 기본 멤버를 선언한 자원 클래스
//다른클래스 포함 또는 상속 통해 자원을 사용할수 있다.


public class Ex15PolyCar {   ///protected  부모클래스
	protected int speed = 50;
	public Ex15PolyCar() {
		System.out.println("나는 자동차 원형 클래스");
	}
	
	public void displaySpeed() {
		
		System.out.println("속도 :"+ speed);
		}
	public int getSpeed() {
		return speed;
	
	}

}
