package pack2;

public class Ex10carMain {

	public static void main(String[] args) {
		//클래스의 포함관계 연습
		Ex10pohamCar tom = new Ex10pohamCar("미스터 보");
		tom.playCarTurnHandle(30);
		System.out.println(tom.ownerName+ "의 회전량은 " + tom.turnMessageshow + " " + tom.handle.quantity);
		tom.playCarTurnHandle(-20);
		System.out.println(tom.ownerName+ "의 회전량은 " + tom.turnMessageshow + " " + tom.handle.quantity);
		
		System.out.println();
		Ex10pohamCar kim = new Ex10pohamCar("미스터 킴");
		kim.playCarTurnHandle(0);
		System.out.println(kim.ownerName+ "의 회전량은 " + kim.turnMessageshow + " " + kim.handle.quantity);
	}

}
