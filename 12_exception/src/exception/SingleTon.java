package exception;

public class SingleTon {
	private int num = 3;
	private static SingleTon instance = null;
	
	public static SingleTon getInstance(){ // �̸��� �ٲ㵵 ������ �Ϲ������� �̷��Ծ��� �̱��� �޼ҵ��̸��̴�
		if(instance == null) {
			synchronized (SingleTon.class) {
				instance = new SingleTon();
			}
		}
		
		return instance;
	}
	
	public static void main(String[] args) {
		SingleTon aa = new SingleTon();
		aa.num++;
		System.out.println("aa = " + aa);
		System.out.println("num = "+ aa.num);
		System.out.println();
		
		SingleTon bb = new SingleTon();
		bb.num++;
		System.out.println("bb = " + bb);
		System.out.println("num = " + bb.num);
		System.out.println();
		
		System.out.println("** �̱��� **");
		SingleTon cc = SingleTon.getInstance();//����
		cc.num++;
		System.out.println("cc = " + cc);
		System.out.println("num = "+ cc.num);
		System.out.println();
		
		SingleTon dd = SingleTon.getInstance();//���� �̱����� ������ �ּҰ��� ���� Ŭ������ ��� �̾����� ���� �þ��
		dd.num++;
		System.out.println("dd = " + dd);
		System.out.println("num = "+ dd.num);
		System.out.println();
		
	}


}
