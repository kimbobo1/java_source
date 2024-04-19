package pack3;

public class Ex19Temporary extends Ex19Employee{
	private int ilsu;
	private int ildang;
	
	public Ex19Temporary(String irum, int nai, int ilsu, int ildang) {
		super(irum, nai);
		this.ilsu = ilsu;
		this.ildang = ildang;
	}
	
	@Override
	public double pay() {
		int salary = ilsu * ildang;
		return salary;
	}

	@Override
	public void print() {
		display();
		System.out.println("월급 : " + (int)pay());
	}

}
