package pack3;

public class Ex20Tv implements Ex20Volume{
	private int volevel1;
	
	public Ex20Tv() {
		volevel1 = 0;
	}
	@Override
	public void volumeUp(int level) {
		//인터페이스의 추상메소드를 오버라이딩
		volevel1 += level;
		String msg = "Tv볼륨을 높이기";
		System.out.println(msg+ volevel1);
	}
	
	@Override
	public void volumeDown(int level) {
		String msg = "Tv볼륨을 내리기 ";
		volevel1 -= level;
		System.out.println(msg + volevel1);
		
		
	}
}
