package park3;

public class Ex23Bird implements Ex23Flyer{
	@Override
	public void fly() {
		System.out.println("커더란 엔진 소리를 내며 날아감");
		
	}
	@Override
	public boolean isAnimal() {
		
		return false;
	}
	@Override
	public void happy() {
		// TODO Auto-generated method stub
		
	}

}
