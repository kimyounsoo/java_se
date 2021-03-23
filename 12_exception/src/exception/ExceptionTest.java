package exception;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		if(args.length > 0)System.out.println(args[0]);
		
		try {
			Scanner scan = new Scanner(System.in);
			System.out.print("���� �Է� : ");
			int num2 = scan.nextInt();
			
			int num1 = Integer.parseInt(args[0]);
			
			System.out.println(num1 + " / " + num2 + " = " + ((double)num1/num2));
		}catch(NumberFormatException e) {
			System.out.println("���� ���¸� �Է��ϼ���");
		}catch(ArithmeticException e) {
			System.out.println("0���� ������ �����ϴ�.");
		}finally {
			System.out.println("error�� �ְ� ���� ������ ����!!");
		}
	}

}
