package method;
/*
 * 금액(money)이 5679원일때 다음과 같이 출력하시오 (% 나머지 연산자로 풀어주세요)

[실행결과]
금액 : 5679원
천원 : 5장
백원 : 6개
십원 : 7개
일원 : 9개
 */
public class Money {

	public static void main(String[] args) {
		int money = 5679;
		System.out.println("금액 : "+money);
		System.out.println("천원 : "+money/1000+"장");
		money=money%1000;
		System.out.println("백원 : "+money/100+"개");
		money=money%100;
		System.out.println("십원 : "+money/10+"개");
		System.out.println("일원 : "+money%10+"개");
		
		
		

	}

}
