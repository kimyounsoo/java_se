package exception;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Packman extends Frame implements KeyListener, Runnable {
	private Image foodImg, img;
	private int sel=2;
	private int x=225, y=225;
	private int mx, my;
	private int[] foodX, foodY;
	
	private int mouseX, mouseY;
	private int count;
	
	
	
	public Packman() {
		
		img = Toolkit.getDefaultToolkit().getImage("pacman.png"); //�̹��� �ҷ�����
		foodImg =Toolkit.getDefaultToolkit().getImage("feed.jpg");		
		setResizable(false);
		setBounds(700, 200, 500, 500);
		setVisible(true);
		
		foodX = new int[5];
		foodY = new int[5];
		
		for(int i=0; i<foodX.length; i++) {
			
				foodX[i]=(int)(Math.random()*401)+50;
				foodY[i]=(int)(Math.random()*401)+50;
			
		}
		addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		
		//�̺�Ʈ
		this.addKeyListener(this);
		
		//������ ����
		Thread t = new Thread(this);
		//������ ����
		t.start();
	}
	
	@Override
	public void paint(Graphics g) {		
			g.drawImage(img, 
				
				x, y, x+50, y+50, //ȭ����ġ
				
				sel*50, 0, sel*50+50, 50, //�̹�����ġ 
				this);
		
			for(int i=0; i<foodX.length; i++) {
				g.drawImage(foodImg, foodX[i], foodY[i], this);
			
		}
		
		

	}
	
	@Override
	public void run() {
		while(true) {
			if(sel%2==0) sel++;
			else sel--;
			
			x += mx; // x = x + mx
			y += my; // y = y + my
			
			if(x<=-70) {
				x=450;
			}else if(x>=450) {
				x = 0;
			}else if(y>=500) {
				y= 0;
			}else if(y<=0) {
				y=500;
			}
			//�ȸ� �߾� ��(��) ��ǥ ����
			mouseX = x+25;
			mouseY = y+25;
			for(int i=0; i<foodX.length; i++) {
				if(foodX[i]+35>mouseX&&foodX[i]<mouseX&&foodY[i]+35>mouseY&&foodY[i]<mouseY){//���� x ���� ���� (�ݰ� 10 �̳�)�� �� ��
					{//if(food[i][1]+30>mouseY&&food[i][1]<mouseY){  //���� y ���� ���� (�ݰ� 10 �̳�)�� �� ��
						foodX[i]=-100; foodY[i]=-100;  //0,0���� ��ǥ ��ġ �ű��
						count++;
					}

				}

			}
			if(count == 5) {
				break;
			}
			
			repaint();
			try {
				Thread.sleep(50); // �⺻�� 1/1000��
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}//while		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_ESCAPE){ //27
			System.exit(0);
		
		}else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			sel=0;
			mx = -10; my = 0;
		}else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			sel=2;
			mx = 10; my = 0;
			
		}else if(e.getKeyCode() == KeyEvent.VK_UP) {
			sel=4;
			mx = 0; my = -10;
			
		}else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			sel=6;
			mx = 0; my = +10;
			
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {}

	@Override
	public void keyTyped(KeyEvent e) {}
	
	public static void main(String[] args) {
		
		new Packman();

	}

}










