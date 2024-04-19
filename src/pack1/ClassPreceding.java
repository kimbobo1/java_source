package pack1;

public class ClassPreceding {
	// 클래스 이해 전에 자원의 재활용에 대해 알아보기
	public static void main(String[] args) {
		int su1 = 6;
		int su2 = 3;

		System.out.println("방법1 사용");
		System.out.println("합은 " + (su1 + su2)); // 방법1
		System.out.println("차는 " + (su1 - su2));
		// 뭔가를 하다가..
		System.out.println();
		// 합과 차 구하기가 또 필요
		System.out.println("합은 " + (su1 + su2)); // 방법1
		System.out.println("차는 " + (su1 - su2));
		
		System.out.println("\n방법2 사용");
		// 별도의 단위 프로그램을 작성 후 필요할 떄 마다 호출
		hap(su1, su2);               // static 때문에 이태릭체로 변경됨
		cha(su1, su2);
		// 뭔가를 하다가..
		System.out.println();
		// 합과 차 구하기가 또 필요
		hap(su1, su2);              
		cha(su1, su2);
		
		System.out.println("\n방법3 사용 - ClassPre2의 단위 프로그램을 호출");   // 단위 프로그램 -> 호출
		// 별도의 단위 프로그램을 작성 후 필요할 떄 마다 호출
		ClassPre2 my = new ClassPre2();
		my.hap(su1, su2);
		my.hap(20, 5);
		my.cha(su1, su2);
	}

	public static void hap(int su1, int su2) {    // 방법2 : 함 구하기 코드 별도 작성  // 변수의 값을 기억하는 방법에는 치환과 메소드를 만들고 매개변수에 값 할당이 있다.
		System.out.println("합은 " + (su1 + su2)); 
	}                                             // 수행이 끝나면 반드시 돌아옴

	public static void cha(int su1, int su2) {
		System.out.println("차는 " + (su1 - su2)); 
	}
	
	// 클래스 설명 이유
	// 1. 클래스 작성
	// 2. 다른 사람이 만든(이미 존재하는) 클래스를 분석 후, 사용
	
	// 괄호가 있는 경우, 메소드이고 없는 경우, 필드
	
	// 클래스 다이어그램 : 클래스명(설계도), 멤버 필드(속성)(전역 변수), 멤버 메소드(행위)로 구성
	// Car(객체 or 인스턴스)라는 자동차를 만들 때, 클래스를 만들고 객체가 만들어짐 -> 이 중간 과정을 인스턴스화라고 한다.
	// 객체가 조금 더 큰 개념, 인스턴스를 대표하는 포괄적으로 객체라고 한다.
	// 클래스로 car 객체를 만들면 car 인스턴스라고 한다.
	// - private, + : public # : protect, none : default
	// OOP의 특징 정리 4가지 : 추상화 상속 다형성 캡슐화
}
