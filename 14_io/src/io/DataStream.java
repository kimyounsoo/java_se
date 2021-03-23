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
			dos.writeUTF("ȫ�浿");
			dos.writeInt(25);
			//dos.writeDouble(185.3);
			dos.writeFloat(185.3f); //�Ǽ��� ����Ʈ�� �����̶� �÷�Ʈ�� ���� ����ȯ�� ������Ѵ� float(185.3) �ص� ����
			dos.close(); // ������ �ݱ�
			
			DataInputStream dis = new DataInputStream(new FileInputStream("result.txt")); // �о�ö��� ���ϸ��� ������� �Ѵ�
			System.out.println("�̸� = " + dis.readUTF());
			System.out.println("���� = " + dis.readInt());
			//System.out.println("Ű = " + dis.readDouble()); // float �� ���ؼ� ����
			System.out.println("Ű = " + dis.readFloat());
			dis.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
