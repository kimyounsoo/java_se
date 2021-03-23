package exception;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		if(args.length > 0)System.out.println(args[0]);
		
		try {
			Scanner scan = new Scanner(System.in);
			System.out.print("숫자 입력 : ");
			int num2 = scan.nextInt();
			
			int num1 = Integer.parseInt(args[0]);
			
			System.out.println(num1 + " / " + num2 + " = " + ((double)num1/num2));
		}catch(NumberFormatException e) {
			System.out.println("숫자 형태를 입력하세요");
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌수 없습니다.");
		}finally {
			System.out.println("error가 있건 없건 무조건 실행!!");
		}
	}

}
