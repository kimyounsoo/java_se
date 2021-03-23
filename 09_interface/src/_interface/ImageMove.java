package _interface;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ImageMove extends Frame implements ActionListener, KeyListener, WindowListener {
	private Button resetBtn, leftBtn, upBtn, downBtn, rightBtn;
	private int x = 100;
	private int y = 100;

	public static void main(String[] args) {

//		new ImageMove().init(); //일회용
		ImageMove i = new ImageMove(); // i 불러올수 있는것
		i.init();

	}

	public void init() {

		resetBtn = new Button("   초기화   ");
		leftBtn = new Button("   왼쪽   ");
		upBtn = new Button("   위   ");
		downBtn = new Button("   아래   ");
		rightBtn = new Button("   오른쪽   ");

		Panel p = new Panel();
		p.add(resetBtn);
		p.add(leftBtn);
		p.add(upBtn);
		p.add(downBtn);
		p.add(rightBtn);

		this.add("North", p);

		setTitle("이미지 이동");
		setBounds(700, 300, 500, 500);
		this.setResizable(false);
		setVisible(true);

		// 포커스 없애기 처리
		resetBtn.setFocusable(false);
		leftBtn.setFocusable(false);
		upBtn.setFocusable(false);
		downBtn.setFocusable(false);
		rightBtn.setFocusable(false);

		// 이벤트
		this.addWindowListener(this);

		resetBtn.addActionListener(this);
		leftBtn.addActionListener(this);
		upBtn.addActionListener(this);
		downBtn.addActionListener(this);
		rightBtn.addActionListener(this);
		this.addKeyListener(this);

	}

	@Override
	public void paint(Graphics g) {
		Image img = Toolkit.getDefaultToolkit().getImage("angryTube.png");
		g.drawImage(img, x, y, this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == resetBtn) {
			System.out.println("초기화");
			x = 100;
			y = 100;
			// 여기 repaint(); 는 아래에서 묶어서써줘도 된다

		} else if (e.getSource() == leftBtn) {
			x -= 30; // x = x - 10;
			// 여기엔 repaint(); 안해도됨
			if (x <= -200) {
				x = 490;
				// 여기 repaint(); 는 아래에서 묶어서써줘도 된다
			}
		} else if (e.getSource() == upBtn) {
			y -= 30;
			// 여기엔 repaint(); 안해도됨
			if (y < -170) {
				y = 490;
				// 여기 repaint(); 는 아래에서 묶어서써줘도 된다
			}

		} else if (e.getSource() == downBtn) {
			y += 30;
			// 여기엔 repaint(); 안해도됨
			if (y > 490) {
				y = -170;
				// 여기 repaint(); 는 아래에서 묶어서써줘도 된다
			}

		} else if (e.getSource() == rightBtn) {
			x += 30;
			// 여기엔 repaint(); 안해도됨
			if (x > 490) {
				x = -200;
				// 여기 repaint(); 는 아래에서 묶어서써줘도 된다
			}

		}
		repaint();

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
	public void windowClosing(WindowEvent e) {
		System.exit(0);

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

	// KeyLitener Override
	@Override
	public void keyPressed(KeyEvent e) {
		// if(e.getKeyCode() == 27)
		if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
			System.exit(0);
		} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			x -= 30; // x = x - 10;
			// 여기엔 repaint(); 안해도됨
			if (x <= -200) {
				x = 490;
				// 여기 repaint(); 는 아래에서 묶어서써줘도 된다
			}
		} else if (e.getKeyCode() == KeyEvent.VK_UP) {
			y -= 30;
			// 여기엔 repaint(); 안해도됨
			if (y < -170) {
				y = 490;
				// 여기 repaint(); 는 아래에서 묶어서써줘도 된다
			}

		} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			y += 30;
			// 여기엔 repaint(); 안해도됨
			if (y > 490) {
				y = -170;
				// 여기 repaint(); 는 아래에서 묶어서써줘도 된다
			}

		} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			x += 30;
			// 여기엔 repaint(); 안해도됨
			if (x > 490) {
				x = -200;
				// 여기 repaint(); 는 아래에서 묶어서써줘도 된다
			}
		}
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

}
//1. Frame 창띄우기 - 창고정
//2. North 방향에 버튼 5개만들기
//3. Frame(창) 에 100, 100 위치에 이미지 그리기
//4. 이벤트