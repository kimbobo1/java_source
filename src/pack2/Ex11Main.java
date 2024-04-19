package pack2;

public class Ex11Main {
	public static void main(String[] args) {
		// 클래스 포함관계를 이용한 커피 자판기 실행
//		Ex11_1Machine machine = new Ex11_1Machine();
//		machine.showData();
		
		new Ex11Machine().showData();
	}
	// 개발이 끝나면 배포를 해야한다.(jar)
	// a,b 프로젝트가 있다. public은 프로젝트 바깥으로 벗어날 수 없다. 다른 프로젝트에서 사용하기위해, 프로젝트 클래스파일을 묶는데 이 파일이 jar 파일. 빌드 패스하면됨, 라이브러리 보다 큰 것은 framework이다.
	// .java/.class < library(.jar) < framework
	
	// runnable jar 파일 -> os에 독립적
	
}
