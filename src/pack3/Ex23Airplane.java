package pack3;

public class Ex23Airplane implements Ex23Flyer{

	@Override
	public void fly() {
		System.out.println("커다란 엔진 소리를 내며 인천공항을 이륙함");
	}

	@Override
	public boolean isAnimal() {		
		return false;
	}
	
	@Override
	public void happy() {
		
	}
}
