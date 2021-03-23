package variable;

/*
 * 변수에 저장하여 320, 258의 합을 구하시오
 * [실행결과]
 * 320 + 258 = xxx (sum)
 * 320 - 258 = xxx (sub)
 * 320 * 258 = xxx (mul)
 * 320 / 258 = 1.24 (div)
 */

 
public class CalcTest {

	public static void main(String[] args) {
		int a = 320;
		short b = 258;
		//short sum = a + b; 결과가 인트형으로 자동 변환하기 때문 error
		
		int sum = a + b;
		int sub = a - b;
		int mul = a * b;
		double div = (double)a / b; // 강제형변환 / 자동형변환
		
		//2번
		//short sum = (short)(a+b)
		
		
		System.out.println(a+" + "+b+" = "+sum);
		System.out.println(a+" - "+b+" = "+sub);
		System.out.println(a+" * "+b+" = "+mul);
		System.out.println(a+" / "+b+" = "+String.format("%.2f", div));
	}

}

