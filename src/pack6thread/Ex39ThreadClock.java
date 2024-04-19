package pack6thread;

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.swing.plaf.basic.BasicButtonListener;

public class Ex39ThreadClock extends Frame implements ActionListener, Runnable { // ActionListener는 버튼
	Label lblMessage;
	boolean bExit = false;
	Thread thread;

	public Ex39ThreadClock() {
		lblMessage = new Label("show time"); // 좌우 기준 좌측에 출력
		super.add("Center", lblMessage); // Frame 클래스에 add 한 것 , 프레임의 위아래 기준 가운데가 되도록 함.

		Button btnClick = new Button("click");
		super.add("South", btnClick); // 프레임의 south 영역에 버튼을 놓는다.
		btnClick.addActionListener(this); // 현재 클래스가 가지고 있으므로 this

		setTitle("스레드 시계");
		setBounds(200, 200, 300, 300);
		setVisible(true);

		super.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				bExit = true;   // run()의 무한루프를 탈출하기 위해 작성함. 
				System.exit(0);
			}
		});
		
		thread = new Thread(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 버튼을 클릭하면 수행될 메소드
		// System.out.println("와우");
		//showData();
		
		// 만약 사용자 정의 스레드가 이미 있다면 start를 호출하지 않음
		if(thread.isAlive()) return; // return을 만나면 이 메소드를 탈출
		thread.start();
	}

	@Override
	public void run() {
		while(true) {
			//if(bExit == true) break;
			if(bExit) break;
			showData();
			try {
				Thread.sleep(1000);     // 1초 동안 비활성화
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}

	private void showData() {
		LocalDate date = LocalDate.now(); // singleton
		int y = date.getYear();
		int m = date.getMonthValue();
		int d = date.getDayOfMonth();

		LocalTime time = LocalTime.now();
		int h = time.getHour();
		int mi = time.getMinute();
		int s = time.getSecond();

		String ss = y + "-" + m + "-" + d + " " + h + ":" + mi + ":" + s;
		lblMessage.setText(ss);
		lblMessage.setFont(new Font("Times new Roman", Font.BOLD, 20));
	}

	public static void main(String[] args) {
		// 스레드를 이용한 현재 날짜 및 시간 표시
		new Ex39ThreadClock();
	}

}
