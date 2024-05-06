package pack;


// 1번문제) https://cafe.daum.net/flowlife/HqLo/53
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class pr extends JFrame implements ActionListener{
	JTextField txtCode, txtPum, txtSu, txtDan;
	int code, su, dan, total;
	JButton btnAdd = new JButton("추가");
	JTextArea txtResult = new JTextArea();
	
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	
	String sql = "";
	int cnt = 0;
	
	public pr() {
		super("상품 처리");
		layInit();
		accDb();
		
		setBounds(100, 100, 500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
	
	private void layInit() {
		JPanel panel = new JPanel();
		txtCode = new JTextField("",5);
		txtPum = new JTextField("",5);
		txtSu = new JTextField("",5);
		txtDan = new JTextField("",5);
		btnAdd.addActionListener(this);
		panel.add(new JLabel("코드: "));
		panel.add(txtCode);
		panel.add(new JLabel("품명: "));
		panel.add(txtPum);
		panel.add(new JLabel("수량: "));
		panel.add(txtSu);
		panel.add(new JLabel("단가: "));
		panel.add(txtDan);
		panel.add(btnAdd);
		add("North",panel);
		
		txtResult.setEditable(false);
		add(txtResult);	
	}
	
	private void accDb() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			String url = "jdbc:mariadb://localhost:3306/test2";
			conn = DriverManager.getConnection(url, "root", "bohyun");
			display();
		} catch (Exception e) {
			System.out.println("accDb err: " + e);
		}
		
	}
	
	private void display() {
		// 금액 3자리마다 콤마
		DecimalFormat df = new DecimalFormat("###,###");
		
		try {
			sql = "select * from sangdata";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			txtResult.setText("코드\t상품명\t수량\t단가\t금액\n");
			while(rs.next()) {
				txtResult.append(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getInt(4)+"\t"+
				df.format(rs.getInt(3)*rs.getInt(4))+"\n");
			}
			txtResult.append("\n건수: " + cnt);
		} catch (Exception e) {
			System.out.println("자료 출력 불가능 에러: " + e);
		}

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// 데이터 모두 입력했는지 검사
		if(txtCode.getText().equals("")) {
			txtResult.setText("코드 미입력");
			txtCode.requestFocus();
			return;
		} else if(txtPum.getText().equals("")) {
			txtResult.setText("품명 미입력");
			txtPum.requestFocus();
			return;
		} else if(txtSu.getText().equals("")) {
			txtResult.setText("수량 미입력");
			txtSu.requestFocus();
			return;
		} else if(txtDan.getText().equals("")) {
			txtResult.setText("단가 미입력");
			txtDan.requestFocus();
			return;
		} 
		
		// 코드. 수량. 단가 숫자인지 확인
		try {
			code = Integer.parseInt(txtCode.getText());
		} catch (Exception e2) {
			JOptionPane.showMessageDialog(this, "코드를 숫자로 입력하세요", "오류", JOptionPane.INFORMATION_MESSAGE);
			txtCode.setText("");
			txtCode.requestFocus();
			return;
		}
		try {
			su = Integer.parseInt(txtSu.getText());
		} catch (Exception e2) {
			JOptionPane.showMessageDialog(this, "수량을 숫자로 입력하세요", "오류", JOptionPane.INFORMATION_MESSAGE);
			txtSu.setText("");
			txtSu.requestFocus();
			return;
		}
		try {
			dan = Integer.parseInt(txtDan.getText());
		} catch (Exception e2) {
			JOptionPane.showMessageDialog(this, "단가를 숫자로 입력하세요", "오류", JOptionPane.INFORMATION_MESSAGE);
			txtDan.setText("");
			txtDan.requestFocus();
			return;
		}

		// 자료 추가
		try {
			sql = "insert into sangdata values(?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, code);
			pstmt.setString(2, txtPum.getText());
			pstmt.setInt(3, su);
			pstmt.setInt(4, dan);
			pstmt.executeUpdate();
			cnt++;
		} catch (Exception e2) {
			JOptionPane.showMessageDialog(this, "코드 중복됨", "오류", JOptionPane.INFORMATION_MESSAGE);
			txtCode.setText("");
			txtCode.requestFocus();
			return;
		}		
		display();
	}

	public static void main(String[] args) {
		new pr();
	}

}

