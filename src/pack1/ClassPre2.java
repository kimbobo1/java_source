package pack1;

public class ClassPre2 {
	// 다른 클래스에서 필요한 자원을 담아둔 저장소 역할
	
	// 방법3 : 함 구하기 코드 별도 작성  
	public void hap(int su1, int su2) {           // main에서 부를 때는 static이 필요 
		System.out.println("방법3 합은 " + (su1 + su2)); 
	}                                             // 수행이 끝나면 반드시 돌아옴

	public void cha(int su1, int su2) {
		System.out.println("방법3 차는 " + (su1 - su2)); 
	}

}
