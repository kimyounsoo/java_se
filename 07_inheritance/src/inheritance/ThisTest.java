package inheritance;

public class ThisTest {
	private String name;
	private int age;
	
	public ThisTest() {
		System.out.println("default ������");
		System.out.println("this = "+this);
	}

	public ThisTest(String name) {
		this();
		System.out.println("this = "+this);
		this.name = name; // this �� �Ⱦ��� name �� �� �޼ҵ��� �Ķ���� ���̵ȴ� this �� ���� Ŭ������ ���̵ȴ�
	}
	
	public ThisTest(int age) {
		this("�ڳ�"); // �ݵ�� ������ �ȿ��� ù��° �ٿ� ����Ѵ� this() �� �����ε� ������ �����ϴ�
		this.age = age;
		
	}

	public static void main(String[] args) {
		ThisTest aa = new ThisTest(); // �⺻������ () �� ��� �ڵ����� ó���ȴ�
		System.out.println("��ü aa = "+aa);
		System.out.println("�̸�  = "+aa.name+"\t ���� = "+aa.age);
		System.out.println();
		
		ThisTest bb = new ThisTest("ȫ�浿");
		System.out.println("��ü bb = "+bb);
		System.out.println("�̸�  = "+bb.name+"\t ���� = "+bb.age);
		System.out.println();
		
		ThisTest cc = new ThisTest(25);
		System.out.println("��ü cc = "+cc);
		System.out.println("�̸�  = "+cc.name+"\t ���� = "+cc.age);
		System.out.println();
	}

}
