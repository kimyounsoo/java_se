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

//		new ImageMove().init(); //��ȸ��
		ImageMove i = new ImageMove(); // i �ҷ��ü� �ִ°�
		i.init();

	}

	public void init() {

		resetBtn = new Button("   �ʱ�ȭ   ");
		leftBtn = new Button("   ����   ");
		upBtn = new Button("   ��   ");
		downBtn = new Button("   �Ʒ�   ");
		rightBtn = new Button("   ������   ");

		Panel p = new Panel();
		p.add(resetBtn);
		p.add(leftBtn);
		p.add(upBtn);
		p.add(downBtn);
		p.add(rightBtn);

		this.add("North", p);

		setTitle("�̹��� �̵�");
		setBounds(700, 300, 500, 500);
		this.setResizable(false);
		setVisible(true);

		// ��Ŀ�� ���ֱ� ó��
		resetBtn.setFocusable(false);
		leftBtn.setFocusable(false);
		upBtn.setFocusable(false);
		downBtn.setFocusable(false);
		rightBtn.setFocusable(false);

		// �̺�Ʈ
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
			System.out.println("�ʱ�ȭ");
			x = 100;
			y = 100;
			// ���� repaint(); �� �Ʒ����� ������൵ �ȴ�

		} else if (e.getSource() == leftBtn) {
			x -= 30; // x = x - 10;
			// ���⿣ repaint(); ���ص���
			if (x <= -200) {
				x = 490;
				// ���� repaint(); �� �Ʒ����� ������൵ �ȴ�
			}
		} else if (e.getSource() == upBtn) {
			y -= 30;
			// ���⿣ repaint(); ���ص���
			if (y < -170) {
				y = 490;
				// ���� repaint(); �� �Ʒ����� ������൵ �ȴ�
			}

		} else if (e.getSource() == downBtn) {
			y += 30;
			// ���⿣ repaint(); ���ص���
			if (y > 490) {
				y = -170;
				// ���� repaint(); �� �Ʒ����� ������൵ �ȴ�
			}

		} else if (e.getSource() == rightBtn) {
			x += 30;
			// ���⿣ repaint(); ���ص���
			if (x > 490) {
				x = -200;
				// ���� repaint(); �� �Ʒ����� ������൵ �ȴ�
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
			// ���⿣ repaint(); ���ص���
			if (x <= -200) {
				x = 490;
				// ���� repaint(); �� �Ʒ����� ������൵ �ȴ�
			}
		} else if (e.getKeyCode() == KeyEvent.VK_UP) {
			y -= 30;
			// ���⿣ repaint(); ���ص���
			if (y < -170) {
				y = 490;
				// ���� repaint(); �� �Ʒ����� ������൵ �ȴ�
			}

		} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			y += 30;
			// ���⿣ repaint(); ���ص���
			if (y > 490) {
				y = -170;
				// ���� repaint(); �� �Ʒ����� ������൵ �ȴ�
			}

		} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			x += 30;
			// ���⿣ repaint(); ���ص���
			if (x > 490) {
				x = -200;
				// ���� repaint(); �� �Ʒ����� ������൵ �ȴ�
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
//1. Frame â���� - â����
//2. North ���⿡ ��ư 5�������
//3. Frame(â) �� 100, 100 ��ġ�� �̹��� �׸���
//4. �̺�Ʈ