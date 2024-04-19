package pack6thread;

public class Ex42BreadMain {

	public static void main(String[] args) {
		//스레드 간 자원 공유 및 스레드 활성화/비홀성화 연습 렛츠기릿
		Ex42BreadPlate breadPlate= new Ex42BreadPlate();
		Ex42BreadMaker maker = new Ex42BreadMaker(breadPlate);
		Ex42BreadEater eater = new Ex42BreadEater(breadPlate);
		//maker.run();
		//eater.run();
		maker.start(); //사용자의 의한 멀티 테스킹
		eater.start();
		
	}

}
