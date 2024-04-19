package pack;

public class Test8for {

	public static void main(String[] args) {
		// 반복문 : continue, break
		System.out.println("뭔가를 하다가...");
		for(int i=1; i <=10; i++) {
			System.out.println(i);
			if(i ==3) continue; //아래 문장을 무시한다
		    if(i == 5) break; //자기를 포함하고있는 반복문을 탈출
		    //if(i==5) System.exit(0);
			System.out.println("금요일");
		}
		System.out.println();
		int kk=0;
		for(;;) {
			kk++;
			System.out.println("무한 반복 출력");
			if(kk == 10) break;
		}
		System.out.println();
		kbs:for(int i=1; i <=3; i++) {
			mbc:for(int j=1; j<=5; j++) {
				System.out.print(i+ " " + j + " ");
				if(j == 3) continue kbs; //해당 label로 분기
				if(j==5) break kbs;
			}
			System.out.println("~~~~~");
		}
		
	}

}
