package collection;

class GenericTest2<T>{ // ���ʹ� ������ �ҷ��� �� ������ �����ڴ� �ѹ��ۿ� �ҷ����� ����
	private T a;
	
	public GenericTest2(T a) {
		this.a = a;
	}
	
	public void setA(T a) {
		this.a = a;
	}
	
	public T getA() {
		return a;
	}
}
//---------------

public class GenricMain2 {

	public static void main(String[] args) {
		GenericTest2<?> aa = new GenericTest2<String>("ȫ�浿"); // �⺻������ -Ŭ�����ȿ� �����ڰ� 1�������� �ڵ����� ����
		//<?> �� ������Ʈ�� ��ü
		//<?> �� �ٽ� ������Ʈȭ ��Ų��
		//<?> �� aa.setA("ȫ�浿"); - �ݵ�� �����ڸ� ���ؼ��� �����Ͱ� ������ �ȴ�. setA X
		//�� ���´� ���� ������ �ʴ´�
		
		String name = (String)aa.getA(); //�ڽ� = (�ڽ�)�θ�
		System.out.println("�̸�  = "+name);
		
		GenericTest2<?> bb = new GenericTest2<Integer>(25);
		int age = (int)bb.getA();// ��ü���� �⺻������ ����ȯ�� �ȵ����� unAutoBoxing�̵Ǿ ������ �ȳ���
		//		  (Integer) �νᵵ �ȴ�
		System.out.println("���� = "+age);
	}

}
