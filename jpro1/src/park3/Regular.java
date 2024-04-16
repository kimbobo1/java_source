package park3;

public class Regular extends Employee{

	int ilsu=0;
	int ildang=0;
	int salary=0;
	
	public Regular(String irum,int nai,int salary) {
		super(irum,nai);
		this.salary=salary;
		
		//this. 해당 클래스의 전역 변수 
	}
	

	public double pay() {
		return salary;
	}
	@Override
	public void print() {
		display();
		
	System.out.print("급여 :"+ (int)pay());	
		
	}
	

}
