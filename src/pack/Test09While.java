package pack;

import java.util.Scanner;

public class Test09While {
	// 4/1
	public static void main(String[] args) {
		// 반복문 while
		// while(조건) { 실행문들... }
		int w = 1;
		while(w <= 5) {
			System.out.printf("w = %d ", w);
			w++;
		}
		System.out.println("\nwhile 수행 후 w : " + w);

		System.out.println();
		int count = 0;
		while(count < 5) {
			count++;
			System.out.println("count : " + count);
			if(count == 3) {
				System.out.println("쉬어가기");
			}
			if(count  == 5) {
				System.out.println("count가 5라서 종료 : " + count);
			}
		}
		
		System.out.println();
		w = 0;
		while(true) {            // 무한 루프
			w++;
			if(w == 5) break;    // w가 5인 경우, while 문 종료
			if(w == 3) continue; // w가 3인 경우, 조건을 건너뜀
			System.out.println("w : " + w);
		}
		
		System.out.println();
		// factorial n!은 1부터 n까지의 모든 정수의 곱
		// 5! = 5 * 4 * 3 * 2 * 1 = 120
		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 입력 : ");
//		int number = sc.nextInt(); // API를 가져다 적음
		int number = 5;
		// factorial 계산을 위한 초기값 설정
		int factorial = 1;
		int i = 1; // 반복을 위한 counter 변수
		while(i <= number) {
			factorial *= i;
			//System.out.println(i);
			i++;
		}
		System.out.printf("number는 %d, factorial은 %d이다.", number, factorial);
		
		System.out.println("\n다중 while ---");
		int a = 1;
		while(a <= 3) {
			System.out.println("a : " + a);
			int b = 1;
			while(b <= 4) {
				System.out.printf("b : %d ", b);
				b++;
			}
			a++;
			System.out.println();
		}
		
		System.out.println();
		// 키보드로 입력받은 숫자에 대해 1부터 시작해 그 숫자까지 모든 수에
		// 나누기를 시도하고 나누어 떨어지는 경우(약수)
		// 0이나 음수를 입력하면 프로그램을 종료
		/*while(true) {
			System.out.print("정수 입력(0이나 음수면 종료) : ");
			int num = sc.nextInt();
			if(num <= 0) {
				System.out.println("프로그램 종료");
				break;          // while과 대응
			}
			System.out.println(num + "의 약수는");
			int divisior = 1;   // 약수를 찾기 위해 1부터 시작
			while(divisior <= num) {
				if(num % divisior == 0) {
					System.out.println(divisior);   // 약수 출력
				}
				divisior++;  // 다음 수로 이동
			}
		}*/
		
		System.out.println();
		// do{ 반복 수행문...} while (조건);
		int k = 1;
		do {   // 최소 1회 수행
			System.out.println("k : " + k);
			k++;
		}while(k <= 5);
		
		System.out.println("exam ------------");
		// 문1) 1 ~ 100 사이의 정수 중 3의 배수 이지만 2의 배수가 아닌
		// 수를 출력하고, 합과 개수도 출력
		int num1 = 1, sum1 = 0, count1 = 0;
		while(num1 <= 100) {
			if(num1 % 3 == 0 && num1 % 2 != 0) {
				System.out.print(num1 + " ");
				sum1 += num1;
				count1 += 1;
			}
			num1++;
		}
		System.out.printf("\nsum : %d, count : %d",sum1, count1);
		System.out.println();
		
		// 문1) 정답
		int m = 1, tot = 1, su = 0;
		while(m <= 100) {
			if(m % 3 == 0 && m % 2 != 0) {
				System.out.println(m +" ");
				tot += m;
				su += 1;
			}
			m++;
		}
		System.out.println("\n문1) 합은 " + tot + ", 개수 : "+ su);
		
		// 문2) -1, 3, -5, 7, -9, 11 .. 99까지의 합 출력
		int num2 = 1, sum2 = 0;
		while(num2 <= 100) {
			if(num2 % 2 == 1) {
				sum2 += (num2 * -1);
				//num2 = Math.abs(num2);
			}else {
				sum2 += num2;
			}
			num2++;
		}
		System.out.printf("\n문2) 합 : %d\n\n", sum2);
		
		// 문2) 답1
		int n = 1, cnt = 1, hap = 0;
		while(n < 100) {
			if(cnt % 2 == 0) {
				System.out.println("짝수" + n);
				hap += n;
			} else {
				int imsi = n * -1;
				hap += imsi;
				System.out.println("홀수" + imsi);
			}
			n += 2;
			cnt += 1;
		}
		System.out.println("합은 " + hap + "입니다.");
		
		// 문2) 답2 for로 출력
		int hap2 = 0, cnt2 = 1;
		for(int c = 1; c < 100; c += 2) {
			if(cnt2 % 2 == 0) {
				hap2 += c;
			} else {
				hap2 += (c * -1);
			}
			cnt2++;
		}
		System.out.println("for 합은 " + hap2 + "입니다.");
		
		System.out.println("\n");
		// 문3) 1 ~ 100 사이의 정수 중에서 소수와 그 개수를 출력 
		// 소수 : 1보다 크며 1과 그 수 자체 이외의 다른 수로는 나누어 떨어지지 않는 수
		int num3 = 2, cnt3 = 0;
		while(num3 <= 100) {
			int divisior = 2;   // 약수를 찾기 위해 1부터 시작
			while(divisior <= num3) {
				if(num3 % divisior == 0) {
					break;
				}
				divisior++;
			}
			if(num3 == divisior) {   
				cnt3++;
				System.out.print(num3 + " ");
			}
			num3++;
		}
		System.out.println("\n소수 : " + cnt3);
		
		// 문3) 답 boolean
		int aa = 2, count2 = 0; // 소수의 개수;
		int su2 = 0;
		System.out.println("1부터 100까지의 소수 : ");
		while(aa <= 100) {
			boolean imsi = false;
			
			int bb = 2;
			while(bb < aa) {
				if(aa % bb == 0) {
					imsi = true;
				}
				bb++;
			}
			if(imsi == false) {
				System.out.print(aa + " ");
				count2++;
			}
			aa++;
		}
		System.out.println("\n건수 : " + count2);
		
		System.out.println();
		// 문3) 답2
		System.out.println("2부터 그 숫자의 제곱근까지의 모든 수로 나누어 떨어지는지 확인");
		// 소수를 찾는 이유로 제곱근까지만 검사하는 것은 어떤 수의 약수는 그 수의 제곱근을 넘지 않기 때문
		int num = 2, count3 = 0; // 1은 소수가 아니므로 2부터 출발
		System.out.println("1부터 100까지의 소수:");
		
		while(num <= 100) {
			boolean isPrime = true; // 현재 숫자가 소수인지 판별
			int divisior = 2; //나누는 수는 2부터 시작
			while(divisior <= Math.sqrt(num)) {
				if(num % divisior == 0) {
					isPrime = false;
					break;    // 나누어 떨어지지 않으면 더 이상의 검사는 필요 없음
				}
				divisior++;
			}
			if(isPrime) {   //if(isPrime  == true)
				count3++;   // 소수의 개수 증가
				System.out.print(num + " ");
			}
			num++;
		}
		System.out.println("\n건수 : " + count3);
		
		
		sc.close();
	}

}
// 문법 에러 : 문법 상의 오류
// 컴파일러 에러 : 컴파일러 실행해봐야 알 수 있는 에러
// 로직 에러 : 결과 확인을 해봐야 알 수 있는 에러
// \\192.168.0.21\pyk폴더