package pack3;

public class Ex23Main {

	public static void main(String[] args) {
		System.out.println("속도 : " + Ex23Flyer.FAST);
		
		Ex23Bird bird = new Ex23Bird();
		bird.fly();
		
		Ex23Airplane airplane = new Ex23Airplane();
		airplane.fly();
		
		System.out.println("------------------");
		Ex23FlyerUtil.show(bird);
		System.out.println();
		Ex23FlyerUtil.show(airplane);
		
		System.out.println("------------------");
		Ex23Ball ball = new Ex23Ball();
		ball.fly();          // fly() 메소드만 오버라이딩 했으므로 isAnimal()을 실행 시 부모의 값이 나올 수 있다.
	}

}
