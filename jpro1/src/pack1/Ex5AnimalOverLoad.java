package pack1;

// method overload : 한 개의 클래스의 이름이 같은 메소드를 여러개 선언
//성립 조건 : 매개변수의 갯수, 순서, 타입, 순서가 다르면 된다. 반환형과는 관계 없다

public class Ex5AnimalOverLoad {
	private int leg = 4;
	private int age;
	private String name;
	public final static int MOUTH = 1; // final 멤버 필드는 대문자로 표기

	public Ex5AnimalOverLoad() {
		// 생성자는 내용이 없는 경우 생략 가능
		this(10); //생성자가 다른 생성자를 호출
		System.out.println("비어 있는 생성자");
		
		//메소드명(): //생성자가 메소드를 호출 
		

	}
	public Ex5AnimalOverLoad(int leg) {
		// 생성자 오버로딩
		this.leg = leg;

	}
	public Ex5AnimalOverLoad(String name) {
		// 생성자 오버로딩
		this.name = name;

	}
	public Ex5AnimalOverLoad(String name,int leg,int age) {
		// 생성자 오버로딩 
		this.leg = leg;
		this.name = name;
		this.age = age;

	}

	public void display() {
		System.out.println("leg:" + leg + " age:" + age + " name:" + name);
	}

	// 메소드 오버로딩 method overloading
	public void display(int age) { // 매개변수 (parameter)의 갯수가 다름
		this.age = age; // 지역변수 age를 멤버필드 age에 기억
		System.out.println("leg:" + leg + " age:" + age + " name:" + name);

	}

	public void display(String name) {

		System.out.println("leg:" + leg + " age:" + age + " name:" + name);
	}

	public void display(String name, int age) {

		System.out.println("leg:" + leg + " age:" + age + " name:" + name);
	}

	public void display(int age, String name) {

		System.out.println("leg:" + leg + " age:" + age + " name:" + name);
	}
	
	//public void display(int leg) {  //매개변수 갯수가 같고 타입이 같아서 에러

		//System.out.println("leg:" + leg + " age:" + age + " name:" + name);
	//}
	/*public String display(String name, int age) {

		System.out.println("leg:" + leg + " age:" + age + " name:" + name);
	}*/
	
}
