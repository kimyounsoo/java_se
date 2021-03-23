package network;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class ChatClient extends JFrame implements ActionListener, Runnable {
	private JTextField input;
	private JButton send;
	private JTextArea output;

	private Socket socket;
	private BufferedReader br;
	private PrintWriter pw;

	public ChatClient() {
		input = new JTextField();
		send = new JButton("보내기");
		output = new JTextArea();
		JScrollPane scroll = new JScrollPane(output);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);// 스크롤 항상 떠있게
		output.setEditable(false); // 텍스트 필드안에 글씨 못쓰게 막아놓음
		output.setBackground(Color.CYAN);

		JPanel p = new JPanel();
		p.setLayout(new BorderLayout()); // p패널 안에서 동서남북에 배치하기
		p.add("Center", input); // 남쪽(아래) 에 있는 p패널 안에서 센터에 배치 Center 안써도 무관
		p.add("East", send); // 남쪽(아래)에 있는 p패널안에서 동쪽(오른쪽)에 배치, input 위에 배치된 것

		Container c = this.getContentPane();
		c.add("Center", scroll);// 스크롤은 중앙에 배치
		c.add("South", p); // p 패널을 남쪽(아래)에 배치

		setVisible(true);
		setBounds(700, 200, 300, 300);
		// setDefaultCloseOperation(EXIT_ON_CLOSE);
		addWindowListener(new WindowAdapter() { // x누르면 quit 작동 기능
			@Override
			public void windowClosing(WindowEvent e) {
				pw.println("quit");
				pw.flush();
			}
		});

	}// ChatClient()

	public void service() {
		// 서버IP
//		String serverIP = JOptionPane.showInputDialog(this, 
//													"서버IP를 입력 하세요", 
//													"서버IP",JOptionPane.INFORMATION_MESSAGE);
		String serverIP = JOptionPane.showInputDialog(this, "서버IP를 입력하세요", "192.168.0.");
		if (serverIP == null || serverIP.length() == 0) {
			System.out.println("서버IP가 입력 되지 않았습니다.");
			System.exit(0);
		}

		// 닉네임
		String nickName = JOptionPane.showInputDialog(this, "닉네임을 입력하세요", "닉네임", JOptionPane.INFORMATION_MESSAGE);
		if (nickName == null || nickName.length() == 0) {
			nickName = "guest";
		}

		// 소켓생성
		try {
			socket = new Socket(serverIP, 9500); // 내아이피가 아님 포트는 임의로 정하면된다

			br = new BufferedReader(new InputStreamReader(socket.getInputStream())); // 소켓을 통해 들어옴 들어오는 객체
			pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));// 소켓을 통해 나감 나가는 객체

		} catch (UnknownHostException e) {
			System.out.println("서버를 찾을 수 없습니다.");
			e.printStackTrace();
			System.exit(0);

		} catch (IOException e) {
			System.out.println("서버를 찾을 수 없습니다.");
			e.printStackTrace();
			System.exit(0);
		}

		// 서버로 닉네임 보내기
		pw.println(nickName);
		pw.flush();

		// 스레드 생성
		Thread t = new Thread(this);
		// 스레드 시작 - 스레드 실행(run() 으로간다)
		t.start();

		// 이벤트
		send.addActionListener(this);
		input.addActionListener(this); // JTextField에서 엔터
		// e.getSource == send 할필요 없다
	}// service()

	@Override
	public void run() {// Object와는 다르게 if문 필요없다
		// 서버로부터 받는 쪽
		String line;
		while (true) {
			try {
				line = br.readLine();

				if (line == null || line.toLowerCase().equals("quit")) {// null이거나 quit 들어오면 종료
					br.close();
					pw.close();
					socket.close();

					System.exit(0);
				}

				output.append(line + "\n"); // append 계속찍어라 setText 대신

				// 채팅 내려가면 스크롤바 내려가게 하는기능
				int pos = output.getText().length(); // output 글자수(length) 에 맞게 스크롤내려가게 하는 것
				output.setCaretPosition(pos); // 스크롤바 위치값 잡아주는 메소드

			} catch (IOException e) {
				e.printStackTrace();
			}
		} // while

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 서버로 보내는 쪽
		String msg = input.getText();
		pw.println(msg);
		pw.flush();
		input.setText("");
	}

	public static void main(String[] args) {
		new ChatClient().service(); // 서비스메소드도 추가
	}

}
