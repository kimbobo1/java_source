package pack3;

public class Ex15PolyMain {

	public static void main(String[] args) {
		Ex15PolyCar car1 = new Ex15PolyCar();
		Ex15PolyBus bus1 = new Ex15PolyBus();
		Ex15PolyTaxi taxi1 = new Ex15PolyTaxi();
		
		System.out.println();
		car1.displaySpeed();
		System.out.println(car1.getSpeed());

		System.out.println();
		bus1.displaySpeed();
		System.out.println(bus1.getSpeed());
		
		System.out.println();
		taxi1.displaySpeed();
		System.out.println(taxi1.getSpeed());
		
		System.out.println("\n-- 객체 주소 치환 --");
		Ex15PolyCar car2 = new Ex15PolyBus();  //promotion
		car2.displaySpeed(); // 자식 메소드를 호출(오버라이딩된 메소드는 호출 가능)
		System.out.println(car2.getSpeed()); // polybus 클래스에서 찾다가 없으면 polycar로 가서 찾는다.
		//car2.show(); // 단, 오버라이딩된 메소드만 가능. 자식 고유 메소드는 불간섭의 원칙에 의해 간섭(호출)할 수 없다. 오버라이딩된 메소드만 호출이 가능. 그러므로 show 메소드는 호출 불가 
		// 부모가 간섭할 수 있는 것은 부모가 선언한 메소드이고, 오버라이딩된 메소드만 호출이 가능하다.
		
		System.out.println();
		Ex15PolyCar car3 = taxi1;   //promotion  car3 객체변수는 폴리카타입이지만 taxi1의 주소를 가지고 있다.
		System.out.println("주소 확인 : " + car3 + " " + taxi1);  // 동일한 주소를 가진다.
		car3.displaySpeed();
		System.out.println(car3.getSpeed());
		
		
		System.out.println("\n===========");
		//Ex15PolyBus bus2 = new Ex15PolyCar();  // X 부모 객체를 생성하면서 자식 타입의 객체 주소를 전달할 수 없다.
		//Ex15PolyBus bus3 = car2; // car2는 폴리카타입인데 폴리버스 주소를 가지고 있다. 타입이 달라서 Type mismatch, 타입을 강제로 변환하면 된다. casting //부모객체 변수의 이름으로 오버라이딩된 메소드를 부르고 있다.
		Ex15PolyBus bus3 = (Ex15PolyBus)car2; //casting  ,폴리버스 타입 객체 변수를 생성하고 car를 주려고하는데 부모 타입 객체 변수는 줄 수 없다. 자식 객체의 주소를 가지고 있다.
		//car2는 부모 타입이지만 bus의 주소를 갖고 있으므로 casting에 의해 치환 가능
		bus3.displaySpeed();
		
		System.out.println();
		//Ex15PolyTaxi taxi2 = new Ex15PolyCar();  //error, type mismatch
		Ex15PolyTaxi taxi2 = (Ex15PolyTaxi)car3;  //car3는 부모 타입이지만 택시의 주소를 가지고 있으므로 casting 가능.
		taxi2.displaySpeed();
		
		//Ex15PolyTaxi taxi3 = (Ex15PolyTaxi)car1; // 문법 상 에러가 없음. 실행 시, 에러 -> javac 명령어는 문제없지만 런타임에러 발생(실행 오류)  //car1은 폴리택시의 주소를 가지고 있지 않기 때문
		
		System.out.println("====================");
		Ex15PolyCar mycar;
		mycar = bus1;
		mycar.displaySpeed();
		
		mycar = taxi1;
		mycar.displaySpeed();
		
		System.out.println();
		Ex15PolyCar p[] = new Ex15PolyCar[3];
		p[0] = car1;
		p[1] = bus1;
		p[2] = taxi1;
		
		for(Ex15PolyCar poly : p) {
			poly.displaySpeed();
		}
	}

}
