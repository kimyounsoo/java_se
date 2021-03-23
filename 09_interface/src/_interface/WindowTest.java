package _interface;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class WindowTest extends Frame implements ActionListener, MouseListener,MouseMotionListener{
	private Button exitBtn; // = new Button("����"); ���⿡ �ٷνᵵ�ǰ� 13����ó�� �ص��ȴ�
	
	public static void main(String[] args) {
		//new WindowTest + ������ + init()ȣ��
		//���̵������ ���� Ȥ�� �ǾƷ��� �δ°� ��ȣ�Ѵ�
		
		new WindowTest().init();
	}
	
	public void init() {
		exitBtn = new Button("����");
		
		//��ġ
		this.add("North", exitBtn);
		
	
		
		setBounds(900, 100, 300, 400);
		setVisible(true);
		
		//�̺�Ʈ �̺�Ʈ�� �� �������� ����
		this.addMouseListener(this); //this ������ �ִ�
		this.addMouseMotionListener(this); // this ������ �ִ�
		this.addWindowListener(new WindowExit());
		exitBtn.addActionListener(this);
	}	
	
	//ActionListener Override
	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0); // ���ڴ� 0 1 2 ������ �ü� ������ ����� 0������ �˾Ƶд�
		
	}
	 
	//MouseListener Override , Call Back �޼ҵ�
	@Override
	public void mouseClicked(MouseEvent arg0) {//����
		System.out.println("���콺 Ŭ��");
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		System.out.println("���콺 IN");
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		System.out.println("���콺 OUT");
	}

	@Override
	public void mousePressed(MouseEvent arg0) {}

	@Override
	public void mouseReleased(MouseEvent arg0) {}

	//MouseMotionListener Override
	@Override
	public void mouseDragged(MouseEvent arg0) {
		System.out.println("���콺 �巡��");
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {}	
	




}
