package swing;
//DrCanvas 에서는 주로 게터가 많이 이용된다 이유는 MsPaint 맨위 주석에 있음 마찬가지로 전부다 게터는 아니니까 주의할것
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class DrCanvas extends Canvas {
	private MsPaint mp;
	
	private Image bufferImage;
	private Graphics bufferG;

	
	public DrCanvas(MsPaint mp) {
		this.mp = mp;
		this.setBackground(new Color(255,200,255));
	      addKeyListener(new KeyAdapter() {

	          @Override
	          public void keyPressed(KeyEvent e) {

	             if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
	                System.exit(0);
	             }
	          }
	       });
	}
	
	@Override
	public void update(Graphics g) {
		Dimension d = this.getSize();
		if(bufferG==null) {
			bufferImage = createImage(d.width, d.height);
			bufferG = bufferImage.getGraphics();
		}
		
		bufferG.setColor(this.getBackground());
		bufferG.fillRect(0,0,d.width,d.height);
		
		int x1, y1, x2, y2, z1, z2;
		
		//ArrayList안의 도형을 하나씩 꺼내서 다시 그려준다
		for(ShapeDTO dto : mp.getList()) { // ShapeDTO dto 에 MsPaint의 어레이리스트를 get 꺼내온다 getList는 어레이 리스트를 게터세터 한것
			x1 = dto.getX1();//dto 에서 get x1의 좌표를 꺼내온다
			y1 = dto.getY1();
			x2 = dto.getX2();
			y2 = dto.getY2();
			z1 = dto.getZ1();
			z2 = dto.getZ2();
			
			//DTO의 색
		switch(dto.getColor()) { // 스위치문으로 dto의 색깔인덱스를 get 꺼내온다
		case 0 : bufferG.setColor(Color.RED); break;// 캐이스인덱스마다 색깔을 set 준다
		case 1 : bufferG.setColor(Color.GREEN);break;
		case 2 : bufferG.setColor(Color.BLUE);break;
		case 3 : bufferG.setColor(Color.MAGENTA);break;
		case 4 : bufferG.setColor(Color.CYAN);break;
		}
		
		//DTO의 도형
		if(dto.isFill()) { //채워진 도형
			if(dto.getShape() == Figure.LINE) 
				bufferG.drawLine(x1, y1, x2, y2);
			else if(dto.getShape() == Figure.CIRCLE) 
				bufferG.fillOval(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2-x1), Math.abs(y2-y1));
			else if(dto.getShape() == Figure.RECT) 
				bufferG.fillRect(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2-x1), Math.abs(y2-y1));
			else if(dto.getShape() == Figure.ROUNDRECT) 
				bufferG.fillRoundRect(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2-x1), Math.abs(y2-y1), z1, z2);
			else if(dto.getShape() == Figure.PEN)
				bufferG.drawLine(x1, y1, x2, y2);
			
		}else { //빈 도형
			if(dto.getShape() == Figure.LINE) 
				bufferG.drawLine(x1, y1, x2, y2);
			else if(dto.getShape() == Figure.CIRCLE) 
				bufferG.drawOval(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2-x1), Math.abs(y2-y1));
			else if(dto.getShape() == Figure.RECT) 
				bufferG.drawRect(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2-x1), Math.abs(y2-y1));
			else if(dto.getShape() == Figure.ROUNDRECT) 
				bufferG.drawRoundRect(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2-x1), Math.abs(y2-y1), z1, z2);
			else if(dto.getShape() == Figure.PEN)
				bufferG.drawLine(x1, y1, x2, y2);
		}
	}//for	
		
		//새로운 그림
		//좌표
		x1 = Integer.parseInt(mp.getX1T().getText().trim());
		y1 = Integer.parseInt(mp.getY1T().getText().trim());
		x2 = Integer.parseInt(mp.getX2T().getText().trim());
		y2 = Integer.parseInt(mp.getY2T().getText().trim());
		z1 = Integer.parseInt(mp.getZ1T().getText().trim());
		z2 = Integer.parseInt(mp.getZ2T().getText().trim());
		
		//색
		switch (mp.getCombo().getSelectedIndex()) {
		case 0 : this.setForeground(Color.RED); break;
		case 1 : this.setForeground(Color.GREEN); break;
		case 2 : this.setForeground(Color.BLUE); break;
		case 3 : this.setForeground(Color.MAGENTA); break;
		case 4 : this.setForeground(Color.CYAN); break;
		}
		
		//도형
		if(mp.getFill().isSelected()) { //채워진 도형
			if(mp.getLine().isSelected()) 
				bufferG.drawLine(x1, y1, x2, y2);
			else if(mp.getCircle().isSelected()) 
				bufferG.fillOval(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2-x1), Math.abs(y2-y1));
			else if(mp.getRect().isSelected()) 
				bufferG.fillRect(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2-x1), Math.abs(y2-y1));
			else if(mp.getRoundRect().isSelected()) 
				bufferG.fillRoundRect(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2-x1), Math.abs(y2-y1), z1, z2);    
			
		}else { //빈 도형
			if(mp.getLine().isSelected()) 
				bufferG.drawLine(x1, y1, x2, y2);
			else if(mp.getCircle().isSelected()) 
				bufferG.drawOval(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2-x1), Math.abs(y2-y1));
			else if(mp.getRect().isSelected()) 
				bufferG.drawRect(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2-x1), Math.abs(y2-y1));
			else if(mp.getRoundRect().isSelected()) 
				bufferG.drawRoundRect(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2-x1), Math.abs(y2-y1), z1, z2);
		}
		
		paint(g);
	
	}
	@Override
	public void paint(Graphics g) {
		g.drawImage(bufferImage, 0, 0, this);
		
	}
	

}






















