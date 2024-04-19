package pack3;

public class Ex18Lion extends Ex18Animal{
	@Override
	public String name() {
		return "마이 이름은 사자라고 해. 어흥";
	}
	
	@Override
	public String eat() {
		String goki = "생고기";
		return goki;
	}
	
	@Override
	public String action() {      // 오버라이딩된 메소드
		return "밤에 움직임";
	}
	
	public void eatOther() {      // 사자만의 고유 메소드
		System.out.println("가끔 물도 마심");
	}
}
