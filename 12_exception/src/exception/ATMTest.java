package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ATMTest implements Runnable{
	private long depositeMoney = 100000; // �ܾ�
	private long balance; // ã���� �ϴ� �ݾ�
	
	public static void main(String[] args) {
		ATMTest atm = new ATMTest();
		Thread mom = new Thread(atm, "����"); // ����ƽ �������� this �ȵȴ� ����ƽ�� Ŭ���� �Ҽ��̾ƴϱ⋚����
		Thread son = new Thread(atm, "�Ƶ�"); // atm ���� new ATMTest() �� ������ ������ ������ ������ ������ �ȵǼ� �浹�� �ȵȴ�
		//mom.setName("����"); �� ���ٰ� ���� ���
		//son.setName("�Ƶ�");
		mom.start();//������ ���� - ������ ����(run())
		son.start();
	}	

	@Override
	public synchronized void run() { //throws IOException{ //�������̵� �Ȱ��� ���ο콺 �ȵȴ� Ʈ����ĳġ�� ó��
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(Thread.currentThread().getName()+"�� �ȳ��ϼ���");
		
		System.out.print("ã���� �ϴ� �ݾ� �Է� : ");
		try {
			balance = Long.parseLong(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//�ܾװ��
		if(depositeMoney >= balance) {
			if(balance%10000==0) {
				depositeMoney-=balance;
				System.out.println("�ܾ��� "+depositeMoney+"�� �Դϴ�");
			
		}else {
			System.out.println("���� ������ �Է� �ϼ���.");
		}
	}else {
		
		System.out.println("�ܾ��� ���� �մϴ�.");
	}	

		
	}

}

