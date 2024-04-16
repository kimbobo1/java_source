package park3;

public class Ex15polyTaxi extends Ex15PolyCar{
	protected int passenger= 2;
	public Ex15polyTaxi() {
		System.out.println("난택시라고해");
		
	}
	public void displaySpeed() {
		System.out.println("승객"+passenger);
	}

}
