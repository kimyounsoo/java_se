package variable;

/*
 * ������ �����Ͽ� 320, 258�� ���� ���Ͻÿ�
 * [������]
 * 320 + 258 = xxx (sum)
 * 320 - 258 = xxx (sub)
 * 320 * 258 = xxx (mul)
 * 320 / 258 = 1.24 (div)
 */

 
public class CalcTest {

	public static void main(String[] args) {
		int a = 320;
		short b = 258;
		//short sum = a + b; ����� ��Ʈ������ �ڵ� ��ȯ�ϱ� ���� error
		
		int sum = a + b;
		int sub = a - b;
		int mul = a * b;
		double div = (double)a / b; // ��������ȯ / �ڵ�����ȯ
		
		//2��
		//short sum = (short)(a+b)
		
		
		System.out.println(a+" + "+b+" = "+sum);
		System.out.println(a+" - "+b+" = "+sub);
		System.out.println(a+" * "+b+" = "+mul);
		System.out.println(a+" / "+b+" = "+String.format("%.2f", div));
	}

}

