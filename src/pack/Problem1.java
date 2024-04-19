package pack;

import java.util.Scanner;

public class Problem1 {
	public static void Main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//문제 1 : 키보드로 상품명, 수량 , 단가를 각각 입력받아 금액(수량 * 단가)을 출력하시오.
		//조건 : 금액이 5만원 이상이면 그맥에 10%를 아니면 금액에 5%를 세금으로 출력
		//출력 모양은 상품영: *** 금액 : *** 세금 : ***
		System.out.println("키보드로 상품명, 수량, 단가를 각각 입력하시오.");
		System.out.print("상품명 : ");
		String pName = sc.next(); // 상품명 입력
		System.out.print("수량 : ");
		int n = sc.nextInt();  // 수량 입력
		System.out.print("단가 : ");
		int cost = sc.nextInt(); // 단가 입력
		int totalCost = cost * n;
		double tax = 0;
		if(totalCost >= 50000) {
			tax = totalCost * 0.1;
		} else {
			tax = totalCost * 0.05;
		}
		System.out.println("상품명 : " + pName + " 금액 : "+ totalCost + " 세금 : " + tax);
		sc.close();
	}
}
