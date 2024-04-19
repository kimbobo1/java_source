package pack;

import java.util.Scanner;

public class Test05If {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 조건 판단문 if 연습
		int num = 5;
		
		if(num >= 3) { // 조건이 참일 때만, 두 개의 실행문 수행
			System.out.println("크다");
			System.out.println("참일 때");
		}
		
		System.out.println("출력1");
		
		num = 5;
		if(num < 3) { // 조건에 따라 참 또는 거짓 영역 수행
			System.out.println("작다");
			System.out.println("참일 때 수행");
		} else {
			System.out.println("거짓일 때 수행");
		}
		System.out.println("출력2");
		
		System.out.println("다중 if문------ ");
		System.out.print("점수 : ");
		//int jumsu = sc.nextInt();
		int jumsu = 75;
		if(jumsu >= 70) {
			if(jumsu >= 90) {
				System.out.println("우수");
			} else {
				System.out.println("보통");
			}
		} else {
			System.out.println("어라 70점 미만");
			if(jumsu > 50) {
				System.out.println("50점 초과");
			} else {
				System.out.println("50점 이하");
			}
		}
		System.out.println("출력3");
		
		// 3/29
		jumsu = 75;
		String msg = "";
		if(jumsu >= 90) {
			msg = "수";
		} else if (jumsu >= 80) {
			msg = "우";
		} else if (jumsu >= 70) {
			msg = "미";
		} else if (jumsu >= 60) {
			msg = "양";
		} else {
			msg = "가";
		}
		
		System.out.println("평가 결과 : " + msg);
		
		System.out.println();
		System.out.println("입장료 출력 ------------");
		// 입장료 : 8세 이하, 65세 이샹 무료
		// 9세 이상 20세 미만 3000원
		// 20세 이상 65세 미만 5000원
		int age = 10;
		if(age <= 8 || age >= 65) {
			System.out.println("0");
		} else if(age >= 9 && age < 20) {
			System.out.println("3000");
		} else {
			System.out.println("5000");
		}
		
		System.out.println();
		age = 65;
		int total = 0;
		if(age >= 9 && age < 20) {
			total = 3000;
		} else if(20 <= age && age < 65) {
			total = 5000;
		}
		System.out.println(total + "원");
		
		System.out.println();
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
		double tax = 0; // 지역 변수값을 할당해주지 않아도 됨.
		if(totalCost >= 50000) {
			tax = totalCost * 0.1;
		} else {
			tax = totalCost * 0.05;
		}
		System.out.println("상품명 : " + pName + " 금액 : "+ totalCost + " 세금 : " + (int)tax);
		
		
		sc.close();
		
	}

}
