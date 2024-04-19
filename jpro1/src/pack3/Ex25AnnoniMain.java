package pack3;

public class Ex25AnnoniMain {

	public static void main(String[] args) {
		//내부 무명 클래스 연습
		Ex25Saram saram = new Ex25Saram();
		System.out.println(saram.getIr());
		
		System.out.println();
		Ex25Person person = new Ex25Person();
		Ex25Saram saram2 = person.getSaram();
		System.out.println(saram2.getIr());

	}

}
