package pack3;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


// 어탭터 클래스를 이용한 이벤트 처리 연습
// WindowAdapter 추상 클래스는 WindowListener 인터페이스를 구현한 클래스
// WindowListener의 추상 메소드가 WindowAdapter에서 일반메소드로 오버라이딩함
public class MyFrame4Adapter extends WindowAdapter{  // 단일 상속이라 마우스 어댑터를 사용할 수 없음.
	private Frame frame;   
	
	public MyFrame4Adapter() {
		frame = new Frame("Adapter 연습");    // 포함
		
		frame.setSize(300, 250);
		frame.setLocation(200, 200);
		frame.setVisible(true);
		
		// 아래 코드는 귀를 기울여서 27행의 코드를 호출하는 역할.
		frame.addWindowListener(this);  //윈도우리스너 객체를 달라고 한다.  //윈도우 리스너는 윈도우어댑터가 갖고 있고, 윈도우리스너를 갖고 있는 윈도우어댑터.
		// 프레임에 윈도우리스너를 감지한다.
		// addWindowListener는 이벤트를 실행하기 위한 윈도우리스너를 호출을 한다. this는 이 클래스에 선언된 메소드를 호출한다. 
	}
	
	@Override
	public void windowClosing(WindowEvent e) {  // 윈도우 종료 버튼
		// 선택적으로 필요한 메소드를 오버라이딩 할 수 있다.
		System.exit(0);
	}
	
	public static void main(String[] args) {
		new MyFrame4Adapter();  // 객체만 생성하면 됨
	}

}
// 이벤트 발생은 유저
// 화면 디자인은 프로그래머
// 이벤트 핸들러
// 이벤트 핸들러 메소드 이름은 고정. 추상 메소드로 되어 있다. 
// 이를 오버라이딩하여 프로그래머가 작성하여 엔드유저가 원하는 방식으로 작성을 하면된다..

// 키보드 리스너, 마우스 리스너 등
// 리스너 : 프레임을 띄웠는데 관련된 이벤트를 사용자가 하는데 윈도우 리스너를 프레임에 연결해야 함(?)
