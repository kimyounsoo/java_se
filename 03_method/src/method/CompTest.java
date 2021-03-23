package method;

public class CompTest {

	public static void main(String[] args) {
		int score = 1;
		String result = score>=80 && score<=100 ? "합격" : "불합격";        
		System.out.println("결과  = "+result);
		System.out.println();
		
		//score의 값이 짝수(2로 나눈 나머지가 0이면)이면 "짝수" 아니면 "홀수"
		result = score%2 == 0 ? "짝수" : "홀수";
		System.out.println("결과  = "+result);
		System.out.println();
		
		// a, b중에서 큰 값을 출력하시오
		int a=30, b=25;
		//만약에 a가 b보다 크다면
		//int big = a > b ? a : b;
	    //System.out.println("결과  = "+big);
		System.out.println("큰 값 = " + Math.max(a,b));
		System.out.println("작은 값 = " + Math.min(a, b));
		System.out.println("제곱 = " + Math.pow(1.0, 5.0));
		
		double p = Math.pow(2.0, 5.0);
		System.out.println("제곱 = "+ p);
		
		
		
		
		int c = 15;
		//result = c가 2와 3의 공배수(2로 나누어 떨어지고 3으로도 나누어 떨어진다) "2와3의 공배수" : "2와3의 공배수가 아니다";
		result = c%2==0 && c%3==0  ? "2와3의 공배수" : "2와3의 공배수가 아니다";
		System.out.println("결과  = "+result);
		System.out.println();
		
		
				
	}

}
