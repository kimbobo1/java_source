package Employee;

public class Regular extends Employee{
	private int salary;
	
	public Regular(String name, int age, int salary) {
		this.salary = salary;
		System.out.println("이름 : ");
		System.out.println("나이 : ");
		System.out.println("급여 : " + salary);
	}
}
