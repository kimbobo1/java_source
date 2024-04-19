package pack3;

public class Ex23Bird implements Ex23Flyer{

	@Override
	public void fly() {
		System.out.println("날개를 휘저으며 숲으로 날아감");
	}

	@Override
	public boolean isAnimal() {		
		return true;
	}
	
	@Override
	public void happy() {
		
	}
	
}
