package pack3;

public class Ex25Person {
	public Ex25Saram getSaram() { // 반환값 Ex25Saram
		//return new Ex25Saram();  // Ex25Saram이라는 객체를 반환
		
		return new Ex25Saram()   // 약속. 반환형은 사람객체인데 아래의 클래스를 달고 간다. 아래 블록에서 Ex25Saram이 가지고 있는 메소드를 오버라이딩할 수 있다.
		{	// 내부 무명 클래스
			public String getIr() {  // Ex25Saram 클래스의 메소드를 오버라이딩
				return "홍길동";
			}
		};   // 메소드를 가지고 있으므로 클래스임. 
	}
}
