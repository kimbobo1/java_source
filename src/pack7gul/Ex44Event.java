package pack7gul;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex44Event extends Frame implements ActionListener{
	private Button btn1 = new Button("button1");
	private Button btn2 = new Button("button2");
	private Button btn3 = new Button("button3");
	private Button btn4 = new Button("button4");
	private Button btn5 = new Button("button5");
	public Ex44Event() {
	super("이벤트연습");
	
	addLayout();
	setBounds(200,200,400,400);
	setVisible(true);
	addWindowListener(new WindowAdapter() {
		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			System.exit(0);
		}
	});
}
	private void addLayout() {
		add("East",btn1);
		add("West",btn2);
		add("South",btn3);
		add("Center",btn4);
		add("North",btn5);
		btn1.addActionListener(this);  //방법1: 현재 클래스에 implements actionlistener를사용
		btn2.addActionListener(this);
		
		btn3.addActionListener(new EventTest()); // 방법2번 내부 클래스 사용 implements
		
		btn4.addMouseListener(new EventTest2());//방법3 :내부클래스 사용 extends
		btn5.addMouseListener(new MouseAdapter() {//방법4 내부 무명 클래스 사용
			//btn5를 클릭하면수행되  는메소드
			@Override
			public void mouseClicked(MouseEvent e) {
				//btn5를 클릭하면수행되  는메소드
				setTitle("버튼5 왜눌렀어");
			}
			
		});
	
	}
	@Override
	public void actionPerformed(ActionEvent e) { //1번과2번을 실행시켜줌
		//btn1,btn2를 클릭하면 수행되는 메소드 
		
		//System.out.println(e.getActionCommand());
		//System.out.println(e.getSource());
		if(e.getSource() == btn1) { //객체 비교 ==를 써준다
			setTitle("버튼 1 클릭");
			
		}else if(e.getSource() == btn2) {
			setTitle("버튼 2 click");
			
		}
	}
	class EventTest implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			//btn3을 클릭하면 수행되는 메소드 
			setTitle("버튼 3 눌러");
		}
	}
	class EventTest2 extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			setTitle("버튼마우스 이벤트로 btn4  눌렀네?");
		}
	}
	public static void main(String[] args) {
		// 이벤트 처리 정리
		new Ex44Event();

	}

}
