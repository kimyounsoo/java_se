package exception;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Timer extends Frame implements ActionListener, Runnable{
	private Label label;
	private Button startBtn, stopBtn;
	private boolean aa = true;
	
	public Timer() {
		setLayout(null); // �������� ����
		
		label = new Label("0");
		label.setFont(new Font("���ü", Font.BOLD, 70));
		label.setForeground(Color.GREEN);
		startBtn = new Button("����");
		stopBtn = new Button("����");
		
		label.setBounds(50, 30, 100, 100);
		startBtn.setBounds(200, 40, 60, 30);
		stopBtn.setBounds(200, 80, 60, 30);
		
		add(label);
		add(startBtn);
		add(stopBtn);
		
		startBtn.setEnabled(true);
		stopBtn.setEnabled(false);
		
		setTitle("Ÿ�̸�");
		setBounds(700, 200, 300, 200);
		setVisible(true);
		addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		
		//�̺�Ʈ
		startBtn.addActionListener(this);
		stopBtn.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Thread t;
		if(e.getSource() == startBtn) {
			//������ ����
			 t = new Thread(this); // implements Runnable ���� ����߾��Ѵ�
			//������ ����
			t.start();
			aa = true; // ���� ������ Ʈ�� -> 82���� Ȯ��
			//���۹�ư ��Ȱ��
			startBtn.setEnabled(false);
			//������ư Ȱ��
			stopBtn.setEnabled(true);
		}else if(e.getSource() == stopBtn) {
			t = null; // ������ ����
			
			aa = false;
			//���۹�ư Ȱ��
			startBtn.setEnabled(true);
			//������ư ��Ȱ��
			stopBtn.setEnabled(false);
		}
		
	}	
	@Override
	public void run() {
		for(int i=1; i<=100000; i++) {
			label.setText(i+"");// i�� ���ڿ��� �ƴ϶� "" �� ���ڿ� ��ȯ
			
			if(!aa) break; // Ʈ�� �ݵ� �ϱ� �ȸ��� ���������� �޽��ϱ� ����
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		}//for
		
	
	
	public static void main(String[] args) {
		new Timer();

	}



	

}
