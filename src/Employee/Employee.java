package Employee;

public abstract class Employee {
	private String irum;
	private int nai;
	
//	public abstract double pay() {
//		return 0;
//	}
	
//	public abstract void print() {
//		
//	}
	
	void display() {
		System.out.println("이름 : " + irum);
		System.out.println("나이 : "+ nai);
	}
}
