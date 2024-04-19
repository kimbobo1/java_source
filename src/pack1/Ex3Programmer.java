package pack1;

public class Ex3Programmer {
	public String nickName;   // 초기값이 null <- 참조형
	private int age;          // 초기값이 0 <- 기본형
	String spec = "자바";
	
	public static String motto = "자바에 미쳐 버리자";  // static을 사용하는 순간, motto는 스태틱이 된다. // 정적 멤버(변수)
	public final String campName = "에이콘 아카데미";  // final   // 수정 불가(상수)
	
	public Ex3Programmer() {
		System.out.println("난 생성자야 역할은 객체 생성 시 초기화를 담당해");
		System.out.println("초기화 없을 때는 생략 가능");
		age = 22;    //this.age = 22; 와 동일
		//displayData();     //여기서 15행으로 넘어가서 실행 후 돌아옴.
		//campName = "도토리";  // final 하는 순간, 수정이 불가능 해진다. 그러므로 이 행은 오류가 발생함.
		System.out.println("캠프 이름 : " + campName);
	}
	
	public void displayData() {
		System.out.println("별명이 " + nickName + ", 나이는 " + age + "살" + ", 고유 기술은 " + spec);
		
		// 메소드가 다른 메소드 호출 가능
		System.out.println("보유 기술 재확인 : " + showSpec());
	}
	
	private String showSpec() {
		String msg = "프로그래밍 언어 : " + spec;
		return msg + "(커피 아님)";
	}
	
	// private age에 대한 getter, setter
	public void setAge(int age) {
		this.age = age;     // 지역 변수 age를 전역 변수(멤버 필드) age에 할당
	}
	
	public int getAge() {
		return age;
	}
	
	public static void goodMethod() {
		System.out.println("스태틱 메소드임을 널리 알리노라");
		//System.out.println(age);     //static인 경우, 논 스태틱 필드를 찍을 수 없다. // 에러, static 메소드는 일반 멤버(static 멤버는 부를 수 있음) 호출 불가 -> 만들어지는 순서 상
		System.out.println(motto);     //static 멤버이므로 motto는 호출이 가능
	}
	
	public void niceMethod() {
		System.out.println(age);       // 일반 메소드는 일반 멤버 호출 가능
		System.out.println(motto);     // 일반 메소드는 스태틱 멤버도 호출 가능 -> 이미 만들어져 있기 때문
	}
}
