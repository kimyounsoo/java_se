package inheritance;

public class SuperTest {
	protected double weight;
	protected double height;
	
	public SuperTest() {
		System.out.println("SuperTest �⺻ ������");
	}
	public SuperTest(double weight, double height) { //�Ķ���� �ŰԺ����� 1:1 �������� ���ε��� ����־���Ѵ�
		System.out.println("SuperTest ������");
		this.weight = weight;						// �����ڰ��������� ���� �⺻�����ڰ� �� �־���Ѵ�
		this.height = height;
	}
	
	public void disp() {
		System.out.println("SuperTestŬ������ disp()");
		System.out.println("������ = " +weight);
		System.out.println("Ű = " +height);
	}

}


