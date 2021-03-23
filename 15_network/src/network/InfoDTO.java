package network;

import java.io.Serializable;

enum Info{
	JOIN, EXIT, SEND
}

public class InfoDTO implements Serializable { // 직렬화 하기 위해선 꼭 Serializable 해줘야한다
	private String nickName;
	private String message;
	private Info command;
	
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Info getCommand() {
		return command;
	}
	public void setCommand(Info command) {
		this.command = command;
	}
}
//BufferedReader, PrinWriter 사용 x

//객체(InfoDTO) 로 데이터를 넘기고 받고
//ObjectInputStream, ObjectOutputStream 써야 함  