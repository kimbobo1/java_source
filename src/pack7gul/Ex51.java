package pack7gul;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Ex51 extends JFrame implements ActionListener {
	private JTextField txt1, txt2,txt3,txt4,txt5,txt6,txt7;
	private JLabel lblResult,lblResult2,lblResult3,lblResult4,lblResult1;
	private JLabel lblphto =new JLabel();
	private ButtonGroup rbGroup = new ButtonGroup();
	private JButton btnCalc, btnReset, btnFin;
	int num1, num2,num3;
	int x  , y;
	Image image;
	
	double hap;
	double avg;
	String a;
	
	
	public Ex51() {
		

		setTitle("JFram");
		calcLayout();
		setBounds(200, 200, 500, 400);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
			int result = JOptionPane.showConfirmDialog(Ex51.this,"정말 종료?", "종료 확인", JOptionPane.YES_NO_OPTION);
			if(result == JOptionPane.YES_OPTION)
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			else
			setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			}
			});
			}
	
	private void calcLayout() {
		setLayout(new GridLayout(6,1));
		// 1행
		JLabel lbl1 = new JLabel("이름: ");
		txt1 = new JTextField("",20);
		JPanel panel1 = new JPanel();
		panel1.add(lbl1);
		panel1.add(txt1);
		add(panel1);

		// 2행
		JPanel panel2 = new JPanel();
		JLabel lbl2 = new JLabel("국어 : ");
		txt2 = new JTextField("",5);
		JLabel lbl3 = new JLabel("영어 : ");
		txt3 = new JTextField("",3);
		JLabel lbl4 = new JLabel("수학 : ");
		txt4 = new JTextField("",3);
		panel2.add(lbl2);
		panel2.add(txt2);
		panel2.add(lbl3);
		panel2.add(txt3);
		panel2.add(lbl4);
		panel2.add(txt4);
		add(panel2);

		
		// 4행
		
	
		JPanel panel3 = new JPanel();
		lblResult1 = new JLabel("총점: ");
		lblResult2 = new JLabel("평균: ");
		lblResult3 = new JLabel("평가: ");
		panel3.add(lblResult1);
		panel3.add(lblResult2);
		panel3.add(lblResult3);
		add(panel3);
		
		btnCalc = new JButton("확인");
		btnReset = new JButton("초기화");
		btnCalc.addActionListener(this);
		btnReset.addActionListener(this);
		JPanel panel4 = new JPanel();
		panel4.add(btnCalc);
		panel4.add(btnReset);
		add(panel4);
		
		JPanel panel5 = new JPanel();
		panel5.add(lblphto);
		add(panel5);
		
		lblResult4 = new JLabel("결과: ", JLabel.CENTER);
		add(lblResult4);
		//5행
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btnCalc) {
			if(txt1.getText().equals("")) {
				lblResult4.setText("이름 입력해");
				txt1.requestFocus();
				return;
				
				
			}
			if(txt2.getText().equals("")) {
				lblResult4.setText("국어점수 입력해");
				txt2.requestFocus();
				return;
				
				
			}try {num1 = Integer.parseInt(txt2.getText());
				
			} catch (Exception e2) {
				lblResult4.setText("국어점수1 정수로 제대로 입력!!");
				txt2.requestFocus();
				return;
			}
			 if(txt3.getText().equals("")) {
				
				lblResult4.setText("영어점수 입력해");
				txt3.requestFocus();
				return;
				
			}try {num2 = Integer.parseInt(txt3.getText());
				
			} catch (Exception e2) {
				lblResult4.setText("영어점수1 정수로 제대로 입력!!");
				txt3.requestFocus();
				return;
			}
			if(txt4.getText().equals("")) {
				
				lblResult4.setText("수학점수 입력해");
				txt4.requestFocus();
				return;
			}try {num3 = Integer.parseInt(txt4.getText());
				
			} catch (Exception e2) {
				lblResult4.setText("수학점수1 정수로 제대로 입력!!");
				txt4.requestFocus();
				return;
			}
			hap=num1 + num2+num3;
			lblResult1.setText("결과: " + hap);
			avg=hap/3;
			lblResult2.setText("평균: " + String.format("%.3f", avg));
			int selImage = 0;
			if(avg>=90) {
				a="A";
				selImage =1;
			}else if(avg>=80){
				a="B";
				selImage =1;
			}else if(avg>=70) {
				a="C";
				selImage =2;
			}else if(avg>=60) {
				a="D";
				selImage =2;
			}else {
				a="F";	
				selImage =2;
			}
			
			lblResult3.setText("평가: " + a);
		
			switch(selImage) {
			case 1:
				lblphto.setIcon(new ImageIcon("/Users/bohyunkim/git/repository2/src/pack7gul/pack1.jpg"));
				break;
				
			case 2:
				lblphto.setIcon(new ImageIcon("/Users/bohyunkim/git/repository2/src/pack7gul/pack3.jpg"));
				break;
			}	
			
		}else if(e.getSource() == btnReset) {
			txt1.setText("");
			txt2.setText("");
			txt3.setText("");
			txt4.setText("");
			lblphto.setIcon(null);

			lblResult1.setText("총점: ");
			lblResult2.setText("평균 ");
			lblResult3.setText("평가: ");
			}
		}
		
		
	
	public static void main(String[] args) {
		// TODO Auto-generted method stub
		new Ex51();
	}

}
