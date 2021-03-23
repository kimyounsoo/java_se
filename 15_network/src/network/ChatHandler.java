package network;

import java.util.List; // awt (x)
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

//������ �����带 ������ ������ ������ �Ǿ �ȵȴ�
//������ �޾Ƽ� ���⼭ �����带 ������
public class ChatHandler extends Thread {
	private Socket socket;
	private List<ChatHandler> list;
	
	private BufferedReader br;
	private PrintWriter pw;
	
	public ChatHandler(Socket socket, List<ChatHandler> list) throws IOException {
		this.socket = socket;
		this.list = list;
		
		br = new BufferedReader(new InputStreamReader(socket.getInputStream())); // ������ ���� ���� ������ ��ü
		pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));// ������ ���� ���� ������ ��ü
		
	}

	@Override
	public void run() {
		String line;
		
		try {
			//�г��� �޴� ��
			String nickName = br.readLine();
			//��� Ŭ���̾�Ʈ���� ������
			broadcast(nickName+"�� �����Ͽ����ϴ�.");
			
			while(true) {
				line = br.readLine();
				
				if(line==null || line.toLowerCase().equals("quit")) {
					break; //quit ������ ���Ϲ� ����������
				}
				
				//�޼����� ��� Ŭ���̾�Ʈ���� ������
				broadcast("["+nickName+"] "+line);
				
						
			}//while
			
			//quit ���� Ŭ���̾�Ʈ ���Ը� quit ������
			pw.println("quit");
			pw.flush();			
			
			br.close();
			pw.close();
			socket.close();
			
			//���� Ŭ���̾�Ʈ�� ���Դ� ����޼����� ������
			list.remove(this);
			broadcast(nickName+"�� ���忴���ϴ�.");
			

			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}//run()
	
	public void broadcast(String msg) {
		for(ChatHandler handler : list) {
			handler.pw.println(msg);
			handler.pw.flush();
		}//for
	}


}
