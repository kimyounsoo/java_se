package class_constructor;

import java.util.Scanner;

public class Assert {
	private int x, y;
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("x �Է� : ");
		x = scan.nextInt();
		System.out.print("y �Է� : ");
		y = scan.nextInt();
	}
	public void output() {
		//y�� �ݵ�� ����� �Է¹޵��� �ϰڴ�
		//assert y>=0;
		assert y>=0 : "y�� 0���� ũ�ų� ���ƾ� �Ѵ�";
		
		int mul = 1;
		for(int i = 1; i <= y; i++) {
			mul*=x; // mul = mul * x ��� x�� ���� ���Ѵ� 
			
		}
		
		System.out.println(x+"�� "+y+"�� "+ mul);
	}
	
	public static void main(String[] args) {
		Assert as = new Assert();
		as.input();
		as.output();
	}

}
