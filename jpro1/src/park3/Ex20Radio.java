package park3;

public class Ex20Radio implements Ex20Volume{
	private int volevel1;
	
	public Ex20Radio() {
		volevel1 = 0;
	}
	@Override
	public void volumeUp(int level) {
		//인터페이스의 추상메소드를 오버라이딩
		volevel1 += level;
		System.out.println("라디오 볼륨을 올리면 " + volevel1);
	}
	
	@Override
	public void volumeDown(int level) {
		volevel1 -= level;
		System.out.println("라디오 볼륨을 내리면 " + volevel1);
		
		
	}
}
