package if_switch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 3개의 숫자 (a,b,c)를 입력받아서 순서대로 출력하시오
 */
public class IfTest3 {

	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a, b, c;
		
		System.out.print(" a 입력 : ");
		a = Integer.parseInt(br.readLine());
		System.out.print(" b 입력 : ");
		b = Integer.parseInt(br.readLine());
		System.out.print(" c 입력 : ");
		c = Integer.parseInt(br.readLine());
		
		if (a<b && a<c) {  //a가 가장 작다면
			if(b<c) System.out.println(a+", "+b+", "+c);
			else System.out.println(a+", "+c+", "+b);
			
		}else if(b<c) { //a가 가장 작지가 않다, b가 가장 작다면
			if(a<c) System.out.println(b+", "+a+", "+c);
			else System.out.println(b+", "+c+", "+a);
		
		}else { // a도 b도 가장 작지가 않다, c가 가장 작다면
			if(a<b) System.out.println(c+", "+a+", "+b);
			else System.out.println(c+", "+b+", "+a);
		}
	

	}

}
/*
 * else
그냥 거짓일 때...이구요
else if 이건 거짓이면 한번 조건을 물어보는 거여요

 */
