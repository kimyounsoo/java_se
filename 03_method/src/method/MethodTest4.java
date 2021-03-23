package method;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Random;
//import 는 알려주는것

public class MethodTest4 {

	public static void main(String[] args) throws IOException {
		System.out.println(Math.abs(-25));
		
		//난수 - 컴퓨터가 무작위로 발생하는 수, 0 <= 난수 < 1
		System.out.println("난수 = " + Math.random());
		
		//난수만 처리 하는 클래스
		Random r = new Random(); //생성
		System.out.println("난수 = " + r.nextDouble());
		
		//숫자를 3자리마다 , 찍기
		int xx = 2131231244;
		
		DecimalFormat df = new DecimalFormat();
		System.out.println(df.format(xx));
		
		//키보드 입력 - 1개의 문자
		System.out.print("데이터 a : ");
		char a = (char)System.in.read(); //지역변수
		
		//flush - 버퍼 비우기
		System.in.read();
		System.in.read();
		
		System.out.print("데이터 b : ");
		char b = (char)System.in.read();
		System.out.println("결과 = " + a + "\t" + b);
		
		//사용자 정의 함수 - a와 b중에서 큰 값을 출력하는 메소드 작성
		MethodTest4 mt = new MethodTest4();
		char max = mt.big(a, b);
		System.out.println("큰 값 = " + max);
		
	}
	
	public char big(char a, char b) { //구현, parameter(매개변수), argument(인수)
		return a >=b ? a : b;
			
		}
	}



//엔터 - 커서를 맨 앞으로 이동  \r
//   - 다음 줄 이동                 \n
