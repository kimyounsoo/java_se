package day0910;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//while �� do while�� �������� �˾ƺ���
public class Ex01DoWhile {

	public static void main(String[] args) throws IOException {
		int number = 5;
		while(number > 5) {
			System.out.println("�ݺ��� �ɱ��?");
		}
		
		//�׿� ���ؼ� do while�� ������ �ѹ��� ������ �ȴ�.
		do {
			System.out.println("�ݺ��� �ɱ��?");
		}while(number > 5);
		
		//����ڷκ��� ���ڸ� �Է� �޵�
		//10���� ū���� ������ �ٽ��Է� �ϵ��� ������
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//while�� ����ϸ� ������ ���� �ڵ带 ������ �Ѵ�.
		System.out.print("���ڸ� �Է��ϼ���: ");
		String number2 = br.readLine();
		int stringToInt = Integer.parseInt(number2);
		
		while(stringToInt > 10) {
			//���� ����ڰ� 10���� �۰ų� ���� ���� �Է��Ѵٸ�
			//stirngToInt >10�� false�� ������ ������
			//�� while���� ������ ���� �ʴ´�.
			System.out.println("�ٽ� �Է����ּ���.");
			number2 = br.readLine();
			stringToInt = Integer.parseInt(number2);
		}
		System.out.println("����ڰ� �Է��� ��: "+number2);
		
		//do while�� ���� ����� ���� �ִ�.
		int userNumber = 0;
		do {
			if(userNumber > 10) {
			System.out.println("���ڸ� �Է����ּ���: ");
		}
		System.out.println("���ڸ� �Է����ּ���1: ");
		userNumber = Integer.parseInt(br.readLine());
	}while(userNumber > 10);
	System.out.println("userNumber: "+userNumber);
	}
}
		
	
	


