package pack;

import java.util.Scanner;

public class Test7for {

	public static void main(String[] args) {
		// 반복문 for
		// for(초기치;조건;증감치) {반복 처리 대상}
		int a; // 전체 a를선언
		// for(int a = 1; a <= 5; a = a + 1) //for안에 a를 선언 {
		// for (a = 1; a <= 5; a = a + 1) {
		// for( a = 1; a <= 5; a += 1) {

		int sum = 0; // 누적 기억장소

		for (a = 1; a <= 10; a++) {
			System.out.println("a :" + a);
			sum += a;
		}
		System.out.println("반복문 수행후 a:" + a);
		System.out.println("합은:" + sum);

		for (int i = 65; i <= 90; i++) {
			System.out.print((char) i + " ");
		}
		System.out.println();

		for (int i = 'A'; i <= 'Z'; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i = 10; i > 1; i -= 2) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int ytn = 0, tvn = 5; ytn <= 5; ytn++, tvn++) {
			System.out.print(ytn + ", " + tvn + ':');
		}

		System.out.println();
		int aa = 1;
		for (; aa <= 5; aa++) {
			System.out.print(aa + " ");
		}

		System.out.println("\n\n다중 for-----");
		for (int m = 1; m <= 3; m++) {
			System.out.println("m=" + m);
			for (int n = 1; n <= 4; n++) {
				System.out.print("n :" + n + " ");
			}
			System.out.println();
		}
		System.out.println();
		for (char i = 65; i <= 90; i++) {
			System.out.print(i + " : ");
			for (char j = i; j <= 'Z'; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		// 구구단 3단 출력
		for (int count = 1; count <= 9; count++) {
			System.out.println("3 * " + count + "=" + (3 * count));
		}

		// 문제1: 키보드로 숫자를 받아 구구단 출력
		// 예) 몇단 ? 3
		// 3*=1 3*2=6.....
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.print("몇단");
		int three = sc.nextInt();
		for (int count1 = 1; count1 <= 9; count1++) {
			System.out.print(three+ "*" + count1 + "=" + (three * count1) + " ");

		}
		// 문2 : 1~100 사이의 정수 중 3의 배수이면서 5의 배수의 객수와 그 합을 출력
		System.out.println();
		int gae = 0;
		int haq = 0;
		for (int count3 = 1; count3 <= 100; count3++) {
			if (count3 % 3 == 0 && count3 % 5 == 0) {
				gae = gae + 1;
				haq = haq + count3;

			}
		}
		System.out.println("객수" + gae + "합" + haq);

		// 문3 : 2 ~ 2단까지 출력 다중for
		// 2*=2 2*2=4.....
		// ../
		// 9*1=9 9*2=18....
		System.out.println();
		for (int count4 = 2; count4 <= 9; count4++) {
			System.out.println(count4 + "단");
			for (int count5 = 1; count5 <= 9; count5++) {
				System.out.print(count4 + " * " + count5 + " = " + (count4 * count5) + " ");
			}
			System.out.println();
		}

	}

}
