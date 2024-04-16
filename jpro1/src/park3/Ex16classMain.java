package park3;

public class Ex16classMain {

	public static void main(String[] args) {
		//부모클래스 생성후volumecontrol()을 오버라딩 하여 다형성 구사 
		
		Ex16ElecPolyProduct product=null;; //부모 객체로만 의미를 가짐 
		Ex16ElecPolyRadio radio = new Ex16ElecPolyRadio();
		radio.setVolume(7);
		System.out.println(radio.getVolume());
		radio.volumControl();
		
		System.out.println();
		Ex16ElecPolyTv tv= new Ex16ElecPolyTv();
		tv.setVolume(3);
		tv.volumControl();
		tv.tvShow();///tv고유메소드  
		
		System.out.println("\n다형성---");
		product= radio; //프로모션 자식의 주소를 부모 객체변수에 치환
		product.volumControl();
		System.out.println();
		product=tv;
		product.volumControl();
		
				
	}

}
