package park3;

public interface Ex21Resume {//이력서 표준 양식 
	String SIZE = "A4"; //public final static String SIZE = "A4";
	//int kor = 90;
	
	void setIrum(String irum); //추상메소드 
	void setPhone(String phone);
	void printData();
	
	//java 1.8 이후가능   default 안적으면 오류가남 
	default void display(boolean b) {
		if(b) {
			System.out.println("참");
		}else {
			System.out.println("거짓");
		}
	}
	
	//static을 안적으면 오류가 남 
	
	static void play() {
		System.out.println("play 메소");
	}
	

}
