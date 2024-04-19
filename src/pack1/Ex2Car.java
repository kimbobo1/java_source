package pack1;

public class Ex2Car {
	private int speed;
	public String irum;
	private double weight;
	
	public Ex2Car() {
		irum = "홍길동";
		speed = 10;
	}
	
	public void showData() {
		System.out.println("이름은 " + irum + ", 속도는 " + speed);
	}
	
	//public void abcd(int s, int password) { // private 멤버값을 외부에서 접근하기 위한 메소드
	public void setSpeed(int s) {    // speed에만 집중, setter 메소드(명명법 : (set + private 변수명) -> setSpeed)
//		if(password == 123) {
//			speed = s;			
//		}
		speed = s;
		//return; // 생략 가능
	}
	
	public int getSpeed() {  // getter 메소드, private 멤버를 외부에서 접근하게 하기 위해 사용   // 반환값은 int 형 
		return speed;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {  // w는 지역변수
		//weight = w;                    // weight(멤버 필드)에 w를 할당
		//weight = weight                // 자기(지역변수)가 자기한테 준 것, 지역변수 멤버필드 같은 이름인 경우, 지역에서 먼저 찾기 때문에 멤버 필드에 값이 가지 않는다. 
		this.weight = weight;            //이름을 같게 주고 싶을 떄는 다음과 같이 하면된다. , 멤버필드 weight에 지역 변수 weight 값을 전달
		// 현재 클래스의 멤버에 접근하기 위해 this 사용
	}                                    
	// this, this() 차이 -> this()는 오버로딩을 알아야 함.
	
	
	
}
