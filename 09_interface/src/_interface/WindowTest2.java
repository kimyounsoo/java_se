package _interface;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//Frame은 BorderLayout(동서남북)
public class WindowTest2 extends Frame implements ActionListener, MouseListener, WindowListener {	
	private Button redBtn, greenBtn, blueBtn, exitBtn;// null 값을 갖고있기때문에 17번줄 초기화
	private int x, y;
	
	public static void main(String[] args) {
		
		new WindowTest2().init();
	}
	

	public void init() {
		redBtn = new Button("빨강"); // null 값을 갖고 있기때문에 초기화(생성)
		greenBtn = new Button("초록");
		blueBtn = new Button("파랑");
		exitBtn = new Button("종료");
		
		Panel p = new Panel(); //Panel은 FlowLayout(순서배치는 - 좌우 중앙)
		p.setBackground(new Color(255, 200, 255)); //0~255
		p.add(redBtn);
		p.add(greenBtn);
		p.add(blueBtn);
		p.add(exitBtn);
		
		
		this.add("North", p);
		
//		this.add("North", redBtn);
//		this.add("South", greenBtn);
//		this.add("Center", blueBtn);
		
		setBounds(900, 100, 300, 400);
		setVisible(true);
		
		//이벤트 (뉴스, 사건) 공표안하면 모름 종료 안됨
		this.addWindowListener(this);
		redBtn.addActionListener(this);
		greenBtn.addActionListener(this);
		blueBtn.addActionListener(this);
		exitBtn.addActionListener(this);
		
		this.addMouseListener(this);
	//누르는 버튼 이벤트				이벤트 불러올 클래스(오버라이드된 위치)
	}
	
	@Override
	public void paint(Graphics g) { // 콜백메소드  setvisible 때 한번
		g.drawString("X : " +x+"\t Y : "+y, x, y);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand()=="빨강") { // 이건 타이틀명으로 불러내는 메소드 이건 많이 사용되진 않는다
		//if(e.getSource()==redBtn) { 	  // 이건 참조명으로 불러내는 메소드
			this.setBackground(new Color(255,0,0));
		}else if(e.getSource()==greenBtn) {
			this.setBackground(new Color(0,255,0));
		}else if(e.getSource()==blueBtn) {
			this.setBackground(new Color(0,0,255));
		}else if(e.getSource()==exitBtn) {
			System.exit(0);
		}
}	
	
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0); //프로그램 강제종료
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	//MouseListener Override
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("마우스 클릭");
		
		this.x = e.getX();
		y = e.getY(); // this 생략 가능
		System.out.println("X : " +e.getX()+"\t Y : "+e.getY());
		
		repaint(); // 클릭하는 순간 paint 메소드 강제 호출 paint 메소드는 콜백메소드로 한번밖에 못부르지만 이렇게 다시 강제호출할수 있다
					// paint 메소드는 setvisible 때 한번만 호출하기때문

		
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



}
