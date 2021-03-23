package swing;
//msPaint 에선 주로세터가 많이 사용됨 이유는 데이터를 보내서(set) 캔버스에서 꺼내오기(get) 가 일어나기 때문 전부다세터는 아니니까 주의 할것
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class MsPaint extends JFrame implements ActionListener {
	private JLabel x1L, y1L, x2L, y2L, z1L, z2L;
	private JTextField x1T, y1T, x2T, y2T, z1T, z2T;
	private JCheckBox fill;
	private JRadioButton line, circle, rect, roundRect, pen;
	private JComboBox<String> combo;
	private JButton draw;
	private DrCanvas canvas;
	private ArrayList<ShapeDTO> list;



	public MsPaint() {
		x1L = new JLabel("X1");
		y1L = new JLabel("Y1");
		x2L = new JLabel("X2");
		y2L = new JLabel("Y2");
		z1L = new JLabel("Z1");
		z2L = new JLabel("Z2");
		
		x1T = new JTextField("0",4);
		y1T = new JTextField("0",4);
		x2T = new JTextField("0",4);
		y2T = new JTextField("0",4);
		z1T = new JTextField("50",4);
		z2T = new JTextField("50",4);
		
		fill = new JCheckBox("채우기");
		
		line = new JRadioButton("선");
		circle = new JRadioButton("원");
		rect = new JRadioButton("사각형", true);
		roundRect = new JRadioButton("둥근 사각형");
		pen = new JRadioButton("연필");
		
		ButtonGroup group = new ButtonGroup();
		group.add(line);
		group.add(circle);
		group.add(rect);
		group.add(roundRect);
		group.add(pen);
		
		String color[] = {"빨강","초록","파랑","보라","하늘"};
		combo = new JComboBox<String>(color);
		
		draw = new JButton("그리기");
		
		canvas = new DrCanvas(this);
		
		list = new ArrayList<ShapeDTO>();
		
		JPanel northP = new JPanel();
		northP.add(x1L); northP.add(x1T);
		northP.add(y1L); northP.add(y1T);
		northP.add(x2L); northP.add(x2T);
		northP.add(y2L); northP.add(y2T);
		northP.add(z1L); northP.add(z1T);
		northP.add(z2L); northP.add(z2T);
		northP.add(fill);
		
		JPanel southP = new JPanel();
		southP.add(line);
		southP.add(circle);
		southP.add(rect);
		southP.add(roundRect);
		southP.add(pen);
		southP.add(combo);
		southP.add(draw);
		
		Container c = this.getContentPane();
		c.add("North", northP);
		c.add("Center", canvas);
		c.add("South", southP);
		
		setBounds(500,200,700,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		//이벤트
		draw.addActionListener(this);
		
		
		
		//마우스
		canvas.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				x1T.setText(e.getX()+"");
				y1T.setText(e.getY()+"");
			}
			@Override
			public void mouseReleased(MouseEvent e) {
			int x1 = Integer.parseInt(x1T.getText());
			int y1 = Integer.parseInt(y1T.getText());
			
			if(x1 == e.getX()&&y1==e.getY())return;
			
			ShapeDTO dto = new ShapeDTO();
			
			//좌표
			dto.setX1(Integer.parseInt(x1T.getText()));// x1T의 텍스트좌표를 get꺼내서 dto 의 X1 좌표에 set 준다
			dto.setY1(Integer.parseInt(y1T.getText()));
			dto.setX2(Integer.parseInt(x2T.getText()));
			dto.setY2(Integer.parseInt(y2T.getText()));
			dto.setZ1(Integer.parseInt(z1T.getText()));
			dto.setZ2(Integer.parseInt(x2T.getText()));
			
			//채우기
			dto.setFill(fill.isSelected());
			//도형
			if(line.isSelected()) {
				dto.setShape(Figure.LINE);
			}else if(circle.isSelected()) {
				dto.setShape(Figure.CIRCLE);
			}else if(rect.isSelected()) {
				dto.setShape(Figure.RECT);
			}else if(roundRect.isSelected()) {
				dto.setShape(Figure.ROUNDRECT);
			}
			//색
			dto.setColor(combo.getSelectedIndex());
			
			list.add(dto);	
			}
			
		});
		
		canvas.addMouseMotionListener(new MouseAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				x2T.setText(e.getX()+"");
				y2T.setText(e.getY()+"");
				
				canvas.repaint(); //update() - paint()순으로 호출
				
				//펜
				if(pen.isSelected()) { 
					ShapeDTO dto = new ShapeDTO();// 그릴때마다 지워지기때문에 여기에 초기화 해줘서 안지워지게 박아둔다
					//좌표
					dto.setX1(Integer.parseInt(x1T.getText())); // x1T의 텍스트좌표를 get꺼내서 dto 의 X1 좌표에 set 준다
					dto.setY1(Integer.parseInt(y1T.getText()));
					dto.setX2(Integer.parseInt(x2T.getText()));
					dto.setY2(Integer.parseInt(y2T.getText()));
					dto.setZ1(Integer.parseInt(z1T.getText()));
					dto.setZ2(Integer.parseInt(z2T.getText()));
					//채우기
					dto.setFill(fill.isSelected());
					
					//도형
					dto.setShape(Figure.PEN);
					
					//색
					dto.setColor(combo.getSelectedIndex());
					
					list.add(dto);
					
					x1T.setText(x2T.getText());
					y1T.setText(y2T.getText());	
					
				}
			
	
					
				}//if
			});
	}//MsPaint()
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		canvas.repaint();
	}

	public JTextField getX1T() {
		return x1T;
	}

	public JTextField getY1T() {
		return y1T;
	}

	public JTextField getX2T() {
		return x2T;
	}

	public JTextField getY2T() {
		return y2T;
	}

	public JTextField getZ1T() {
		return z1T;
	}

	public JTextField getZ2T() {
		return z2T;
	}

	public JCheckBox getFill() {
		return fill;
	}

	public JRadioButton getLine() {
		return line;
	}

	public JRadioButton getCircle() {
		return circle;
	}

	public JRadioButton getRect() {
		return rect;
	}

	public JRadioButton getRoundRect() {
		return roundRect;
	}

	public JRadioButton getPen() {
		return pen;
	}

	public JComboBox<String> getCombo() {
		return combo;
	}
	
	public ArrayList<ShapeDTO> getList() {
		return list;
	}

	public void setList(ArrayList<ShapeDTO> list) {
		this.list = list;
	}



	public static void main(String[] args) {
		new MsPaint();
		
	}
}












