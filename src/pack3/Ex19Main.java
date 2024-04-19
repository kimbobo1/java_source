package pack3;

public class Ex19Main {

	public static void main(String[] args) {
		Ex19Temporary tem = new Ex19Temporary("홍길동", 23, 20, 150000);
		tem.print();
		
		Ex19Regular reg = new Ex19Regular("신기해", 25, 2345000);
		reg.print();
		
		Ex19Salesman sal = new Ex19Salesman("손오공", 27, 2890000, 30000, 0.25);
		sal.print();
		
		Ex19Manager man = new Ex19Manager("사오정", 33, 4578000);
		man.print();

	}

}
