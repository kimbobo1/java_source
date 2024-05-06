package pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbTest4 {
	private Connection conn; //db 자바 연결 클래스
	private Statement stmt;  // SQL 문 실행을 위해 사용 결과출력하는객체
	private ResultSet rs; // 데이터베이스에 결과를 나타내는 데이터의테이블
	
	public DbTest4() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
	         
			String url = "jdbc:mariadb://localhost:3306/test2";    // commmand에서 로그인과 use test; 까지 실행한 상태.
			conn = DriverManager.getConnection(url, "root", "bohyun");
			
			stmt = conn.createStatement();
			
			boolean b = false;
			//update
			b = stmt.execute("update sangdata set sang ='마우스' where code=4");
			System.out.println("update b :"+ b);
			int result =stmt.getUpdateCount();
			System.out.println("result"+result);
			if(result >=1) {
				System.out.println("수정성공");
			}else {
				System.out.println("작업 실패");
			}
			
			//execute : executeQuer(),executeUpdate()를 하나로 처리
			//select
			b = stmt.execute("select * from sangdata");
			System.out.println("select b:"+ b); //성공하면 true 가뜸
			rs = stmt.getResultSet(); //execute는 rs = stmt.getResultSet();이걸써서 받는다
			while(rs.next()) {
				System.out.println(rs.getString(1)+" "+ 
								rs.getString(2)+" "+ 
								rs.getString(3)+" "+ 
								rs.getString(4));
			}
			
			
		} catch (Exception e) {
			
			System.out.println("로딩 실패 : " + e);
			return;  // 로딩 실패 시, 생성자를 탈출하여 go를 출력하지 못한다.
		}
		
	}
	public static void main(String[] args) {
		new DbTest4();

	}

}
