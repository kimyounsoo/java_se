package _interface;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class WindowTest extends Frame implements ActionListener, MouseListener,MouseMotionListener{
	private Button exitBtn; // = new Button("종료"); 여기에 바로써도되고 13번줄처럼 해도된다
	
	public static void main(String[] args) {
		//new WindowTest + 생성자 + init()호출
		//보이드메인은 맨위 혹은 맨아래에 두는걸 선호한다
		
		new WindowTest().init();
	}
	
	public void init() {
		exitBtn = new Button("종료");
		
		//배치
		this.add("North", exitBtn);
		
	
		
		setBounds(900, 100, 300, 400);
		setVisible(true);
		
		//이벤트 이벤트는 맨 마지막에 수행
		this.addMouseListener(this); //this 나한테 있다
		this.addMouseMotionListener(this); // this 나한테 있다
		this.addWindowListener(new WindowExit());
		exitBtn.addActionListener(this);
	}	
	
	//ActionListener Override
	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0); // 숫자는 0 1 2 세개가 올수 있지만 종료는 0번으로 알아둔다
		
	}
	 
	//MouseListener Override , Call Back 메소드
	@Override
	public void mouseClicked(MouseEvent arg0) {//구현
		System.out.println("마우스 클릭");
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		System.out.println("마우스 IN");
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		System.out.println("마우스 OUT");
	}

	@Override
	public void mousePressed(MouseEvent arg0) {}

	@Override
	public void mouseReleased(MouseEvent arg0) {}

	//MouseMotionListener Override
	@Override
	public void mouseDragged(MouseEvent arg0) {
		System.out.println("마우스 드래그");
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {}	
	




}
