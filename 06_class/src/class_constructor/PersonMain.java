package class_constructor;

class PersonTest{ // ������ �ִ°� ������ �� setter, ���°� getter
	private String name = null; // �ʵ�, �Ӽ�		// �Ĵ� �޴���, �޴����� �ϳ��� ������ �ȴ�
	private int age;	// �ʵ�, �Ӽ�
	//�̸�, ����, Ű, ������,,, - �Ӽ�, �ʵ�
	
	// �ȴ´� �ڴ� �Դ´�,,, - ���, �޼ҵ�
	public PersonTest() {	//�����ڴ� void �� ���� �ȵȴ� void ������ ������ �ڰ� ��Ż�ȴ�
		System.out.println("default ������"); //() �ȿ� �ƹ��͵� ���� ������
	}
	
	public PersonTest(String n) { // ������ �����ε� �ֵ��� 22��° �ٰ� �Ȱ����� �ϴ��ϵ� �Ȱ���
		name = n;
	}
	
	public PersonTest(String n, int a) { // ������ �����ε� 26��° �ٰ� �Ȱ����� 
		name = n;
		age = a;
	}
	
	public void setName(String n) {	// setter ������
		name = n;
	}
	
	public void setData(String n, int a) { // setter ������
		name = n;
		age = a;
	}
	public void setData() {
	
	}
	
	public String getName(){
		return name;
	}
	public int getAge() {
		return age;
	}
}

public class PersonMain { // public�� ���尳�� �ϳ����ۿ� �ȵ�
	public static void main(String[] args) { //main ���α׷��� ������
		PersonTest aa; // Ŭ���� ���� X, - ��ü
		//aa = new PersonTest("ȫ�浿"); // new Ŭ���� + ������	// �����ֹ�
		aa = new PersonTest("ȫ�浿", 25);
		System.out.println("��ü aa ="+aa);

		System.out.println("�̸�  = "+aa.getName()+"\t ���� = "+aa.getAge());
		System.out.println();
		
		PersonTest bb = new PersonTest();
		System.out.println("��ü bb = "+bb);
		bb.setData("�ڳ�", 13);
		System.out.println("�̸�  = "+bb.getName()+"\t ���� = "+bb.getAge());
		
		PersonTest cc = new PersonTest();
		cc.setData();
		System.out.println("�̸�  = "+cc.getName()+"\t ���� = "+cc.getAge());
		
		
	}	// ��(main)

}
