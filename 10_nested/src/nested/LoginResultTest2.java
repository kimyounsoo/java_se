package nested;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class LoginResultTest2 {
	private Frame frame;
	String id, pwd;
	
	public LoginResultTest2(String id, String pwd) {
		frame = new Frame() {
		@Override
		public void paint(Graphics g) {
			
			if(id.equals("angel")&&pwd.equals("1004")) {
				g.drawString("�α��� ����", 30, 100);
			}else {
				g.drawString("�α��� ����", 30, 100);
			}
		}};
		this.id = id;
		this.pwd = pwd;
		frame.setVisible(true);
		frame.setBounds(700,200,200,200);
		
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				frame.setVisible(false);
			}
		});
	}
	

}
