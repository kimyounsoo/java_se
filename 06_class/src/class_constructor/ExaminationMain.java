package class_constructor;

import java.util.Scanner;

/*
 * 5������ ������ ä���ϴ� ���α׷�
1������ 5������ ��� ���� ���� 1�̴�
1������ 20���� ����Ѵ�

�̸� �Է� : ȫ�浿
��   �Է� : 12311

�̸�      1 2 3 4 5   ����
ȫ�浿   O X X O O   60
----------------
��ü �迭
�ο��� �Է� : 3

�̸� �Է� : ȫ�浿
�� �Է�    : 13211

�̸� �Է� : �ڳ�
�� �Է�    : 11111

�̸� �Է� : ��ġ
�� �Է�    : 13242

�̸�      1 2 3 4 5   ����
ȫ�浿   O X X O O   60
�ڳ�      O O O O O   100
��ġ      O X X X X   20
 */
public class ExaminationMain {

	public static void main(String[] args) {
//		Examination aa = new Examination();
//				//			�޸� ������ + ������
//		aa.compare();
//		
//		System.out.println("�̸�\t1 2 3 4 5 \t����");
//		System.out.print(aa.getName()+"\t");//+aa.getOx()+"\t"+aa.getScore());
//										//	�迭���� �ּҰ����� ���´� ��ũ���� 70�� ����
//		for(int i=0; i<aa.getOx().length; i++) {
//			System.out.print(aa.getOx()[i]+" ");
//		}
//		System.out.println("\t"+aa.getScore());
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�ο��� �Է� : ");
		int count = scan.nextInt();
		
		Examination[] ar = new Examination[count];
		
			for(int i=0; i<ar.length; i++) {
	         ar[i] = new Examination();
	         ar[i].compare();
	      }
	      
	      System.out.println();
	      System.out.println("�̸�\t1 2 3 4 5 \t����");
	      
	      for(int k=0; k<count; k++) {
	         System.out.print(ar[k].getName()+"\t");
	         for(int i=0; i<ar[k].getOx().length; i++) {
	            System.out.print(ar[k].getOx()[i]+" ");
	         }
	         System.out.println("\t" + ar[k].getScore());
	      }//for k

			
		
		
		



	}

}
