package pack3;

// 볼륨 조절 인터페이스
//public interface Ex22InterVol {  // 인터페이스 1
public interface Ex22InterVol extends Ex22VolEtc {   // 인터페이스 간 상속이 가능, 인터페이스 2를 상속받은 인터페이스 1
	String vol = "볼륨";
	
	void volUp(int v);
	void volDown(int v);
}
