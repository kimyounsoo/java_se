package io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStream {
	
	public static void main(String[] args) {
		try {
			DataOutputStream dos = new DataOutputStream(new FileOutputStream("result.txt"));
			dos.writeUTF("홍길동");
			dos.writeInt(25);
			//dos.writeDouble(185.3);
			dos.writeFloat(185.3f); //실수의 디폴트는 더블이라 플로트를 쓰면 형변환을 해줘야한다 float(185.3) 해도 무관
			dos.close(); // 데이터 닫기
			
			DataInputStream dis = new DataInputStream(new FileInputStream("result.txt")); // 읽어올때는 파일명을 꼭써줘야 한다
			System.out.println("이름 = " + dis.readUTF());
			System.out.println("나이 = " + dis.readInt());
			//System.out.println("키 = " + dis.readDouble()); // float 로 안해서 에러
			System.out.println("키 = " + dis.readFloat());
			dis.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
