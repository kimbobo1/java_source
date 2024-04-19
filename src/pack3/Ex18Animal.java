package pack3;

public abstract class Ex18Animal {
	public abstract String name();   // 추상 메소드
	public abstract String eat();
	public abstract String action();
	
	public void animalPrint() {      // 일반 메소드
		System.out.println("동물 추상 클래스의 일반 메소드");
	}
}
