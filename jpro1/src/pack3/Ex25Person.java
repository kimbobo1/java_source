package pack3;

public class Ex25Person {
	public Ex25Saram getSaram() {
		//return new Ex25Saram();
		
		return new Ex25Saram()
		{   //내부 무명 클래스 
			public String getIr() { //Ex25saram 클래스의 메소드를 오버라이딩
				return "홍길동";
			}
		};
		
	}
}
