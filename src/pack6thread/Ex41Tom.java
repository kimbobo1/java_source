package pack6thread;

public class Ex41Tom extends Thread{
	
	
	@Override
	public void run() {
		Ex41BankMain.bank.saveMoney(2000);  //입금2000
		
		System.out.println("남편 톰 입금후   잔고 :" + Ex41BankMain.bank.getMoney());
		
		
		
	}
	

}
