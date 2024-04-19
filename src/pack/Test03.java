package pack;

public class Test03 {

	public static void main(String[] args) {
		// 관계, 논리 연산자
		int a = 5;
		
		System.out.println(a > 3); // 관계(비교) 연산자
		boolean bo = a > 3;
		System.out.println(bo);
		System.out.println(a >= 3);
		System.out.println(a <= 3);
		System.out.println(a == 3);
		System.out.println(a != 3);
		
		System.out.println();
		int b = 10;
		System.out.println(a > 3);
		System.out.println(b > 3);
		System.out.println(a > 3 && b > 3); // && 논리 연산자 and
		System.out.println(a > 3 && b <= 3); //1 && 0 이므로 거짓, 둘 다 참이어야만 참
			
		System.out.println(a > 3 || b > 3); // || 논리 연산자 or
		System.out.println(a > 3 || b <= 3); // 하나라도 참이면 결과는 참.
		
		System.out.println(a > 3 || b <= 1 + 1 * 1);
		boolean bb = a < 3 || b <= 1 + 1 * 1;
		System.out.println(bb);
		// 연산자 우선순위 : ()소괄호 > 산술(*, / > +, -) > 관계 > 논리 > 치환
		
		System.out.println("\n\nshift 연산 -----------");
		int ii = 1, ij = 0;
		System.out.println("ii : " + Integer.toBinaryString(ii));
		ij = ii << 1; // << 좌측으로 1비트 이동, 남는 우측은 0으로 채움
		ij = ii << 30; // 4바이트이므로 31번째 비트까지 이동이 가능하고 32번째 비트로 이동하면 부호 비트가 변경되어 마이너스 값이 나온다.
		
		ij = ii >> 1; // >> 우측으로 1비트 이동, 남는 좌측은 부호(0 : 양수, 1 : 음수)와 같은 값으로 채움
		System.out.println("ii : " + ii + ", ij : "+ ij); // 지역변수 ij 초기화 필요
		
		ij = ii >>> 2; // 우측으로 2비트 이동, 남는 좌츠근 0으로 채움
		System.out.println("ii : " + ii + ", ij : "+ ij);
		
		System.out.println("삼항 연산자   (조건) ? 참 : 거짓");
		int sbs = 3;
		int mbc = (sbs > 5) ? 100 : 10 + 20 * 2;
		System.out.println(mbc);
		
		System.out.println();
		int x, y, z;
		x = y = z = 5;
		System.out.println(x + " " + y + " " + z);
		
		System.out.println("논리 연산자에서 주의할 점 ----");
		/*
		aa();
		
		System.out.println(aa());
		
		boolean imsi = aa();
		System.out.println(imsi);
		*/
		
		//boolean a1 = false, b1 = true, c1;
		boolean a1 = true, b1 = false, c1;
		c1 = a1 || b1; // false || true == true // or 연산
		System.out.println("c1 : " + c1);
		c1 = a1 && b1; // and 연산
		System.out.println("c1 : " + c1);
		
		System.out.println();
		boolean b2, b3;
		b1 = aa();
		System.out.println(b1);
		System.out.println(bb()); // static 함수를 부르면 이탤릭체로 변경됨.
		
		System.out.println("-------------------");
		//b2 = aa() || bb(); //aa는 출력, bb는 출력이 안된 이유 -> 하나가 참이므로 bb는 수행하지 않음 // aa() 수행 결과가 참이므로 bb()를 수행하지 않음
		//b2 = bb() || aa(); // bb는 false, aa는 true -> bb가 false 이므로 참이 아니니 aa도 확인을 해야한다. 
		b2 = aa() | bb(); // or : 모든 메소드 호출 // i think: 이것은 비트 연산자이므로 aa()가 1이더라도 비교 대상인 bb()와 비교를 해야만 하므로  
		System.out.println(b2);
		
		System.out.println();
		//b3 = aa() && bb();
		//b3 = bb() && aa(); // bb()가 false이므로 aa()를 무시
		b3 = bb() & aa(); //0 & 1 -> 1
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
