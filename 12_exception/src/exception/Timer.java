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
		setLayout(null); // 동서남북 제거
		
		label = new Label("0");
		label.setFont(new Font("고딕체", Font.BOLD, 70));
		label.setForeground(Color.GREEN);
		startBtn = new Button("시작");
		stopBtn = new Button("정지");
		
		label.setBounds(50, 30, 100, 100);
		startBtn.setBounds(200, 40, 60, 30);
		stopBtn.setBounds(200, 80, 60, 30);
		
		add(label);
		add(startBtn);
		add(stopBtn);
		
		startBtn.setEnabled(true);
		stopBtn.setEnabled(false);
		
		setTitle("타이머");
		setBounds(700, 200, 300, 200);
		setVisible(true);
		addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		
		//이벤트
		startBtn.addActionListener(this);
		stopBtn.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Thread t;
		if(e.getSource() == startBtn) {
			//스레드 생성
			 t = new Thread(this); // implements Runnable 먼저 해줘야아한다
			//스레드 시작
			t.start();
			aa = true; // 시작 누르면 트루 -> 82번줄 확인
			//시작버튼 비활성
			startBtn.setEnabled(false);
			//정지버튼 활성
			stopBtn.setEnabled(true);
		}else if(e.getSource() == stopBtn) {
			t = null; // 스레드 종료
			
			aa = false;
			//시작버튼 활성
			startBtn.setEnabled(true);
			//정지버튼 비활성
			stopBtn.setEnabled(false);
		}
		
	}	
	@Override
	public void run() {
		for(int i=1; i<=100000; i++) {
			label.setText(i+"");// i는 문자열이 아니라서 "" 로 문자열 변환
			
			if(!aa) break; // 트루 반데 니까 안멈춤 정지누르면 펄스니까 멈춤
			
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
