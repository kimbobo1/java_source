package pack2;

import java.util.Scanner;

public class Ex11Machine {
	private int cupCount;
	private Ex11Coin coinin= new  Ex11Coin(); //포함관계
	public Ex11Machine() {
		
	}
	public void showData() {
		Scanner scanner =new Scanner(System.in);
		System.out.println("금액을 입력하세요");
		coinin.setcoin(scanner.nextInt());
		System.out.println("몇잔을 원하세요");
		cupCount =scanner.nextInt();
		//String result = coinin.calc(cupCount);
		//System.out.println(result);
		System.out.println(coinin.calc(cupCount));
		scanner.close();
		
	}
}
