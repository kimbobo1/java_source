package pack2;

public class Ex10PohamHandle {    // 부품 클래스
	int quantity;   // 자동차의 회전량(얼마나 핸들을 꺾었는지)
	
	public Ex10PohamHandle() {
		quantity = 0;
	}
	
	String leftTurn(int q) {
		quantity = q;  // 음수인 경우
		return "좌회전"; 
	}
	String rightTurn(int quantity) {
		this.quantity = quantity;    // 양수인 경우
		return "우회전";
	}
	String straight(int quantity) {
		this.quantity = quantity;
		return "직진";
	}
}
