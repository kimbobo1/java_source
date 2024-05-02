package pack7gul;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.net.URI;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.Popup;

public class Ex49Memojang extends JFrame implements ActionListener{
	private JTextArea txtMemo = new JTextArea("",10,30); //10행 30열 ""초기값
	private String copyText; //복사 복사한 문자열 잠시 보관용
	
	private JMenuItem mnuNew,mnuSave,mnuOpen,mnuExit;    //메뉴로 쓸 것들
	private JMenuItem mnuCopy,mnuPaste,mnuCut,mnuDel,mnuFontSize;
	private JMenuItem mnuAbout,mnuEtc1,mnuEtc2;
	
	private JPopupMenu popup;  //팝업 메뉴 용
	private JMenuItem m_white, m_blue , m_yellow;
	
	
	
	public Ex49Memojang() {
		super("메모장"); //가장 먼저 적어야함 자바의 규칙
		
		initLayout();
		menuLayout();
		setBounds(200, 200, 400, 350); //화면크기
		setVisible(true); //화면 띄우기
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 화면 닫기
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
			int result = JOptionPane.showConfirmDialog(Ex49Memojang.this,"정말 종료할거양?", "종료 확인", JOptionPane.YES_NO_OPTION);
			if(result == JOptionPane.YES_OPTION)
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			else
			setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			}
			});
		
	}
	private void initLayout() {
		JScrollPane scrollPane = new JScrollPane(txtMemo);
		txtMemo.setFont(new Font("돋음", Font.PLAIN, 16));
		add("Center",scrollPane);
		
	}
	private void menuLayout() {
		JMenuBar menuBar = new JMenuBar(); //메뉴바 
		
		JMenu mnuFile = new JMenu("파일"); //주메뉴
		
		mnuNew = new JMenuItem("새문서");  // 부 메뉴
		mnuOpen = new JMenuItem("열기..");// 부 메뉴
		mnuSave = new JMenuItem("저장..");// 부 메뉴
		mnuExit = new JMenuItem("종료..");// 부 메뉴
		mnuFile.add(mnuNew);
		mnuFile.add(mnuOpen);
		mnuFile.add(mnuSave);
		mnuFile.addSeparator(); // 구분선
		mnuFile.add(mnuExit);
		
		JMenu mnuEdit= new JMenu("편집");
		mnuCopy =new JMenuItem("복사");
		mnuCopy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,ActionEvent.CTRL_MASK)); //단축키
		mnuPaste =new JMenuItem("붙여넣기");
		mnuCut =new JMenuItem("잘라내기");
		mnuDel =new JMenuItem("삭제");
		mnuFontSize = new JMenuItem("글꼴 크기...");
		
		mnuEdit.add(mnuCopy);
		mnuEdit.add(mnuPaste);
		mnuEdit.add(mnuCut);
		mnuEdit.add(mnuDel);
		mnuFile.addSeparator();
		mnuEdit.add(mnuFontSize);
		
		
		
		JMenu mnuShow = new JMenu("보기"); //주메뉴
		mnuAbout = new JMenuItem("메모장이란...");
		mnuEtc1 = new JMenuItem("계산기");
		mnuEtc2 = new JMenuItem("카페");
		mnuShow.add(mnuAbout);
		mnuShow.addSeparator(); // 구분선
		mnuShow.add(mnuEtc1);
		mnuShow.add(mnuEtc2);
		
		
		menuBar.add(mnuFile); // 메뉴바에 주메뉴 등록
		menuBar.add(mnuEdit);
		menuBar.add(mnuShow);
		
		setJMenuBar(menuBar);  //JFrame에 메뉴바 등록
		
		//메뉴에 리스너 등록 기능 넣기
		mnuNew.addActionListener(this);
		mnuOpen.addActionListener(this);
		mnuSave.addActionListener(this);
		mnuExit.addActionListener(this);
		mnuCopy.addActionListener(this);
		mnuCut.addActionListener(this);
		mnuDel.addActionListener(this);
		mnuEtc1.addActionListener(this);
		mnuEtc2.addActionListener(this);
		mnuPaste.addActionListener(this);
		mnuAbout.addActionListener(this);
		mnuFontSize.addActionListener(this);
		
		//팝업 메뉴
		popup= new JPopupMenu();
		JMenu menuColor = new JMenu("색선택");
		m_blue = new JMenuItem("파랑");
		m_white = new JMenuItem("하얀색");
		m_yellow =new JMenuItem("노랑");
		menuColor.add(m_blue);
		menuColor.add(m_white);
		menuColor.add(m_yellow);
		m_white.addActionListener(this);
		m_blue.addActionListener(this);
		m_yellow.addActionListener(this);
		popup.add(menuColor);
		txtMemo.add(popup); //txtmemo에 팝업메뉴추가
		txtMemo.addMouseListener(new MouseAdapter() {
			//마우스 오른쪽 버튼클릭시...해당 지점에 팝업띄우기
			@Override
			public void mousePressed(MouseEvent e) {
				if((e.getModifiersEx() & MouseEvent.BUTTON3_DOWN_MASK) == MouseEvent.BUTTON3_DOWN_MASK) {
					popup.show(txtMemo, e.getX(), e.getY());
				}
				//if(e.getModifiers() == MouseEvent.BUTTON3_MASK) {
					//popup.show(txtMemo, e.getX(), e.getY()); //해당지점클릭 
				//}
			}
		});
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//System.out.println(e.getActionCommand()); //콘솔의 버튼이름 출력
		//System.out.println(e.getSource());  //누르면 콘솔창에 소스가 뜬다
		if(e.getSource() == mnuNew) {//새문서 누르면 다시 기능이 붙여넣기가 됨
			txtMemo.setText("");
			setTitle("제목 좀 줄래?");
			
			
		}else if(e.getSource() == mnuOpen) {//열기
			//파일 열기 을 위한 경로명과 파일명 얻기는 os지원 창 사용
			FileDialog dialog= new FileDialog(this,"열기",FileDialog.LOAD);
			dialog.setDirectory("");
			dialog.setVisible(true);
			
			if(dialog.getFile()==null)return;
			String dfName = dialog.getDirectory() + dialog.getFile();
			try {
				BufferedReader reader= new BufferedReader(new FileReader(dfName));
				
				txtMemo.setText("");//비워놓기
				String line = "";
				while((line=reader.readLine())!=null){
					txtMemo.append(line+"\n");
				}
				reader.close();
				setTitle(dialog.getFile()+ "- 메모장 ");
				
				
			} catch (Exception e2) {
				System.out.println(e2.getMessage());//개발자가 보기위함
				JOptionPane.showMessageDialog(this, e2.getMessage(),"에러",JOptionPane.WARNING_MESSAGE);	//사용자가보기위함	
			}
			
		}else if(e.getSource() == mnuSave) { //저장
			//파일 저장을 위한 경로명과 파일명 얻기는 os지원 창 사용
			FileDialog dialog= new FileDialog(this,"저장",FileDialog.SAVE);
			dialog.setDirectory("");
			dialog.setVisible(true);
			
			if(dialog.getFile()==null)return;
			String dfName = dialog.getDirectory() + dialog.getFile();
		
			//System.out.println("dfName: "+dfName);
			
			try {
				//BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/bohyunkim/a.txt"));
				BufferedWriter writer = new BufferedWriter(new FileWriter(dfName)); //경로 저장
				
				writer.write(txtMemo.getText());
				writer.close();
				setTitle(dialog.getFile()+ "- 메모장 ");
				
			} catch (Exception e2) {
				System.out.println(e2.getMessage());//개발자가 보기위함
				JOptionPane.showMessageDialog(this, e2.getMessage(),"에러",JOptionPane.WARNING_MESSAGE);	//사용자가보기위함	
			}
			
		}else if(e.getSource() == mnuExit) { //종료
			
				int result = JOptionPane.showConfirmDialog(this,"정말 종료할거야?", "종료 확인", JOptionPane.YES_NO_OPTION);
				
				if(result == JOptionPane.YES_OPTION)
				System.exit(0);
				else
				setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			
		}else if(e.getSource() == mnuCopy) {//복사
			//System.out.println(txtMemo.getText());  //텍스트 전체
			//System.out.println(txtMemo.getSelectedText()); //범위 지정만 복사
			copyText = txtMemo.getSelectedText();
			
		
			
			
		}else if(e.getSource() == mnuCut) {//잘라내기
			copyText = txtMemo.getSelectedText();
			
			int start =txtMemo.getSelectionStart();
			int end =txtMemo.getSelectionEnd();
			txtMemo.replaceRange("", start, end);
			
		}else if(e.getSource() == mnuDel) {//삭제
			
			int start =txtMemo.getSelectionStart();
			int end =txtMemo.getSelectionEnd();
			txtMemo.replaceRange("", start, end);
			
		}else if(e.getSource() == mnuEtc1) {//기타1
			//exe(실행파일) 실행
			try {
				Runtime runtime = Runtime.getRuntime();
				runtime.exec("calc.exe"); //윈도우용
				
				
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(this, e2.getMessage());
			}
			
			
			
			
			
		}else if(e.getSource() == mnuEtc2) {//기타2
			
			//브라우저실행
			try {
				
				String url = "https://cafe.daum.net/flowlife/RUrO";
				//desktop 지원확인
				
				//데스크탑 클래스는 자바 응용 프로그램 url 나 파일 처리하기
				// 위해 기본 등록된 관련 응용 프로그램 실행 할수있다 지원하는 기능 기본 브라우저 를 통해서 url전시 메일 클라이언트 실행 
				//기본응용프로그램을 통해서 파일을 열거나 편
				if(Desktop.isDesktopSupported()) {
					Desktop desktop = Desktop.getDesktop();
					if(desktop.isSupported(Desktop.Action.BROWSE)) {
						//URI는 문자열 특정 리소스를 의미
						desktop.browse(new URI(url));
					}
				}else {
					JOptionPane.showMessageDialog(this, "브라우저 지원 안함");
				}
				
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(this, e2.getMessage());
			}
		}else if(e.getSource()==m_white){
			txtMemo.setBackground(Color.WHITE);
		}else if(e.getSource()==m_blue){
			txtMemo.setBackground(Color.BLUE);
		}else if(e.getSource()==m_yellow){
			txtMemo.setBackground(Color.YELLOW);
			
			
		}else if(e.getSource() == mnuPaste) {//붙여넣기
			//txtMemo.setText(copyText); //붙여넣기하면 새 메모장ㅇ로 복사
			
			int position = txtMemo.getCaretPosition(); //커서로 위치지정
			txtMemo.insert(copyText, position); //커서가 있는 지점에 붙여넣기 
			
		}else if(e.getSource() == mnuAbout) {//메모장이란
			new Ex49MemoAbout(this);
			System.out.println("About 호출 후 상황");  //modal,modeless 구분 modeless는 창이 떠있는데도 다른창에 입력가
			
			
			
		}else if(e.getSource() == mnuFontSize) { //글꼴크기
			String fontSize = JOptionPane.showInputDialog(this,"글자크기"+16);
			if(fontSize !=null) {
				try {
					int fSize = Integer.parseInt(fontSize);
					
					txtMemo.setFont(new Font(txtMemo.getFont().getName(), txtMemo.getFont().getStyle(), fSize));
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(this, "글자크기를 입력하세요");
				}
			}
			
		}
		
		
	}
	public static void main(String[] args) {
		//간단한 메모장 만들어보기
		new Ex49Memojang();
	}

}
