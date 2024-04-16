package park3;

//인터페이스는 implements로 인해 다중상속 가능 
//public class Ex22Radio implements Ex22InterVol,Ex22VolEtc{
public class Ex22Radio implements Ex22InterVol{
	private int v = 0;
	
	@Override
	public void volUp(int v) {
		this.v += v;
		
		
	}
	
	@Override
	public void VolDown(int v) {
		this.v -= v;
		
	}
	
	@Override
	public void volOff() {
		v = 0;
		
	}
	@Override
	public void volOn() {
		v = 1;
		
	}
	
	public void showVol() {
		System.out.println("현재 볼륨은 " + v);
	}

}
