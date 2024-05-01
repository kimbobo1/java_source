package pack7gul;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Ex47 extends JFrame implements ActionListener {
	JTextField txtName, txtAge;
	ButtonGroup buttonGroup = new ButtonGroup();   // 라디오 버튼 그룹화를 위해 사용
	JRadioButton rdoM, rdoF;
	JLabel lblResult;
	
	public Ex47() {
		super("이벤트 연습");
		
		layoutInit();
	
		setBounds(800,200,400,300);
		setVisible(true);
		
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // 윈도우 종료
	}

	private void layoutInit() {
		setLayout(new GridLayout(5, 1));
		
		// 1행
		JLabel lbl1 = new JLabel("이름 : ");
		txtName = new JTextField("", 20);
		JPanel panel1 = new JPanel();
		panel1.add(lbl1);
		panel1.add(txtName);
		
		add(panel1);   // Frame에 등록
		// 2행
		JLabel lbl2 = new JLabel("나이 : ");
		txtAge = new JTextField("", 20);
		JPanel panel2 = new JPanel();
		panel2.add(lbl2);
		panel2.add(txtAge);
		
		add(panel2);   // Frame에 등록
		// 3행
		rdoM = new JRadioButton("남자", true);
		rdoF = new JRadioButton("여자", false);
		buttonGroup.add(rdoM);    // JRadioButton은 그룹화 필요
		buttonGroup.add(rdoF);
		JPanel panel3 = new JPanel();
		panel3.add(rdoM);
		panel3.add(rdoF);
		
		add(panel3);   // JFrame에 담김
		// 4행
		JButton btnOk = new JButton("확인");
		btnOk.addActionListener(this);
		JPanel panel4 = new JPanel();
		panel4.add(btnOk);
		
		add(panel4);
		// 5행
		lblResult = new JLabel("결과 : ", JLabel.CENTER);
		add(lblResult);
		
		txtName.requestFocus();   // 해당 객체로 cursor 이동
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// 입력 자료 오류 검사
		if(txtName.getText().equals("")) {
			//lblResult.setText("이름 입력!");
			JOptionPane.showMessageDialog(this, "이름 입력!", "알림", JOptionPane.INFORMATION_MESSAGE);
			txtName.requestFocus();
			return;
		} 
		
		if(txtAge.getText().equals("")) {
			//lblResult.setText("나이 입력!");
			JOptionPane.showMessageDialog(this, "나이 입력!", ":\\", JOptionPane.INFORMATION_MESSAGE);
			txtAge.requestFocus();
			return;
		}
		
		// 나이는 숫자 형태 여부 확인 필요
		int nai = 0;
		try {
			nai = Integer.parseInt(txtAge.getText());
		} catch (Exception e2) {
			//lblResult.setText("나이는 정수만 가능");
			JOptionPane.showMessageDialog(this, "정수 입력!", ":/", JOptionPane.INFORMATION_MESSAGE);
			txtAge.requestFocus();
			return;
		}
		
		// 나이 출력 확인
		//System.out.println(nai);
		
		// 라디오 버튼 선택 여부 확인
		//System.out.println(rdoM.isSelected() + " " + rdoF.isSelected());    // 선택되면 true, 아니면 false  -> 남자를 선택하면 true false, 여자를 선택하면 false true 출력
		
		// 성별 확인
		String gender = "";
		if(rdoM.isSelected()) {
			gender = "남";
		} else {
			gender = "여";
		}
		
		String message = "결과 : " + txtName.getText() + "님의 나이는 " + nai + ", 성별은 " + gender;
		lblResult.setText(message);
	}
	
	public static void main(String[] args) {
		new Ex47();
	}
}
