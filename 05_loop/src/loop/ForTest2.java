package loop;

import java.io.IOException;

/*원하는 단을 입력 : 2  ← System.in.read()
2*1=2
2*2=4
2*3=6
2*4=8
2*5=10
2*6=12
2*7=14
2*8=16
2*9=18
 * 
 */
public class ForTest2 {

	public static void main(String[] args)throws IOException {
		int dan;
		System.out.println("원하는 단을 입력 :");
		dan = System.in.read()-'0';
		int i;
		for(i=1; i<=9; i++) {
			System.out.println(dan+"*"+i+"="+dan*i);
			
		}

	}

}
