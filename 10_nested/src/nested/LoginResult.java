package nested;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
//비교 페인트메소드에서
public class LoginResult extends Frame {
	private String id, pwd;
	
	public LoginResult(String id, String pwd) {
		//new Login(); //하지말것 Login 클래스 메인에 이미 만들어서 여기에 new 하면 새로운 창(아무것도 입력되지 않은 새로운창)이 하나 더 생긴다
		this.id = id;
		this.pwd = pwd;
		
		setBounds(700,200,200,200);
		setVisible(true);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				//System.exit(0); 이건 모든프로그램 종료 아래것은 로그인 실패창만 보이지 않게 하기
				setVisible(false);
			}
		});
	}
	
	public void paint(Graphics g) {
		if(id.equals("angel") && pwd.equals("1004"))
			g.drawString("로그인 성공", 30, 100);
		else
			g.drawString("로그인 실패", 30, 100);
	}

}
