package network;

import java.util.List; // awt (x)
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

//서버를 스레드를 돌리면 서버가 여러개 되어서 안된다
//소켓을 받아서 여기서 스레드를 돌린다
public class ChatHandler extends Thread {
	private Socket socket;
	private List<ChatHandler> list;
	
	private BufferedReader br;
	private PrintWriter pw;
	
	public ChatHandler(Socket socket, List<ChatHandler> list) throws IOException {
		this.socket = socket;
		this.list = list;
		
		br = new BufferedReader(new InputStreamReader(socket.getInputStream())); // 소켓을 통해 들어옴 들어오는 객체
		pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));// 소켓을 통해 나감 나가는 객체
		
	}

	@Override
	public void run() {
		String line;
		
		try {
			//닉네임 받는 쪽
			String nickName = br.readLine();
			//모든 클라이언트에게 보내기
			broadcast(nickName+"님 입장하였습니다.");
			
			while(true) {
				line = br.readLine();
				
				if(line==null || line.toLowerCase().equals("quit")) {
					break; //quit 만나면 와일문 빠져나가기
				}
				
				//메세지를 모든 클라이언트에게 보내기
				broadcast("["+nickName+"] "+line);
				
						
			}//while
			
			//quit 보낸 클라이언트 에게만 quit 보내기
			pw.println("quit");
			pw.flush();			
			
			br.close();
			pw.close();
			socket.close();
			
			//남은 클라이언트들 에게는 퇴장메세지만 보내기
			list.remove(this);
			broadcast(nickName+"님 퇴장였습니다.");
			

			
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
