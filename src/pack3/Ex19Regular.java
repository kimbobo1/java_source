package pack3;

public class Ex19Regular extends Ex19Employee{
	private int salary;
	
	public Ex19Regular(String irum, int nai, int salary) {
		super(irum, nai);
		this.salary = salary;
	}
	
	@Override
	public double pay() {
		return salary;
	}

	@Override
	public void print() {
		display();
		System.out.println("급여 : " + (int)pay());   
		
	}
	
}
