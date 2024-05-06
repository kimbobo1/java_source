package pack;

import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class DbTest9 extends JFrame implements ActionListener{
	JTextField txtNum = new JTextField("", 5);
	JTextField txtName = new JTextField("", 5);
	JTextArea txtResult = new JTextArea();
	JTextArea txtResult2= new JTextArea();
	JButton btn = new JButton("로그인");
	Connection conn;
	PreparedStatement pstmt,pstmtno,pstmtna;
	ResultSet rs,rsno,rsname;
	JScrollPane pane = new JScrollPane(txtResult);
	
	public DbTest9() {
		setTitle("직원 자료");
		
		layInit();
		accDB();
		
		setBounds(800, 200, 500, 250);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	private void layInit() {
		setLayout(new GridLayout(3,1));
		JPanel panel1 = new JPanel();
		Label lblo = new Label("사번 : ");
		Label lblna= new Label("이름 : ");
		panel1.add(lblo);
		panel1.add(txtNum);
		panel1.add(lblna);
		panel1.add(txtName);
		panel1.add(btn);
		add("North",panel1);
		
		txtResult.setEditable(false);
		txtResult2.setEditable(false);
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(2,1));
		panel2.add(panel1);
		add(panel2);
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(new GridLayout(2,1));
		panel3.add(panel1);
		panel3.add(panel2);
		add(panel3);
		add(txtResult);
		
		add(txtResult2);
		
		JScrollPane scrollPane = new JScrollPane(txtResult);
		add("Center",scrollPane);
		JScrollPane scrollPane2 = new JScrollPane(txtResult2);
		add("Center",scrollPane2);
		
		btn.addActionListener(this);
	}
	private void accDB() {
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			String url = "jdbc:mariadb://localhost:3306/test2";
			conn = DriverManager.getConnection(url, "root", "bohyun");
			
		} catch (Exception e) {
			System.out.println("err" + e);
		}
	}
		//private boolean loginAndDisplay() { boolean 실행
		private void loginAndDisplay() {
			try {
				String sql3="";
				
				sql3 = "SELECT count(*) FROM jikwon WHERE jikwon_name ='" + txtName.getText()+"'and jikwon_no="+txtNum.getText();
				pstmtno = conn.prepareStatement(sql3);
				rsno = pstmtno.executeQuery();
		
		/* boolean 실행
		if(rsno.next()) {
			int count = rsno.getInt(1);
			if (count >= 1) {
				return true;
			} else {
				return false;
			}
		}
		*/
		
		if(rsno.next()) {
			// count(*)
			//    1
			int count = rsno.getInt(1);
			if(count>=1) {
				
				display();
				display2();
			}
			System.out.println(rsno.getInt(1));
			
		}
			} catch (Exception e) {
				System.out.println("ee"+e);
			}
	
	
	
	
}
	private void display() {
		try {
			String sql = "";
			sql = "SELECT jikwon_no,jikwon_name,jikwon_pay,jikwon_jik,jikwon_rating FROM jikwon";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			txtResult.setText("사번\t직원명\t연봉\t직급\t평점\n");
			
			while(rs.next()) {
				txtResult.append(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)+"\n");

			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
	private void display2() {
		
		try {
			String sql2 = "";
			sql2 = "SELECT jikwon_jik,avg(jikwon_pay), "
					+ "case when jikwon_jik='이사' then 1 "
					+ "when jikwon_jik='부장' then 2 "
					+ "when jikwon_jik='과장' then 3 "
					+ "when jikwon_jik='대리' then 4 "
					+ "when jikwon_jik='사원' then 5 END AS jik "
					+ "FROM jikwon GROUP BY jik";
			
			pstmt = conn.prepareStatement(sql2);
			rs = pstmt.executeQuery();
			System.out.println("z"+sql2);
			txtResult2.setText("이사:\t부장:\t과장\t대리\t사원\n");
			while(rs.next()) {
				txtResult2.append(rs.getString(1)+rs.getString(2)+"\t");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(txtNum.getText().equals("")) {
			
			JOptionPane.showMessageDialog(this, "사번  입력하시오.", "알림", JOptionPane.INFORMATION_MESSAGE);
			txtNum.requestFocus();
			return;
		}
		if(txtName.getText().equals("")) {
			
			JOptionPane.showMessageDialog(this, "이름을 입력하시오.", "알림", JOptionPane.INFORMATION_MESSAGE);
			txtName.requestFocus();
			return;
		}
		
		loginAndDisplay();
		
		/* boolean 실행
		boolean isSuccess = loginAndDisplay();
		
		if (isSuccess) {
			display();
			display2();
		}
		*/
	}
	

	public static void main(String[] args) {
		new DbTest9();
		
	}

}
