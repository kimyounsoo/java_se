package if_switch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*3과목(a,b,c)의 점수를 입력받아서 합격인지 불합격인지 출력하시오
합격은 평균이 60점 이상이어야 하고 각 과목이 40점 이상이어야 한다

[실행결과]
a : 98
b : 90
c : 85
합격

a : 98
b : 90
c : 35
과락으로 불합격 

a : 68
b : 50
c : 45
불합격 
 * 
 */
public class IfTest2 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a, b, c;
		System.out.print(" a 입력 : ");
		a = Integer.parseInt(br.readLine());
		System.out.print(" b 입력 : ");
		b = Integer.parseInt(br.readLine());
		System.out.print(" c 입력 : ");
		c = Integer.parseInt(br.readLine());
		
		double avg = (double)(a+b+c)/3;
		
		if (avg>=60) {
			if(a>=40 && b>=40 && c>=40) { 
			System.out.println("합격");
			}else {
			System.out.println("과락으로 불합격");}
		
		}else {
			System.out.println("불합격");
		
		}
		
		

	}

}


//(double)(a + b+ c) / 3 => 실수형 나누기 정수형
//271.0 / 3 => 90.3333333
//(double)((a + b + c) /3) => 정수형 나누기 정수형   다르게 나옴
//                270 / 3
