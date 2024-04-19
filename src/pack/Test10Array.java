package pack;

public class Test10Array {

	public static void main(String[] args) {
		// 배열(array) : 성격과 크기가 일치하는 복수 개의 기억 장소에 대해
		// 대표명 하나를 주고 첨자(index)로 각 기억장소를 구분
		// 반복처리가 효과적
		//int aa;                          // 기억장소 1개 선언
		//int ar[];                      // 배열로 선언, int[] ar;
		//ar = new int[5];
		int ar[] = new int[5];
		System.out.println("배열 크기 : " + ar.length);
		
		ar[0] = 10; 
		ar[1] = 20; 
		ar[4] = ar[0] + ar[1] + ar[2];   // 첨자(index)로 각 기억장소를 호출
		System.out.println(ar[4]);
		//ar[5] = 50;                    // syntax 오류는 없음. 실행오류 발생(런타임 에러) ArrayIndexOutOfBoundsException
		
		int a = 4, b = 4;
		System.out.println(ar[4] + " " + ar[a] + " " + ar[b] + " " + ar[1 + 3]);
		
		System.out.println();
		int[] ar1 = {1, 2, 3, 4, 5};     // 배열 선언과 동시에 값을 기억
		System.out.println(ar1[0] + " " + ar1.length);
		System.out.println(ar1[0] + " " + ar1[1] + " " + ar1[2]);
		
		// 반복문으로 배열 자료 출력
		for(int i = 0; i < ar1.length; i++) {
			System.out.print(ar1[i] + " ");
		}
		
		System.out.println();
		// 향상된 for : 배열, 컬렉션에서 사용 가능
		for(int i : ar1) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		String city[] = {"서울", "대전", "제주"};
		for(String s : city) {
			System.out.print(s + " ");
		}
		
		System.out.println("\n배열에 값 저장 후 출력 ---");
		int[] ar2 = new int[5];
		
		for(int i = 0; i < ar2.length; i++) {
			ar2[i] = i + 1;
		}
		
		int tot = 0;
		for(int i = 0; i < ar2.length; i++) {
			System.out.print(ar2[i] + " ");
			tot += ar2[i];
		}
		System.out.println("ar2 요소 값 총합 : " + tot);
		
		System.out.println("\n다차원 배열 ---");
		//int[] au = new int[12];         // 1차원 배열로 요소 수 12개
		int[][] su = new int[3][4];     // 2차원 배열로 요소 수 12개
		su[0][0] = 100;
		System.out.println(su[0][0]);
		System.out.println("행수 : " + su.length + ", 열수 : " + su[0].length);
		
		// 2차원 배열 값 저장
		int num = 10;
		for(int i = 0; i < su.length; i++) {
			for(int j = 0; j < su[i].length; j++) {
				su[i][j] = num++; 
				//su[i][j] = ++num;
			}
		}
		System.out.println(su[0][0] + " " + su[2][0]);
		for(int i = 0; i < su.length; i++) {
			for(int j = 0; j < su[i].length; j++) {
				System.out.print(su[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		// 위의 예시를 향상된 for로
		for(int[] row: su) {
			for(int ele: row) {
				System.out.print(ele + " ");
			}
			System.out.println();
		}
		
		System.out.println("\n가변 배열 : 행 마다 요소의 개수가 동적");
		int[][] scores = new int[2][];
		scores[0] = new int[2];
		scores[1] = new int[3];
		System.out.println(scores.length + " " + scores[0].length + " " + scores[1].length);
		
		System.out.println();
		int [][] jum = {{90, 87},{88, 99, 100}}; // 가변 배열 선언 후, 초기치 저장
		for(int i = 0; i < jum.length; i++) {
			for(int j = 0; j < jum[i].length; j++) {
				System.out.print(jum[i][j] + " ");
			}
			System.out.println();
		}
	}

}
