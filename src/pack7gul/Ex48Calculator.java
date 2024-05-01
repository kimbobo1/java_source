package pack7gul;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Ex48Calculator extends JFrame implements ActionListener {
private JTextField txt1, txt2;
int num1, num2;
private ButtonGroup rbGroup = new ButtonGroup();
private JRadioButton rbA, rbS, rbM, rbD;
private JLabel lblResult;
private JButton btnCalc, btnReset, btnFin;

public Ex48Calculator() {
super("미니 계산기");
calcLayout();
setBounds(200, 200, 300, 400);
setVisible(true);

addWindowListener(new WindowAdapter() {
@Override
public void windowClosing(WindowEvent e) {
int result = JOptionPane.showConfirmDialog(Ex48Calculator.this,"정말 종료할거야?", "종료 확인", JOptionPane.YES_NO_OPTION);
if(result == JOptionPane.YES_OPTION)
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
else
setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
}
});
}

private void calcLayout() {
setLayout(new GridLayout(5,1));

// 1행
JLabel lbl1 = new JLabel("숫자1: ");
txt1 = new JTextField("",20);
JPanel panel1 = new JPanel();
panel1.add(lbl1);
panel1.add(txt1);
add(panel1);

// 2행
JLabel lbl2 = new JLabel("숫자2: ");
txt2 = new JTextField("",20);
JPanel panel2 = new JPanel();
panel2.add(lbl2);
panel2.add(txt2);
add(panel2);

// 3행
JLabel lbl3 = new JLabel("연산선택: ");
rbA = new JRadioButton("+",true);
rbS = new JRadioButton("-",false);
rbM = new JRadioButton("*",false);
rbD = new JRadioButton("/",false);
rbGroup.add(rbA);
rbGroup.add(rbS);
rbGroup.add(rbM);
rbGroup.add(rbD);

JPanel panel3 = new JPanel();
panel3.add(lbl3);
panel3.add(rbA);
panel3.add(rbS);
panel3.add(rbM);
panel3.add(rbD);
add(panel3);

// 4행
lblResult = new JLabel("결과: ", JLabel.CENTER);
add(lblResult);

// 5행
btnCalc = new JButton("계산");
btnReset = new JButton("초기화");
btnFin = new JButton("종료");
btnCalc.addActionListener(this);
btnReset.addActionListener(this);
btnFin.addActionListener(this);

JPanel panel5 = new JPanel();
panel5.add(btnCalc);
panel5.add(btnReset);
panel5.add(btnFin);
add(panel5);

}

@Override
public void actionPerformed(ActionEvent e) {
if(e.getSource() == btnCalc) {
// 숫자1 오류 검사
if(txt1.getText().equals("")) {
lblResult.setText("숫자1 입력해");
txt1.requestFocus();
return;
}
try {
num1 = Integer.parseInt(txt1.getText());
} catch (Exception e2) {
lblResult.setText("숫자1 정수로 제대로 입력!!");
txt1.requestFocus();
return;
}// 숫자2 오류 검사
if(txt2.getText().equals("")) {
lblResult.setText("숫자2 입력해");
txt2.requestFocus();
return;
}
try {
num2 = Integer.parseInt(txt2.getText());
} catch (Exception e2) {
lblResult.setText("숫자2 정수로 제대로 입력!!");
txt2.requestFocus();
return;
}

// 계산
if(rbA.isSelected()) lblResult.setText("결과: " + (num1 + num2));
else if (rbS.isSelected()) lblResult.setText("결과: " + (num1 - num2));
else if (rbM.isSelected()) lblResult.setText("결과: " + (num1 * num2));
else {
if(num1==0) {
lblResult.setText("0은 나눌 수 없어");
txt1.setText("");
txt1.requestFocus();
}
else if(num2==0) {
lblResult.setText("0으로 나눌 수 없어");
txt2.setText("");
txt2.requestFocus();
} else
lblResult.setText("결과: " + (double)num1 /num2);
}


} else if(e.getSource() == btnReset) {
txt1.setText("");
txt2.setText("");
rbA.setSelected(true);
rbS.setSelected(false);
rbM.setSelected(false);
rbD.setSelected(false);
txt1.requestFocus();
lblResult.setText("결과: ");
} else {
int result = JOptionPane.showConfirmDialog(this, "정말 종료할거야?", "종료 확인", JOptionPane.YES_NO_OPTION);
if(result == 0) System.exit(0);
else return;
}
}

public static void main(String[] args) {
System.out.println();
new Ex48Calculator();
}
}


