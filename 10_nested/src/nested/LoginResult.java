package nested;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
//�� ����Ʈ�޼ҵ忡��
public class LoginResult extends Frame {
	private String id, pwd;
	
	public LoginResult(String id, String pwd) {
		//new Login(); //�������� Login Ŭ���� ���ο� �̹� ���� ���⿡ new �ϸ� ���ο� â(�ƹ��͵� �Էµ��� ���� ���ο�â)�� �ϳ� �� �����
		this.id = id;
		this.pwd = pwd;
		
		setBounds(700,200,200,200);
		setVisible(true);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				//System.exit(0); �̰� ������α׷� ���� �Ʒ����� �α��� ����â�� ������ �ʰ� �ϱ�
				setVisible(false);
			}
		});
	}
	
	public void paint(Graphics g) {
		if(id.equals("angel") && pwd.equals("1004"))
			g.drawString("�α��� ����", 30, 100);
		else
			g.drawString("�α��� ����", 30, 100);
	}

}
