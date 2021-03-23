package swing;

import java.awt.Button;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class SwingTest extends JFrame implements ActionListener {
	private JButton newBtn, exitBtn;
	private JTextArea area;
	
	public SwingTest() {
		//newBtn = new JButton("새로만들기");
		newBtn = new JButton("새파일", new ImageIcon("image/mini.gif"));
		exitBtn = new JButton("종료");
		area = new JTextArea();
		JScrollPane scroll = new JScrollPane(area);
		
		JPanel p = new JPanel();
		p.add(newBtn);
		p.add(exitBtn);
		
		Container c = this.getContentPane();
		c.add("North", p);
		c.add("Center", scroll);
		
		setBounds(700,100,300,400);
		setVisible(true);
		//setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int result = JOptionPane.showConfirmDialog(SwingTest.this,
						"정말로 종료하시겠습니까", 
						"종료", 
						JOptionPane.YES_NO_OPTION, 
						JOptionPane.QUESTION_MESSAGE);
				
				if(result == JOptionPane.YES_OPTION) System.exit(0);
			}
		});
		
		//이벤트
		newBtn.addActionListener(this);
		exitBtn.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == newBtn) {
			area.setText("");
		}else if(e.getSource() == exitBtn) {
			//System.exit(0);
			
			int result = JOptionPane.showConfirmDialog(this,
					"정말로 종료하시겠습니까", 
					"종료", 
					JOptionPane.YES_NO_OPTION, 
					JOptionPane.QUESTION_MESSAGE);
			
			//if(result == JOptionPane.YES_OPTION) System.exit(0);
			if(result == 0) System.exit(0);
			
		}
		
	}

	public static void main(String[] args) {
		new SwingTest();
	}
}










