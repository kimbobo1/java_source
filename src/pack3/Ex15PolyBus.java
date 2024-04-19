package pack3;

public class Ex15PolyBus extends Ex15PolyCar{
	private int passenger = 10;
	
	public void show() {   //Ex15PolyBus 고유 메소드
		System.out.println("버스");
	}
	
	@Override // 어노테이션, 메타데이터 : 컴파일러에 다양한 정보를 알려주는 역할
	public void displaySpeed() {
		System.out.println("버스 승객 수는 " + passenger);
		System.out.println("버스의 속도는 " + speed);
	}
}
