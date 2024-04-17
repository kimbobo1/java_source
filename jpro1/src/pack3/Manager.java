package pack3;

public class Manager extends Regular{
	double incentive;
	public Manager(String irum,int nai,int salary) {
		super(irum,nai,salary);
		
	}

	
	public void print() {
		display();
		if(pay()>=2500000) {
			incentive= pay()*0.6;
		}else if(pay() >=2000000){
			incentive=pay()*0.5;
			
		}else {
			incentive=pay()*0.4;
		}
		System.out.print(incentive+(int)pay());
		
	}
	

}
