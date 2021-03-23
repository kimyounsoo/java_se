package exception;

class JoinTest implements Runnable {

	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		}//for
		
	}
	

//---------
public class JoinMain {
	
	public static void main(String[] args) {
		JoinTest jt = new JoinTest();
		Thread t = new Thread(jt);
		System.out.println("������ ����");
		t.start();
		try {
			t.join(); // join������ ������ ���ⵥ�� ����ȴ�.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("������ ����");
		//main�� ������ ��׶��忡�� ������� ���ư��� ������ ������� ������� �ʴ´�.
		//
	}
}
