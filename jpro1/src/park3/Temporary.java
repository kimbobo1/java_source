package park3;

public class Temporary  extends Employee{
	
	private int ilsu;
	private int ildang;
	
	
	public Temporary(String irum,int nai,int ilsu,int ildang) {
		super(irum,nai);
		this.ilsu=ilsu;
		this.ildang=ildang;
	}
		
	@Override
	public double pay() {
		int salary =ilsu * ildang;
		return salary;
	}
	
	
	
	@Override
		public void print() {
			display();
			System.out.print("월급 :"+(int)pay());
				
			
		
	}

}
