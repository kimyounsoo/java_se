package class_constructor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str, tr, re;
		int index, count;
		
		System.out.print("���ڿ� �Է� : ");
		str = br.readLine();
		
		System.out.print("���� ���ڿ� �Է� : ");
		tr = br.readLine();
		
		System.out.print("�ٲ� ���ڿ� �Է� : ");
		re = br.readLine();
		
		if(str.length()<tr.length()) {
			System.out.println("�Է��� ���ڿ��� ũ�Ⱑ �۽��ϴ�.");
		}else {
			str = str.toLowerCase();
			tr = tr.toLowerCase();
			count = index = 0;
			while((index = str.indexOf(tr,index)) != -1) {
				index +=tr.length();
				count++;

			}
			
			System.out.println(str.replace(tr, re));
			System.out.println(count+"�� ��ȯ");
			
		

			}
		

		}
		
		
		
		
		

	

}

