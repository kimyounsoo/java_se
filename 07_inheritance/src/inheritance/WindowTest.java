package inheritance;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class WindowTest extends Frame {
	
	public WindowTest() {//구현
		//Frame 클래스에 생성자를 통해서 "내가 만든 윈도우"
		//new Frame("내가 만든 윈도우").setVisible(true); 
		// new Frame 으로 창을 하나 더만든 것 이다 생성자 호출이라고 new만 하는 것이 아니다
		// WindowTest 와 관계없는 Frame 을 불러와서 창만 하나 더 생성된 것 이다.
		super("내가 만든 윈도우"); // 부모 생성자 호출, 첫번째에 써야함
		//String title = "내가 만든 윈도우"; // 이렇게 해도된다
		//setTitle("내가 만든 윈도우"); // 이렇게 간단한 메소드로 해도 된다
		//setBackground(Color.WHITE); // 바탕색 Color 가static 이 아니고 WHITE가 static 이다
		System.out.println("도형"); // System 이란 클래스는 콘솔창에 출력하려는명령어 
		
		this.setBackground(new Color(222,222,222)); //바탕색  Color 가static 이 아니고 WHITE가 static이다. 그러므로 new Color 해줘야한다
		setForeground(Color.RED);
		//창의 크기 설정
		//setSize(300,400);
		setBounds(800, 200, 300, 400); // x의 위치, y의 위치, 너비, 높이
		//창 띄우기
		setVisible(true);
	}
	
	public void paint(Graphics g) {//구현, 호출부는 어디?? 콜백메소드 하단설명
		g.drawString("도형", 100, 80);
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
		WindowTest aa = new WindowTest(); // aa 로 부를일이 없다면 new WindowTest(); 로 해서 일회용으로 써도 된다
										  //26번째줄 설명과 같은내용
		
	}

}

//윈도우 기본 바탕색 - 흰색, 기본 글씨색 - 검정
// Color c = new Color(222,22,222); 이건 계속 불러내서 쓸수있는것
// new Color(222,22,222); 이건 메모리 저장이 안되어서 한번만쓰고 버리겠다는 것

//일정한 시점이 되면 JVM에 의해서 호출 되는 메소드 - Call Back 메소드 28번째 줄의 paint가 대표적인 Call Back 메소드
//			   달빅머신
//			   운영체제
//실행 시점이 main( 