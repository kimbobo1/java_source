package pack3;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;  // 그래픽을 위해 제공되는 클래스
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;      // 추상 클래스
import java.awt.event.WindowEvent;


// 내부 클래스 예시
public class MyFrame5Inner extends Frame{
	//private Wevent wevent;
	private Wevent wevent = new Wevent();
	int x, y;   // mouseClicked에서 발생한 x, y 좌표를 기억
	private String[] names= { "정재형", "이원재", "지명기", "김성하", "김서현" };
	
	public MyFrame5Inner() {
		setTitle("내부 클래스");
		
		setSize(300, 250);
		setLocation(200, 200);
		setVisible(true);
		
		//wevent = new Wevent();
		//addiwindowListener(wevent);
		addWindowListener(wevent);  // Frame이 가지고 있는 메소드, 이벤트 객체 , new Wevent()와 동일
		addMouseListener(new Mevent());
	}
	
	class Wevent extends WindowAdapter{  // 내부 클래스, MyFrame5Inner의 멤버 1
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
	
	class Mevent extends MouseAdapter {  // 내부 클래스, MyFrame5Inner의 멤버 2
		@Override
		public void mouseClicked(MouseEvent e) {   // 마우스 이벤트가 가지고 있는 정보를 e가 가짐
			//setTitle("클릭");
			//int x = e.getX();        // x 좌표를 얻을 수 있는 메소드, 지역변수에 값 치환
			//int y = e.getY();        // y 좌표를 얻을 수 있는 메소드, 지역변수에 값 치환
			x = e.getX();              // 전역 변수에 값 치환
			y = e.getY();              // 전역 변수에 값 치환
			setTitle("X : " + x + ", Y : " + y);
			
			//paint(getGraphics());  // 자동 호출되지만 명시적으로 부를 수 있다.  자동호출되는 paint()를 명시적으로 호출
			repaint();  // Graphics 객체를 가진 paint()를 호출. refresh 됨.
		}
	}
	
	@Override
	public void paint(Graphics g) {  // 멤버 메소드, 자동 호출이 기본  // paint 메소드는 Frame이 가지고 있다.
		// Graphics : Frame이 제공하는 그림 그리기 객체
		//g.drawString("홍길동", 100, 100);   // x : 100, y : 100에 홍길동이 그려짐, 호출하지 않았지만 자동 호출됨, 좌표는 고정된 상태
		g.setFont(new Font("굴림체", Font.BOLD, (int)(Math.random() * 50 + 8)));  // 글꼴 크기 조절
		
		int n = (int)(Math.random() * 5);
		//g.drawString("홍길동", x, y); 좌표를 무작위로 설정
		g.drawString(names[n], x, y);  //names 배열은 전역 변수임.
	}
	
	public static void main(String[] args) {
		new MyFrame5Inner();
	}
}
