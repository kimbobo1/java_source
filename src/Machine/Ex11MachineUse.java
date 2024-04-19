package Machine;

import java.util.Scanner;

public class Ex11MachineUse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("동전을 입력하세요 : ");
		int inputMoney = sc.nextInt();
		System.out.print("몇 잔을 원하세요 : ");
		int count = sc.nextInt();
		
		Ex11Machine machine1 = new Ex11Machine(inputMoney, count);
		machine1.showData();
		sc.close();
	}

}
