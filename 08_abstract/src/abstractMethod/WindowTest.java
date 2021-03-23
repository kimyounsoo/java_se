package abstractMethod;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class WindowTest extends Frame {

	public WindowTest() {
		setTitle("�̹���");
		setBounds(900, 100, 840, 600);
		setVisible(true);
	}

	public void paint(Graphics g) { // paint �ݹ�޼ҵ�
		//Toolkit t = Toolkit.getDefaultToolkit();
		//Image img = t.getImage("heath-joker-7591.jpg"); // �̹��� �ҷ�����
		Image img = Toolkit.getDefaultToolkit().getImage("heath-joker-7591.jpg");//�̹��� �ҷ�����
		//���� ������ ���ļ� ������ �̰��̴�. Toolkit Ŭ���� ���� 1ȸ��
		
		
		g.drawImage(img, 40, 120,this);// �̹��� �׸��� this �� ���� �ǹ���
		
		//�̹��� �۰�
		g.drawImage(img, 
			50, 80, 800, 500,//ȭ�� ũ��
			0, 0, 500, 400,	//�̹��� ũ��
			this);
		//�Ųٷ�
		g.drawImage(img,
					70, 100, 500, 500, //ȭ��ũ��
					600, 600, 0, 0,   //�̹��� ũ��
					this);
	}

	public static void main(String[] args) {
		new WindowTest();

	}

}
