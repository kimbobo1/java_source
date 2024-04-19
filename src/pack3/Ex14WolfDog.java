package pack3;

public class Ex14WolfDog extends Ex14Dog{   // Dog의 서브 클래스
	private String where = "산";
	
	public Ex14WolfDog(String name) {
		super(name);
	}
	
	public void show() {
		System.out.println("늑대가 사는 곳 : " + where + " 속");
	}
	
	@Override
	public void printMsg() {
		System.out.println(getName() + " ~ " + where + "에 산다(요즘은 동물원)");
	}
	
	// WolfDog 고유 메소드
	public void display() {
		printMsg();          // 산
		this.printMsg();     // 산
		super.printMsg();    // 지구
	}
}
