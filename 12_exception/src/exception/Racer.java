package exception;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

//�� 1����
public class Racer extends Canvas implements Runnable {
	private Image img;
	private String name;
	private int x;
	static private int rank;
	public Racer(String name) {
		this.name = name;
		
		img = Toolkit.getDefaultToolkit().getImage("horse.gif"); //�̹��� �ҷ�����
//		setBackground(new Color((int)(Math.random()*255+1),
//								(int)(Math.random()*255+1),
//								(int)(Math.random()*255+1)));
	}

	@Override
	public void paint(Graphics g) {
		g.drawLine(0, getSize().height/2, getSize().width, getSize().height/2);
		g.drawImage(img, x, 0, 50,this.getSize().height, this);
		
	}

	@Override
	public void run() {
		for(int i=0; i<600; i+=(int)(Math.random()*10+1)) {
			x = i;
			repaint();
			
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		
		rank++;
		System.out.println(rank+"��\t"+name);
		
		
	}
}





