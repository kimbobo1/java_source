package pack3;

public class Salesman extends Regular{
	int sales=0;
	double commission=0;
	public Salesman(String irum,int nai, int salary,int sales,double commission) {
		super(irum,nai,salary);//부모클래스에 생성자 호출
		this.sales=sales;
		this.commission=commission;
		
		
	}
	@Override
	public void print() {
		display();
		System.out.println((int)pay()+" "+(sales*commission));
	}

}
