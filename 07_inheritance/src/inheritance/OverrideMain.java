package inheritance;

class Test {
	int a=3;
	
	public void disp() {
		a += 5; // a = a + 5
		System.out.println("Test : a = "+a);
	}
}

class Sample extends Test{
	int a=8;
	
	@Override
	public void disp() {
		a += 5; // a = a + 5 
		System.out.println("Sample : a = "+a);
	}
}

public class OverrideMain {
	public static void main(String[] args) {
		Sample aa = new Sample(); // Test �⺻������ -> Sample �⺻ ������ ȣ��
		aa.disp(); //Sample Ŭ������ disp() ȣ��
		System.out.println("aa : "+ aa.a);
		System.out.println();
		
		Test bb = new Sample(); //�θ� = �ڽ�
		bb.disp(); //Sample Ŭ������ disp() ȣ��, �������̵� �Ʊ⶧����
		System.out.println("bb : "+ bb.a); //Test Ŭ������ �ʵ� a�� �ȴ�
		System.out.println();
		
		Sample dd = (Sample)bb;//�ڽ� = (�ڽ�)�θ� �ڽ��� �θ� �����ϱ� ���ؼ��� ����ȯ�� �ʿ��ϴ�
		dd.disp();			   // Sample dd = bb; x �׳��� �����Ҽ� ����
		System.out.println("dd : " + dd.a);
		System.out.println();
		
		Test cc = new Test();
		cc.disp(); //Test Ŭ������ disp() ȣ��
		System.out.println("cc : "+ cc.a);
		System.out.println();
		
		//Sample ee = (Sample)cc; //�ڽ� = (�ڽ�)�θ�
		//����� ���� �޸𸮰� �������־ �����Ͽ� �ٽü���
		
		
		
	}

}

