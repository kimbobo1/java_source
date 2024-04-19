package pack3;

//public class Ex13Object extends Object{   //extends Object가 생략되어 있는 상태, 기본적으로 Object 클래스를 상속을 받고 있다. 
public class Ex13Object {
	@Override
	public String toString() {
		// 오버라이딩 : 부모의 본래 기능을 자식이 원하는 명령으로 재정의
		return "자바여 영원하라";
	}
	
	public static void main(String[] args) {
		// 최상위 수퍼 클래스 Object
		// 모든 클래스는 자동으로 Object 클래스를 상속받는다. - 진리
		Ex13Object obj = new Ex13Object();
		System.out.println(obj);   // 13행과 동일
		System.out.println(obj.toString());   // toString() : 주소찍는 용도(객체 변수의 주소를 출력)
	}
}
