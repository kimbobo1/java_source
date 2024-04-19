package pack3;

public abstract class Ex19Employee {
	private String irum;
	private int nai;
	 
	public Ex19Employee(String irum, int nai) {
		this.irum = irum;
		this.nai = nai;
	}
	
	public abstract double pay();
	public abstract void print();
	
	public void display() {
		System.out.print("이름 : " + irum + ", 나이 : " + nai + ", ");
	}
	
}
