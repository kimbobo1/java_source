package pack2;

import java.util.Scanner;

public class Ex11Machine {
	private int cupCount;     // string의 사용법은 기본형과 비슷 ,객체 생성하는 방법은 참조형(new)이다.
	private Ex11CoinIn coinIn = new Ex11CoinIn(); // 포함 관계  
	
	public Ex11Machine() {
		
	}
	
	public void showData() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("금액을 입력하세요 ");
		coinIn.setCoin(scanner.nextInt());
		
		System.out.print("몇잔을 원하세요 ");
		cupCount = scanner.nextInt();
		//String result = coinIn.calc(cupCount);
		//System.out.println(result);
		System.out.println(coinIn.calc(cupCount));
		scanner.close();
	}
	
	
	
}
