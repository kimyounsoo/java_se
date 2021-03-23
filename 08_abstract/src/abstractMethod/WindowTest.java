package abstractMethod;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class WindowTest extends Frame {

	public WindowTest() {
		setTitle("이미지");
		setBounds(900, 100, 840, 600);
		setVisible(true);
	}

	public void paint(Graphics g) { // paint 콜백메소드
		//Toolkit t = Toolkit.getDefaultToolkit();
		//Image img = t.getImage("heath-joker-7591.jpg"); // 이미지 불러오기
		Image img = Toolkit.getDefaultToolkit().getImage("heath-joker-7591.jpg");//이미지 불러오기
		//위에 두줄을 합쳐서 쓴것이 이것이다. Toolkit 클래스 생성 1회용
		
		
		g.drawImage(img, 40, 120,this);// 이미지 그리기 this 는 나를 의미함
		
		//이미지 작게
		g.drawImage(img, 
			50, 80, 800, 500,//화면 크기
			0, 0, 500, 400,	//이미지 크기
			this);
		//거꾸로
		g.drawImage(img,
					70, 100, 500, 500, //화면크기
					600, 600, 0, 0,   //이미지 크기
					this);
	}

	public static void main(String[] args) {
		new WindowTest();

	}

}
