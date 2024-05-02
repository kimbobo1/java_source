package pack7gul;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Ex50Packman extends JFrame implements KeyListener{
	//키보드 2벤트 연습
	Image image;
	int x = 100 , y= 100;
	int selImage = 1;
	
	
	
	public Ex50Packman() {
		
		super("상하좌우 화살표를 사용하셈");
		//이미지를 넣을때 toolkit사용 한다
		setIconImage(Toolkit.getDefaultToolkit().getImage("/Users/bohyunkim/git/repository2/src/pack7gul/pack1.jpg")); 
		
		setLayout(null); //배치관리자없음
		setResizable(false); //창크기조절 못함
		
		setBounds(200, 200, 700, 800);
		setBackground(Color.WHITE);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		addKeyListener(this);  //키 사용하게 리스너줘~
		
		x = super.getWidth() /2;  //프레임의 	너비 절반	int x = 100 , y= 100;의절반 
		y = super.getHeight() /2;  //프레임의 높이 절반 	int x = 100 , y= 100;의 절반
		
	}
	@Override
	public void paint(Graphics g) {
		// Frame에 뭔가를 그려주는 메소드로 자동호출
		switch(selImage) {
		case 1:
			image=Toolkit.getDefaultToolkit().getImage("/Users/bohyunkim/git/repository2/src/pack7gul/pack10.jpg"); 
			break;
		case 2:
			image=Toolkit.getDefaultToolkit().getImage("/Users/bohyunkim/git/repository2/src/pack7gul/pack11.jpg"); 
			break;
		case 3:
			image=Toolkit.getDefaultToolkit().getImage("/Users/bohyunkim/git/repository2/src/pack7gul/pack3.jpg"); 
			break;
		case 4:
			image=Toolkit.getDefaultToolkit().getImage("/Users/bohyunkim/git/repository2/src/pack7gul/pack4.jpg"); 
			break;
		case 5:
			image=Toolkit.getDefaultToolkit().getImage("/Users/bohyunkim/git/repository2/src/pack7gul/pack5.jpg"); 
			break;
		case 6:
			image=Toolkit.getDefaultToolkit().getImage("/Users/bohyunkim/git/repository2/src/pack7gul/pack6.jpg"); 
			break;
		case 7:
			image=Toolkit.getDefaultToolkit().getImage("/Users/bohyunkim/git/repository2/src/pack7gul/pack7.jpg"); 
			break;
		case 8:
			image=Toolkit.getDefaultToolkit().getImage("/Users/bohyunkim/git/repository2/src/pack7gul/pack8.jpg"); 
			break;
		
		}
		
		//image=Toolkit.getDefaultToolkit().getImage("/Users/bohyunkim/git/repository2/src/pack7gul/pack1.jpg"); 
		g.clearRect(0, 0, getWidth(), getHeight()); //화면 전체를 선택 후클리어  잔상해결 
		
		
		g.drawImage(image, x-image.getWidth(this) / 2,y-image.getHeight(this) / 2, this); //현재클래스에서 감시 this감시자
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		int key=e.getKeyCode();
		//System.out.println("key :" + key);
		
		
		//오른쪽 화살표   KeyEvent.VK_NUMPAD6 숫자6 맥북에 없어
		if(key == KeyEvent.VK_RIGHT || key == KeyEvent.VK_NUMPAD6) {
			//System.out.println("go");
			selImage=(selImage == 2)?1:2; //삼항 연산자  1이면2를주고 아니면 1을준다
			//x = x+10;
			//x = (x < getWidth())?x+=10:-image.getWidth(this);
			x = (x < getWidth())?x+=10:0;
		}if(key == KeyEvent.VK_UP || key == KeyEvent.VK_NUMPAD6) {
			//System.out.println("go");
			selImage=(selImage == 8)?7:8; //삼항 연산자  1이면2를주고 아니면 1을준다
			//x = x+10;
			y = (y > 0)?y-=10:getWidth()+image.getWidth(this);
		}
		if(key == KeyEvent.VK_DOWN || key == KeyEvent.VK_NUMPAD6) {
			//System.out.println("go");
			selImage=(selImage == 6)?5:6; //삼항 연산자  1이면2를주고 아니면 1을준다
			//x = x+10;
			y = (y < getWidth())?y+=10:-image.getWidth(this);
		}
		if(key == KeyEvent.VK_LEFT || key == KeyEvent.VK_NUMPAD6) {
			//System.out.println("go");
			selImage=(selImage == 1)?2:1; //삼항 연산자  1이면2를주고 아니면 1을준다
			//x = x+10;
			x= (x >0 )?x-=10:getWidth();
			//x= (x >0 )?x-=10:getWidth()+image.getWidth(this);
		}
		repaint(); //paint()호출
		
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		new Ex50Packman();
		
	}
}
