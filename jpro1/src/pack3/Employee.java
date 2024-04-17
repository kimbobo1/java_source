package pack3;

abstract public class Employee {
	private String irum;
	private int nai;
	abstract public double pay(); 
	abstract public void print();
	
	
	
	public  Employee(String irum,int nai) { 
		this.irum=irum;
		this.nai=nai;
	
	
	
	}

	public void display() {
		System.out.print(" 이름 :"+irum+" 나이 : "+nai+", ");
		
	//()메소	
	}

}
