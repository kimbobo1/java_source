package pack;

public class Test11Array {
		// 4/2
	public static void main(String[] args) {
		// main 메소드의 매개변수(배열) 확인
		if(args.length == 0) {
			System.out.println("실행 시 값을 주세요");
			System.exit(0);
		}
		
		System.out.println(args.length);
		for(int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		System.out.println();
		for(String imsi : args) {
			System.out.println(imsi);
		}
		
		System.out.println("응용 프로그램 종료");

	}

}
