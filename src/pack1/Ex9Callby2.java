package pack1;

//call-by-value, call-by-reference
public class Ex9Callby2 {
	public void ex(int a, int b) {  // 매개변수(parameter)로 기본형 사용
		int imsi = a;
		a = b;
		b = imsi;
		System.out.println("메소드 내의 a : " + a + ", b : " + b);
	}
	
	public void ex(Ex9Callby1 data) { // 매개변수(parameter)로 참조형 사용
		int imsi = data.a;            // 객체의 주소를 이용하여 멤버를 참조
		data.a = data.b;
		data.b = imsi;
		System.out.println("메소드(참조형) 내의 data.a : " + data.a + ", data.b : " + data.b);
	}
	
	public void ex(int[] ar) {
		int imsi = ar[0];
		ar[0] = ar[1];
		ar[1] = imsi;
		System.out.println("메소드 내의 배열요소[0] : " + ar[0] + ", [1] : " + ar[1]);
	}
	// has - a : 포함관계 Resource r = new Resource();
	// is - a : 상속관계 Test extends Resource
	
}
