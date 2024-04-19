package pack;

public class Test08For {

	public static void main(String[] args) {
		// 반복문 : continue, break
		System.out.println("뭔가를 하다가...");
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
			if(i == 3) continue; //i가 3인 경우, 건너뛴다.
			// if(i == 5) break; // 자기를 포함하는 반복문을 무조건 탈출. //중첩 반복문에 대해 실행.
			//if(i == 5) System.exit(0);  
			System.out.println("금요일");
		}
		
		System.out.println();
		int kk = 0;
		for(;;) { // 무한 반복
			kk++;
			System.out.println("무한 반복 출력");
			if(kk == 10) break;
		}
		
		System.out.println();
		kbs:for(int i = 1; i <= 3; i++) {
			mbc:for(int j = 1; j <= 5; j++) {
				System.out.print(i + " " + j + "  ");
				if(j == 3) continue kbs; // 아무것도 없는 경우 mbc로 이동, //kbs로 이동이 가능하다. // 해당 label로 분기
				if(j == 5) break mbc; //없는 경우 mbc를 빠져나감/ kbs를 입력하면 kbs를 빠져나감
			}
			System.out.println("~~~~~");
		}
	}

}
