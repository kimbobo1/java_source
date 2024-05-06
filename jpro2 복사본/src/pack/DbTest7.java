package pack;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class DbTest7 extends JFrame implements ActionListener{
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	JTextField txtCode;
	JTextField txtpum;
	JTextField txtsu;
	JTextField txtdan;
	JTextArea sho;
	private JButton btnCalc;
	
	JButton btnF = new JButton("추가");
	public DbTest7() {
		super("레코드이동"); 
		layInit();
		accDb();
		
		
		 
		setBounds(200,200,500,600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	private void layInit() {
		JPanel panel1 = new JPanel();
		JLabel lbl1 = new JLabel("코드 : ");
		txtCode = new JTextField("",5);
		JLabel lbl2 = new JLabel("품명 : ");
		txtpum = new JTextField("",3);
		JLabel lbl3 = new JLabel("수량 : ");
		txtsu = new JTextField("",3);
		JLabel lbl4 = new JLabel("단가 : ");
		txtdan = new JTextField("",3);
		btnCalc = new JButton("추가: ");
		panel1.add(lbl1);
		panel1.add(txtCode);
		panel1.add(lbl2);
		panel1.add(txtpum);
		panel1.add(lbl3);
		panel1.add(txtsu);
		panel1.add(lbl4);
		panel1.add(txtdan);
		panel1.add(btnCalc);
		add("North",panel1);
		JPanel panel2 = new JPanel();
		sho = new JTextArea(); 
		sho.setBounds(50, 50, 300, 300);
		
		sho.setEditable(false);
		panel2.add(sho);
		add(panel2);
		

	}
	private void accDb() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			processDb();
		} catch (Exception e) {
			System.out.println("err"+e);
		}

	}
	private void processDb() {
		try {
			String url = "jdbc:mariadb://localhost:3306/test2"; 
			conn = DriverManager.getConnection(url, "root", "bohyun");
			
			String sql ="";
			sql ="select * from sangdata";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString(1)+" "+ 
						rs.getString(2)+" "+ 
						rs.getString(3)+" "+ 
						rs.getString(4));
				
			}
		
			display();
		} catch (Exception e) {
			System.out.println("processDb err :"+e);
		}

	}
	private void display() {
		try {
			

			
		} catch (Exception e) {
			// TODO: handle exception
		}
		

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		sho.append(null);
		
	}

	public static void main(String[] args) {
		new DbTest7();
	}

}
