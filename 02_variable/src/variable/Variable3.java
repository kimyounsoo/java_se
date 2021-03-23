package variable;

public class Variable3 {
         int a; //필드
         static int b; // 매니저 선생님
	
       public static void main(String[] args) {
		int a = 10; //지역변수
		System.out.println("지역변수 a ="+a);
		
		Variable3 v; //객체
		v = new Variable3();
		System.out.println("필드 a =" + v.a);
		v.a = 20;
		System.out.println("필드 a =" + v.a);
		
		Variable3 v2; //객체
		v2 = new Variable3();
		System.out.println("필드 a =" + v2.a);
		
		int sum = v.a + v2.a;
		System.out.println("합 = " + sum);

		System.out.println("필드 b = " + Variable3.b);
		System.out.println("필드 b = " + b);
		System.out.println("필드 b = " + v.b);
		
	}

}
