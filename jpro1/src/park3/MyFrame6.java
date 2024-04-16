package park3;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame6 extends Frame{
	public MyFrame6(String msg) {
		super(msg);
		
		setSize(300,250);
		setLocation(200,200);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//setBackground(new Color(0, 0, 255));
				setBackground(Color.BLUE);
			}
		});
	}

	public static void main(String[] args) {
		//내부 무명 클래스
		new MyFrame6("내부 무명 클래스");
		
		
		
	}

}
