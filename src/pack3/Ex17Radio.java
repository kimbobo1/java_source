package pack3;

public class Ex17Radio extends Ex17Jepum{
	public Ex17Radio() {
		System.out.println("라디오 생성자");
	}
	
	@Override
	public void volumeControl() {  // 비어 있는 삼각형 : 추상 메소드 오버라이딩
		System.out.println("라디오 소리 조정");
	}
}
