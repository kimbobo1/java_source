package pack6thread;

public class Ex41Wife extends Thread{
	
	
	@Override
	public void run() {
		Ex41BankMain.bank.minusMoney(3000);  //마이너스2000원
		System.out.println("아내 출금후  잔고 :" + Ex41BankMain.bank.getMoney());
		
		
		
	}
	

}
