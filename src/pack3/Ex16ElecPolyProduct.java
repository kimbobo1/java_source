package pack3;

public class Ex16ElecPolyProduct {
	// 가전제품이 가져야 할 기본 멤버를 선언한 부모 클래스
	private int volume = 0;
	
	public Ex16ElecPolyProduct() {
		
	}
	
	public void volumeControl() {
		// 가전제품의 볼륨을 조절하는 기능
		// 자식 클래스가 오버라이딩해서 사용하기를 기대하는 메소드
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public int getVolume() {
		return volume;
	}
}
