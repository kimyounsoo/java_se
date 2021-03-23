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
		//this.setFont(new Font("고딕체",Font.BOLD, 24));
		this.setFont(new Font("고딕체",1, 24)); // 이렇게 해도 되지만 구분이 쉽지 않기 때문에 위에것을 선호한다 상수의 중요성
		setForeground(Color.RED);
		
		setBounds(700, 200, 300, 100);
		setVisible(true);
		this.addWindowListener(new WindowAdapter() { //추상 클래스 이지만 추상메소드 x
			@Override
			public void windowClosing(WindowEvent e) { // 그래서 오버라이드 안해도 에러는 안생기지만 창끄기위해 오버라이드 해줌
				System.exit(0);
			}
		});
	
		Thread t = new Thread(this); //스레드 생성
		t.start();//스레드 시작 //내가 스레드    문법적으로는 this 를안써도 에러는 아니지만 써야한다
	}


	
	public void paint(Graphics g) {
		SimpleDateFormat sdf = new SimpleDateFormat("HH시 mm분 ss초");
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
