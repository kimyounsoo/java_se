package if_switch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*3����(a,b,c)�� ������ �Է¹޾Ƽ� �հ����� ���հ����� ����Ͻÿ�
�հ��� ����� 60�� �̻��̾�� �ϰ� �� ������ 40�� �̻��̾�� �Ѵ�

[������]
a : 98
b : 90
c : 85
�հ�

a : 98
b : 90
c : 35
�������� ���հ� 

a : 68
b : 50
c : 45
���հ� 
 * 
 */
public class IfTest2 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a, b, c;
		System.out.print(" a �Է� : ");
		a = Integer.parseInt(br.readLine());
		System.out.print(" b �Է� : ");
		b = Integer.parseInt(br.readLine());
		System.out.print(" c �Է� : ");
		c = Integer.parseInt(br.readLine());
		
		double avg = (double)(a+b+c)/3;
		
		if (avg>=60) {
			if(a>=40 && b>=40 && c>=40) { 
			System.out.println("�հ�");
			}else {
			System.out.println("�������� ���հ�");}
		
		}else {
			System.out.println("���հ�");
		
		}
		
		

	}

}


//(double)(a + b+ c) / 3 => �Ǽ��� ������ ������
//271.0 / 3 => 90.3333333
//(double)((a + b + c) /3) => ������ ������ ������   �ٸ��� ����
//                270 / 3
