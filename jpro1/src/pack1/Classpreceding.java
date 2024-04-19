package pack1;

public class Classpreceding {
	public static void main(String[] args) {
		//클래스 이해 전에 자원의 재활용 대해 알아보기
		int su1 =6;
		int su2 = 3;
		
		
		System.out.println("방법1 사용");
		System.out.println("합은" + (su1 + su2)); //방법1
		System.out.println("차는" + (su1 - su2));
		//뭔가를 하다가 ...
		System.out.println();
		//합과 차 구하기가 또 필요
		System.out.println("합은" + (su1 + su2)); //방법1
		System.out.println("차는" + (su1 - su2));
		
		System.out.println("\n방법2 사용");
		//별도의 단위 프로그램을 작성 후 필요할때 마다 호출
		hap(su1, su2);
		ca(su1, su2);
		System.out.println("\n방법3 사용-classpre2의 단위 프로그램을 호출");
		Classpre2 my = new Classpre2();
		my.hap(su1, su2);
		my.hap(20, 5);
		my.ca(su1, su2);
		
	}
	
	public static void hap(int su1, int su2) {//방법2 합 구하기 코드 별도 작성
		System.out.println("합은" + (su1 + su2));
		
	}
	public static void ca(int su1, int su2) {
		System.out.println("차는" + (su1 - su2));
		
	}
	

}
