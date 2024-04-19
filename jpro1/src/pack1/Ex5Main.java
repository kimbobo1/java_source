package pack1;

public class Ex5Main {

	public static void main(String[] args) {
		// 메소드 오버로딩 연습
		Ex5AnimalOverLoad tiger = new Ex5AnimalOverLoad();
		tiger.display();
		tiger.display(5); //인수(인자, argument)
		tiger.display("호랑이");
		tiger.display("호랑이", 2);
		tiger.display(3, "보현");
		
		System.out.println("\n생성자 오버로딩-----");
		
		
		Ex5AnimalOverLoad dog = new Ex5AnimalOverLoad();
		dog.display();
		
		Ex5AnimalOverLoad hen = new Ex5AnimalOverLoad(2);
		hen.display();
		
		Ex5AnimalOverLoad wolf = new Ex5AnimalOverLoad("늑대", 4 , 3);
		wolf.display();
		
	}

}
