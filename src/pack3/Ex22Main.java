package pack3;

public class Ex22Main {

	public static void main(String[] args) {
		Ex22Radio radio = new Ex22Radio();
		radio.volOn();      // 1
		radio.volUp(5);     // 6
		radio.volDown(2);   // 4
		radio.showVol();    
		radio.volOff();     // 0
		radio.showVol();
	}

}
