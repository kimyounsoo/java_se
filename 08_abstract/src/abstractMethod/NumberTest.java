package abstractMethod;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberTest {

	public static void main(String[] args) {
		NumberFormat nf = new DecimalFormat(); //�߻�Ŭ������ new NumberFormat ��� �ڽ�Ŭ����
		//3�ڸ�����, ��� �Ҽ����� 3°�ڸ�
		System.out.println(nf.format(12345678.456789));
		System.out.println(nf.format(12345678));
		System.out.println();
		
		NumberFormat nf2 = new DecimalFormat("#,###.##��");
		//�Ҽ��� ������ ���ڰ� �ƴѰ��� ǥ������ �ʴ´�.
		System.out.println(nf2.format(12345678.456789));
		System.out.println(nf2.format(12345678));
		System.out.println();
		
		NumberFormat nf3 = new DecimalFormat("#,###.00��");
		//0�� ������ ǥ��
		System.out.println(nf3.format(12345678.456789));
		System.out.println(nf3.format(12345678));
		System.out.println();
		
		//NumberFormat nf4 = NumberFormat.getInstance();	//�߻�Ŭ������ new NumberFormat ��� �޼ҵ�
		NumberFormat nf4 = NumberFormat.getCurrencyInstance();//��ǥ��
		nf4.setMaximumFractionDigits(2); // �Ҽ����� 2°�ڸ�
		nf4.setMinimumFractionDigits(2); // ������ 0�� ǥ��
		System.out.println(nf4.format(12345678.456789));
		System.out.println(nf4.format(12345678));
		System.out.println();
		
		//NumberFormat nf5 = NumberFormat.getInstance(Locale.US);	//�߻�Ŭ������ new NumberFormat ��� �޼ҵ�
		//NumberFormat nf5 = NumberFormat.getCurrencyInstance(Locale.US);//��ǥ��
		//NumberFormat nf5 = NumberFormat.getCurrencyInstance(Locale.JAPAN);//��ȭ ǥ��
		//NumberFormat nf5 = NumberFormat.getCurrencyInstance(Locale.CHINA);
		NumberFormat nf5 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		nf4.setMaximumFractionDigits(2); // �Ҽ����� 2°�ڸ�
		nf4.setMinimumFractionDigits(2); // ������ 0�� ǥ��
		System.out.println(nf5.format(12345678.456789));
		System.out.println(nf5.format(12345678));
		System.out.println();
		
		}
		
}		

	


//				#,###.##	#,###.00
// 1234.567	1,234.57	1.234.57
//	1234		1,234		1,234.00