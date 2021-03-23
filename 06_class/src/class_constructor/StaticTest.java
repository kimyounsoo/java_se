package class_constructor;

public class StaticTest {
	private int a;		 //�ʵ�, �ν��Ͻ� ���� 11���� �� �ʱ�ȭ
	private static int b;//�ʵ�, Ŭ���� ����	7���� �ʱ�ȭ
	
	static {
		System.out.println("�ʱ�ȭ ����"); // static �� static �������� �ʱ�ȭ
		b=3;
	}
	
	public StaticTest() {
		System.out.println("�⺻ ������"); // ��� �⺻������ ���� �ʱ�ȭ
		this.a = 3; // �ʱ�ȭ
		
	}
	
	public void calc() {
		a++;
		b++;
	}
	
	public void disp() {
		System.out.println("a="+this.a+"\t b="+StaticTest.b); // a �տ���this. �� ����, b�տ��� StaticTest������ �Ǿ��ִ� ���̴�
	}
	
	public static void output() {
		//System.out.println("a =" + this.a + "\t b=" +StaticTest.b); - error
		// static �޼ҵ� �ȿ����� static ������ ��� �����ϴ� this super �Ѵ� �Ұ���
		System.out.println("static method...");
	}

	public static void main(String[] args) {
		StaticTest st = new StaticTest();
		st.calc();
		st.disp();
		System.out.println();
		
		StaticTest st2 = new StaticTest();
		st2.calc();
		st2.disp();
		System.out.println();
		
		StaticTest st3 = new StaticTest(); // a�� static �� ��� 
		st3.calc();						   // new ���ٶ����� ���ο� �޸𸮿� ��� ������ֱ� ������ 
		st3.disp();						   // ���� 1�� ���´� b�� ���� �޸� ������ ��� �������� ������ �����Ѵ�
		System.out.println();			   // st.a st2.a st3.a �� ���� ������ �� �ٸ� ������ �ִ� a �̱⶧���� ���� a�� �ƴϴ�
										   // st.b st2.b st3.b �� ���� �ٸ����� ���������� �ִ� b�̱⶧���� b�� �� ���� b�̴�
		System.out.println("static �޼ҵ� ȣ��");
		StaticTest.output();  // �̷��� �ص� ������
		output();			  // StaticTest �����̱⶧���� �̷��� �ᵵ�ȴ�
		st.output();
		st2.output();	 	  // a�� b�� ��� ��ü�� �����ϱ⶧���� �ᵵ�ȴ�
		st3.output();
	}									   
	
}//class StaticTest
