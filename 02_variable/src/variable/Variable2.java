package variable;

public class Variable2 {
	int a; // �ʵ�. �ν��Ͻ� ���� �ʱ�ȭ
	static int b; // �ʵ�, Ŭ���� ����, �ʱ�ȭ
	int c;
	String d; //Ŭ������ ��ü���� null
	int f=7;
	//f = 7; error

	public static void main(String[] args) {
		int a=10; // ��������(local variable), �����Ⱚ
		System.out.println("�������� a = "+a); 
		System.out.println("�ʵ� b ="+b);//b�տ� Ŭ������ �����Ǿ��ִ� 
		System.out.println("�ʵ� b ="+Variable2.b); 
		System.out.println("�ʵ� a ="+new Variable2().a); 
		System.out.println("�ʵ� c ="+new Variable2().c); 
		System.out.println("�ʵ� d ="+new Variable2().d);
	}

	
	
	//������ �޸� ���� �ؾ��Ѵ�... static�� �ڵ����� ����
}
