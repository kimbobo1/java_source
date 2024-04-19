package pack4;

import java.io.FileNotFoundException;
import java.io.FileReader;

// 예외 처리 : 키보드, 파일 처리, 네트워크, DB 연동 처리 등 외부와 접속을 통한 프로그래밍 작업 중
// 예상치 못한 에러가 발생할 수 있는데 이와 같은 경우에 사용한다.
// try ~ catch 구문을 사용

public class Ex26Try {
	public void testMethod() {
		System.out.println("testMethod");
		try {
			int a[] = {1, 2, 3};
			System.out.println("배열 요소 값 출력 : " + a[0]);
			System.out.println("배열 요소 값 출력 : " + a[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("testMethod 오류 : " + e);
		}
	}
	
	//public static void main(String[] args) throws Exception{    // 예외를 잡지 않고 JVM에 던져버리는 것임.
	public static void main(String[] args) {
		//FileReader fr = new FileReader("c:/work/aa.txt");  // Unhandled exception 발생 
		
		try {
			// 보조기억장치의 파일 읽기
			FileReader fr = new FileReader("c:/work/aa.txt");  
			
			// 객체가 인스턴스에 주소를 갖지 않은 경우
			//Ex26Try try1 = null;
			Ex26Try try1 = new Ex26Try();
			try1.testMethod();
			
			int re = 10 / 0;     // 0으로 나누기
			System.out.println("re : " + re);
			
		} catch (FileNotFoundException e1) {
			System.out.println("해당 파일이 없어요");
		} catch (NullPointerException e2) {
			//e2.printStackTrace();
			System.out.println("객체 변수 에러 원인은 " + e2.getMessage());
		} catch (ArrayIndexOutOfBoundsException e3) {
			System.out.println("배열 처리 중 에러 : " + e3);
		} catch (ArithmeticException e4) {
			System.out.println("연산 오류 : " + e4);
		} catch (Exception e) {
			System.out.println("오류 " + e);
		} finally {
			System.out.println("에러와 상관없이 반드시 출력");
		}
		
		System.out.println("프로그램 종료");
	}

}
