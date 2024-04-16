package pack;

public class Test3 {

	public static void main(String[] args) {
		// 관계 논리 연산자
		int a = 5;
		
		
		System.out.println(a > 3);
		boolean bo = a > 3;
		System.out.println(bo);
		System.out.println(a >= 3);
		System.out.println(a <= 3);
		System.out.println(a == 3);
		System.out.println(a !=3);
		
		
		System.out.println();
		int b = 10;
		System.out.println(a > 3);
		System.out.println(b > 3);
		System.out.println(a > 3 && b > 3); //   &&(and)  논리 연산자 
		System.out.println(a > 3 && b <= 3);  //하나라도 false 이면 전체가 false
		
		System.out.println(a > 3 || b > 3);  //  ||(or) 논리연산자 
		System.out.println(a > 3 || b <= 3);  // 하나만 true 여도 전체가 true 모두가 false 때 false 
		
		System.out.println(a < 3 || b <= 1 + 1 * 1);
		boolean bb = a < 3 || b <= 1 + 1 * 1;
		System.out.println(bb);
		// 연산자 우선순위 : () 소괄호 > 산술연산자(*,/>+, -) > 관계 > 논리 > 치환
		
		
		System.out.println("shift 연산-------------");
		int ii = 8, ij = 0;
		
		
		
		System.out.println("ii:" + Integer.toBinaryString(ii));
		
		ij = ii << 1;  // << 좌측으로 1bit 이동 남는 우측은 0으로 채움
		
		System.out.println("ii:" + ii + ",ij:" + ij); // 지역 변수 ij 초기화가 필요
         ij = ii >> 1;  // << 우측으로 1bit 이동 남는 좌측은 부호(0:양수, 1:음수)와 같은 값으로 채움
		System.out.println("ii:" + ii + ",ij:" + ij);
		
		
		ij = ii >>> 2;  // << 우측으로 2bit 이동 남는 좌측은 0으로 채움
		System.out.println("ii:" + ii + ",ij:" + ij);
		
		
		
		System.out.println("삼항 연산자    (조건)?참일때:거짓일때값");
		int sbs = 8;
		int mbc = (sbs > 5)?100:10 + 20 * 2;
		System.out.println(mbc);
		
		System.out.println();
		int x, y, z;
		x =y = z = 5;
		System.out.println(x + " " + y + " " + z);
		
		
		System.out.println("논리 연산자에서 주의할 점-----");
		/*
		aa();
		aa();
		aa();
		*/
		//boolean a1 = false, b1 = true, c1;
		boolean a1 = true, b1 = false, c1;
		c1 = a1 || b1;
		System.out.println("c1 : " + c1);
		c1 =a1 && b1;
		System.out.println("c1 : " + c1);
		
		System.out.println();
		boolean b2, b3;
		b1 = aa();
		System.out.println(b1);
		System.out.println(bb());
		System.out.println("~~~~~~");
		//b2 = aa() || bb(); //aa() 수행 결과가 참이므로 bb() 수행안함
		//b2 = bb() || aa(); 
		b2 = aa() | bb(); //or : 모든 메소드 호출
		
		System.out.println(b2);
		
		System.out.println();
		//b3 = aa() && bb();
		//b3 = bb() && aa();
		b3 = bb() & aa();
		System.out.println(b3);
		
		
		System.out.println("프로그램 종료");
		
	
		
	
	}
	public static boolean aa() {
		 System.out.println("aa 출력");
		 return true;
	}
	public static boolean bb() {
		 System.out.println("bb 출력");
		 return false;
	
	}	
}
	
