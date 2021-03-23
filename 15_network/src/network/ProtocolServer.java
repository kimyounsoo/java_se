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
	private BufferedReader br; // 클라이언트와 동일하게 들어오고 나갈 객체변수 생성
	private BufferedWriter bw;
	private String line;
	
	public ProtocolServer() {
		try {
			ss = new ServerSocket(9500);
			System.out.println("서버 준비 완료");
			System.out.println(line);
			socket = ss.accept(); // 낚아챈다
			br = new BufferedReader(new InputStreamReader(socket.getInputStream())); // 소켓을 통해 들어옴 들어오는 객체
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));// 소켓을 통해 나감 나가는 객체
			
		} catch (IOException e) {
			System.out.println("클라이언트와 연결이 안되었습니다.");
			e.printStackTrace();
			System.exit(0);
		}
		
		//-------------------------
		String line;
		while(true) {
			//클라이언트로 부터 오는 메세지 읽기
			try {
				line = br.readLine();// "100:angel" "200:angel" "300:angel:안녕" 클라이언트에서 엔터값 \n 도 같이보내졌기때문에 readLine 했을때 제대로 읽을수있다고 함
			
				//클라이언트로 보내기
				String[] ar = line.split(":");
				if(ar[0].equals(Protocol.ENTER)) { //Protocol.ENTER 대신 "100" 해도되지만 이게 더 육안으로 구분이 쉽다
					bw.write(ar[1]+"님 입장\n"); // "angel님 입장"
					bw.flush();
				
				}else if (ar[0].equals(Protocol.EXIT)) {
					bw.write(ar[1]+"님 퇴장\n");
					bw.flush();
					
					bw.close();
					br.close();
					socket.close();
					
					System.exit(0);
					//서버에는 키보드가 없어서 키보드 종료는 안해줘도 된다
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
