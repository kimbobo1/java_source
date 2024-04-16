package park3;

public class Ex18Main {

	public static void main(String[] args) {
		Ex18Cow cow = new Ex18Cow();
		System.out.println(cow.name());
		System.out.println(cow.action());
		System.out.println(cow.eat());
		cow.animalPrint();
		
		System.out.println();
		Ex18Lion lion = new Ex18Lion();
		System.out.println(lion.name());
		System.out.println(lion.action());
		System.out.println(lion.eat());
		lion.eatOther(); //사자 고유 메소드
		
		System.out.println();
		Ex18Animal animal = null;
		animal = cow;
		System.out.println(animal.name());
		animal =lion;
		System.out.println(animal.name());
		
		System.out.println("\n 별도의 클래스 사용해 보기");
		Ex18FindUtil.find(cow);
		System.out.println();
		Ex18FindUtil.find(lion);
		
		
	}
	

}
