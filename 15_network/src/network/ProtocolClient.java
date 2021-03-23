package network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ProtocolClient {
	private Socket socket;
	private BufferedReader br;
	private BufferedWriter bw;
	
	private BufferedReader keyboard;//Ű����
	
	public ProtocolClient() {
		try {
			socket = new Socket("192.168.0.18", 9500);// ������ , ��Ʈ
			br = new BufferedReader(new InputStreamReader(socket.getInputStream())); // ������ ���� ���� ������ ��ü
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));// ������ ���� ���� ������ ��ü
			
			keyboard = new BufferedReader(new InputStreamReader(System.in));// Ű���带 ���� ����
			
		} catch (UnknownHostException e) {
			System.out.println("������ ã�� �� �����ϴ�.");
			e.printStackTrace();
			System.exit(0);
			
		} catch (IOException e) {
			System.out.println("������ ������ �ȵǾ����ϴ�.");
			e.printStackTrace();
			System.exit(0);
		}
		
		//--------------------
		String msg, line;
		
		while(true) {
			//������ ������ ��
			//msg = Ű����� ���� �޼��� �д´� -> ������ ������
			try {
				msg = keyboard.readLine();			
				bw.write(msg+"\n");// ������ ������; ���Ͱ����߰� "100:angel" "200:angel" "300:angel:�ȳ�"
				bw.flush(); // ���� ���� ���۸� ������ �� ���� �����Ͱ� ���� scoreŬ���� ������ ������ ������ close ���༭ �÷��� ó�� �������� ���⼱ ä������ ��� �ְ�޾ƾ��ؼ� �÷��� ó�� ���ش�
				
				//�����κ��� �޴� ��
				line = br.readLine();//					"angel�� ����" "angel�� ����" "[angel] �ȳ�"
				System.out.println(line);
				
				String[] ar = msg.split(":"); // split
				if(ar[0].equals(Protocol.EXIT)) {// 200 : �̸� ����
					br.close();
					bw.close();
					socket.close();
					
					keyboard.close();
					
					System.exit(0);
					
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		}//while
	}//ProtocolClient();
	
	public static void main(String[] args) {
		new ProtocolClient();
	}
}
