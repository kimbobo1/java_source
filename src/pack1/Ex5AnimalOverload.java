package pack1;

// method overloading : 하나의 클래스의 이름이 같은 메소드를 여러 개 선언
// 성립 조건 : 매개변수의 개수, 타입, 순서가 다르면 된다. 반환형과는 관계없다.

public class Ex5AnimalOverload {
	private int leg = 4;
	private int age;
	private String name;
	public final static int MOUTH = 1;  // final 멤버필드는 대문자로 적자(약속)
	
	public Ex5AnimalOverload() {               // 기본형: 멤버 필드 값으로 객체를 생성  // 생성자 오버로딩하는 경우, 이 생성자도 사용하려면 삭제하면 안된다. 그러나 이 생성자를 사용하지 않는다면 지워도 되긴한다.
		// 생성자는 내용이 없는 경우, 생략 가능
		this(10); // 생성자가 다른 생성자를 호출, 생성자가 생성자를 부르는 경우 // 아래줄과 바꾸면 에러 -> 다른 누구보다 먼저 적어주어야 함.
		System.out.println("비어 있는 생성자");
		
		//메소드명(); // 생성자가 메소드를 호출
	}
	public Ex5AnimalOverload(int leg) {   // 생성자 오버로딩 , 고급형: 멤버 필드 값을 매개변수를 통해 변경하여 객체를 생성
		this.leg = leg;
	}
	public Ex5AnimalOverload(String name) {   // 생성자 오버로딩2
		this.name = name;
	}
	public Ex5AnimalOverload(String name, int age, int leg) {   // 생성자 오버로딩3
		this.name = name;
		this.age = age;
		this.leg = leg;       //현재 클래스의 멤버에 접근하기 위해 this 사용
	}
	
	// ----------------------------------------
	public void display() {
		System.out.println("leg : " + leg + ", age : " + age + ", name : " + name);
	}
	
	// method overloading
	public void display(int age) {   // 매개변수(parameter)의 개수가 다름 
		this.age = age;  // 지역변수 age를 멤버필드 age에 기억
		System.out.println("leg : " + leg + ", age : " + age + ", name : " + name);
	}
	
	public void display(String name) {
		System.out.println("leg : " + leg + ", age : " + age + ", name : " + name);
	}
	
	public void display(String name, int age) {    // 개수가 달라도 됨
		System.out.println("leg : " + leg + ", age : " + age + ", name : " + name);
	}
	
	public void display(int age, String name) {    // 순서가 달라도 됨
		System.out.println("leg : " + leg + ", age : " + age + ", name : " + name);
	}
	
//	public void display(int leg) {           // 타입과 개수가 같은 경우, 에러, 변수명은 다르게 보이지만 컴퓨터 입장에서는 같은 정수형 데이터이다. age 값인지 leg 값인지 알 수 없음
//		System.out.println("leg : " + leg + ", age : " + age + ", name : " + name);
//	}
	
//	public String display(int leg) {         // 오버로딩 성립 조건은 파라미터와만 관계가 있다. 반환형과는 상관이 없으므로 이 역시 에러 발생
//		System.out.println("leg : " + leg + ", age : " + age + ", name : " + name);
//	}
	
	
}
