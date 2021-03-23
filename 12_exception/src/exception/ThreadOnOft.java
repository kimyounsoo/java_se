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
		label.setFont(new Font("고딕체", Font.BOLD, 70));
		//label.setForeground(Color.RED);
		btn = new Button("누르기");
		
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
				Thread t = new Thread(ThreadOnOft.this); //익명이라 누구의 것인지 써줘야한다
				System.out.println("누르기t = "+t);
				t.start();
				//.this 주의****
				//new Thread(ThreadOnOft.this).start();// 위의것을 합친것 어느것을써도 상관없다
				bb = true;
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {
				t = null; // 과부화 나지 않게 제거 중, 완전한 메모리 제거는 자바가상머신이 할수있다 우리는 못함
				System.out.println("버튼떼기t = "+t);
				bb = false;
			}
		});
	}//ThreadOnOff()
	
	@Override
	public void run() {
		while(true) { //  스태틱으로 ii 를잡지 않아도 돼서 포문으로 처리해도 무관
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










