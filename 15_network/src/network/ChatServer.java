package network;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List; // awt (x)

public class ChatServer {
	private ServerSocket ss;
	private List<ChatHandler> list; //�������� �޾ƾ��ϹǷ� ��̸���Ʈ �����
	public ChatServer() {
		try {
			ss = new ServerSocket(9500);
			System.out.println("���� �غ� �Ϸ�");
			
			list = new ArrayList<ChatHandler>();
			
			while(true) {
				Socket socket = ss.accept();//����æ��
				ChatHandler handler = new ChatHandler(socket, list);//socket ��
				handler.start();//������ ���� - ������ ����(run())
				
				list.add(handler);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		new ChatServer();

	}

}






