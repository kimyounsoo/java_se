package if_switch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 3���� ���� (a,b,c)�� �Է¹޾Ƽ� ������� ����Ͻÿ�
 */
public class IfTest3 {

	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a, b, c;
		
		System.out.print(" a �Է� : ");
		a = Integer.parseInt(br.readLine());
		System.out.print(" b �Է� : ");
		b = Integer.parseInt(br.readLine());
		System.out.print(" c �Է� : ");
		c = Integer.parseInt(br.readLine());
		
		if (a<b && a<c) {  //a�� ���� �۴ٸ�
			if(b<c) System.out.println(a+", "+b+", "+c);
			else System.out.println(a+", "+c+", "+b);
			
		}else if(b<c) { //a�� ���� ������ �ʴ�, b�� ���� �۴ٸ�
			if(a<c) System.out.println(b+", "+a+", "+c);
			else System.out.println(b+", "+c+", "+a);
		
		}else { // a�� b�� ���� ������ �ʴ�, c�� ���� �۴ٸ�
			if(a<b) System.out.println(c+", "+a+", "+b);
			else System.out.println(c+", "+b+", "+a);
		}
	

	}

}
/*
 * else
�׳� ������ ��...�̱���
else if �̰� �����̸� �ѹ� ������ ����� �ſ���

 */
