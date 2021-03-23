package exception;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.crypto.Data;

public class Clock extends Frame implements Runnable {
	
	public Clock() {
		//this.setFont(new Font("���ü",Font.BOLD, 24));
		this.setFont(new Font("���ü",1, 24)); // �̷��� �ص� ������ ������ ���� �ʱ� ������ �������� ��ȣ�Ѵ� ����� �߿伺
		setForeground(Color.RED);
		
		setBounds(700, 200, 300, 100);
		setVisible(true);
		this.addWindowListener(new WindowAdapter() { //�߻� Ŭ���� ������ �߻�޼ҵ� x
			@Override
			public void windowClosing(WindowEvent e) { // �׷��� �������̵� ���ص� ������ �Ȼ������� â�������� �������̵� ����
				System.exit(0);
			}
		});
	
		Thread t = new Thread(this); //������ ����
		t.start();//������ ���� //���� ������    ���������δ� this ���Ƚᵵ ������ �ƴ����� ����Ѵ�
	}


	
	public void paint(Graphics g) {
		SimpleDateFormat sdf = new SimpleDateFormat("HH�� mm�� ss��");
		//while(true) {
			Date date = new Date();
			g.drawString(sdf.format(date),60, 70);
		}
		
	//}
	
	@Override
	public void run() {
		while(true) {
			repaint();try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}



	public static void main(String[] args) {
		new Clock();
	
	}














}
