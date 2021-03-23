package exception;

public class SnackTest extends Thread {
	private String str;		
	
	public SnackTest(String str) {
			this.str = str;
		}
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(str + "\t" + "i=" + i + "\t" + Thread.currentThread()); // Thread �޼ҵ�� Ŭ�������� �ٷο����Ƿ� static �޼ҵ�
		}
	}
	
	public static void main(String[] args) {
		SnackTest aa = new SnackTest("�����"); // ������ ����
		SnackTest bb = new SnackTest("��īĨ"); // ������ ����
		SnackTest cc = new SnackTest("��Ĩ"); // ������ ����
		
		//������ �̸� �ο�
		aa.setName("�����");
		bb.setName("��īĨ");
		cc.setName("��Ĩ");
		
		//�켱���� 1~10 (default : 5)
		aa.setPriority(10);//aa.setPriority(Thread.MAX_PRIORITY); �̷��� �ᵵ �ȴ�// static final 10 ����
		bb.setPriority(Thread.MIN_PRIORITY);// 1
		cc.setPriority(Thread.NORM_PRIORITY);// 5
		
		aa.start(); // ������ ���� -> ������ ����(run())
//		try {
//			aa.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		bb.start();
		cc.start();
		
		
		
	}

}
