package inheritance;

public class ChildTest extends SuperTest {
	protected String name;
	protected int age;
	
	public ChildTest() {
		System.out.println("ChildTest �⺻ ������");
	}
	
	public ChildTest(double weight, double height, String name, int age) {
		super(weight, height); // �ڵ��� �ݺ��� �����ϱ� ����  super.weight = weight;
		System.out.println("ChildTest ������");	//  super.height = height; �� ������ ����� �̷��� �Ѵ�(16,17��)
		//this.weight = weight; // this �νᵵ �θ�͵� �ڱ�� ó�� ���� �ֱ� ����������� ����
		//this.height = height;	// this �� ���ڽ��� ������
		//super.weight = weight;  // super ��Ȯ�ϰ� �θ���� ��Ī
		//super.height = height;	// super �� �θ� Ŭ������ ������
		this.name = name;
		this.age = age;
		// super(weight, height); �̰� SuperTest�� �����ڸ� ���� �Ἥ SuperTest �����ڰ� ������
	}	// super.weight = weight; �̰� SuperTest �����ڸ� �ڱ�� �ΰ�ó���Ἥ SuperTest �⺻������ �� �����°�??
		// super.height = height;
	
	public void disp() {
		System.out.println("ChildTestŬ������ disp()");
		System.out.println("������ = " + weight);
		System.out.println("Ű = " + height);
		System.out.println("�̸� = " + name);
		System.out.println("���� = " + age);
	
}

	public static void main(String[] args) {
		ChildTest aa = new ChildTest(75.3, 185.5, "ȫ�浿",25);
		aa.disp(); // disp()�� ChildTest���� ã�´�. ������ �θ�Ŭ�������� ���� ã�´�
		System.out.println();
		
		System.out.println("-----------------------");
		SuperTest bb = new ChildTest(35.8, 156.3, "�ڳ�",13);
		bb.disp(); // �������̵�(�̸��� �����޼ҵ�)�� �Ǹ� ������ �ڽ�Ŭ������ �޼ҵ带 �θ���
		System.out.println();
	}

}
