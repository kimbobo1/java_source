package park3;

public class Ex20HandPhone implements Ex20Volume{
	private int volevel1;
	
	public Ex20HandPhone() {
		volevel1 = 0;
	}
	@Override
	public void volumeUp(int level) {
		//인터페이스의 추상메소드를 오버라이딩
		if(level >100) level = 100;
		volevel1 += level;
		System.out.println("핸드폰  소리를 올리면 " + volevel1);
	}
	
	@Override
	public void volumeDown(int level) {
		volevel1 -= level;
		if(volevel1 <0)volevel1 = 0;
		System.out.println("핸드폰 볼륨을 내리면 " + volevel1);
		
		
	}
}
