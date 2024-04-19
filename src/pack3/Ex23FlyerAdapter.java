package pack3;

// Adapter란 이름이 붙은 클래스는 인터페이스를 구현해 추상을 일반 메소드로 작성
// 자신은 추상 클래스가 된다.


// 어댑터 클래스 예시
public abstract class Ex23FlyerAdapter implements Ex23Flyer{  // abstract를 사용하여 추상 클래스로 만들어준다. 선택적으로 오버라이딩이 가능해짐. 
	@Override                                                 // 일반 메소드로 만들고 해당 클래스를 추상을 만들면 어댑터라고 한다.
	public void fly() {}    // 일반 메소드를 작성함.
	
	@Override
	public void happy() {}
	
	@Override
	public boolean isAnimal() { return false; }
}
