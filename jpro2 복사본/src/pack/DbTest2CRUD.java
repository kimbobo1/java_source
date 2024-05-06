package pack;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class DbTest2CRUD {
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	Properties prop = new Properties();
	
	
	public DbTest2CRUD() { // secure coding의 하나로 연결정보 별도 저장후 읽기
		try {
			prop.load(new FileInputStream("/Users/bohyunkim/eclipse-workspace/work/jpro1/jpro2/src/pack/dbTest2.properties"));
			Class.forName(prop.getProperty("driver"));
			conn = DriverManager.getConnection(
					prop.getProperty("url"),// jdbc:mariadb://localhost:3306/test2 <<우리가 적은거 호스트주소 
					prop.getProperty("user"),
					prop.getProperty("passwd"));
			stmt = conn.createStatement();
			String sql= "";
			//자료추가
			//auto commit이 기본
			//sql = "insert into sangdata values(5,'새우깡',55,3000)";
			//stmt.executeUpdate(sql);  //select는 쿼리 나머지는 insert update delete업데이트
			
			//auto commit을 수동으로 전환해 작업 Transaction 처리가 필요
//			conn.setAutoCommit(false); //수동으로 전환
//			sql = "insert into sangdata values(6,'감자깡깡',7,3000)"; //5번쓰면 pk에러뜬다
//			stmt.executeUpdate(sql);// Transaction 처리 실행
//			sql = "insert into sangdata values(7,'고구마깡',17,2000)";
//			stmt.executeUpdate(sql);
//			//conn.rollback(); //Transaction 종료~~~~클라이언트에서 입력한 자료  위에있는거 다취소~
//			conn.commit();//Transaction 종료 클라이언트에서 입력한 자료 원격 DB(원본)에 저장~~
//			conn.setAutoCommit(true); //다시 자동으로 변환~~
			//한번 실행하고 다시 실행하면 오류가남  위에 자료가 저장 되어있는데  다시저장하려면 새로운 8,9번이 있어야됨
			
			
			//자료수정
			//sql = "update sangdata set sang ='데일리 콤부차',su=12,dan=8000 where code=5";
			//stmt.executeUpdate(sql);
			
			//자료 삭제 
			sql = "delete from sangdata where code>=5";
			//stmt.executeUpdate(sql);
			//insert update delete는 수행후 처리 수 만큼 행의 갯수를 반환
			//insert는 한번에 한개밖에 안된다
			int result =stmt.executeUpdate(sql);
			System.out.println("result"+result);
			if(result==0) System.out.println("삭제 실패 !!!");
			//다시 실행하면 삭제 실패!!
			
			//모든자료읽기
			sql = "select *from sangdata order by code desc";
			rs = stmt.executeQuery(sql);
			int cou = 0;
			while(rs.next()) {
				System.out.println(rs.getString("code")+ " "+
						rs.getString("sang")+" "+
						rs.getString("su")+
						rs.getString("dan"));
				cou++;
			}
			System.out.println("전체자료슈"+cou);
			//부분 자료 읽기
			sql = "select *from sangdata where code=1";
			if(rs.next()) {System.out.println(rs.getString("code")+ " "+
					rs.getString("sang")+" "+
					rs.getString("su")+
					rs.getString("dan"));
			
				
				
			}else {
				System.out.println("해당자료는없어");
			}
			
		} catch (Exception e) {
			System.out.println("err"+e);
		}finally {
			try {
				if(rs != null)rs.close();
				if(stmt != null)stmt.close();
				if(conn != null)conn.close();
				
				
			} catch (Exception e2) {
				
			}
		}
	}

	public static void main(String[] args) {
		new DbTest2CRUD();
	}

}
