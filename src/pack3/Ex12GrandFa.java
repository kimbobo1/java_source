package pack3;

// 상속 : 하나의 클래스가 다른 클래스를 포함하는 상위 개념일 때, 두 클래스 사이에 일반화 관계가 있다.
//       이런 일반화 관계를 상속관계(is a kind of 관계)라고 한다.
// 클래스 간 부모 자식의 구조를 갖는다.
// 부모 클래스는 자식 클래스의 멤버(필드나 메소드)를 제공하는 틀 역할을 한다.

//public final class Ex12GrandFa {  // 클래스에 final은 상속 불가
public class Ex12GrandFa {  
	private int nai = 80;
	public String gabo = "상감청자";
	protected String gahun = "자바 모르면 인간도 아니다";  // protected 선언했으므로 grandFa는 자식을 가질 수 있다. 
	// 프로젝트가 있고 a, b라는 패키지가 있다. a, b 패키지에서 둘 다 사용가능,
	// (같은 프로젝트 사용가능), 프로텍티드가 있는 경우 다른 패키지에서 사용이 가능하다. 생략과 퍼블릭의 중간
	
	public Ex12GrandFa() {
		System.out.println("할아버지 생성자");
	}
	
	public Ex12GrandFa(int nai) {   // 생성자 오버로딩
		this(); // 디폴트 생성자를 부름. -> 할아버지 생성자를 출력하고 나이를 멤버 필드에 할당
		this.nai = nai;
	}
	
	public String say() {
		return "할아버지 말씀 : 자기주도학습";
	}
	
	public void eat() {
		System.out.println("밥은 맛있게...");
	}
	// 나이는 생성자로 받는다.
	
	public int getNai() {
		return nai;
	}
}
