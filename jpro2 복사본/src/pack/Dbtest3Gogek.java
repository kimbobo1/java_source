package pack;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Dbtest3Gogek extends JFrame implements ActionListener{
	JButton btnA = new JButton("전체"); //버튼 만들기
	JButton btnM= new JButton("남자");
	JButton btnF = new JButton("여자");
	JTextArea txtResult = new JTextArea();
	
	
	Connection conn;
	Statement stmt;
	ResultSet rs;
	
	
	public Dbtest3Gogek() {
		setTitle("고객자료");
		
		 layInit();
		 accDb();
		 
		 setBounds(200,200,300,250);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	private void layInit() {
		JPanel jPanel = new JPanel();
		jPanel.add(btnA);
		jPanel.add(btnF);
		jPanel.add(btnM);
		txtResult.setEditable(false); // read only 읽기만 가능
		JScrollPane pane = new JScrollPane(txtResult);
		
		add("Center",pane);
		add("North",jPanel);
		
		btnA.addActionListener(this);
		btnM.addActionListener(this);
		btnF.addActionListener(this);
		
		

	}
	private void accDb() {
		try {
			Class.forName("org.mariadb.jdbc.Driver"); //드라이버 로딩 	  생성자를 통해서 한번만 로딩
		} catch (Exception e) {
			System.out.println("err"+e);
		}
		

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//DB 연결은 필요시 접속하고 작업이 끝나면 반드시 연결을 해제한다
		try {
			String url = "jdbc:mariadb://localhost:3306/test2";    // commmand에서 로그인과 use test; 까지 실행한 상태.
			conn = DriverManager.getConnection(url, "root", "bohyun"); 
			
			stmt = conn.createStatement();
			
			String sql = "select gogek_no,gogek_name,gogek_jumin from gogek";
			
			if(e.getSource() == btnA) {
				
			}else if(e.getSource()== btnM) {
				sql += " where gogek_jumin like '%-1%'";
				//sql += " where substr(gogek_jumin,8,1)=1";   //8번쨰이후 1자리가 1임
			}else if(e.getSource()==btnF) {
				sql += " where gogek_jumin like '%-2%'";
				
			}
			
			
			txtResult.setText(null); //자료 입력전에 출력 영역을 청소한다
			
			rs =stmt.executeQuery(sql); //셀렉트 문장을 가져옴
			
			int count = 0;   //건수구하기
			txtResult.setText("고객번호\t고객명\t주민번호\n"); //제목 짓기
			
			while(rs.next()) {
				String imsi = rs.getString("gogek_no") + "\t" + 
						rs.getString("gogek_name") + "\t" +
						rs.getString("gogek_jumin") + "\n";

				txtResult.append(imsi);//추가
				count++;
			}
			txtResult.append("인원수 : "+count);
			
		} catch (Exception e2) {
			System.out.println("actionPerformed err"+e);
		}finally {
			try {
				if(rs != null)rs.close();
				if(stmt != null)stmt.close();
				if(conn != null)conn.close();
				//쓰고나면 반납해라!!!
				
			} catch (Exception e2) {
				
			}
				
		}
		
	}
	
	public static void main(String[] args) {
		new Dbtest3Gogek();

	}

}
