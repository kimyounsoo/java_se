package method;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Random;
//import �� �˷��ִ°�

public class MethodTest4 {

	public static void main(String[] args) throws IOException {
		System.out.println(Math.abs(-25));
		
		//���� - ��ǻ�Ͱ� �������� �߻��ϴ� ��, 0 <= ���� < 1
		System.out.println("���� = " + Math.random());
		
		//������ ó�� �ϴ� Ŭ����
		Random r = new Random(); //����
		System.out.println("���� = " + r.nextDouble());
		
		//���ڸ� 3�ڸ����� , ���
		int xx = 2131231244;
		
		DecimalFormat df = new DecimalFormat();
		System.out.println(df.format(xx));
		
		//Ű���� �Է� - 1���� ����
		System.out.print("������ a : ");
		char a = (char)System.in.read(); //��������
		
		//flush - ���� ����
		System.in.read();
		System.in.read();
		
		System.out.print("������ b : ");
		char b = (char)System.in.read();
		System.out.println("��� = " + a + "\t" + b);
		
		//����� ���� �Լ� - a�� b�߿��� ū ���� ����ϴ� �޼ҵ� �ۼ�
		MethodTest4 mt = new MethodTest4();
		char max = mt.big(a, b);
		System.out.println("ū �� = " + max);
		
	}
	
	public char big(char a, char b) { //����, parameter(�Ű�����), argument(�μ�)
		return a >=b ? a : b;
			
		}
	}



//���� - Ŀ���� �� ������ �̵�  \r
//   - ���� �� �̵�                 \n
