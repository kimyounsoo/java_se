package variable;

public class Variable {

	public static void main(String[] args) {
		boolean a;
		a = true;
		System.out.println("a = "+ a);
		
		char b;
		b = 'A';
		System.out.println("b = "+ b);
		
		char c;
		c = 65;
		// c = 65536;  error 65535������ �ޱ⶧��
		System.out.println("c = "+ c);
		
	    //int d;
	    //d = 54;
		int d = 65; //0100 0001
		System.out.println("d ="+ d);
		
		int e = 'A';
		System.out.println("e ="+ e);
		
		float f;
		f = 43.8f;
		//f = (float) 43.8;
		System.out.println("f = "+ f);
		
		//1��
		//43.8  double ���
		//43.8f float ���
		
		//int a
		//long b;
		// b = a; o
		// a = b; x
	}

}
