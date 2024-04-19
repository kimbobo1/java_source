package pack3;

public class Ex14HouseDog extends Ex14Dog{   // Dog의 서브 클래스
	private String where = "집";
	
	public Ex14HouseDog(String name) {
		super(name);
	}
	
	public void show() {
		System.out.println("사는 곳 : " + where);
	}
	
	@Override
	public void printMsg() {
		System.out.println(getName() + " ~ " + where + "에 산다");
	}
}
