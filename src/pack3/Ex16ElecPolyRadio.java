package pack3;

public class Ex16ElecPolyRadio extends Ex16ElecPolyProduct{
	@Override
	public void volumeControl() {
		System.out.println("라디오 볼륨 조절 후 " + getVolume());
	}
}
