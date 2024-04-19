package pack1;

public class Classpre2 {
	//다른 클래스에서 필요한 자원을 담아둔 저장소 역할
	
	//방법3 합 구하기 코드 별도 클래스에서 작성
	public void hap(int su1, int su2) {
		System.out.println("방법3 합은" + (su1 + su2));
		
	}
	public static void ca(int su1, int su2) {
		System.out.println("방법3 차는" + (su1 - su2));
		
	}

}
