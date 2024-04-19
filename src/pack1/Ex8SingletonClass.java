package pack1;

public class Ex8SingletonClass {
	int kor = 90;
	
	public Ex8SingletonClass() {
		
	}
	
	// 객체의 인스턴스가 오직 1개만 생성되는 패턴을 만들기
	// 장점 : 메모리 절약, 데잉터 공유 편리
	// 단점 : 테스트가 불편, 유연성이 떨어짐
	
	private static Ex8SingletonClass class1 = new Ex8SingletonClass();// 자기가 new를 함, 자기 자신을 반환
	
	public static Ex8SingletonClass getInstance() {  // [접근제어자][클래스 자체 호출][클래스명][메소드명]
		return class1;   // 자기가 객체를 선언 후, 리턴
	}
	
	// 4행 : kor 변수에 90 할당
	// 6행 : 기본 생성자 생성
    // 14행 : 객체 변수 class1을 생성, 이 행에서 new하여 객체를 생성하고 main 메소드에서 객체 생성을 할 수 없도록 기타지정자 static 사용
	// 16행 : 반환형은 Ex8SingletonClass이고 메소드명은 getInstance
	// 17행 : Ex8SingletonClass 형태를 가진 객체 변수 class1을 반환하여 main함수에서 객체를 추가적으로 생성할 수 없도록 함
}
