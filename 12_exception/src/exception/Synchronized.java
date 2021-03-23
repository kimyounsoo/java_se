package exception;

public class Synchronized extends Thread {
	private static int count;

	public static void main(String[] args) {
		Synchronized aa = new Synchronized(); // ������ ����
		Synchronized bb = new Synchronized();
		Synchronized cc = new Synchronized();

		aa.setName("aa");
		bb.setName("bb");
		cc.setName("cc");

		aa.start();// ������ ���� - ������ ����(run())
		bb.start();
		cc.start();
	}

	@Override
	// public synchronized void run() { // ���ڰ� �������� ���� ���� synchronized ������ ����ȭ X
	public void run() {
		//synchronized (Synchronized.class) { // ����ȭ O, ATMTest Ŭ���� ������ 3���� ����ȭ ��� �� ����ȭ �ȴ� Ŭ���������� �ϳ��� ���̾��� �־ �׷���
		synchronized(this) { // ����ȭ X 21�ٰ� ������ this �� ���� �� �ٸ��� aa bb cc new ������ ������ �͵�
			for (int i = 1; i <= 5; i++) {
				count++;
				System.out.println(Thread.currentThread().getName() + " : " + count);
			} // for
		}
	}
}
