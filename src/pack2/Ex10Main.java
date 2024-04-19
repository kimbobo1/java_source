package pack2;

public class Ex10Main {

	public static void main(String[] args) {
		// 클래스의 포함관계 연습
		Ex10PohamCar tom = new Ex10PohamCar("미스터 톰");
		tom.playCarTurnHandle(30);  // 30 양수를 들고 pohamcar로 이동 -> playCarTrnHandle의 파라미터로 30이 들어감
		System.out.println(tom.ownerName + "의 회전량은 " + tom.turnMessageShow + ", 회전량 " + tom.handle.quantity);  // 포함관계
		
		tom.playCarTurnHandle(-20);  // -20 음수를 들고 pohamcar로 이동 -> playCarTrnHandle의 파라미터로 30이 들어감
		System.out.println(tom.ownerName + "의 회전량은 " + tom.turnMessageShow + ", 회전량 " + tom.handle.quantity);
		
		System.out.println();   // 새로운 객체 james
		Ex10PohamCar james = new Ex10PohamCar("제임스 삼촌");
		james.playCarTurnHandle(0);  // 30 양수를 들고 pohamcar로 이동 -> playCarTrnHandle의 파라미터로 30이 들어감
		System.out.println(james.ownerName + "의 회전량은 " + james.turnMessageShow + ", 회전량 " + james.handle.quantity);
	}

}
