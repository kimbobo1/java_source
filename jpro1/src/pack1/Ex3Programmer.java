package pack1;

public class Ex3Programmer {
	public String nickName;   //초기값은 null
	private int age;
	String spec= "자바";
	
	public static String motto = "자바에 미치자"; //정적 변수
	public final String campName = "에이콘 아카데미"; //final을 붙이면 수정불가   campName을 상수   에이콘 아카데미를 리터럴
	
	public Ex3Programmer() {//생성자
		System.out.println("난 생성자야 역할은 객체 생성시 초기화를 담당해");
		System.out.println("초기화 없을때는 생략가능");
		age=22;
		//displayData();
		//campName ="도토리";  final때문에 에러
		System.out.println("캠프 이름 :" +campName);
		
	}
	
	public void displayData() {
		
		System.out.println("별명이 " + nickName + ", 나이" + age + "살" + "보유기술은" + spec);
		//메소드가 다른 메소드 호출가능
		System.out.println("보유기술 재확인:" + showSpec());
	}
	private String showSpec() {
		String msg = "프로그래밍 언어 : " + spec;
		return msg + "(커피아님)";
	}
	//private age에대한 getter setter

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	static public void goodMethod() {
		System.out.println("스테틱 메소드임을 널리 알리노라");
		System.out.println(motto);
		//System.out.println(age); //에러 static 메소드는 일반 멤버 호출 불가
		
	}
	
	public void niceMethod() {
		System.out.println(age); //일반 메소드는 일반 멤버 호출 가능
		System.out.println(motto); //일반 메소드는 static 멤버 호출 가능
	}
	

}
