package park3;

public class EmployeeMain {

	public static void main(String[] args) {
		Temporary tem=new Temporary ("kimbo", 30, 2, 300000);
		tem.print();
		Regular reg= new Regular("kimd", 22, 4000000);
		reg.print();
		Salesman sal=new Salesman("kim", 22, 2000, 2, 0.2);
		sal.print();
		Manager man =new Manager( "bbbb", 33, 5000000);
		man.print();
		//인스턴스화 매니저 파라미터(매개변수)3개에 매니저 생성자 호출  아규먼트 
	}

}
