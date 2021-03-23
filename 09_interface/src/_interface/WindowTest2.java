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

//Frame�� BorderLayout(��������)
public class WindowTest2 extends Frame implements ActionListener, MouseListener, WindowListener {	
	private Button redBtn, greenBtn, blueBtn, exitBtn;// null ���� �����ֱ⶧���� 17���� �ʱ�ȭ
	private int x, y;
	
	public static void main(String[] args) {
		
		new WindowTest2().init();
	}
	

	public void init() {
		redBtn = new Button("����"); // null ���� ���� �ֱ⶧���� �ʱ�ȭ(����)
		greenBtn = new Button("�ʷ�");
		blueBtn = new Button("�Ķ�");
		exitBtn = new Button("����");
		
		Panel p = new Panel(); //Panel�� FlowLayout(������ġ�� - �¿� �߾�)
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
		
		//�̺�Ʈ (����, ���) ��ǥ���ϸ� �� ���� �ȵ�
		this.addWindowListener(this);
		redBtn.addActionListener(this);
		greenBtn.addActionListener(this);
		blueBtn.addActionListener(this);
		exitBtn.addActionListener(this);
		
		this.addMouseListener(this);
	//������ ��ư �̺�Ʈ				�̺�Ʈ �ҷ��� Ŭ����(�������̵�� ��ġ)
	}
	
	@Override
	public void paint(Graphics g) { // �ݹ�޼ҵ�  setvisible �� �ѹ�
		g.drawString("X : " +x+"\t Y : "+y, x, y);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand()=="����") { // �̰� Ÿ��Ʋ������ �ҷ����� �޼ҵ� �̰� ���� ������ �ʴ´�
		//if(e.getSource()==redBtn) { 	  // �̰� ���������� �ҷ����� �޼ҵ�
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
		System.exit(0); //���α׷� ��������
		
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
		System.out.println("���콺 Ŭ��");
		
		this.x = e.getX();
		y = e.getY(); // this ���� ����
		System.out.println("X : " +e.getX()+"\t Y : "+e.getY());
		
		repaint(); // Ŭ���ϴ� ���� paint �޼ҵ� ���� ȣ�� paint �޼ҵ�� �ݹ�޼ҵ�� �ѹ��ۿ� ���θ����� �̷��� �ٽ� ����ȣ���Ҽ� �ִ�
					// paint �޼ҵ�� setvisible �� �ѹ��� ȣ���ϱ⶧��

		
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
