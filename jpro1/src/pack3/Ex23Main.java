package pack3;

public class Ex23Main {

	public static void main(String[] args) {
		
		System.out.println("속도 :" + Ex23Flyer.Fast);
		Ex23Bird bird = new Ex23Bird();
		bird.fly();
		
		Ex23Airplane airplane = new Ex23Airplane();
		airplane.fly();
		
		System.out.println("--------");
		Ex23FlyerUtill.show(bird);
		System.out.println();
		Ex23FlyerUtill.show(airplane);
		
		System.out.println("--------");
		Ex23Ball ball= new Ex23Ball();
		ball.fly();
		
				
	}

}
