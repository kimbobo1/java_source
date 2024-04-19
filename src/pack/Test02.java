package pack;

public class Test02 {

	public static void main(String[] args) {
		// 응용 프로그램의 시작 메소드(method(행위))
		// main이 아닌 경우, 우클릭 시 run as 없음.
		
		int a = 5; // 치환 연산자. 오른쪽의 최종 결과값을 왼쪽 기억장소에 저장을 하는 연산자
		int b = 3;
		int c = a + b;
		System.out.println("c는 " + c);
		
		System.out.println("산술 연산자 연습--------");
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b); // 몫
		System.out.println(a % b); // 나머지
		System.out.println(a / (double)b); // 결과가 실수
		System.out.println(3 + 4 * 5);// *, /가 +, -보다 우선순위 높음
		System.out.println((3 + 4) * 5); // () 소괄호 내의 연산순위가 가장 높다.
		
		// System.out.println(a / 0); // 정수연산인 경우 에러 ArithmaticException : / by zero
		System.out.println(a / 0.0); // 정수연산인 경우 Infinity(무한대)
		System.out.println(a % 0.0); // NaN(Not a Number) 숫자가 아니라 표현할 수 없는 상태
		
		System.out.println("문자열 더하기 연산");
		String ss1 = "배가";
		String ss2 = "고파";
		String ss3 = ss1 + ss2;
		System.out.println(ss3);
		System.out.println(ss3 + " " + 123); // 숫자가 문자열로 자동 변환 후 연산
		System.out.println(ss3 + " " + 123 + 100); // 123100 
		System.out.println(ss3 + " " + (123 + 100)); //괄호를 먼저 계산하면 정수 계산이 먼저되어 223이 출력
		//String ss4 = 5 + 6; // type mismatch error
		String ss4 = "5" + 6;
		System.out.println(ss4);
		String ss5 = Integer.toString(5) + 6; //toString을 사용하여 5를 문자열로 강제 형변환. // int 기본형 클래스는 Integer(wrapper class)이다.
		System.out.println(ss5);
		String ss6 = Double.toString(5.5) + 6;
		System.out.println(ss6);
		
		System.out.println();
		//int abc = 5 + "6"; // type mismatch err
		int abc = 5 + Integer.parseInt("6"); //문자열을 정수로 바꿀때 parseInt를 사용
		System.out.println(abc);
		double abc2 = 5 + Double.parseDouble("5.9");
		System.out.println(abc2);
		
		System.out.println();
		//누적
		int no = 1;
		no = no + 1;
		no += 1;
		no++; // 후위 증감연산자
		++no; // 전위 증감연산자
		System.out.println("no : " + no);
		
		int imsi = 5;
		int result = ++imsi + 1; // imsi가 연산 전에 1증가
		System.out.println("imsi : " + imsi);
		System.out.println("result : " + result);
		
		int imsi2 = 5;
		int result2 = imsi2++ + 1;  // imsi2가 연산 후에 1증가
		System.out.println("imsi2 : " + imsi2);
		System.out.println("resul2 : " + result2);
		//후위 증감연산자는 다른 연산자와 함께 사용하지 않도록 권장.
		
		// 부호 관련
		int imsi3 = 3;
		System.out.println(imsi3);
		System.out.println(-imsi3);
		System.out.println(imsi3 * -1);
		
		
		
		
	}// 여기서 끝

}
