package pack3;

public class Ex20Tv implements Ex20Volume{
	private int volLevel;
	
	public Ex20Tv() {
		volLevel = 0;
	}
	
	@Override
	public void volumeUp(int level) {
		// 인터페이스의 추상 메소드를 오버라이딩
		volLevel += level;
		String msg = "TV 볼륨을 올리면 ";
		System.out.println(msg + volLevel);
	}

	@Override
	public void volumeDown(int level) {
		volLevel -= level;
		String msg = "TV 볼륨을 내리면 ";
		System.out.println(msg + volLevel);
	}
	
}
