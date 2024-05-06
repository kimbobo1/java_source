package pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

// MariaDB(원격 DB 서버) 연동 프로그래밍
public class DbTest1 {
	private Connection conn; //db 자바 연결 클래스
	private Statement stmt;  // SQL 문 실행을 위해 사용 결과출력하는객체
	private ResultSet rs; // 데이터베이스에 결과를 나타내는 데이터의테이블
	
	public DbTest1() {
		// 1. Driver file loading
		try {
			Class.forName("org.mariadb.jdbc.Driver");
	         //mysql
//	         Class.forName("com.mysql.jdbc.Driver");
	         //oracle
//	         Class.forName("oracle.jdbc.driver.OracleDriver"); 
		} catch (Exception e) {
			System.out.println("로딩 실패 : " + e);
			return;  // 로딩 실패 시, 생성자를 탈출하여 go를 출력하지 못한다.
		}
		
		// 2. DB server와 연결
		try {
			String url = "jdbc:mariadb://localhost:3306/test2";    // commmand에서 로그인과 use test; 까지 실행한 상태.
			conn = DriverManager.getConnection(url, "root", "bohyun");    //.getConnection(url, 사용자, 비밀번호) // 싱글턴?
			
		} catch (Exception e) {
			System.out.println("연결 실패 : " + e.getMessage());   // 포트번호나 비밀번호가 틀리다면 DB 접근 불가
			return;
		}
		
		// 3. 연결된 DB server에 SQL을 실행
		try {
			// sangdata 테이블 자료 읽기
			stmt = conn.createStatement(); // stmt 인스턴스 된 상태
			
			//rs = stmt.executeQuery("select * from sangdata");  // query 문 실행
			rs = stmt.executeQuery("select code, sang, su, dan from sangdata"); // 위 쿼리와 동일하다.  // 우변이 new 하지 않았음에도 인스턴스화 해준다. 
//			rs.next();  // cursor (레코드 포인터) 이동
//			rs.next();  // 두 번째 레코드를 읽는다.
//			System.out.println(rs.next());  // 자료값이 있으면 true, 없으면 false
			
			while(rs.next()) {
				//int a = rs.getInt("code");  //  연산에 사용하기 위해 코드를 숫자로 받는다.
				String code = rs.getString("code");   // 숫자값을 문자열로 받을 수도 있다. // 코드는 연산에 참여할 생각이 없다.
				String sangname = rs.getString("sang");
				int su = rs.getInt("su");
				int dan = rs.getInt("dan");
				System.out.println(code + " " + sangname + " " + su + " " + dan);
			}
			
			System.out.println("------------");
			rs.close(); // ResultSet를 닫고, 아래에서 다시 열기
			
			rs = stmt.executeQuery("select code as 코드, sang as 상품명, su, dan from sangdata");
			while(rs.next()) {
				String code = rs.getString("코드");   
				String sangname = rs.getString("상품명"); // 컬럼은 순서가 1부터 부여됨
				int su = rs.getInt(3);
				int dan = rs.getInt("dan");
				System.out.println(code + " " + sangname + " " + su + " " + dan);
			}
			
			//System.out.println(rs.getString("sang"));   // 스트링 타입을 읽기 위해 getString을 사용한다. 정수형인 경우, getInt를 사용한다. 
			
			//String sql = "select count(*) as 건수 from sangdata";
			String sql = "select count(*) from sangdata";
			rs = stmt.executeQuery(sql);
			rs.next();
			//System.out.println("건수 : " + rs.getString("건수")); // 별명을 사용한 경우 인수로는 별명만 받을 수 있다.
			//System.out.println("건수 : " + rs.getString("count(*)"));  // 별명을 사용하지 않고 컬럼명을 가져오는 방법도 있다.
			System.out.println("건수 : " + rs.getString(1));  // 1번 컬럼 데이터를 가져오는 방법도 있다.
		} catch (Exception e) {
			System.out.println("처리 실패 :" + e);
		} finally {
			try {
				if(rs != null) rs.close(); // rs가 이미 닫혀있을 수 있으므로
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
		
	}
	
	public static void main(String[] args) {
		new DbTest1();
	}

}
// ping [ip주소]: 해당 ip 주소와 통신이 되는지 확인 
// nsLookup (ip / 도메인) : ip 주소를 가지고 도메인명을 얻을 수 있음.
// 

