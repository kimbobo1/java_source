package pack5Io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

import Employee.Salesman;

public class Ex34IoTest {
	
	public static void main(String[] args) throws IOException {
		// Console과 file을 통한 입력
		// 1. Console을 통한 입력
		/*
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		InputStreamReader in = new InputStreamReader(System.in); 
		BufferedReader br = new BufferedReader(in);  // 12행과 동일
		System.out.print("이름은 ");
		String ir = br.readLine();  
		System.out.println("이름은 " + ir);
		
		br.close();
		in.close();
		*/
		
		// 2. Scanner를 통한 입력
		/*
		Scanner sc = new Scanner(System.in);  // 여기서 장치를 엶.
		System.out.print("이름은 ");
		String ir = sc.nextLine();
		System.out.print("몸무게는 ");
		double w = sc.nextDouble();
		System.out.println(ir + "님의 몸무게는 " + w);
		sc.close();  
		*/
		
		// 파일 읽기
		//File f = new File("c:/work/good.txt");  // 리눅스 방식 경로 설정
		File f = new File("c:\\work\\good.txt"); // 윈도우 방식 경로 설정
		// 문자 단위
		FileReader fr = new FileReader(f);  // 파일 열기
		BufferedReader br = new BufferedReader(fr);  // 버퍼를 이용하여 읽기  , reader를 매개변수에 넣는다.      // 컴퓨터와 보조기억장치의 처리속도 차이로 인해 작성
		//System.out.println(br.readLine());  // read 메소드 : 한번에 다 읽는다., readLine() : 한줄 씩 읽는다.
		
		while(true) {
			String ss = br.readLine();
			if(ss == null) break;
			System.out.println(ss);
		}
		
		br.close();   // Garbage collector(GC)로 하여금 점유 메모리 해제 요청
		fr.close();
		
		System.out.println("전국 도서관 정보 파일 일부 읽기 --------");
		File file = new File("C:/work/전국도서관표준데이터.csv");
		FileReader fr2 = new FileReader(file);
		BufferedReader br2 = new BufferedReader(fr2);  // 입출력 장치 속도가 달라 사용.
		
		int count = 0;
		String ss = br2.readLine();  // 제목을 제외하기 위해
		while(true) {
			count++;
			ss = br2.readLine();
			if(ss == null || count >= 10) break;
			StringTokenizer tok = new StringTokenizer(ss, ",");
			String s1 = tok.nextToken();
			String s2 = tok.nextToken();
			String s3 = tok.nextToken();
			String s4 = tok.nextToken();
			
			System.out.println(s1 + "\t" + s2 + "\t" + s3 + "\t" + s4);
		}
		
	}
}
