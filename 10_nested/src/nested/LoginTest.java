package nested;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class LoginTest extends Frame implements ActionListener{
	private Label idL, pwdL;
	private TextField idT, pwdT;
	private Button loginBtn, cancelBtn;
	private String id, pwd;
	
	public LoginTest() {
		idL = new Label("아뒤");
		pwdL = new Label("비번");
		
		idT = new TextField();
		pwdT = new TextField();
		
		loginBtn = new Button("로그인");
		cancelBtn = new Button("취소");
		
		idL.setBounds(50, 80, 50, 30);
		pwdL.setBounds(50, 130, 50, 30);
		
		idT.setBounds(120, 80, 100, 30);
		pwdT.setBounds(120, 130, 120, 30);
		
		loginBtn.setBounds(50, 200, 100, 30);
		cancelBtn.setBounds(160, 200, 100, 30);
		
		this.add(idL);
		this.add(pwdL);
		this.add(idT);
		this.add(pwdT);
		add(loginBtn);
		add(cancelBtn);
		
		setLayout(null);
		
		this.setVisible(true);
		this.setBounds(800, 100, 300, 300);
		
		//이벤트
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		loginBtn.addActionListener(this);
		cancelBtn.addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == loginBtn) {
			id = idT.getText();
			pwd = pwdT.getText();
			
			//new LoginResultTest1(id, pwd);
			//new LoginResultTest2(id, pwd);
			new LoginResultTest3(this);
			
			
		}else if (e.getSource() == cancelBtn) {
			idT.setText(" "); idT.setText("");
			pwdT.setText(" "); pwdT.setText("");
		}
		
	}
	

	
	public String getId() {
		return id;
	}
	
	public String getPwd() {
		return pwd;
	}
	
	
	public static void main(String[] args) {
		new LoginTest();
	}





}
