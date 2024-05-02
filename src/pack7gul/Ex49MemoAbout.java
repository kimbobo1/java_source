package pack7gul;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
	//JDialog :맞춤형 대화 상자 즉, 커스터마이징이 가능하다.
	//Frame에서 자식창으로 호출 가능
public class Ex49MemoAbout extends JDialog implements ActionListener{
	public Ex49MemoAbout(JFrame frame) {
		super(frame);
		//super(frame,"메모장이란 "+true); // modal   false modeless
		
		
		
		setTitle("메모장이란");
		setModal(true); //true modal
		//setModal(false); // false modal, modeless modeless는 창이 떠있는데도 다른창에 입력가능 modal은 입력불가
		initLayoutAbout();
		
		setBackground(Color.LIGHT_GRAY);
		setBounds(350, 350, 350, 350);
		setVisible(true);  //버튼누르면 닫힘
		
	}
	private void initLayoutAbout() {
		JLabel lblMes =new JLabel("미니 메모장 ver0.9");
		JButton btnConfirm = new JButton("확인");
		btnConfirm.addActionListener(this);
		add("Center", lblMes);
		add("South", btnConfirm);
		
	}
	@Override
		public void actionPerformed(ActionEvent e) {
			
			dispose(); // Jdialog 닫기
			
		}
	
}
