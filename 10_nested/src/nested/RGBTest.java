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

//Frame - BorderLayout(동서남북)
//윈도우 창이 나다(RGBTest) 가 Frame 이다 is a 관계
//				나			자바강사				가수가 되고싶 하지만 나는 자바강사
public class RGBTest extends Frame implements ActionListener {
	private Button redBtn, greenBtn, blueBtn;
	private DrCanvas can;

	public RGBTest() {
		redBtn = new Button("빨강");
		greenBtn = new Button("초록");
		blueBtn = new Button("파랑");
		can = new DrCanvas();

		Panel p = new Panel();
		p.setLayout(new GridLayout(1, 3, 5, 0)); // GridLayout(행열배치, 균등배열), new GridLayout(행, 열, 가로여백, 세로여백)
		p.add(redBtn);// 하나씩 해야한다 p.add(redBtn, greenBtn, blueBtn); 안됨
		p.add(greenBtn);
		p.add(blueBtn);

		this.add("North", p);
		add("Center", can);

		setBounds(900, 100, 300, 400);
		setVisible(true);



		// 이벤트
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});// 익명(흑기사)		
		
		redBtn.addActionListener(this);
		greenBtn.addActionListener(this);
		blueBtn.addActionListener(this);

	}
	//Canvas - null (Layout 이 없다)
	class DrCanvas extends Canvas { // 이너클래스를 만들어도 되고 새로 동일페키지에 클래스를 새로만들어서 세터게터로 사용할수도 있다.
		public DrCanvas() { // 추천 사용법은 후자이지만 오늘은 전자로 (82번 스크린샷참조)
			this.setBackground(new Color(255, 255, 0));
		}

		@Override
		public void paint(Graphics g) {
			g.drawString("바보", 100, 100);
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == redBtn) {
			can.setBackground(Color.RED); // this. 대신 can.// Color.RED 해도되고 아래처럼 뉴컬러 좌표로 해도 된다
		} else if (e.getSource() == greenBtn) {
			can.setBackground(new Color(0, 255, 0)); // this. 대신 can.
		} else if (e.getSource() == blueBtn) {
			can.setBackground(new Color(0, 0, 255)); // this. 대신 can.
		}

	}

	public static void main(String[] args) {
		new RGBTest();

	}
}
