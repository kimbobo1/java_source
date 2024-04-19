package pack;

import java.util.*;

public class Test04InputData {

	public static void main(String[] args) {
		// 프로그램 진행 도중에 외부에서 값 얻기
		System.out.println("뭔가를 하다가...");
		// args 매개변수를 통해 값 얻기
		System.out.println(args.length); //args에 현재 문자열 0개 // 4:33
		System.out.println("args : " + args[0]); // 여러 개 주에 index 0번째
		//String이라고 되어 있으면 하나만 받을 수 있는데 String[]과 같이 배열을 생성하여 여러 개를 받을 수 있음.
		
		System.out.println();
		// 프로그램 진행 도중에 키보드로 값 받기
		Scanner sc = new Scanner(System.in); // 표준 입력 장치(키보드)로 값 받기
		System.out.println("이름 입력 : ");
		String irum = sc.next();
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		System.out.println("이름은 " + irum + ", 나이는 " + age + "살");
		
		sc.close();
		// 플로우 차트
	}

}
