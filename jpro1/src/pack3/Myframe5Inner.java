package pack3;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Myframe5Inner extends Frame{
	private Wevent wevent =new Wevent();
	int x , y; //mouseClicked 에서 발생한 x,y 좌표를 기억
	private String[]names = {"김보현", "고다현","천훈민","장요한"};
	
	public Myframe5Inner() {
		
		setTitle("내부사이즈");
		setSize(300,250);
		setLocation(200,200);
		setVisible(true);
		addWindowListener(wevent);
		addMouseListener(new Mevent());
		
	}
	class Wevent extends WindowAdapter{//내부 클래스
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
			super.windowClosing(e);
		}
		
	}
	
	class Mevent extends MouseAdapter{//내부클래스
		@Override
		public void mouseClicked(MouseEvent e) {
			//setTitle("클릭");	
			//int x = e.getX();  //x좌표 y좌표 표시하기
			//int y = e.getY(); //지역 변수에 값 치환
			
			x = e.getX();  //전역 변수에 값치환
			y = e.getY();
			setTitle("x:" +x + ", y " + y);
			
			//paint(getGraphics());  //자동호출되는  paint()를 명시적으로 호출
			repaint();  //Graphice 객체를 가진 paint()호출 refresh됨
		}
		
		
	}
	
	@Override
	public void paint(Graphics g) { // 자동 호출이 기본
		//graphics : Frame이 제공하는 그림 그리기 객체
		//g.drawString("홍길동", 100, 100);
		g.setFont(new Font("굴림",Font.BOLD, (int)(Math.random()* 50 + 8 )));
		int n = (int)(Math.random() * 4);
		//g.drawString("홍길동",x, y);
		g.drawString(names[n],x, y);
		
		
	}
	
	
	public static void main(String[] args) {
		new Myframe5Inner();
	
	}
}
