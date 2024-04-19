package pack3;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

// 인터페이스를 이용한 이벤트 처리 연습
public class MyFrame3 extends Frame implements WindowListener, MouseListener{
	//MyFrame3 test= new MyFrame3();
	public MyFrame3() {
		// 생성자
		//super("상속 사용");   // 생성자를 통해 값을 줌. -> 멤버 필드 타이틀에 넣어줌
		super.setTitle("상속 사용");  // setter를 사용해 제목 입력
		
		display();
		
		super.addWindowListener(this);  // Frame 클래스가 갖고 있음    (super.)addWindowListener(null);   // 현재 Frame에 이벤트 리스너를 장착
		// 현재 프레임에 윈도우리스너를 장착, 얘가 인자를 달라고 하는데 현재 클래스가 윈도우 클래스를 가지고 있다.
		addMouseListener(this);  // 마우스리스너 발생.
 	}
	
	void display() {
		setSize(500, 300);
		setLocation(200, 150);
		setVisible(true);
	}
	
	// WindowListener가 가진 추상메소드 오버라이딩
	@Override
	public void windowActivated(WindowEvent e) {
		// 복수의 창이 있을 떄 한쪽은 activated, 다른 한 쪽은 deactivated
	}
	
	@Override
	public void windowClosed(WindowEvent e) {
		
	}
	
	@Override
	public void windowClosing(WindowEvent e) {  // 윈도우 종료 버튼
		//System.out.println("종료");
		//setTitle("안녕 종료는 아직...");          // 종료 버튼을 누르면 title이 변경된다. -> 이벤트 처리
		System.exit(0);
	}
	
	@Override
	public void windowDeactivated(WindowEvent e) {
		// 복수의 창이 있을 떄 한쪽은 activated, 다른 한 쪽은 deactivated
	}
	
	@Override
	public void windowDeiconified(WindowEvent e) {  // 윈도우 창 활성화
		System.out.println("windowDeiconified");
	}
	
	@Override
	public void windowIconified(WindowEvent e) {  // 윈도우 창 축소
		System.out.println("windowIconified");	
	}
	
	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("windowOpened");
	}
	
	// MouseListener가 가진 추상메소드 오버라이딩
	@Override
	public void mouseClicked(MouseEvent e) {     // 마우스 클릭 시, 실행
		//System.out.println("클릭 성공 후 점심 먹기");
		//System.out.println((int)(Math.random() * 255));  // 난수 생성
		int r = (int)(Math.random() * 255);
		int g = (int)(Math.random() * 255);
		int b = (int)(Math.random() * 255);
		setBackground(new Color(r, g, b));   // 배경색 255,0,0 red로 변경  // 이 메소드도 부모클래스에 선언되어 있으므로 super.를 쓸수 있으나 이 클래스의 멤버 메소드에 오버라이딩되지 않았으므로 super를 붙이지 않아도 부모 클래스로 올라가서 메소드를 호출한다.
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
			
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
			
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		
	}
	
	public static void main(String[] args) {
		new MyFrame3();  // 객체만 생성하면 됨
	}

}
// 이벤트 발생은 유저
// 화면 디자인은 프로그래머
// 이벤트 핸들러
// 이벤트 핸들러 메소드 이름은 고정. 추상 메소드로 되어 있다. 
// 이를 오버라이딩하여 프로그래머가 작성하여 엔드유저가 원하는 방식으로 작성을 하면된다..

// 키보드 리스더, 마우스 리스너 등
// 리스너 : 프레임을 띄웠는데 관련된 이벤트를 사용자가 하는데 윈도우 리스너를 프레임에 연결해야 함(?)
