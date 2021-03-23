package network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ProtocolServer {
	private ServerSocket ss;
	private Socket socket;
	private BufferedReader br; // Ŭ���̾�Ʈ�� �����ϰ� ������ ���� ��ü���� ����
	private BufferedWriter bw;
	private String line;
	
	public ProtocolServer() {
		try {
			ss = new ServerSocket(9500);
			System.out.println("���� �غ� �Ϸ�");
			System.out.println(line);
			socket = ss.accept(); // ����æ��
			br = new BufferedReader(new InputStreamReader(socket.getInputStream())); // ������ ���� ���� ������ ��ü
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));// ������ ���� ���� ������ ��ü
			
		} catch (IOException e) {
			System.out.println("Ŭ���̾�Ʈ�� ������ �ȵǾ����ϴ�.");
			e.printStackTrace();
			System.exit(0);
		}
		
		//-------------------------
		String line;
		while(true) {
			//Ŭ���̾�Ʈ�� ���� ���� �޼��� �б�
			try {
				line = br.readLine();// "100:angel" "200:angel" "300:angel:�ȳ�" Ŭ���̾�Ʈ���� ���Ͱ� \n �� ���̺������⶧���� readLine ������ ����� �������ִٰ� ��
			
				//Ŭ���̾�Ʈ�� ������
				String[] ar = line.split(":");
				if(ar[0].equals(Protocol.ENTER)) { //Protocol.ENTER ��� "100" �ص������� �̰� �� �������� ������ ����
					bw.write(ar[1]+"�� ����\n"); // "angel�� ����"
					bw.flush();
				
				}else if (ar[0].equals(Protocol.EXIT)) {
					bw.write(ar[1]+"�� ����\n");
					bw.flush();
					
					bw.close();
					br.close();
					socket.close();
					
					System.exit(0);
					//�������� Ű���尡 ��� Ű���� ����� �����൵ �ȴ�
				}else if (ar[0].equals(Protocol.SEND_MESSAGE)) {
					bw.write("["+ar[1]+"] "+ar[2]+"\n");
					bw.flush();
				}
			
			} catch (IOException e) {
				e.printStackTrace();
			} 
			
		}//while
	}
	
	public static void main(String[] args) {
		new ProtocolServer();
		
	}
}
