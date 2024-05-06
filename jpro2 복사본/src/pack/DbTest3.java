package pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DbTest3 {
	//키보드로 부서번호를 입력 받아 해당 부서에 근무하는 직원자료 출력
	//부서번호10 <<--
	// 사번 이름 부서 직급 연봉
	// 1 홍길동 총무부 부장 8900
	
	//건수:* 
	private Connection conn; //db 자바 연결 클래스
	private Statement stmt;  // SQL 문 실행을 위해 사용 결과출력하는객체
	private ResultSet rs; // 데이터베이스에 결과를 나타내는 데이터의테이블
	
	public DbTest3() {
		try {
			Class.forName("org.mariadb.jdbc.Driver"); //마리아 디비라서
			
		} catch (Exception e) {
			System.out.println("로딩 실패 : " + e);
			return;
		}
		try {
			String url = "jdbc:mariadb://localhost:3306/test2";    // commmand에서 로그인과 use test; 까지 실행한 상태.
			conn = DriverManager.getConnection(url, "root", "bohyun");    //.getConnection(url, 사용자, 비밀번호) // 싱글턴?
			
			
		} catch (Exception e) {
			System.out.println("연결 실패 : " + e.getMessage());   // 포트번호나 비밀번호가 틀리다면 DB 접근 불가
			return;
		}
		Scanner kk =new Scanner(System.in);
		System.out.println("부서번호");
		try {
		 
			String kkk= kk.next();
			
			String sql = "SELECT jikwon_no 사번,jikwon_name 이름,buser_name 부서,jikwon_jik 직급,jikwon_pay 연봉 "
				+ "FROM jikwon"
				+ " inner join buser ON buser_num=buser_no where buser_num="+kkk;
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			int ben=0;
			while(rs.next()) {
				String saben = rs.getString("사번");
				String irum= rs.getString("이름");
				String bu= rs.getString("부서");
				String ji=rs.getString("직급");
				int pa= rs.getInt("연봉");
				
				System.out.println(saben+" "+irum+" "+bu+" "+ji+" "+pa);
				ben++;
			}
			
			System.out.println("건수 :"+ben);
		} catch (Exception e) {
			System.out.println("처리"+e);
			
		}finally {
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
		new DbTest3();

	}

}
