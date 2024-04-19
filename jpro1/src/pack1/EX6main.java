package pack1;

public class EX6main {

	public static void main(String[] args) {
		//같은 패키지에 있는 Ex6bank 클래스를 사용
		Ex6Bank kildong = new Ex6Bank();
		kildong.dePosit(5000);
		kildong.withDraw(2000);
		System.out.println("kildong 예금액:" + kildong.getMoney());
		//kildong.money;//에러  :private 멤버이므로 해당 클래스 에서만 참조
		System.out.println("a:" + kildong.a); //default 가능
		System.out.println("a:" + kildong.b); //public 가능
		
		
		System.out.println();
		Ex6Bank bo = new Ex6Bank(2000);
		bo.dePosit(5000);
		bo.withDraw(2000);
		System.out.println("bo 예금액:" + bo.getMoney());
		
		System.out.println("객체 주소 관련------");
		System.out.println("kildong 주소 :" + kildong);
		System.out.println("bo 주소 :" + bo);
		
		Ex6Bank tom = null;   // Ex6Bank tomm;
		System.out.println("tom 주소 :" + tom);
		//System.out.println("tom 예금액:" + tom.getMoney()); // NullPointerException
		tom = bo; //주소 치환
		System.out.println("tom 예금액:" + tom.getMoney());
		
		if(bo == tom) {
			System.out.println("둘은 같은 주소");

		} else {
			System.out.println("둘은 다른주소");
		}
		if(bo == kildong) {
			System.out.println("둘은 같은 주소임을 알림");

		} else {
			System.out.println("둘은 다른 주소임");
		}
			System.out.println(bo instanceof Ex6Bank);
		if (bo instanceof Ex6Bank) {
			// instanceof :객체 타입 비교 연산자
			System.err.println("Ex6Bank 타입이 맞아");

		} else {
			System.out.println("ㅠㅠ Ex6Bank 타입이 아님");
		}
		System.out.println("\n스트링(String) 타입의 값 비교 --------");
		String ss1="kor"; // String 클래스 :기본형 처럼 사용 할수 있도록 자바가 배려
		String ss2 = new String();
		ss2 = "kor";
		String ss3 = new String("kor");
		
		System.out.println(ss1+ " " + ss2 + " " + ss3);
		
		
		if(ss1 == ss2)  //주소 비교
			System.out.println("같음1");
		else
			System.out.println("다름1");
		if(ss1 == ss3)
			System.out.println("같음2");
		else
			System.out.println("다름2");
		
		//그러므로 결론은 String은 주소 비교가 아니라 값을 비교하는 것이 목적이므로 equals()사용
		if(ss1.equals(ss2)) //값 비교
			System.out.println("같은3");
		else 
		System.out.println("다름3");
		
		
		
		
	}

}
