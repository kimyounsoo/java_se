package inheritance;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class WindowTest extends Frame {
	
	public WindowTest() {//����
		//Frame Ŭ������ �����ڸ� ���ؼ� "���� ���� ������"
		//new Frame("���� ���� ������").setVisible(true); 
		// new Frame ���� â�� �ϳ� ������ �� �̴� ������ ȣ���̶�� new�� �ϴ� ���� �ƴϴ�
		// WindowTest �� ������� Frame �� �ҷ��ͼ� â�� �ϳ� �� ������ �� �̴�.
		super("���� ���� ������"); // �θ� ������ ȣ��, ù��°�� �����
		//String title = "���� ���� ������"; // �̷��� �ص��ȴ�
		//setTitle("���� ���� ������"); // �̷��� ������ �޼ҵ�� �ص� �ȴ�
		//setBackground(Color.WHITE); // ������ Color ��static �� �ƴϰ� WHITE�� static �̴�
		System.out.println("����"); // System �̶� Ŭ������ �ܼ�â�� ����Ϸ��¸�ɾ� 
		
		this.setBackground(new Color(222,222,222)); //������  Color ��static �� �ƴϰ� WHITE�� static�̴�. �׷��Ƿ� new Color ������Ѵ�
		setForeground(Color.RED);
		//â�� ũ�� ����
		//setSize(300,400);
		setBounds(800, 200, 300, 400); // x�� ��ġ, y�� ��ġ, �ʺ�, ����
		//â ����
		setVisible(true);
	}
	
	public void paint(Graphics g) {//����, ȣ��δ� ���?? �ݹ�޼ҵ� �ϴܼ���
		g.drawString("����", 100, 80);
		g.drawLine(42, 152, 222, 322);
		g.drawLine(122, 122, 22, 322);
		g.drawRect(119, 99, 99, 99);
		g.drawOval(120, 100, 100, 100);
		g.drawOval(121, 101, 101, 101);
		g.drawOval(122, 102, 102, 102);
		g.drawOval(123, 103, 103, 103);
		g.drawOval(124, 104, 104, 104);
		g.drawOval(125, 105, 105, 105);
		g.drawOval(126, 106, 106, 106);
		g.drawOval(127, 107, 107, 107);
		g.drawOval(128, 108, 108, 108);
		g.drawOval(129, 109, 109, 109);
		g.drawOval(130, 110, 110, 110);
		g.drawOval(131, 111, 111, 111);
		g.drawOval(132, 112, 112, 112);
		g.drawOval(133, 113, 113, 113);
		g.drawOval(134, 114, 114, 114);
		g.drawOval(135, 115, 115, 115);
		g.drawOval(136, 116, 116, 116);
		g.drawOval(137, 117, 117, 117);
		g.drawOval(138, 118, 118, 118);
		g.drawOval(139, 119, 119, 119);
		g.drawOval(140, 120, 120, 120);
		g.drawOval(141, 121, 121, 121);
		g.drawOval(142, 122, 122, 122);
		g.drawOval(143, 123, 123, 123);
		g.drawOval(144, 124, 124, 124);
		g.drawOval(145, 125, 125, 125);
		g.drawOval(146, 126, 126, 126);
		g.drawOval(147, 127, 127, 127);
		g.drawOval(148, 128, 128, 128);
		g.drawOval(149, 129, 129, 129);
		g.drawOval(150, 130, 130, 130);
		
		
		
		
		
	}

	public static void main(String[] args) {
		WindowTest aa = new WindowTest(); // aa �� �θ����� ���ٸ� new WindowTest(); �� �ؼ� ��ȸ������ �ᵵ �ȴ�
										  //26��°�� ����� ��������
		
	}

}

//������ �⺻ ������ - ���, �⺻ �۾��� - ����
// Color c = new Color(222,22,222); �̰� ��� �ҷ����� �����ִ°�
// new Color(222,22,222); �̰� �޸� ������ �ȵǾ �ѹ������� �����ڴٴ� ��

//������ ������ �Ǹ� JVM�� ���ؼ� ȣ�� �Ǵ� �޼ҵ� - Call Back �޼ҵ� 28��° ���� paint�� ��ǥ���� Call Back �޼ҵ�
//			   �޺�ӽ�
//			   �ü��
//���� ������ main( 