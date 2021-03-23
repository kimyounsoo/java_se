package inheritance;

public class SubTest extends SuperTest {
	protected String name;	//�θ��� �͵� ���� �ֱ⶧����
	protected int age;		//�� 4���� �ʵ带 ���� �ִ�(weight height)���� �׷��� 12���� ��ó�� ����
							
	public SubTest() {
		System.out.println("SubTest �⺻ ������");
	}
	
	public SubTest(double weight, double height, String name, int age) {
		System.out.println("SubTest ������");
		//this.weight = weight; // this �νᵵ �θ�͵� �ڱ�� ó�� ���� �ֱ� ����������� ����
		//this.height = height;	// this �� ���ڽ��� ������
		super.weight = weight;  // super ��Ȯ�ϰ� �θ���� ��Ī
		super.height = height;	// super �� �θ� Ŭ������ ������
		this.name = name;
		this.age = age;
		
	}
		public void output() {
			System.out.println("������ = " + weight);
			System.out.println("Ű = " + height);
			System.out.println("�̸� = " + name);
			System.out.println("���� = " + age);
		
	}
	
	public static void main(String[] args) {
		//SubTest aa = new SubTest(); // �θ� �⺻������ + �ڱ�͵� �⺻������
		
		SubTest aa = new SubTest(75.3, 185.5, "ȫ�浿",25); // �θ�⺻������ + �ڱ���� �Ķ���Ͱ� �ִ� ������
		aa.output(); //output()�� SubTest���� ã�´�. ������ �θ�Ŭ������ ���� ã�´�.
		System.out.println();
		
		aa.disp(); //disp()�� SubTest���� ã�´�. ������ �θ�Ŭ�������� ã�´�
		System.out.println("------------------------");
		
		SuperTest bb = new SubTest(35.8, 156.3, "�ڳ�",13);
		// bb.output(); - error: bb. �� SuperTest�� �ּҰ��� ������ �ֱ⶧���� output�� �����ü�����.
		bb.disp();
	}

}

//�ڽ� Ŭ������ �θ� �����ڸ� �����ؼ� ȣ���� �� �ִ�
//�ƹ� ���� ������ �θ��� �⺻ �����ڸ� ȣ���Ѵ�