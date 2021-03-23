package exception;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//Frame - BorderLayout(��������)
public class RunRace extends Frame implements ActionListener {
	private Button btn;
	private int count;
	private Racer[] r;
	
	public RunRace(String[] args) {
		btn = new Button("���");
		count = Integer.parseInt(args[0]);
		r = new Racer[count]; //�迭 ����
		
		for(int i=0; i<count; i++) {
			r[i] = new Racer(args[i+1]); //Ŭ���� ����
		}
		
		Panel p = new Panel(new FlowLayout(FlowLayout.RIGHT));
		p.add(btn);
		
		Panel p2 = new Panel(new GridLayout(count,1));//Panel - FlowLayout
		for(int i=0; i<count; i++) {
			p2.add(r[i]);
		}
		add("South", p);		
		add("Center", p2);		
		
		
		setResizable(false);
		setBounds(700, 200, 600, 400);
		setVisible(true);
		addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		
		//�̺�Ʈ
		btn.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		btn.setEnabled(false);
		
		Thread[] t = new Thread[count];
		
		for(int i=0; i<count; i++) {
			t[i] = new Thread(r[i]); //������ ����
			t[i].setPriority((int)(Math.random()*10+1));//�켱���� 1~10
			t[i].start();//������ ���� - ������ ����(�ü�� - run())
		}//for
		
		
	}
	
	public static void main(String[] args) {
		if(args.length < 2) {
			System.out.println("Usage : java RunRace count name1, ...");
			System.exit(0);
		}
		
		if(Integer.parseInt(args[0]) != args.length-1){
			
			System.out.println("�� �������� �̸��� ������ ���� �ʽ��ϴ�.");
			System.exit(0);
		}

		new RunRace(args);

	}

}














