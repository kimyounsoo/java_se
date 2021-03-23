package exception;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ThreadOnOft extends Frame implements Runnable {
	private Label label;
	private Button btn;
	private boolean bb = true;
	private  int ii;
	
	public ThreadOnOft() {
		label = new Label("0", Label.CENTER);
		label.setFont(new Font("���ü", Font.BOLD, 70));
		//label.setForeground(Color.RED);
		btn = new Button("������");
		
		Panel p = new Panel(new FlowLayout(FlowLayout.RIGHT));
		p.add(btn);
		
		add("Center", label);
		add("South", p);
		
		setBounds(700, 200, 300, 200);
		setVisible(true);
		addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		
		btn.addMouseListener(new MouseAdapter() {
			Thread t;
			@Override
			public void mousePressed(MouseEvent e) {
				Thread t = new Thread(ThreadOnOft.this); //�͸��̶� ������ ������ ������Ѵ�
				System.out.println("������t = "+t);
				t.start();
				//.this ����****
				//new Thread(ThreadOnOft.this).start();// ���ǰ��� ��ģ�� ��������ᵵ �������
				bb = true;
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {
				t = null; // ����ȭ ���� �ʰ� ���� ��, ������ �޸� ���Ŵ� �ڹٰ���ӽ��� �Ҽ��ִ� �츮�� ����
				System.out.println("��ư����t = "+t);
				bb = false;
			}
		});
	}//ThreadOnOff()
	
	@Override
	public void run() {
		while(true) { //  ����ƽ���� ii ������ �ʾƵ� �ż� �������� ó���ص� ����
			ii++;
			label.setText(ii+"");
			
			if(!bb) break;
			
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			//if(ii>=50) ii=0;
		}//while
				
	}
	
	public static void main(String[] args) {
		new ThreadOnOft();
	}

}










