package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStream {
	public static void main(String[] args) throws IOException {
		//BufferedInputStream bis = new BufferedInputStream(new FileInputStream("data.txt"));
	
		FileInputStream fis = new FileInputStream("data.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		int data; // ġ���ϰ� ���������θ� �о�� ������ ??
	
		while((data = bis.read())!=-1) { // -1 �ɶ����� 1310 �߰��߰� �����մ� 1310�� ���Ͱ� \n
			//System.out.print(data);
			System.out.print((char)data); // ���������� ����ȯ
		}
	
		bis.close();
	
	}
	
}
