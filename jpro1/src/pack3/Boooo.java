package pack3;

public class Boooo extends Kimbobo{
	public Boooo() {
		
	}
	private String add;
	private String phone;
	
	public Boooo(String irum,int age,String add, String phone) {
		super(irum,age);
		
		this.add=add;
		this.phone=phone;
		
	}
	public void showData1() {
		showData();
		System.out.println("주소소"+add);
		System.out.println("폰"+phone);
		
	}
	

}
