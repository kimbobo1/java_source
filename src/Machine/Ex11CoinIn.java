package Machine;

public class Ex11CoinIn {
	private int coin;  // 400
	private int jandon;
	
	private int cupCount;
	
	public void setCoin(int coin, int cupCount) {
		this.coin = coin;
		this.cupCount = cupCount;
	}
	
	public int calc() {
		jandon = coin - (cupCount * 200);
		return jandon;
	}
}
