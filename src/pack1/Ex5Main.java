package pack1;

public class Ex5Main {

	public static void main(String[] args) {
		// 메소드 오버로딩 연습 -> 메소드들이 하는일이 비슷하므로 메소드 명을 같게 하여 파라미터의 개수, 숱서 타입을 기준으로 구분하여 사용
		Ex5AnimalOverload tiger = new Ex5AnimalOverload(); // 객체 변수 tiger
		tiger.display();
		tiger.display(5);    // 인수(인자, argument)
		tiger.display("호랑이");         //argument != parameter
		tiger.display("호랭이", 10);
		tiger.display(3, "호돌이");
		
		System.out.println();
		// 생성자 오버로딩 -> 생성자도 메소드, new 하면서 단 한번만 실행이 가능, 초기화 담당
		System.out.println("생성자 오버로딩  -------");
		Ex5AnimalOverload dog = new Ex5AnimalOverload();  // 기본 멤버 필드 값을 사용
		dog.display();
		
		Ex5AnimalOverload hen = new Ex5AnimalOverload(2);
		hen.display("닭");
		
		Ex5AnimalOverload wolf = new Ex5AnimalOverload("늑대", 3, 4);
		wolf.display();
	}

}
