package class_constructor;
/*
 SungJuk Ŭ���� �̿��Ͻÿ�
��ü �迭 arrayList �� �ƴ� ���۵帮�� ���

[������]
�ο��� �Է� : 2

�̸� �Է� : ȫ�浿
���� �Է� : 85
���� �Է� : 93
���� �Է� : 100

�̸� �Է� : �ڳ�
���� �Է� : 75
���� �Է� : 86
���� �Է� : 92

----------------------------------------------------
�̸�      ����      ����      ����      ����      ���      ����
----------------------------------------------------
ȫ�浿   85      93      100
�ڳ�      75      86      92
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SungJukMain2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		System.out.print("�ο��� �Է�: ");
		int count = Integer.parseInt(br.readLine());
		
		SungJuk[] ar = new SungJuk[count];
		
	for(int i = 0; i < count; i++) {
		System.out.print("�̸� �Է� : ");
		String name = br.readLine();
		System.out.print("���� �Է� : ");
		int kor = Integer.parseInt(br.readLine());
		System.out.print("���� �Է� : ");
		int eng = Integer.parseInt(br.readLine());
		System.out.print("���� �Է� : ");
		int math = Integer.parseInt(br.readLine());
		
		ar[i] = new SungJuk(name, kor, eng, math);
		
		System.out.println("------------------------------------------------------");
		System.out.println("�̸�\t����\t����\t����\t����\t���\t����");
		System.out.println("------------------------------------------------------");
		}
		for(int i = 0; i < ar.length; i++) {
			ar[i].calc();
		System.out.println(ar[i].getName()+"\t"
							+ar[i].getKor()+"\t"
							+ar[i].getEng()+"\t"
							+ar[i].getMath()+"\t"
							+ar[i].getTot()+"\t"
							+String.format("%.2f",ar[i].getAvg())+"\t"
							+ar[i].getGrade());

	

		} for(SungJuk data: ar) {
			System.out.println(data.getName()+"\t"
								+data.getKor()+"\t"
								+data.getEng()+"\t"
								+data.getMath()+"\t"
								+data.getTot()+"\t"
								+String.format("%.2f",data.getAvg())+"\t"
								+data.getGrade());

		}
	}
}