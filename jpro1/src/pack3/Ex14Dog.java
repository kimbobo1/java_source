package pack3;

public class Ex14Dog {
	//개과의 동물이 가져야할 기본 속성과 행위를 별도의 클래스로 작성후 상속
	private String name = "개"; //이름을적는다
	
	
	public Ex14Dog() {
		
		}
	public Ex14Dog(String name) { //생성자를만듬
		this.name = name;
		
	}
	public String getName() { //이름을 쓸거야!!
		return name;
	}
	public String callName() {
		return"종류 :"+name;   //종류는뭐야
		
	}
	public void printMsg() {
		System.out.println(name +" : 지구에 산다" );
	}
}
