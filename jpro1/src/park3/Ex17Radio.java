package park3;

public class Ex17Radio extends Ex17Jepum{
	
	public Ex17Radio() {
		System.out.println("라디오 생성자 ");
	}
	
	@Override
	public void volumeControl() {
		System.out.println("라디오 소리 조절 "); //추상메소드를 오버라이드 하면 옆에 세모 속이 비어 있다
		
	}

}
