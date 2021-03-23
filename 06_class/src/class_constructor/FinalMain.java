package class_constructor;

public class FinalMain {
	public final String FRUIT = "���"; // �ʱⰪ�� �̷��� ���̷�Ʈ�� �൵������
	private final String FRUIT2;	  // public�� ���̾��� 
	
	public static final String ANIMAL = "����"; // final �� ������ �̸��� �ٲܼ� ���� �س��� �� �̱⶧���� public ���� ���̾��� private ������� ����.
	public static final String ANIMAL2;
	static {	//����ƽ �ʱ�ȭ���� �̷��� �Ҽ����ִ� ����ƽ�ʱ�ȭ�� ����ƽ ���������� �Ҽ��ִ�
		ANIMAL2 = "�⸰";	
	}
	
	public FinalMain() {
		FRUIT2 = "����";					// �⺻�����ڷ� �ʱⰪ�� �ο����ټ��� �ִ�
	}

	public static void main(String[] args) {
		final int AGE = 10;
		//AGE++; - error, final �� ���̸� ���� �� ���»���� �Ǳ� ������ ������ �߻�
		System.out.println("��� = " + AGE);
		
		final int AGE2;
		AGE2 = 20; // ����� �ݵ�� �ʱⰪ�� �ʿ��ϴ�
		//AGE2 = 30; - error �ѹ� ���� �������ױ⶧���� ����
		
		FinalMain fm = new FinalMain(); // ����� �θ������ؼ��� �ݵ�� Ŭ������ �����ؾ��Ѵ�
		System.out.println("FRUIT = " + fm.FRUIT);
		System.out.println("FRUIT = " + fm.FRUIT2);
		
		System.out.println("ANIMAL = " + FinalMain.ANIMAL); // fm.ANIMAL �ص��ȴ�
															// static �̶� new���ϰ� �ٷ������ص� �ȴ�
		System.out.println("ANIMAL = " + FinalMain.ANIMAL2);


	}

}
//�θ� Ŭ������ �޼ҵ忡 final �� ���̸� �������̵尡 �ȵǰ�
//�θ� Ŭ������ final �� ���̸� ����� �ȵȴ�
