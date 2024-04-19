package pack3;

public interface Ex21Resume {   // 이력서 표준 양식
	String SIZE = "A4";    // public final static String SIZE = "A4";
	// int kor = 90;
	
	void setIrum(String irum);       // 추상 메소드만 가능
	void setPhone(String phone);
	void printData();
	
	// java 1.8 이후에 가능
	// 추상 메소드로 구성되는 것이 일반적이지만 메소드 이름에 디폴트 또는 스태틱을 선행해도 쓸 수 있다.
	default void display(boolean b) {    //default 지정자 사용 시 가능
		if(b) {
			System.out.println("참");
		} else {
			System.out.println("거짓");
		}
	}
	
	static void play() {   // 접근 지정자가 없으면 에러, static 사용 시 에러 x
		System.out.println("play 메소드");
	}
}
