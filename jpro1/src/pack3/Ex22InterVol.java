package pack3;

//public interface Ex22InterVol {
//인터페이스간 상속이 가능하다~~  Etc는2개 Inter은 4개 
public interface Ex22InterVol extends Ex22VolEtc{
	String vol = "볼륨";
	
	void volUp(int v);
	void VolDown(int v);

}
