package pack3;

public class Ex23FlyerUtil {
	public static void show(Ex23Flyer f) {   //flyer 타입의 객체 주소를 넘겨줌. flyer 서브 클래스 포함.
		f.fly();
		System.out.println("동물인가요? " + f.isAnimal());
	}
}

// 어댑터 클래스는 추상 클래스임.
