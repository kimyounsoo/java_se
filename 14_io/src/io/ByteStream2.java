package io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStream2 {
	
	public static void main(String[] args) throws IOException{
		//파일 객체 생성 이름만으론 파일의 크기 및 정보를 알수없다
		File file = new File("data.txt");
		
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		int size = (int)file.length();
		byte[] b = new byte[size];
		
		bis.read(b, 0, size);
		
		String str = new String(b);//byte[] -> String로 생성
		
		System.out.println(str);
		
		bis.close();
	}
}
