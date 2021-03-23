package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStream {
	public static void main(String[] args) throws IOException {
		//BufferedInputStream bis = new BufferedInputStream(new FileInputStream("data.txt"));
	
		FileInputStream fis = new FileInputStream("data.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		int data; // 치사하게 정수형으로만 읽어내기 때문에 ??
	
		while((data = bis.read())!=-1) { // -1 될때까지 1310 중간중간 끼어잇는 1310은 엔터값 \n
			//System.out.print(data);
			System.out.print((char)data); // 문자형으로 형변환
		}
	
		bis.close();
	
	}
	
}
