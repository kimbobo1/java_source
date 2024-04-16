package park3;

import java.security.interfaces.RSAKey;

public class Ex21Main {

	public static void main(String[] args) {
		// 지원자가 작성한 이력서를 인사 담당자가 취합하여 이력서 출력
		System.out.println("톰 이력서 작성후 출력");
		Ex21Tom tom = new Ex21Tom();
		tom.setIrum("톰");
		tom.setPhone("123");
		tom.setJuso("강남구");
		tom.printData();
		
		System.out.println("제임스 이력서 작성후 출력");
		Ex21James james = new Ex21James();
		james.setIrum("제임");
		james.setPhone("123444");
		james.setskill("정처기");
		james.printData();
		
		
		System.out.println("\n 인사담당자 ");
		Ex21Resume[] resBox = new Ex21Resume[2];
		resBox[0] = tom;
		resBox[1] = james;
		
		
		for (Ex21Resume r:resBox) {
			r.printData();
			System.out.println();
			
		}		
				
	}

}
