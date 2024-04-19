package pack;

public class Test01 {
	public static void main(String[] args) {
		System.out.println("성공1"); //syso + ctrl + spacebar
		System.out.println("단축키를 사용하자");
		System.out.print("자바");
		System.out.print("변수");   //print는 개행이 되지 않음
		System.out.println("연습"); //println은 개행
		//한 줄 주석
		/*
		 * 여러 줄 
		 * 주석. 실행에 참여 안함
		 * ctrl + / 를 누르면 주석 및 해제가능
		 */
		System.out.println("주석 연습"); // 한 줄 주석
		
		System.out.println("---------변수 연습---------");
		// 기본형 : bcbsilfd - 값을 변수가 직접 기억
		// 참조형 : 객체 - 객체의 주소를 변수가 기억
		// byte : 하나의 단위로 이루어진 이진 분자(bit)의 집합, 데이ㅓ를 표시할 수 있는 최소 단위
		// 8bit로 1byte를 구성하는 것이 일반적
		// 아스키 코드 : 8비트로 구성 0100 0001 = 'A'
		// 유니코드 : 알파벳을 제외하고 UTF-8, 16과 같이 바이트를 늘려서 표현
		
		// 숫자형 기억장소 : 변수 선언 방법 -> 타입 변수명
		byte var1; // 1byte 정수 기억 장소 -128 ~ 127
		var1 = 3; // var1 에 3을 할당
		System.out.println(var1);
		System.out.println(Byte.MAX_VALUE); // byte 형의 최대값
		System.out.println(Byte.MIN_VALUE); // byte 형의 최소값
		
		System.out.println("-------------------------");
		short var2 = 123; // short는 2바이트 정수 기억 장소
		System.out.println(var2);
		
		System.out.println("-------------------------");
		int var3 = 123; // int는 4바이트 정수 기억 장소
		System.out.println(var3);
		
		System.out.println("-------------------------");
		long var4 = 12345678921345L; // long는 8바이트 정수 기억 장소
		// L이라는  리터럴을 붙이는 이유는 8바이트로 변경시킴.
		System.out.println(var4);
		
		System.out.println("형변환에 대해 : 자동 형변환(promotion), 강제 형변환(casting)");
		// 자바에서 정수는 int로 인정
		short ss = 10; // promotion 원래 10은 int형이다. 형변환을 시켜 int -> short로 자동으로 변경
		short ss2 = (short) 10; // casting
		System.out.println(ss + " " + ss2); // 여기서 +는 문자열 더하기
		short ss3 = 5000; // 50000을 할당하는 경우,type mismatch : 두바이트 공간에 4바이트 공간을 차지하는 수를 입력하여 오류가 발생
		ss3 = (short)50000; // 강제로 할당할 경우 마이너스 값이 할당
		System.out.println(ss3);
		
		int ismi = 123;
		// short ss4 = 123; // 123은 정수형, 자동 형변환 (short 범위에 들어가므로) 가능
		//short ss4 = imsi; // imsi는 123을 갖고 있다. ss4에 이 값을 주니 에러가 발생 -> 컴퓨터는 imsi에 얼마가 들었는지 알 수 없음. 실행을 시켜봐야지만 알 수 있음.
		short ss4 = (short) ismi;
		System.out.println(ss4);
		
		// 3/26
		System.out.println("-------------------------");
		// 자바에서 실수는 double로 인정 (기본)
		double d1 = 1.2; // 8byte
		d1 = 12.345; // 덮어쓰기
		d1 = 12345; // promotion 정수는 실수 기억 장소에 기억될 때, 실수로 자동 형변환이 된다.
		System.out.println(d1);
		
//		float f1 = 12.3F; // 강제 형변환
//		float f2 = (float)12.3; // casting
		
		// 연산자 큰 타입으로 자동변환
		double result = 4.5 + 10;
		result = 4.5 + (double)10;
		result = (int)4.5 + 10; // 강제로 실수를 정수화할 때, 버림이 발생한다. 반올림 X
		System.out.println(result);
		
		double dd = 5.5;
		//int result2 = 4.5 + 10; 최종값이 result2에 할당된다.14.5값을 int에 넣을 수 없다. type mismatch.
		int result2 = (int)(4.5 + 10); // 연산자 우선순위에 의해 4.5 + 10 하고 그 결과를 정수화한다.
		//result2 = (int)4.5 + dd       dd는 double이므로 type mismatch
		result2 = (int)4.5 + (int)dd; // 4 + 5
		System.out.println(result2);
		
		System.out.println("지금부터는 논리형(boolean) - 참, 거짓결과 기억");
		boolean bu1 = true; // 1byte
		bu1 = false;
		System.out.println(bu1);
		
		System.out.println("지금부터는 문자형(char) - Ascii 코드표에 등록된 문자");
		char c1 = 'a';
		//c1 = 'kbs'; char에는 한 문자만 입력할 수 있음 error
		c1 = '7';
		c1 = 'A';
		//c1 = "k";    큰따옴표는 string을 담는 용도 error
		System.out.println(c1);
		System.out.println(c1 + " " + (int)c1 + " " + 65 + " " + (char)65); //int형으로 형변환하는 경우, 아스키코드 값이 출력
		
		System.out.println("안녕" + 13 + "반가워");
		System.out.println("안녕" + (char)13 + "반가워"); // 13에 해당하는 아스키 코드 값은 enter 10도 13과 동일
		System.out.println("안녕" + "\n" + "반가워");
		System.out.println("안녕\n반가워"); // \n는 이스케이프 문자 중 하나. 이스케이프 문자 정리!
		
		System.out.println();
		System.out.println(11 + " " + 0xb + " " + 013); //10진수 16진수 8진수
		
		System.out.println("\n----문자열 처리-------");
		// String : 참조형 객체이지만 기본형처럼 사용할 수 있도록 자바가 배려
		String irum = "홍길동"; // 홍길동 객체의 주소를 irum이란 변수가 기억
		System.out.println(irum + "님 만세");
		
		System.out.println();
		// 상수 : final type 변수명 = 값(리터럴)
		//리터럴은 데이터(값) 그 자체를 말한다. 변수에 넣는 변하지 않는 데이터를 의미하는 것.
		// 한 번 저장된 상수 값은 수정 불가
		final int KBS = 9;
		//kbs = 11; //final 선언을 했으므로 수정 불가 error
		System.out.println("kbs : " + KBS); // 전체가 문자열로 나온다.
		
		final double PI = 3.14; // final 변수(상수)는 대문자로 작성하기를 권장, 가독성을 위해
		System.out.println("pi : " + PI);
		
	}
}
//javac까지 실행된 상태