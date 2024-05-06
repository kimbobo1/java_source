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
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class DbTest8 extends JFrame implements ActionListener{
	JTextField txtName = new JTextField("", 5);
	JTextField txtJumin1 = new JTextField("", 5);
	JTextField txtJumin2 = new JTextField("", 5);
	JTextArea txtResult = new JTextArea();
	
	JButton btn = new JButton("확인");
	
	
	Connection conn;
	PreparedStatement pstmt, pstmtName, pstmtJumin;  // 선처리 방식
	ResultSet rs, rsName, rsJumin;
	
	public DbTest8() {
		setTitle("직원 자료");
		
		layInit();
		accDb();
		
		setBounds(800, 200, 500, 250);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void layInit() {
		setLayout(new GridLayout(2,1));
		
		JPanel panel1 = new JPanel();
		Label lblName = new Label("이름 : ");
		panel1.add(lblName);
		panel1.add(txtName);
		
		txtResult.setEditable(false);
		
		JPanel panel2 = new JPanel();
		Label lblJumin = new Label("주민번호 : ");
		panel2.add(lblJumin);
		panel2.add(txtJumin1);
		panel2.add(new Label("-"));
		panel2.add(txtJumin2);
		panel2.add(btn);
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(new GridLayout(2,1));
		panel3.add(panel1);
		panel3.add(panel2);
		add(panel3);
		
		add(txtResult);
		
		btn.addActionListener(this);
	}
	
	private void accDb() {
		try {
			txtResult.setText(null);
			String url = "jdbc:mariadb://localhost:3306/test2";
			conn = DriverManager.getConnection(url, "root", "bohyun");
			
			String sql = "";
			String sqlName="";
			String sqlJumin="";
			
			String name = txtName.getText();
			String jumin1 = txtJumin1.getText();
			String jumin2 = txtJumin2.getText();
			String jumin = jumin1 + "-"+ jumin2;
			
			sql = "SELECT DISTINCT jikwon_no, jikwon_name, buser_name, buser_tel, jikwon_jik "
					+ "FROM jikwon "
					+ "LEFT OUTER JOIN gogek ON jikwon.jikwon_no=gogek.gogek_damsano "
					+ "INNER JOIN buser ON jikwon.buser_num=buser.buser_no where jikwon_no = "
					+ "(SELECT gogek_damsano FROM gogek WHERE gogek_name=? AND gogek_jumin=?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, jumin);
			rs = pstmt.executeQuery();
			
			sqlName = "SELECT DISTINCT gogek_no,gogek_name FROM gogek WHERE gogek_name=?";
			pstmtName = conn.prepareStatement(sqlName);
			pstmtName.setString(1, name);
			rsName = pstmtName.executeQuery();
			
			sqlJumin = "SELECT DISTINCT gogek_no, gogek_jumin FROM gogek WHERE gogek_jumin=?";
			pstmtJumin = conn.prepareStatement(sqlJumin);
			pstmtJumin.setString(1, jumin);
			rsJumin = pstmtJumin.executeQuery();
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (Exception e) {
			System.out.println("accDb err : " + e);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			
			if(txtName.getText().equals("")) {
				JOptionPane.showMessageDialog(this, "이름을 입력해.", "알림", JOptionPane.INFORMATION_MESSAGE);
				txtName.requestFocus();
				return;
			}
			if(txtJumin1.getText().equals("")) {
				JOptionPane.showMessageDialog(this, "주민번호 앞자리를 입력해.", "알림", JOptionPane.INFORMATION_MESSAGE);
				txtJumin1.requestFocus();
				return;
			}
			if(txtJumin2.getText().equals("")) {
				JOptionPane.showMessageDialog(this, "주민번호 뒷자리를 입력하시오.", "알림", JOptionPane.INFORMATION_MESSAGE);
				txtJumin2.requestFocus();
				return;
			}
			if(txtJumin1.getText().length()!=6) {
				JOptionPane.showMessageDialog(this, "주민번호 앞자리 자리수 오류", "알림", JOptionPane.INFORMATION_MESSAGE);
				txtJumin1.requestFocus();
				return;
			}
			if(txtJumin2.getText().length()!=7) {
				JOptionPane.showMessageDialog(this, "주민번호 뒷자리 자리수 오류", "알림", JOptionPane.INFORMATION_MESSAGE);
				txtJumin1.requestFocus();
				return;
			}
			
			try {
				Integer.parseInt(txtJumin1.getText());
				
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(this, "dd", "알림", JOptionPane.INFORMATION_MESSAGE);
				
				return;
			}
			
			String resultName = "";
			String resultJumin = "";
			
			if(rsName.next()) {
				resultName = rsName.getString(1);
				//txtResult.append(resultName);
			}
			if(rsJumin.next()) {
				resultJumin = rsJumin.getString(1);
				//txtResult.append(resultName);
			}
			
			txtResult.append("담당 직원 정보\n");
			txtResult.append("사번" + "\t" + "이름" + "\t" + "부서명" + "\t" + "전화" + "\t" + "직급" + "\n");
			if(resultName.equals(resultJumin)) {
				if(rs.next()) {
					String result = rs.getString(1) + "\t" + 
									rs.getString(2) + "\t" + 
									rs.getString(3) + "\t" + 
									rs.getString(4) + "\t" +
									rs.getString(5) + "\n";
					txtResult.append(result);
				}
			} else {
				JOptionPane.showMessageDialog(this, "이름과 주민번호가 일치하지 않습니다.");
			}
		
			
		} catch (Exception e2) {
			// TODO: handle exception
		} finally {
			try {
				if(rs != null) rs.close(); 
				if(pstmt != null) pstmt.close();
				if(pstmtName != null) pstmtName.close();
				if(pstmtJumin != null) pstmtJumin.close();
				if(conn != null) conn.close();
			} catch (Exception e2) { }
		}
	}
	
	public static void main(String[] args) {
		new DbTest8();
	}
}



