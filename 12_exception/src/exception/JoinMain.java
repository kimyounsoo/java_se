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
		System.out.println("스레드 시작");
		t.start();
		try {
			t.join(); // join을쓰면 순서의 방향데로 실행된다.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("스레드 종료");
		//main이 끝나도 백그라운드에서 스레드는 돌아가기 때문에 스레드는 종료되지 않는다.
		//
	}
}
