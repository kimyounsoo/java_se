package exception;

public class Synchronized extends Thread {
	private static int count;

	public static void main(String[] args) {
		Synchronized aa = new Synchronized(); // 스레드 생성
		Synchronized bb = new Synchronized();
		Synchronized cc = new Synchronized();

		aa.setName("aa");
		bb.setName("bb");
		cc.setName("cc");

		aa.start();// 스레드 시작 - 스레드 실행(run())
		bb.start();
		cc.start();
	}

	@Override
	// public synchronized void run() { // 숫자가 같은것은 동시 접근 synchronized 했지만 동기화 X
	public void run() {
		//synchronized (Synchronized.class) { // 동기화 O, ATMTest 클래스 에서는 3가지 동기화 모두 다 동기화 된다 클래스파일을 하나로 같이쓰고 있어서 그렇다
		synchronized(this) { // 동기화 X 21줄과 같은것 this 의 값은 다 다르다 aa bb cc new 했을때 나오는 것들
			for (int i = 1; i <= 5; i++) {
				count++;
				System.out.println(Thread.currentThread().getName() + " : " + count);
			} // for
		}
	}
}
