package variable;

public class Variable3 {
         int a; //�ʵ�
         static int b; // �Ŵ��� ������
	
       public static void main(String[] args) {
		int a = 10; //��������
		System.out.println("�������� a ="+a);
		
		Variable3 v; //��ü
		v = new Variable3();
		System.out.println("�ʵ� a =" + v.a);
		v.a = 20;
		System.out.println("�ʵ� a =" + v.a);
		
		Variable3 v2; //��ü
		v2 = new Variable3();
		System.out.println("�ʵ� a =" + v2.a);
		
		int sum = v.a + v2.a;
		System.out.println("�� = " + sum);

		System.out.println("�ʵ� b = " + Variable3.b);
		System.out.println("�ʵ� b = " + b);
		System.out.println("�ʵ� b = " + v.b);
		
	}

}
