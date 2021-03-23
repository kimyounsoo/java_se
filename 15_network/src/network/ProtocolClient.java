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
	
	private BufferedReader keyboard;//키보드
	
	public ProtocolClient() {
		try {
			socket = new Socket("192.168.0.18", 9500);// 아이피 , 포트
			br = new BufferedReader(new InputStreamReader(socket.getInputStream())); // 소켓을 통해 들어옴 들어오는 객체
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));// 소켓을 통해 나감 나가는 객체
			
			keyboard = new BufferedReader(new InputStreamReader(System.in));// 키보드를 통해 들어옴
			
		} catch (UnknownHostException e) {
			System.out.println("서버를 찾을 수 없습니다.");
			e.printStackTrace();
			System.exit(0);
			
		} catch (IOException e) {
			System.out.println("서버와 연결이 안되었습니다.");
			e.printStackTrace();
			System.exit(0);
		}
		
		//--------------------
		String msg, line;
		
		while(true) {
			//서버로 보내는 쪽
			//msg = 키보드로 부터 메세지 읽는다 -> 서버로 보내기
			try {
				msg = keyboard.readLine();			
				bw.write(msg+"\n");// 서버로 보내기; 엔터강제추가 "100:angel" "200:angel" "300:angel:안녕"
				bw.flush(); // 버퍼 비우기 버퍼를 비워줘야 그 다음 데이터가 들어간다 score클래스 에서는 데이터 보내고 close 해줘서 플러시 처리 안했지만 여기선 채팅으로 계속 주고받아야해서 플러시 처리 해준다
				
				//서버로부터 받는 쪽
				line = br.readLine();//					"angel님 입장" "angel님 퇴장" "[angel] 안녕"
				System.out.println(line);
				
				String[] ar = msg.split(":"); // split
				if(ar[0].equals(Protocol.EXIT)) {// 200 : 이면 종료
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
