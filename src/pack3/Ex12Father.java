package pack3;

// 단일 상속만 가능, extends [클래스 1개]
public class Ex12Father extends Ex12GrandFa{   // 부모(super, parent) 클래스 GrandFa를 상속받는 자식(child, sub, 파생) 클래스 Father
	//Ex12GrandFa fa = new Ex12GrandFa();      // 포함관계
	
	public String gabo = "꽃병";        // 은닉화
	private int nai = 55;
	private int house = 1;
	
	public Ex12Father() {
		//super(55);   // 매개변수가 없는 부모 생성자 호출, 이걸 쓰지 않으면 기본적으로 실행됨.
		System.out.println("아버지 생성자");
		
	}
	
	public Ex12Father(int n) {
		
		System.out.println("아버지 생성자라고 해");
	}
	
//	@Override         // 어노테이션, 메소드이다.  getNai는 오버라이드한 것이다.   오버라이딩 시, 부모와 메서드명이 같은지 체크해주는 역할.
	public int getNai() {  // 메소드 오버라이딩 : 부모가 선언한 메소드를 자식이 재정의, 부모가 가진 동일명의 메소드를 자식에서 다시 선언.
		return nai;
	}
	
	public String say() { // 좌측 초록색 삼각형이 오버라이딩을 표시해주고 있음.
		return "아버지 말씀 : 에러 잡는 연습을 하거라";
	}
	
	public final String getHouse() {   // 메소드에 fianl하면 자식클래스에서 오버라이딩 불가
		return "집 : " + house + "채";
	}
	
	public void showData() {
		System.out.println("아버지 나이 : " + nai);  // 현재 블럭 내에서 지역변수 나이를 찾음, 없으면 멤버 필드로 올라가서 찾는다.
		System.out.println("아버지 나이 : " + this.nai);  // 처음부터 멤버 필드로 올라가서 찾는다.
		System.out.println("아버지 나이 : " + getNai());  // 현재 클래스의 메소드를 찾느다.   // 현재 클래스에 메소드가 없으므로 부모 클래스에 올라가서 getNai 메소드를 찾아간다.
		System.out.println("아버지 나이 : " + this.getNai());   // 39행과 동일.
		
		//System.out.println("할아버지 나이 : " + super.nai); // 에러
		System.out.println("할아버지 나이 : " + super.getNai());   //39행과 다르다. 처음부터 부모로 간다.
		
		System.out.println();
		String gabo = "물병";
		System.out.println("가보 : " + gabo);   //물병
		System.out.println("가보 : " + this.gabo); // 꽃병
		System.out.println("가보 : " + super.gabo); // 상감청자
	
	}
}
