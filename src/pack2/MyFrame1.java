package pack2;

import java.awt.Frame;

// 자바가 지원하는 Frame 클래스로 창 띄우기 : 포함 관계
public class MyFrame1 {
	private String title = "포함관계"; 
	private Frame frame;
	
	public MyFrame1() {
		frame = new Frame(title);
		
//		frame.setSize(500, 300);
//		frame.setLocation(200, 150);
//		frame.setVisible(true);
	}
	
	private void display() {
		frame.setSize(500, 300);
		frame.setLocation(200, 150);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		MyFrame1 frame1 = new MyFrame1();  // 10-12행 수행
		frame1.display();
//		new MyFrame1();
//		new MyFrame1().display();
	}
}
