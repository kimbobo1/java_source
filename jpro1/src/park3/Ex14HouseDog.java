package park3;

public class Ex14HouseDog extends Ex14Dog{
	private String where="집";
	
	public Ex14HouseDog(String name) {
		super(name);
	}
	
	public void show() {
		System.out.println("사는 곳:" + where);
		
	}
	@Override
	public void printMsg() {
		
		System.out.println(getName()+ "~" + where + "에 산다");
	}

}
