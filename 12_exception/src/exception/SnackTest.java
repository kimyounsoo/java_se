package exception;

public class SnackTest extends Thread {
	private String str;		
	
	public SnackTest(String str) {
			this.str = str;
		}
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(str + "\t" + "i=" + i + "\t" + Thread.currentThread()); // Thread 메소드는 클래스명이 바로왔으므로 static 메소드
		}
	}
	
	public static void main(String[] args) {
		SnackTest aa = new SnackTest("새우깡"); // 스레드 생성
		SnackTest bb = new SnackTest("포카칩"); // 스레드 생성
		SnackTest cc = new SnackTest("썬칩"); // 스레드 생성
		
		//스레드 이름 부여
		aa.setName("새우깡");
		bb.setName("포카칩");
		cc.setName("썬칩");
		
		//우선순위 1~10 (default : 5)
		aa.setPriority(10);//aa.setPriority(Thread.MAX_PRIORITY); 이렇게 써도 된다// static final 10 고정
		bb.setPriority(Thread.MIN_PRIORITY);// 1
		cc.setPriority(Thread.NORM_PRIORITY);// 5
		
		aa.start(); // 스레드 시작 -> 스레드 실행(run())
//		try {
//			aa.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		bb.start();
		cc.start();
		
		
		
	}

}
