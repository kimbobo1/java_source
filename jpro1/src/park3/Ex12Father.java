package park3;



public class Ex12Father extends Ex12GrandFa{//단일 상속만 가능
	//Ex12GrandFa fa = new Ex12GrandFa();//포함관계
	
	public String gabo="꽃병";  //은닉화
	private int nai = 55;
	private int house = 1;
	
	//override
	public int getNai() { //method overriding(오버라이딩)
		return nai;
	}

	public Ex12Father() {
		//super(); //매개변수가 없는 부모 생성자 호출
		System.out.println("아버지 생성자");
		
		
	}
	public Ex12Father(int n) {
		System.out.println("아버지 생성자라고해");
		
	}
	public String say(){
		return "아버지말씀 : 에러잡는 연습해라";
	}
	public int getHouse() {//메소드에 final을하면 자식 클래스에서 오버라이딩 불가
		return house;
		//public String getHouse() {
		//return "집" + house + "채";
	}
	public void showData() {
		
		System.out.println("아버지 나이" + nai);  //블럭내에서 나이를 찾다가 맴버 변수로감
		System.out.println("아버지 나이" + getNai());
		System.out.println("아버지 나이" + this.nai);//바로 맴버 변수로감
		System.out.println("아버지 나이" + this.getNai());//블록내에서 찾다 없으면 부모클래스에서 찾아
		//System.out.println("아버지 나이" + super.nai);에러
		System.out.println("할아버지 나이" +super.getNai());//처음부터 부모클래스에게 감
		
		System.out.println();
		String gabo="물병";
		System.out.println("가보" + gabo);
		System.out.println("가보" + this.gabo);
		System.out.println("가보" + super.gabo);
		
		
	}
	
}

