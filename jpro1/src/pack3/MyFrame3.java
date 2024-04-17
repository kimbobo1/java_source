package pack3;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyFrame3 extends Frame implements WindowListener,MouseListener{
	public MyFrame3() {
		//생성자
		//super("상속 사용");
		setTitle("상속 사용");
		disply();
		
		addWindowListener(this);  //현재 Frame에 이벤트 리스너를 장착 
		addMouseListener(this);
	}
	void disply() {
		setSize(500,300);
		setLocation(200,300);
		setVisible(true);
	}
	//WindowListener가  가진 추상 메소드 오버라이딩
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent e) {
		//System.out.println("종료");
		//setTitle("안녕 종료는 아직..");
		System.exit(0);
		
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("windowDeiconified");
		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("windowIconified");
		
	}
	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("windowOpened");
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		//System.out.println("클릭 성공후 점심 먹기 ");
		//setBackground(new Color(255, 0, 0));
		//System.out.println((int)(Math.random()*255));
		int r =(int)(Math.random()*255);
		int g = (int)(Math.random()*255);
		int b = (int)(Math.random()*255);
		setBackground(new Color(r, g, b));
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	public static void main(String[] args) {
		// 상속으로 Frame 띄우기
		MyFrame3 frame= new MyFrame3();
		//frame.disply();
		//new MyFrame3().disply();
		
	}

}
