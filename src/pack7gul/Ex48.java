//package pack7gul;
//
//import java.awt.GridLayout;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.ButtonGroup;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JOptionPane;
//import javax.swing.JPanel;
//import javax.swing.JRadioButton;
//import javax.swing.JTextField;
//
//public class Ex48 extends JFrame implements ActionListener{
//	JTextField txtsu1,txtsu2,txtgap;
//	ButtonGroup buttonGroup = new ButtonGroup();
//	JRadioButton btnD;
//	JRadioButton btnB,btnG,btnN;
//	private JButton btnCalc, btnReset, btnFin;
//	JLabel lblResult;
//	int num1, num2;
//	public Ex48() {
//		super("계산기");
//		
//		layoutInit();
//	
//		setBounds(800,200,400,300);
//		setVisible(true);
//		
//		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // 윈도우 종료
//	}
//	private void layoutInit() {
//		setLayout(new GridLayout(5, 1));
//		
//		//1행
//		JLabel lbl1 = new JLabel("숫자 : ");
//		txtsu1 = new JTextField("", 20);
//		JPanel panel1 = new JPanel();
//		panel1.add(lbl1);
//		panel1.add(txtsu1);
//		add(panel1);
//		
//		//2행
//		JLabel lbl2 = new JLabel("숫자2 : ");
//		txtsu2 = new JTextField("", 20);
//		JPanel panel2 = new JPanel();
//		panel2.add(lbl2);
//		panel2.add(txtsu2);
//		add(panel2);
//		
//		//3행
//		btnD = new JRadioButton("더하기", true);
//		btnB = new JRadioButton("빼기", false);
//		buttonGroup.add(btnD);    // JRadioButton은 그룹화 필요
//		buttonGroup.add(btnB);
//		JPanel panel3 = new JPanel();
//		panel3.add(btnD);
//		panel3.add(btnB);
//		btnG = new JRadioButton("곱하기", false);
//		btnN = new JRadioButton("나누기", false);
//		buttonGroup.add(btnG);    // JRadioButton은 그룹화 필요
//		buttonGroup.add(btnN);
//	
//		panel3.add(btnG);
//		panel3.add(btnN);
//		
//		add(panel3);   // JFrame에 담김
//		//4행
//		JButton btnOk = new JButton("계산");
//		btnOk.addActionListener(this);
//		JPanel panel4 = new JPanel();
//		panel4.add(btnOk);
//		
//		add(panel4);
//		//5행
//		lblResult = new JLabel("결과 : ", JLabel.CENTER);
//		add(lblResult);
//		//6행
//		btnCalc = new JButton("계산");
//		btnReset = new JButton("초기화");
//		btnFin = new JButton("종료");
//		btnCalc.addActionListener(this);
//		btnReset.addActionListener(this);
//		btnFin.addActionListener(this);
//
//		JPanel panel5 = new JPanel();
//		panel5.add(btnCalc);
//		panel5.add(btnReset);
//		panel5.add(btnFin);
//		add(panel5);
//		 
//	}
//	
//	 @Override
//	public void actionPerformed(ActionEvent e) {
//		 if(txtsu1.getText().equals("")) {
//			
//				//lblResult.setText("이름 입력!");
//				JOptionPane.showMessageDialog(this, "숫자 입력!", "알림", JOptionPane.INFORMATION_MESSAGE);
//				txtsu1.requestFocus();
//				return;
//		 }
//		if(txtsu2.getText().equals("")) {
//					
//		//lblResult.setText("나이 입력!");
//		JOptionPane.showMessageDialog(this, "숫자 입력!", ":\\", JOptionPane.INFORMATION_MESSAGE);
//		txtsu2.requestFocus();
//		return;		
//		}try {
//			num2=Integer.parseInt(txtsu2.getText());
//			
//		} catch (Exception e2) {
//			lblResult.setText("숫자2 정수로 제대로 입력!!");
//			txtsu2.requestFocus();
//			return;
//		}
//		
//		
//		//계산
//		if(btnD.isSelected()) lblResult.setText("결과: " + (num1 + num2));
//		else if (btnB.isSelected()) lblResult.setText("결과: " + (num1 - num2));
//		else if (btnG.isSelected()) lblResult.setText("결과: " + (num1 * num2));
//		else {
//		if(num1==0) {
//		lblResult.setText("0은 나눌 수 없어");
//		txtsu1.setText("");
//		txtsu1.requestFocus();
//		}
//		else if(num2==0) {
//		lblResult.setText("0으로 나눌 수 없어");
//		txtsu2.setText("");
//		txtsu2.requestFocus();
//		} else
//		lblResult.setText("결과: " + (double)num1 /num2);
//		}else ㅑ(e.getSource() == btnReset) {
//			txtsu1.setText("");
//			txtsu2.setText("");
//			btnD.setSelected(true);
//			btnB.setSelected(false);
//			btnG.setSelected(false);
//			btnN.setSelected(false);
//			txtsu1.requestFocus();
//			lblResult.setText("결과: ");
//			} else {
//			int result = JOptionPane.showConfirmDialog(this, "정말 종료할거야?", "종료 확인", JOptionPane.YES_NO_OPTION);
//			if(result == 0) System.exit(0);
//			else return;
//			}
//			}
//			
//		
//		
//		
//		
//	}
//		
//	
//	public static void main(String[] args) {
//		new Ex48();
//
//	}
//
//}
