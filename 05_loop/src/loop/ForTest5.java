package loop;

import java.io.IOException;

/*
 * �ŵ������� ���Ͻÿ�
x�� y���� ����Ͻÿ�

[������]
x�� �Է� : 2
y�� �Է� : 5
2�� 5�� xx   (2*2*2*2*2)
			1 2 3 4 5 
x�� �Է� : 3
y�� �Է� : 4
3�� 4�� xx   (3*3*3*3)
 *///			1 2 3 4
public class ForTest5 {

	public static void main(String[] args)throws IOException {
	int x, y, mul;	
	
	for(int j=1; j<=2; j++) {
		System.out.print("x�� �Է� : ");
		x = System.in.read()-48; //1���� ����
		System.in.read();//���ۺ���
		System.in.read();//���ۺ���
		
		System.out.print("y�� �Է� : ");
		y = System.in.read()-'0';
		System.in.read();//���ۺ���
		System.in.read();//���ۺ���
		
		//System.out.println(x+"\t"+y); �����
		mul = 1;
		for(int i=1; i<=y; i++) { //1, 2, 3, 4 => i �ݺ�Ƚ��
			mul *=x;//mul = mul*x //3* 3* 3* 3
		}
		
		System.out.println(x+"�� "+y+"���� "+mul);
		System.out.println("-------------------");
		
		System.out.print("x�� �Է� : ");
		x = System.in.read()-48; //1���� ����
		System.in.read();//���ۺ���
		System.in.read();//���ۺ���
		
		System.out.print("y�� �Է� : ");
		y = System.in.read()-'0';
		System.in.read();//���ۺ���
		System.in.read();//���ۺ���
		
		//System.out.println(x+"\t"+y); �����
		mul = 1;
		for(int i=1; i<=y; i++) { //1, 2, 3, 4 => i �ݺ�Ƚ��
			mul *=x;//mul = mul*x //3* 3* 3* 3
		}
		
		System.out.println(x+"�� "+y+"���� "+mul);
		System.out.println("------------");
		
		System.out.print("x�� �Է� : ");
		x = System.in.read()-48; //1���� ����
		System.in.read();//���ۺ���
		System.in.read();//���ۺ���
		
		System.out.print("y�� �Է� : ");
		y = System.in.read()-'0';
		System.in.read();//���ۺ���
		System.in.read();//���ۺ���
		
		//System.out.println(x+"\t"+y); �����
		mul = 1;
		for(int i=1; i<=y; i++) { //1, 2, 3, 4 => i �ݺ�Ƚ��
			mul *=x;//mul = mul*x //3* 3* 3* 3
		}//for i
		
		System.out.println(x+"�� "+y+"���� "+mul);
		
		


	}//for j

	}
}
