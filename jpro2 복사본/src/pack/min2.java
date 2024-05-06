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

public class min2 extends JFrame implements ActionListener {
	JTextField txtNum = new JTextField("", 10);
	JTextField txtName = new JTextField("", 10);
	JTextArea txtTable = new JTextArea();
	JTextArea txtResult = new JTextArea();
	JButton btn = new JButton("로그인");
	JScrollPane pane = new JScrollPane(txtTable);

	Connection conn;
	PreparedStatement pstmt, pstmtNum, pstmtName, pstmtFinal; // 선처리 방식
	ResultSet rs, rsNum, rsName, rsFinal;

	public min2() {
		setTitle("로그인");

		layInit();
		accDb();

		setBounds(800, 200, 480, 360);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void layInit() {
		setLayout(new GridLayout(3, 1));

		JPanel panel1 = new JPanel();
		panel1.add(new Label("직원번호 : "));
		panel1.add(txtNum);
		panel1.add(new Label("이름 : "));
		panel1.add(txtName);
		panel1.add(btn);

		add(panel1);
		txtTable.setEditable(false);
		txtResult.setEditable(false);
		JScrollPane pane = new JScrollPane(txtTable);
		
		add(pane);
		add(txtResult);

		btn.addActionListener(this);
	}

	private void accDb() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (Exception e) {
			System.out.println("accDb err : " + e);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			txtResult.setText(null);
			String url = "jdbc:mariadb://localhost:3306/test2";
			conn = DriverManager.getConnection(url, "root", "bohyun");

			String sql = "";
			String sqlNum = "";
			String sqlName = "";
			String sqlFinal = "";

			String sql2 = "";

			if(txtNum.getText().equals("")) {
				JOptionPane.showMessageDialog(this, "직원번호를 입력하시오.", "알림", JOptionPane.INFORMATION_MESSAGE);
				txtNum.requestFocus();
				return;
			}
			if(txtName.getText().equals("")) {
				JOptionPane.showMessageDialog(this, "이름을 입력하시오.", "알림", JOptionPane.INFORMATION_MESSAGE);
				txtName.requestFocus();
				return;
			}
			final String REGEX = "[0-9]+";
			if(!txtNum.getText().matches(REGEX)) {
				JOptionPane.showMessageDialog(this, "숫자만 입력 가능합니다.", "알림", JOptionPane.INFORMATION_MESSAGE);
				txtNum.requestFocus();
			}
			
			int num = Integer.parseInt(txtNum.getText());
			String name = txtName.getText();

			sql = "SELECT jikwon_no, jikwon_name, jikwon_pay, jikwon_jik, jikwon_rating FROM jikwon WHERE jikwon_no=? AND jikwon_name=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.setString(2, name);
			rs = pstmt.executeQuery();

			sqlNum = "SELECT jikwon_no,jikwon_name FROM jikwon WHERE jikwon_no=?";
			pstmtNum = conn.prepareStatement(sqlNum);
			pstmtNum.setInt(1, num);
			rsNum = pstmtNum.executeQuery();

			sqlName = "SELECT jikwon_no,jikwon_name FROM jikwon WHERE jikwon_name=?";
			pstmtName = conn.prepareStatement(sqlName);
			pstmtName.setString(1, name);
			rsName = pstmtName.executeQuery();

			sqlFinal = "SELECT jikwon_no, jikwon_name, jikwon_pay, jikwon_jik, jikwon_rating FROM jikwon";
			pstmtFinal = conn.prepareStatement(sqlFinal);
			rsFinal = pstmtFinal.executeQuery();
				
			String resultNum = "";
			String resultName = "";

			if (rsNum.next()) {
				resultNum = rsNum.getString(2);
				//txtTable.append(resultNum);
			}
			if (rsName.next()) {
				resultName = rsName.getString(2);
				//txtTable.append(resultName);
			}
			
			txtTable.append("담당 직원 정보\n");
			txtTable.append("사번" + "\t" + "직원명" + "\t" + "연봉" + "\t" + "직급" + "\t" + "평점" + "\n");
			if (resultNum.equals(resultName)) {
				while (rsFinal.next()) {
					String result = rsFinal.getString(1) + "\t" + rsFinal.getString(2) + "\t" + rsFinal.getString(3)
							+ "\t" + rsFinal.getString(4) + "\t" + rsFinal.getString(5) + "\n";
					txtTable.append(result);
					
				}
				txtResult.append("직급별 연봉평균\n");
				sql2 = "SELECT jikwon_jik, avg(jikwon_pay) FROM jikwon GROUP BY jikwon_jik HAVING jikwon_jik = ?";
				String[] jik = {"이사","부장","과장","대리","사원"};
				String jikResult = "";

				for (int i = 0; i < 5; i++) {
					pstmt = conn.prepareStatement(sql2);
					pstmt.setString(1, jik[i]);
					rs = pstmt.executeQuery();
					if(rs.next())
						jikResult +=(jik[i] + ": " + rs.getString(2));
					
				}
			
				txtResult.append(jikResult);
			} else {
				txtTable.setText(null);
				JOptionPane.showMessageDialog(this, "사번과 직원명이 일치하지 않습니다.");
			}

		} catch (Exception e2) {
			// TODO: handle exception
		}

	}

	public static void main(String[] args) {
		new min2();

	}

}