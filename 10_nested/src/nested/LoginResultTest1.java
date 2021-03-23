package nested;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class LoginResultTest1 extends Frame {
	private String id, pwd;
	
	public LoginResultTest1(String id, String pwd) {
		this.id = id;
		this.pwd = pwd;
		
		this.setVisible(true);
		setBounds(700,200,200,200);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				setVisible(false);
			}
		});
	}
	
	public void paint(Graphics g) {
		if(id.equals("angel")&&pwd.equals("1004")) {
			g.drawString("로그인 성공", 30, 100);
		}else {
			g.drawString("로그인 실패", 30, 100);
		}
	}
	
	}
	
	
	
		
	

	

	
	

	
