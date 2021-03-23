package nested;

public class Outer { //�޴���
	private String name;
	
	public void output() { // �ƿ�ǲ�� �ҷ��������� �޸𸮸� ��Ӹ����
		Inner in = new Inner(); // �̳�Ŭ������ ������ ��ü ������ ������Ѵ�
		System.out.println("�̸� = "+name+"\t ���� = "+in.age);
		//���� ���ٰ� ���� ��
		//System.out.println("�̸� = "+name+"\t ���� = "+new Inner().age);
	}
	class Inner {
		private int age;
		
		public void disp() {
			System.out.println("�̸�1 = "+name+"\t ����1 = "+age); //�̳�Ŭ������ �ƿ��� Ŭ������ ���� �����Ӱ� ����Ҽ� �ִ� (��ü���� x)
		}
	}
	public static void main(String[] args) { //static
		Outer ou = new Outer();
		ou.name = "ȫ�浿";
		ou.output();
		System.out.println();
		
		//�ƿ��� ���� �̳� 	 ou �ȿ� �ʱ�ȭ
		Outer.Inner in = ou.new Inner();
		in.age = 25;
		in.disp();
		ou.output();
		//ou.disp(); �θ��� ����
		//in.output(); �θ��� ����
		System.out.println();
		
		Outer.Inner in2 = ou.new Inner();
		in2.age = 30;
		in2.disp();
		System.out.println();
		
		//?? ������ �˰���
		Outer.Inner in3 = new Outer().new Inner();
		in3.age = 35;
		in3.disp();

	}

}//class Outer

//����� new �ڽ�() �ϸ� �޸𸮿���
//�θ� + �ڽ� �� ����������
//�̳� Ŭ������ Outer ou = new Outer(); �ϸ� �޸𸮿� Inner Ŭ������ �������� �ʴ´�

