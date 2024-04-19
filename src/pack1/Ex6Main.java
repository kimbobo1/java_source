package pack1;

public class Ex6Main {

	public static void main(String[] args) {
		// 같은 패키지에 있는 Ex6Bank 클래스를 사용
		Ex6Bank kildong = new Ex6Bank(); // Ex6Bank가 같은 폴더에 있으므로 문제없이 사용이 가능
		kildong.dePosit(5000);
		kildong.withDraw(2000);
		System.out.println("kildong 예금액 : " + kildong.getMoney());
		//kildong.money; // 에러, private 멤버이므로 해당 클래스에서만 참조 가능
		System.out.println("a:" + kildong.a);  // default  가능
		System.out.println("b:" + kildong.b);  // public   가능
		
		System.out.println();
		Ex6Bank dajeong = new Ex6Bank(2000);
		dajeong.dePosit(5000);
		dajeong.withDraw(2000);

		System.out.println("dajeong 예금액 : " + dajeong.getMoney());

		System.out.println("객체 주소 관련 ----------");
		System.out.println("kildong 주소 : " + kildong + " " + kildong.hashCode()); // 16진수 -> 10진수
		System.out.println("dajeong 주소 : " + dajeong + " " + dajeong.hashCode()); // kildong과 dajeong은 다른 객체를 참조하고 있음.
																					// 16진수 결과

		Ex6Bank tom = null; // Ex6Bank tom;
		System.out.println("tom 주소 : " + tom);
		// System.out.println("tom 예금액 : " + tom.getMoney()); // NullPointerException,
		// 객체 변수가 있기는 한데 어떤 인스턴스 주소도 가지고 있지 않은 상태
		tom = dajeong; // (참조형은) 주소를 치환, tom 과 dajeong의 주소는 같다.
		System.out.println("tom 예금액 : " + tom.getMoney());
		// System.out.println("tom 주소 : " + tom + " " + tom.hashCode()); 주소를 치환했으므로
		// dajeong과 주소값이 같다.

		if (dajeong == tom) {
			System.out.println("둘은 같은 주소");
		} else {
			System.out.println("둘은 다른 주소");
		}
		
		if (dajeong == kildong) {
			System.out.println("둘은 같은 주소임을 알림");
		} else {
			System.out.println("둘은 다른 주소야");
		}
		
		if(kildong instanceof Ex6Bank) {
			// instanceof : 객체 타입 비교 연산자
			System.out.println("Ex6Bank 타입이 맞아요");
		} else {
			System.out.println("Ex6Bank 타입이 아니군요");
		}
		
		System.out.println("\n스트링(String) 타입의 값 비교 --- ");
		String ss1 = "kor";   // String 클래스 : 기본형처럼 사용할 수 있도록 자바가 배려함 //literal pool에 "kor"가 들어오는데 이걸 ss2에서도 참조
		String ss2 = new String();  // 객체 생성하면 ss1에 참조한 것을 참조하므로 같음1이 나온다.  //pool 에 만들어지면 새로 생성되지 않고 참조.
		ss2 = "kor";
		String ss3 = new String("kor"); //ss3는 new string을 만들면 heap 영역에 만들어짐, 만들 때마다 heap에 새로 생성된다. 
		
		System.out.println(ss1 + " " + ss2 + " " + ss3);
		
		// a == b 기본형 -> 값 비교 , kildong == dajeong -> 주소 비교
		if(ss1 == ss2) // 문자열 비교는 == 를 사용 x // 객체 변수, 기본 변수를 비교할 때는 == 사용 
			System.out.println("같음1");
		else
			System.out.println("다름1");
		
		if(ss1 == ss3) 
			System.out.println("같음2");
		else
			System.out.println("다름2");
		
		// 그러므로 결론은 string은 주소 비교가 아니라 값을 비교하는 것이 목적이므로, equals()를 사용
		if(ss1.equals(ss3))  // 값 비교
			System.out.println("같음3");
		else
			System.out.println("다름3");
		if(ss1.equalsIgnoreCase(ss3))  // 값 비교(영문 대소문자 구분 안함)
			System.out.println("같음4");
		else
			System.out.println("다름4");
			
		// 싱글톤 패턴 : 시스템 내부에 1개의 인스턴스만 생성하고 싶은 경우 사용
	}

}
