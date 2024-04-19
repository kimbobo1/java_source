package pack4;

import java.io.FileNotFoundException;
import java.io.FileReader;

//예외처리 : 키보드, 파일 처리,네트웍,DB연동 처리등을 
//외부와 접속을 통한 프로그래밍 작업중 예상치 못한 에러가 발생할수 있는데 이와같은경우에 주로 사용한다.
//try ~ catch 구문을 사용

public class Ex26Try {
	
	public void testMethod() {
		System.out.println("testMethod");
		try {
			int a[] = {1,2,3,};
			System.out.println("배열 요소 값 출력 :"+ a[0]);
			System.out.println("배열 요소 값 출력 :"+ a[3]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("testMetho 오류"+ e);
		}
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
			
			int re = 10 / 2;
			System.out.println("re :"+re);
			
		} catch (FileNotFoundException e1) {       //throw Exception 안쓸경우 try catch를 사용한다
			System.out.println("해당 파일이 없어요");
		}catch (NullPointerException e2) {
			//e2.printStackTrace();
			System.out.println("객체 변수에러 원인"+e2);
		}catch (ArrayIndexOutOfBoundsException e3) {
			
			System.out.println("배열 처리중 에러 :"+e3);
		}catch (Exception e) {                          //Exception을 써주면 모든 오류를 안써두됨
			System.out.println("연산 오류"+e);
		}finally {
			System.out.println("에러와 상관없이 반드시 출력");
		}
		
		System.out.println("프로그램 종료");

	}

}
