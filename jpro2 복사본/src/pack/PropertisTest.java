package pack;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertisTest {

	public static void main(String[] args) {
		// properties file 읽기
//		개발자들이 소스에 직접 값을 하드 코딩하는 경우가 종종있다.
//		하지만 이렇게 하드 코딩할 경우 하드 코딩된 변수가 많아지면 유지보수도 힘들어질 뿐더러
//		암호화에 사용되는 key값들을 하드코딩하는 경우 보안적인 측면에서 안전하지 못하다.
		//이런 경우 파일명.properties에 정보를 담은 후 읽어 줄수 있다.
		Properties prop= new Properties();
		try {
			prop.load(new FileInputStream("/Users/bohyunkim/eclipse-workspace/work/jpro1/jpro2/src/pack/ex.properties"));//ex.propertes저장경로
			System.out.println(prop.getProperty("mes1"));
			System.out.println(prop.getProperty("mes2"));
		} catch (Exception e) {
			System.out.println("err"+e);
		}

	}

}
