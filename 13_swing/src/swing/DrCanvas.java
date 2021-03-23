package swing;
//DrCanvas ������ �ַ� ���Ͱ� ���� �̿�ȴ� ������ MsPaint ���� �ּ��� ���� ���������� ���δ� ���ʹ� �ƴϴϱ� �����Ұ�
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
		
		//ArrayList���� ������ �ϳ��� ������ �ٽ� �׷��ش�
		for(ShapeDTO dto : mp.getList()) { // ShapeDTO dto �� MsPaint�� ��̸���Ʈ�� get �����´� getList�� ��� ����Ʈ�� ���ͼ��� �Ѱ�
			x1 = dto.getX1();//dto ���� get x1�� ��ǥ�� �����´�
			y1 = dto.getY1();
			x2 = dto.getX2();
			y2 = dto.getY2();
			z1 = dto.getZ1();
			z2 = dto.getZ2();
			
			//DTO�� ��
		switch(dto.getColor()) { // ����ġ������ dto�� �����ε����� get �����´�
		case 0 : bufferG.setColor(Color.RED); break;// ĳ�̽��ε������� ������ set �ش�
		case 1 : bufferG.setColor(Color.GREEN);break;
		case 2 : bufferG.setColor(Color.BLUE);break;
		case 3 : bufferG.setColor(Color.MAGENTA);break;
		case 4 : bufferG.setColor(Color.CYAN);break;
		}
		
		//DTO�� ����
		if(dto.isFill()) { //ä���� ����
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
			
		}else { //�� ����
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
		
		//���ο� �׸�
		//��ǥ
		x1 = Integer.parseInt(mp.getX1T().getText().trim());
		y1 = Integer.parseInt(mp.getY1T().getText().trim());
		x2 = Integer.parseInt(mp.getX2T().getText().trim());
		y2 = Integer.parseInt(mp.getY2T().getText().trim());
		z1 = Integer.parseInt(mp.getZ1T().getText().trim());
		z2 = Integer.parseInt(mp.getZ2T().getText().trim());
		
		//��
		switch (mp.getCombo().getSelectedIndex()) {
		case 0 : this.setForeground(Color.RED); break;
		case 1 : this.setForeground(Color.GREEN); break;
		case 2 : this.setForeground(Color.BLUE); break;
		case 3 : this.setForeground(Color.MAGENTA); break;
		case 4 : this.setForeground(Color.CYAN); break;
		}
		
		//����
		if(mp.getFill().isSelected()) { //ä���� ����
			if(mp.getLine().isSelected()) 
				bufferG.drawLine(x1, y1, x2, y2);
			else if(mp.getCircle().isSelected()) 
				bufferG.fillOval(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2-x1), Math.abs(y2-y1));
			else if(mp.getRect().isSelected()) 
				bufferG.fillRect(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2-x1), Math.abs(y2-y1));
			else if(mp.getRoundRect().isSelected()) 
				bufferG.fillRoundRect(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2-x1), Math.abs(y2-y1), z1, z2);    
			
		}else { //�� ����
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






















