package pack;

import java.util.Scanner;

public class Test07For {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 반복문 for
		//for(초기치; 조건; 증감치){ 반복 처리 대상 }
		int a;
		int sum = 0; // 누적 기억장소
		
		for(a = 1; a <= 10; a++) {
			System.out.println("a : " + a);
			// a = 4;  // 무한 반복
			sum += a;
		}
		System.out.println("반복문 수행 후 a: " + a);
		System.out.println("합은 " + sum);
		
		for(int i = 65; i <= 90; i++) {
			System.out.print((char)i + " ");
		}
		System.out.println();
		for(int i = 'A'; i <= 'Z'; i++) {   // promotion
			System.out.print(i + " ");
		}
		System.out.println();
		for(int i = 10; i > 1; i -= 2) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		for(int ytn = 0, tvn = 5; ytn <= 5; ytn++, tvn++) { //조건은 1개
			System.out.print(ytn + ", "+ tvn + ":");
		}
		
		System.out.println();
		int aa = 1;
		for(; aa <= 5; aa++) {
			System.out.print(aa + " ");
		}
		
		System.out.println("\n\n다중 for -------");
		for(int m = 1; m <= 3; m++) {
			System.out.println("m = " + m);
			for(int n = 1; n <= 4; n++) {
				System.out.print("n : " + n + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		for(char i = 65; i <= 90; i++) {
			System.out.print(i + " : ");
			for(char j = i; j <= 'Z'; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println();
		// 구구단 3단 출력
		for(int count = 1; count < 10; count++) {
			System.out.println("3 x " + count + " = "+ (3 * count));
		}
		
		//문제 2: 키보드로 숫자를  받아 구구단 출력
		// 예) 몇 단? 3
		System.out.print("몇 단? ");
		int dan = sc.nextInt();
		for(int i = 1; i< 10;i++) {
			System.out.print(dan + "*" + i + "=" + (dan * i) +  " ");
		}
		System.out.println();
		
		//문제 3: 1 ~ 100 사이의 정수 중 3의 배수이면서 5의 배수의 개수와 그 합을 출력
		int count = 0, sum1 = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				count++;
				sum1 += i;
			}
		}
		System.out.println("개수 : " + count + " 합 : " + sum1);
		
		//문제 4: 2~9단 구구단 출력
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.print(i + "*" + j + "=" + (i * j) + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
