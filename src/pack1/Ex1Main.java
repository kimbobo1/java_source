package pack1;

public class Ex1Main {   // 응용 프로그램의 시작, 즉 main을 위한 클래스일 뿐.
	public static void main(String[] args) {
		System.out.println("이런 저런 작업을 하다가...");
		int a = 1;
		System.out.println("기본형 변수 a가 기억한 값: " + a);               // 기본형
		
		System.out.println();
		// 자동차 객체를 만들고 싶어..
		Ex1Car car1 = new Ex1Car();  // 클래스 -> 인스턴스화 -> 인스턴스(object)  
		// Ex1Car : 보조기억장치에 있는 Ex1Car.class를 주기억장치로 로딩
		// car1 : 객체 변수 - 객체의 주소를 기억, 주소를 가지고 본체를 찾아가는 car1은 참조변수
		// new : 인스턴스화를 위한 키워드
		// Ex1Car() : 생성자를 호출
		System.out.println("Ex1Car 타입의 객체 생성된 객체 주소 : " + car1);  // 참조형 car1은 인스턴스가 힙에 만들어져있는데 그 주소를 기억하고 있다.
		System.out.println("바퀴 수 : " + car1.wheel);     // 멤버 필드 호출
		car1.abc();           // 멤버 메소드 호출
		//car1.def();         // 클래스 안에서만 호출이 가능. private이므로 호출 불가, Ex1Main에서는 알 수 없음
		
		System.out.println("\n객체 하나 더 생성 ---");
		Ex1Car car2 = new Ex1Car();
		System.out.println("Ex1Car 타입의 객체 생성된 객체 주소 : " + car2);  // 참조형 car1은 인스턴스가 힙에 만들어져있는데 그 주소를 기억하고 있다.
		System.out.println("바퀴 수 : " + car2.wheel);     // 멤버 필드 호출
		car2.abc();           // 멤버 메소드 호출
		
		System.out.println();
		System.out.println(car1.getClass());  // 객체변수 타입 확인
		System.out.println(car2.getClass()); 
		System.out.println(car1.getClass() == car2.getClass()); // 두 개의 타입이 동일
		System.out.println(car1 == car2);  // 주소 비교
		
		
		// 주기억장치 내부
		// static : 보조기억장치에 있는 Ex1Car가 이 영역에 들어오면(1) // 응용 프로그램이 끝날때까지 여기 있는 내용은 사라지지 않음
		// stack : car1 객체 변수가 스택에 잡힘(기본 변수).(2), 생존시간이 가장 짧다. 휘발성
		// heap : car 객체가 이 영역에 만들어짐. 생성자에 의해 초기화할거 하고 객체가 만들어지는 위치
		//        객체의 주소를 가지고 있음 -> 그 주소를 가지고 stack의 변수에 값이 할당됨, 
		//        멤버나 메소드가 여기에 들어있다. 이것은 객체 변수(참조 변수)를 이용하여 불러온다. ex. car1.멤버필드
	    //        객체가 존재하는 곳, 아무도 참조 안하면 가비지에 컬렉터에 의해 사라짐.
		
		// 인스턴스가 힙에 만들어지고 stack에서 참조함. 참조 변수의 경우
		
		// 가비지 컬렉터 : 아무도 참조하지 않는 경우, 메모리 상에서 지워지도록 함.
		
		// 객체 변수는 주소를 기억하고 인스턴스를 찾아가는데 아무것도 참조하지 않을 경우, 에러(널포인터 예외)가 발생.
		
		
	}

}
