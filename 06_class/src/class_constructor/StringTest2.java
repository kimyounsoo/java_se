package class_constructor;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/*
ġȯ�ϴ� ���α׷��� �ۼ��Ͻÿ�
String Ŭ������ �޼ҵ带 �̿��Ͻÿ�
��ҹ��� ������� ������ ����Ͻÿ�
br.readLine 3�� �Է�
[������]
���ڿ� �Է� : aabba 3�� ���� �Է�
���� ���ڿ� �Է� : aa
�ٲ� ���ڿ� �Է� : cc
ccbba			2�� �� ��� ���
1�� ġȯ

���ڿ� �Է� : aAbbA
���� ���ڿ� �Է� : aa
�ٲ� ���ڿ� �Է� : cc
ccbba
1�� ġȯ

���ڿ� �Է� : aabbaa
���� ���ڿ� �Է� : aa
�ٲ� ���ڿ� �Է� : cc
ccbbcc
2�� ġȯ

���ڿ� �Է� : AAccaabbaaaaatt
���� ���ڿ� �Է� : aa
�ٲ� ���ڿ� �Է� : dd
ddccddbbddddatt
4�� ġȯ

���ڿ� �Է� : aabb
���� ���ڿ� �Է� : aaaaa
�ٲ� ���ڿ� �Է� : ddddd
�Է��� ���ڿ��� ũ�Ⱑ �۽��ϴ�

indexOf()
replace(??, ??)
 */

public class StringTest2 {
	
	
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int index;
		
		int count = 0;
		for(int i=0; i<=4; i++) {
		
			System.out.print("���ڿ� �Է� : ");
			String str = br.readLine();
			System.out.print("���� ���ڿ� �Է� : ");
			String rp = br.readLine();
			System.out.print("�ٲ� ���ڿ� �Է� : ");
			String rc = br.readLine();
			
			if(str.length()<rp.length()) {
				System.out.println("�Է��� ���ڿ��� ũ�Ⱑ �۽��ϴ�");
			}else {
				str = str.toLowerCase();
				rp = rp.toLowerCase();
				index = count = 0;
				while((index = str.indexOf(rp, index)) != -1){
					index += rp.length();
					count++;
				}
			}
			
			System.out.println(str.replace(rp, rc));
			System.out.println(count+"�� ġȯ�߽��ϴ�");
			
		

	}
	}
}









