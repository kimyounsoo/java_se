package loop;

/*
 * 난수 대문자(A~Z)를 100개 발생하여 1줄에 10개씩 출력하시오
 * 난수 65~90 사이의 숫자를 100개 발생하여 출력하시오
 * 이중A가 몇개인지 출력하시오
 */
public class ForTest3 {

	public static void main(String[] args) {
		int num;
		int count = 0;
		
		for(int i=1; i<=100; i++) {
			num=(int)(Math.random()*26)+65; //65~90 90-65+1 = 26
		System.out.printf((char)num+ " ");
		//System.out.printf("%-2c",(char)num);
		
		if(i%10==0) System.out.println();
		
		if(num == 'A') count++; //count = + 1
	}
		System.out.println();
		System.out.println("A의 개수 = "+ count);
		
}

}
