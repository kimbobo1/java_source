package pack;

import java.util.Scanner;

public class Test4inputData {

	public static void main(String[] args) {
		//프로그램 진행 도중에 외부에서 값 얻기
		System.out.println("뭔가를 하다가....");
		// args 매개변수를 통해 값 얻기
		System.out.println(args.length);
		System.out.println("args : " + args[0]);   //여러 개 중에  index 0번째
		
		System.out.println();
		//프로그램 진핸도중에 키보드로 값 받기
		Scanner sc = new Scanner(System.in); //표준 입력장치 (키보드)로 값 얻기
		System.out.print("이름 입력:");
		String irum = sc.next();
		System.out.print("나이 입력:");
		int nai = sc.nextInt();
		System.out.println("이름은 " + irum +", 나이는" + nai + " 살 "); 
		

	}

}

