package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ATMTest implements Runnable{
	private long depositeMoney = 100000; // 잔액
	private long balance; // 찾고자 하는 금액
	
	public static void main(String[] args) {
		ATMTest atm = new ATMTest();
		Thread mom = new Thread(atm, "엄마"); // 스태틱 구역에는 this 안된다 스태틱은 클래스 소속이아니기떄문에
		Thread son = new Thread(atm, "아들"); // atm 공유 new ATMTest() 를 넣으면 스레드 생성은 됐지만 공유가 안되서 충돌이 안된다
		//mom.setName("엄마"); 위 두줄과 같은 방식
		//son.setName("아들");
		mom.start();//스레드 시작 - 스레드 실행(run())
		son.start();
	}	

	@Override
	public synchronized void run() { //throws IOException{ //오버라이드 된곳은 쓰로우스 안된다 트라이캐치로 처리
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(Thread.currentThread().getName()+"님 안녕하세요");
		
		System.out.print("찾고자 하는 금액 입력 : ");
		try {
			balance = Long.parseLong(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//잔액계산
		if(depositeMoney >= balance) {
			if(balance%10000==0) {
				depositeMoney-=balance;
				System.out.println("잔액은 "+depositeMoney+"원 입니다");
			
		}else {
			System.out.println("만원 단위로 입력 하세요.");
		}
	}else {
		
		System.out.println("잔액이 부족 합니다.");
	}	

		
	}

}

