package park3;

public class Ex15PolyMain { 
	public static void main(String[] args) {
	
		
			Ex15PolyCar car1 = new Ex15PolyCar(); //나는 자동차 원형클래스
			Ex15PolyBUs bus1 = new Ex15PolyBUs(); //나는 자동차 원형클래스
			Ex15polyTaxi taxi1=new Ex15polyTaxi();
			System.out.println();
			car1.displaySpeed();
			System.out.println(car1.getSpeed());
			
			System.out.println();
			bus1.displaySpeed();
			System.out.println(bus1.getSpeed());
			bus1.show();
			
			System.out.println();
			taxi1.displaySpeed();
			System.out.println(taxi1.getSpeed());
			
			
			System.out.println("===객체 주소 치환==");
			Ex15PolyCar car2 = new Ex15PolyBUs();//prootion
			car2.displaySpeed(); //부모 객체변수로 호출     오버라이딩된 멧ㄷ는 호출 가능
			System.out.println(car2.getSpeed());
			//car2.show();//오버라이딩된것만 할수있당 자식 고유의 메소드는 간섭 불가
			System.out.println();
			Ex15PolyCar car3= taxi1;//promotion
			System.out.println("주소확인:"+car3+" "+taxi1);
			car3.displaySpeed();
			System.out.println(car3.getSpeed());
			
			System.out.println("\n");
			//Ex15PolyBUs bus2 = new Ex15PolyCar(); //부모객체를 자식한테 줄수없음x
			Ex15PolyBUs bus3 = (Ex15PolyBUs)car2; //성립 casting
			//car2는 부모 타입이지만 bus의 주소를 갖고 있으므로 캐스팅에 의해 치환가능
			bus3.displaySpeed();
			
			System.out.println();
			//Ex15polyTaxi taxi2=new Ex15PolyCar();//타입 미스매치 부모꺼를 자식한테 치환안됌 
			Ex15polyTaxi taxi2 = (Ex15polyTaxi)car3; //casting
			taxi2.displaySpeed();
			
			//Ex15polyTaxi taxi3 = (Ex15polyTaxi)car1;// 실행 오류 runtime error -classcastexception
			System.out.println("______");
			Ex15PolyCar mycar;
			mycar = bus1;
			mycar.displaySpeed();
			
			mycar = taxi1;
			mycar.displaySpeed();
			
			System.out.println();
			Ex15PolyCar p[]=new Ex15PolyCar[3];
			p[0] =car1;
			p[1]=bus1;
			p[2]=taxi1;
			for( Ex15PolyCar poly:  p) {
				poly.displaySpeed();
				
			}
			
		}	
	
	
	
	

}
