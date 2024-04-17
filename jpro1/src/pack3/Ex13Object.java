package pack3;

//public class Ex13Object extends Object{
	public class Ex13Object {
	@Override
	public String toString() {
		//부모의 본래 기능을 자식이 원하는 명령으로 재정의
		return "자바여 영원하라";
	}
	public static void main(String[] args) {
		// 최상위 super클래스 object
		//모든 클래스는 자동으로 object 클래스를 상속
		Ex13Object obj = new Ex13Object();
		System.out.println(obj);
		System.out.println(obj.toString());

	}

}
