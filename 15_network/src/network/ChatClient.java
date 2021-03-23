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
		send = new JButton("������");
		output = new JTextArea();
		JScrollPane scroll = new JScrollPane(output);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);// ��ũ�� �׻� ���ְ�
		output.setEditable(false); // �ؽ�Ʈ �ʵ�ȿ� �۾� ������ ���Ƴ���
		output.setBackground(Color.CYAN);

		JPanel p = new JPanel();
		p.setLayout(new BorderLayout()); // p�г� �ȿ��� �������Ͽ� ��ġ�ϱ�
		p.add("Center", input); // ����(�Ʒ�) �� �ִ� p�г� �ȿ��� ���Ϳ� ��ġ Center �Ƚᵵ ����
		p.add("East", send); // ����(�Ʒ�)�� �ִ� p�гξȿ��� ����(������)�� ��ġ, input ���� ��ġ�� ��

		Container c = this.getContentPane();
		c.add("Center", scroll);// ��ũ���� �߾ӿ� ��ġ
		c.add("South", p); // p �г��� ����(�Ʒ�)�� ��ġ

		setVisible(true);
		setBounds(700, 200, 300, 300);
		// setDefaultCloseOperation(EXIT_ON_CLOSE);
		addWindowListener(new WindowAdapter() { // x������ quit �۵� ���
			@Override
			public void windowClosing(WindowEvent e) {
				pw.println("quit");
				pw.flush();
			}
		});

	}// ChatClient()

	public void service() {
		// ����IP
//		String serverIP = JOptionPane.showInputDialog(this, 
//													"����IP�� �Է� �ϼ���", 
//													"����IP",JOptionPane.INFORMATION_MESSAGE);
		String serverIP = JOptionPane.showInputDialog(this, "����IP�� �Է��ϼ���", "192.168.0.");
		if (serverIP == null || serverIP.length() == 0) {
			System.out.println("����IP�� �Է� ���� �ʾҽ��ϴ�.");
			System.exit(0);
		}

		// �г���
		String nickName = JOptionPane.showInputDialog(this, "�г����� �Է��ϼ���", "�г���", JOptionPane.INFORMATION_MESSAGE);
		if (nickName == null || nickName.length() == 0) {
			nickName = "guest";
		}

		// ���ϻ���
		try {
			socket = new Socket(serverIP, 9500); // �������ǰ� �ƴ� ��Ʈ�� ���Ƿ� ���ϸ�ȴ�

			br = new BufferedReader(new InputStreamReader(socket.getInputStream())); // ������ ���� ���� ������ ��ü
			pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));// ������ ���� ���� ������ ��ü

		} catch (UnknownHostException e) {
			System.out.println("������ ã�� �� �����ϴ�.");
			e.printStackTrace();
			System.exit(0);

		} catch (IOException e) {
			System.out.println("������ ã�� �� �����ϴ�.");
			e.printStackTrace();
			System.exit(0);
		}

		// ������ �г��� ������
		pw.println(nickName);
		pw.flush();

		// ������ ����
		Thread t = new Thread(this);
		// ������ ���� - ������ ����(run() ���ΰ���)
		t.start();

		// �̺�Ʈ
		send.addActionListener(this);
		input.addActionListener(this); // JTextField���� ����
		// e.getSource == send ���ʿ� ����
	}// service()

	@Override
	public void run() {// Object�ʹ� �ٸ��� if�� �ʿ����
		// �����κ��� �޴� ��
		String line;
		while (true) {
			try {
				line = br.readLine();

				if (line == null || line.toLowerCase().equals("quit")) {// null�̰ų� quit ������ ����
					br.close();
					pw.close();
					socket.close();

					System.exit(0);
				}

				output.append(line + "\n"); // append ������� setText ���

				// ä�� �������� ��ũ�ѹ� �������� �ϴ±��
				int pos = output.getText().length(); // output ���ڼ�(length) �� �°� ��ũ�ѳ������� �ϴ� ��
				output.setCaretPosition(pos); // ��ũ�ѹ� ��ġ�� ����ִ� �޼ҵ�

			} catch (IOException e) {
				e.printStackTrace();
			}
		} // while

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// ������ ������ ��
		String msg = input.getText();
		pw.println(msg);
		pw.flush();
		input.setText("");
	}

	public static void main(String[] args) {
		new ChatClient().service(); // ���񽺸޼ҵ嵵 �߰�
	}

}
