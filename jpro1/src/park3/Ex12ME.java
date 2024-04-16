package park3;

public class Ex12ME extends Ex12Father {
	final int score = 90;  //멤버필드에 파이널 하면 값수정 불가
	public Ex12ME() {
		//spuer();//생략가능
		System.out.println("내 생성자");
		//score = 80;
		}
	
	public void biking() {
		System.out.println("자전거로 전국일주드가자");
		}
		
		//public int getHouse() {//부모에 final해서 오버라이딩 불가
			//return house;	
	//}
	

	

}
