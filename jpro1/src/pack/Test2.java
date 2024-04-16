package pack;

public class Test2 {

	public static void main(String[] args) {
		// 응용 프로그램의 시작 메소드(method)행위
		System.out.println("산술 연산자 연습");
		int a = 5;  //치환 연산자 오른쪽의 최종 결과 값을 왼쪽 기억장소에 저장을 하는 연산자
		int b = 3;
		int c = a+b;
		System.out.println("c는 " + c);
		
		System.out.println("산술 연산자 연습 -------");
		
	System.out.println(a + b);
	System.out.println(a - b);
	System.out.println(a * b);
	System.out.println(a / b);   //몫만 취함
	System.out.println(a % b);   // 나머지만
	System.out.println(a / (double) b); //나머지 몫 둘다
	System.out.println(3 + 4 * 5);   // * , /가 +,- 보다 우선 순위가 높음
	System.out.println((3 + 4) * 5);  // () 소괄호 내의 연산순위가 가장 높다
	
	//System.out.println(a / 0); //정수연산인 경우  에러
	System.out.println(a / 0.0); // 실수연산인 경우Infinity 무한대
	System.out.println(a % 0.0); // NAN(Not a Number) 숫자가 아니라 표현할 수 없는 상태
	
	System.out.println("문자열 더하기 연산");
	String ss1= "배가";
	String ss2= "고파";	
	String ss3= ss1 + ss2;
	System.out.println(ss3);
	System.out.println(ss3 + " " + 123);  // 숫자가 문자열로 자동 변환 후 연산
	System.out.println(ss3 + " " + (123 + 100)); 
	
	//String ss4 = 5 + 6; // type mismatch err
	String ss4 = "5" + 6;
	System.out.println(ss4);
	String ss5 = Integer.toString (5) + 6; // 문자열로 강제 변환   int 기본형클래스는 integer
	System.out.println(ss5);
	
	String ss6 = Double.toString(5.5) + 6; 
	System.out.println(ss6);
	
	System.out.println();
	int abc = 5 + Integer.parseInt("6"); //문자열을 정수로 강제 변환
	System.out.println(abc);
	double abc2 = 5 + Double.parseDouble("6.7"); // 문자열을 실수로 강제 변환
	System.out.println(abc2);
	
	
	System.out.println();
	//누적
	int no = 1;
	no = no + 1;
	no +=1;
	no++;  // 후위 증감 연산자
	++no;  // 전위 증감 연산자
	System.out.println("no : " + no);
	
	
	
	int imsi = 5;
	int result = ++imsi + 1; //imsi가 연산 전에 1증가
	System.out.println("imsi :" + imsi);
	System.out.println("result : " + result);
	
	

	int imsi2 = 5;
	int result2 = imsi2++ + 1; //imsi2가 연산 후에 1증가
	System.out.println("imsi2 :" + imsi2);
	System.out.println("result2 : " + result2);
	//주의 증감연산자는 다른 연산자와 함께 쓰지 않도록 권장
	
	
	//부호 관련
	int imsi3 = 3;
	System.out.println(imsi3);
	System.out.println(-imsi3);
	System.out.println(imsi3 * -1);	
	
	
	
	
	
	
	
	
	}

}
