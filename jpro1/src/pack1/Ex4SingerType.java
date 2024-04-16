package pack1;

public class Ex4SingerType {  // 가수들이 가져야할 기본 멤버를 클래스로 작성
	private String name  = "무명 가수"; //이름
	private String title = "아 대한민국"; //곡 제목
	//......
	
	//생성자를 통해 멤버 변수에 값저장
	public Ex4SingerType(String name, String title) {
		this.name= name;
		this.title = title;
	}
	
	public String getName() { //getter
		return name;
	}
	public String getTitle() {
		return title;
	}
	public void sing() {
		System.out.println(name + " is singing" + title + "...");
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		// 응용 프로그램 시작용 메소드
		//Ex4SingerType 멤버는 아니다
		Ex4SingerType bts = new Ex4SingerType("Bts"," 다이너마이트");
		bts.sing();
		System.out.println("가수 이름 :" + bts.getName());
		System.out.println("곡 이름 :" + bts.getTitle());
		
		System.out.println();
		
		Ex4SingerType blackpink = new Ex4SingerType("Blackpink"," How you like");
		blackpink.sing();
		System.out.println("가수 이름 :" + blackpink.getName());
		System.out.println("곡 이름 :" + blackpink.getTitle());
	}

}




