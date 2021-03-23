package network;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List; // awt (x)

public class ChatServer {
	private ServerSocket ss;
	private List<ChatHandler> list; //여러명을 받아야하므로 어레이리스트 만든다
	public ChatServer() {
		try {
			ss = new ServerSocket(9500);
			System.out.println("서버 준비 완료");
			
			list = new ArrayList<ChatHandler>();
			
			while(true) {
				Socket socket = ss.accept();//낚아챈다
				ChatHandler handler = new ChatHandler(socket, list);//socket 과
				handler.start();//스레드 시작 - 스레드 실행(run())
				
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






