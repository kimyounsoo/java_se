package nested;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CardTest {
	private Frame frame;
	private CardLayout card;
	
	public CardTest() {
		frame = new Frame();
		card = new CardLayout();
		frame.setBounds(300,300,300,300);
		frame.setVisible(true);
		frame.setLayout(card);
		
		Panel[] p = new Panel[6];
		Color[] color = {Color.BLACK, Color.BLUE, Color.CYAN, Color.GREEN, Color.ORANGE, Color.YELLOW};
		String[] title = {"����", "�Ķ�", "�ϴ�", "�ʷ�", "��Ȳ", "���"};
//		p[0] = new Panel();
//		p[0].setBackground(Color.BLACK);
		
		
		
		for(int i=0; i<p.length; i++) {
			p[i] = new Panel();
			p[i].setBackground(color[i]);
			
			frame.add(p[i], title[i]);
			//������ �̺�Ʈ
			p[i].addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					card.next(frame);
					//card.show(frame, "���");
				}
			});
		}
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}
	
	
	
	
	public static void main(String[] args) {
		new CardTest();
	}
			
				
		

		


	
	
	
	
	


}
