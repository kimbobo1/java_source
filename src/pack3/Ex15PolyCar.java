package pack3;

// 자동차가 가져야 할 기본 멤버를 선언한 자원 클래스
// 다른 클래스 포함 또는 상속을 통해 자원을 사용할 수 있다.

public class Ex15PolyCar {
	protected int speed = 50;  // 부모 클래스로 사용하는 거구나 protected
	
	public Ex15PolyCar() {
		System.out.println("나는 자동차 원형(수퍼) 클래스~~~");
	}
	
	public void displaySpeed() {
		System.out.println("속도 : " + speed);
	}
	
	public int getSpeed() {
		return speed;
	}
}
