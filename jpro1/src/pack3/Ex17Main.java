package pack3;

public class Ex17Main {

	public static void main(String[] args) {
		// 추상 클래스 연습 
		//Ex17Jepum jepum = new Ex17Jepum(); 추상 클래스는 인스턴스
		Ex17Jepum jepum = null;
		
		Ex17Radio radio = new Ex17Radio();  //라디오에서 오버라이딩을 꼭해야함
		jepum = radio;
		jepum.volumeControl();
		
		
		System.out.println();
		Ex17Tv tv=new  Ex17Tv(); //라디오에서 오버라이딩을 꼭해야함
		jepum = tv;
		jepum.volumeControl();
		
		
		System.out.println();
		Ex17Jepum jepumArr[]= {radio, tv};
		for(Ex17Jepum j:jepumArr) {
			j.volumeControl();
			
			
		}
		
		
			
			
	}
	

}
