package pack4;

import java.io.FileNotFoundException;
import java.io.FileReader;

//예외처리 : 키보드, 파일 처리,네트웍,DB연동 처리등을 
//외부와 접속을 통한 프로그래밍 작업중 예상치 못한 에러가 발생할수 있는데 이와같은경우에 주로 사용한다.
//try ~ catch 구문을 사용

public class Ex26Try {
	
	public void testMethod() {
		System.out.println("testMethod");
	}
	public static void main(String[] args) {  //Unhandled exception 오류는 예외처리해
	//public static void main(String[] args) throws Exception{  //Unhandled exception 오류는 예외처리해
		try {
			// 보조기억장치의 파일 읽기
			FileReader fr = new FileReader("/Users/bohyunkim/eclipse-workspace/work/aa.txt"); 
			
			//객체가 인스턴스의 주소를 갖지 않은 경우
			//Ex26Try try1 = null;
			Ex26Try try1= new Ex26Try();
			try1.testMethod();
			
		} catch (FileNotFoundException e1) {       //throw Exception 안쓸경우 try catch를 사용한다
			System.out.println("해당 파일이 없어요");
		}catch (NullPointerException e2) {
			//e2.printStackTrace();
			System.out.println("객체 변수에러 원인"+e2);
		}
		
		System.out.println("프로그램 종료");

	}

}
