package nested;

import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//Frame - BorderLayout(��������)
//������ â�� ����(RGBTest) �� Frame �̴� is a ����
//				��			�ڹٰ���				������ �ǰ�� ������ ���� �ڹٰ���
public class RGBTest extends Frame implements ActionListener {
	private Button redBtn, greenBtn, blueBtn;
	private DrCanvas can;

	public RGBTest() {
		redBtn = new Button("����");
		greenBtn = new Button("�ʷ�");
		blueBtn = new Button("�Ķ�");
		can = new DrCanvas();

		Panel p = new Panel();
		p.setLayout(new GridLayout(1, 3, 5, 0)); // GridLayout(�࿭��ġ, �յ�迭), new GridLayout(��, ��, ���ο���, ���ο���)
		p.add(redBtn);// �ϳ��� �ؾ��Ѵ� p.add(redBtn, greenBtn, blueBtn); �ȵ�
		p.add(greenBtn);
		p.add(blueBtn);

		this.add("North", p);
		add("Center", can);

		setBounds(900, 100, 300, 400);
		setVisible(true);



		// �̺�Ʈ
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});// �͸�(����)		
		
		redBtn.addActionListener(this);
		greenBtn.addActionListener(this);
		blueBtn.addActionListener(this);

	}
	//Canvas - null (Layout �� ����)
	class DrCanvas extends Canvas { // �̳�Ŭ������ ���� �ǰ� ���� ������Ű���� Ŭ������ ���θ��� ���Ͱ��ͷ� ����Ҽ��� �ִ�.
		public DrCanvas() { // ��õ ������ ���������� ������ ���ڷ� (82�� ��ũ��������)
			this.setBackground(new Color(255, 255, 0));
		}

		@Override
		public void paint(Graphics g) {
			g.drawString("�ٺ�", 100, 100);
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == redBtn) {
			can.setBackground(Color.RED); // this. ��� can.// Color.RED �ص��ǰ� �Ʒ�ó�� ���÷� ��ǥ�� �ص� �ȴ�
		} else if (e.getSource() == greenBtn) {
			can.setBackground(new Color(0, 255, 0)); // this. ��� can.
		} else if (e.getSource() == blueBtn) {
			can.setBackground(new Color(0, 0, 255)); // this. ��� can.
		}

	}

	public static void main(String[] args) {
		new RGBTest();

	}
}
