package method;

public class CompTest {

	public static void main(String[] args) {
		int score = 1;
		String result = score>=80 && score<=100 ? "�հ�" : "���հ�";        
		System.out.println("���  = "+result);
		System.out.println();
		
		//score�� ���� ¦��(2�� ���� �������� 0�̸�)�̸� "¦��" �ƴϸ� "Ȧ��"
		result = score%2 == 0 ? "¦��" : "Ȧ��";
		System.out.println("���  = "+result);
		System.out.println();
		
		// a, b�߿��� ū ���� ����Ͻÿ�
		int a=30, b=25;
		//���࿡ a�� b���� ũ�ٸ�
		//int big = a > b ? a : b;
	    //System.out.println("���  = "+big);
		System.out.println("ū �� = " + Math.max(a,b));
		System.out.println("���� �� = " + Math.min(a, b));
		System.out.println("���� = " + Math.pow(1.0, 5.0));
		
		double p = Math.pow(2.0, 5.0);
		System.out.println("���� = "+ p);
		
		
		
		
		int c = 15;
		//result = c�� 2�� 3�� �����(2�� ������ �������� 3���ε� ������ ��������) "2��3�� �����" : "2��3�� ������� �ƴϴ�";
		result = c%2==0 && c%3==0  ? "2��3�� �����" : "2��3�� ������� �ƴϴ�";
		System.out.println("���  = "+result);
		System.out.println();
		
		
				
	}

}
