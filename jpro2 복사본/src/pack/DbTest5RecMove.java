package pack;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;



//connection 객체는 필요할때만 연결하고 끊는 것이 원칙이나 그렇지 않은 경우도 있다 
public class DbTest5RecMove extends JFrame implements ActionListener{
	JButton btnF = new JButton("|<<"); //처음
	JButton btnP = new JButton("<"); //이전
	JButton btnN = new JButton(">"); //다음
	JButton btnL = new JButton(">>|"); //마지막
	
	JTextField txtNo = new JTextField("",5);
	JTextField txtName = new JTextField("",10);
	
	Connection conn;
	Statement stmt;
	ResultSet rs;
	
	public DbTest5RecMove() {
		super("레코드이동"); 
		layInit();
		accDb();
		
		 
		setBounds(200,200,400,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			
			if(e.getSource()==btnF) rs.first();
			else if(e.getSource()==btnP) rs.previous();
			else if(e.getSource()==btnN) rs.next();
			else if(e.getSource()==btnL) rs.last();
			
			display(); //버튼을 누르면 디스플레이를 부른다
		} catch (Exception e2) {
			
			
		}
		
	}
	private void display() {
		try {
			
			txtNo.setText(rs.getString("jikwon_no"));
			txtName.setText(rs.getString("jikwon_name"));
		} catch (Exception e) {
			System.out.println("처음과끝입니다 돌아가세요 :"+e);
			
		}
		
	}
	private void layInit() {
		JPanel panel1 = new JPanel(); //FlowLayout 배치 관리자
		panel1.add(new JLabel("직원자료"));
		txtNo.setEditable(false); //편집만 불가능
		//txtName.setEnabled(false);//비활성화시킴 아예 하지마!!
		txtName.setEditable(false);
		panel1.add(txtNo);
		panel1.add(txtName);
		add("North",panel1);
		
		JPanel panel2 = new JPanel();
		panel2.add(btnF);
		panel2.add(btnP);
		panel2.add(btnN);
		panel2.add(btnL);
		add("Center",panel2);
		
		btnF.addActionListener(this);
		btnP.addActionListener(this);
		btnN.addActionListener(this);
		btnL.addActionListener(this);
		
		
	}private void accDb() {
		try {
			Class.forName("org.mariadb.jdbc.Driver"); //드라이버 로딩 	  생성자를 통해서 한번만 로딩
			
			processDb();
		} catch (Exception e) {
			System.out.println("err"+e);
		}
		

	}
	private void processDb() {
		try {
			String url = "jdbc:mariadb://localhost:3306/test2"; 
			conn = DriverManager.getConnection(url, "root", "bohyun");
			stmt = conn.createStatement();
			
			
			rs=stmt.executeQuery("select jikwon_no,jikwon_name from jikwon");
			rs.next();
			display();
			
		} catch (Exception e) {
			System.out.println("processDb err :"+e);
		}
	}
	
	public static void main(String[] args) {
		new DbTest5RecMove();

	}

}
