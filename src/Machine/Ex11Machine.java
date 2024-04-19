package Machine;

public class Ex11Machine {
	private int cupCount;
	private Ex11CoinIn coinIn;
	
	private int result;
	
	public Ex11Machine(int money, int cupCount) {
		coinIn = new Ex11CoinIn();
		this.cupCount = cupCount;
		coinIn.setCoin(money, cupCount);
		
		result = coinIn.calc();
		if(result < 0) {
			System.out.println("요금 부족");
			System.exit(0);
		}
		
	}
	
	public void showData() {
		System.out.print("커피 " + cupCount + "잔과");
		System.out.println(" 잔돈 " + result + "원");
	}
}
