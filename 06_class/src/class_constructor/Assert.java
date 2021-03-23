package class_constructor;

import java.util.Scanner;

public class Assert {
	private int x, y;
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("x 입력 : ");
		x = scan.nextInt();
		System.out.print("y 입력 : ");
		y = scan.nextInt();
	}
	public void output() {
		//y는 반드시 양수만 입력받도록 하겠다
		//assert y>=0;
		assert y>=0 : "y는 0보다 크거나 같아야 한다";
		
		int mul = 1;
		for(int i = 1; i <= y; i++) {
			mul*=x; // mul = mul * x 계속 x의 값을 곱한다 
			
		}
		
		System.out.println(x+"의 "+y+"승 "+ mul);
	}
	
	public static void main(String[] args) {
		Assert as = new Assert();
		as.input();
		as.output();
	}

}
