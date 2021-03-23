package nested;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class LoginResultTest3 extends Frame {
	private LoginTest login;
	
	public LoginResultTest3(LoginTest login) {
		this.login = login;
		this.setVisible(true);
		this.setBounds(700,200,200,200);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				setVisible(false);
			}
		});
		
	}
	
	public void paint (Graphics g) {
		String id = login.getId();
		String pwd = login.getPwd();
		if(id.equals("angel")&&pwd.equals("1004")) {
			g.drawString("로그인 성공", 30, 100);
		}else {
			g.drawString("로그인 실패", 30, 100);
		}
	}
	
		
	
}
