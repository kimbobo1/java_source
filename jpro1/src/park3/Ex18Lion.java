package park3;

public class Ex18Lion extends Ex18Animal{
	@Override
	public String name() {
	 
		return "내 이름은 사자야 ";
	}
	@Override
	public String eat() {
		String goki= "생고기";
		return goki;
	}
	@Override
	public String action() {
	
		return "밤에 활동";
	}
	
	public void eatOther() { //고유메소
		
		System.out.println("물도 마신다");
		
	}

}
