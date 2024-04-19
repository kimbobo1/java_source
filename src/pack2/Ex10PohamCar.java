package pack2;

public class Ex10PohamCar {
	// 여러 개의 부품이 모인 완성차 설계도
	int speed = 0;
	String ownerName, turnMessageShow;
	Ex10PohamHandle handle; // 포함관계, 클래스를 멤버로 사용함.  // 객체가 만들어지지 않은 상태, 그러므로 Ex10PohamCar 생성자에서는 사용할 수 없음.  // 부품 클래스를 자신의 멤버처럼 사용
	
	public Ex10PohamCar() {
		//this("하하");  // 13행을 실행
	}
	
	public Ex10PohamCar(String name) {
		ownerName = name;
		handle = new Ex10PohamHandle();     // 클래스의 포함 관계에 해당.(has-a 관계) // PohamCar 내부에서 handle 생성자 호출하여 handle 클래스 접근  
	}
	
	public void playCarTurnHandle(int q) {  // q : 핸들 회전량
		if(q > 0) {
			turnMessageShow = handle.rightTurn(q);
		} else if(q < 0) {
			turnMessageShow = handle.leftTurn(q);
		} else {
			turnMessageShow = handle.straight(q);
		}
	}
}
