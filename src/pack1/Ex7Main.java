package pack1;

public class Ex7Main {

	public static void main(String[] args) {
		Ex7Production test = new Ex7Production();
		// 메소드 오버로딩
		System.out.println("메소드 오버로딩 ---");
		test.show();
		test.show("이름");
		test.show("이름2", 10000);
		test.show("이름3", 10000, 70.5);
		
		
		// 생성자 오버로딩
		System.out.println("\n생성자 오버로딩 ---");
		Ex7Production test2 = new Ex7Production("이름4");
		test2.show();
	}

}
