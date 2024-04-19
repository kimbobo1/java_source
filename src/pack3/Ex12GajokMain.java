package pack3;

public class Ex12GajokMain {

	public static void main(String[] args) {
		// 상속 연습 : 우리 가족 소개
		Ex12GrandFa gr1 = new Ex12GrandFa();
		System.out.println("가보 : " + gr1.gabo);
		System.out.println("가훈 : " + gr1.gahun);
		System.out.println(gr1.say());
		gr1.eat();
		System.out.println("할아버지 나이 : " + gr1.getNai());
		
		System.out.println();
		// 매개변수가 있는 생성자 호출
		Ex12GrandFa gr2 = new Ex12GrandFa(77);
		System.out.println("가훈 : " + gr2.gahun);
		System.out.println("할아버지 나이 : " + gr2.getNai());
		
		System.out.println("\n아버지에 대해 -------------------");
		Ex12Father father = new Ex12Father();
		//father.   // nai는 Grandfa 클래스의 private이라 나오지 않음
		System.out.println("가보 : " + father.gabo);  // gabo 변수가 father 클래스에 없으므로 grandfa 클래스에 가서 가져온다.
		System.out.println("가훈 : " + father.gahun);
		System.out.println(father.say());
		father.eat();
		System.out.println("아버지 나이 : " + father.getNai());
		System.out.println(father.getHouse());
		
		father.showData();
		
		System.out.println("\n나에 대해 -------------");
		Ex12Me me = new Ex12Me();
		System.out.println("가보 : " + me.gabo);  // gabo 변수가 father 클래스에 없으므로 grandfa 클래스에 가서 가져온다.
		System.out.println("가훈 : " + me.gahun);
		System.out.println(me.say());
		me.eat();
		System.out.println("나이 : " + me.getNai());
		System.out.println(me.getHouse());
		me.biking();
	}

}
