package pack3;

public class Ex12Me extends Ex12Father{
	final int score = 90;  // 멤버 필드에 final하면 값 수정 불가
	
	public Ex12Me() {
		super();   // 생략 가능, 부모 생성자를 찾아가서 Ex12Father()를 찾아가서 생략된 super() 로 가서 할아버지 생성자로가서 출력 후 아버지 생성자가서 출력하고 내 생성자를 출력
		System.out.println("내 생성자");
		//score = 80;  error
	}
	
	public void biking() {
		System.out.println("자전거로 전국일주~~~");
	}
	
	
//	public String getHouse() {   // 부모에서 fianl해서 오버라이딩 불가
//		return "집";
//	}
}
