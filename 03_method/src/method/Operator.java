package method;

public class Operator {

	public static void main(String[] args) {
		int a = 0;
		a += 5; // a = a + 5 
		a *= 2; // a = a * 2
		a -= 3; // a = a - 3
		System.out.println("a = "+a); // a = 7
		
		a++; // a = a + 1
		
		System.out.println("a = "+a); // a = 8
		
		int b = a++;
		//int b = a;  ��ü �� ���� �� �� ��
		//a++;
		System.out.println("a = "+a+ " b = "+b); //a=9 b=8
		
		int c = ++a;
		//++a;
		//int c = a; ��ü �� ���� �� �� ��
		System.out.println("a = "+a+ " c = "+c);
		
		int d = ++a - b--;
		//++a;
		//int d= a - b; ��ü �� ���� �� �� ��
		//b--;
		System.out.println("a = "+a+ " b = "+b+ " d = "+d); //a=11 b=7 d=3
		
		System.out.println("a++ = " + a++);
		
		//System.out.println("a++ = " + a); //��ü �� ���� �� �� �� 11
		//a++;							  //12
		
		
		
		System.out.println("a = "+a); //12
		
		System.out.println("++a = " + ++a);

	}

}

