package method;
/*
 * �ݾ�(money)�� 5679���϶� ������ ���� ����Ͻÿ� (% ������ �����ڷ� Ǯ���ּ���)

[������]
�ݾ� : 5679��
õ�� : 5��
��� : 6��
�ʿ� : 7��
�Ͽ� : 9��
 */
public class Money {

	public static void main(String[] args) {
		int money = 5679;
		System.out.println("�ݾ� : "+money);
		System.out.println("õ�� : "+money/1000+"��");
		money=money%1000;
		System.out.println("��� : "+money/100+"��");
		money=money%100;
		System.out.println("�ʿ� : "+money/10+"��");
		System.out.println("�Ͽ� : "+money%10+"��");
		
		
		

	}

}
