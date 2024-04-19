package pack3;

public class Ex14Main {

	public static void main(String[] args) {
		// 개과의 동물들 상속으로 처리
		Ex14Dog dog = new Ex14Dog();
		dog.printMsg();
		System.out.println(dog.callName());
		
		System.out.println("\nHouseDog ------");
		Ex14HouseDog hd = new Ex14HouseDog("집개");
		hd.printMsg();
		System.out.println(hd.callName());
		
		System.out.println("\nWolfDog ------");
		Ex14WolfDog wolfDog = new Ex14WolfDog("늑대");
		wolfDog.printMsg();
		System.out.println(wolfDog.callName());
		System.out.println();
		wolfDog.display();
		
		System.out.println("\n\n주소 치환 ------------------");
		Ex14WolfDog bushdog = wolfDog;  // wolfDog의 주소를 bushDog에 전달 -> 두 개가 같은 wolfDog을 갖고 있음   // 같은 타입의 변수에게 주소를 치환
		wolfDog.printMsg();
		bushdog.printMsg(); // 18행과 동일
		
		System.out.println();
		// Ex14HouseDog hd2 = wolfDog; error -> Type mismatch
		Ex14Dog dog2 = wolfDog;  // 타입은 다르지만 부모변수에 자식변수 주소 치환 가능 // promotion
		dog2.printMsg(); // wolfDog에 있는 printMsg()가 나온다. //부모 객체변수에 자식 객체변수를 치환하고 부모객체변수의 이름으로 자식 메서드를 호출할 수 있다.
		
		Ex14Dog dog3 = new Ex14Dog();  // 부모 객체 변수
		dog3.printMsg(); 
		//Ex14WolfDog wolfDog2 = dog3;  // 자식 객체변수에 부모 객체변수 주소 치환 불가
		// wolfDog = dog3;
	}

}
