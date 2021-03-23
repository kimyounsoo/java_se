package loop;

import java.io.IOException;

/*
 * 거듭제곱을 구하시오
x의 y승을 계산하시오

[실행결과]
x값 입력 : 2
y값 입력 : 5
2의 5승 xx   (2*2*2*2*2)
			1 2 3 4 5 
x값 입력 : 3
y값 입력 : 4
3의 4승 xx   (3*3*3*3)
 *///			1 2 3 4
public class ForTest5 {

	public static void main(String[] args)throws IOException {
	int x, y, mul;	
	
	for(int j=1; j<=2; j++) {
		System.out.print("x값 입력 : ");
		x = System.in.read()-48; //1개의 문자
		System.in.read();//버퍼비우기
		System.in.read();//버퍼비우기
		
		System.out.print("y값 입력 : ");
		y = System.in.read()-'0';
		System.in.read();//버퍼비우기
		System.in.read();//버퍼비우기
		
		//System.out.println(x+"\t"+y); 디버깅
		mul = 1;
		for(int i=1; i<=y; i++) { //1, 2, 3, 4 => i 반복횟수
			mul *=x;//mul = mul*x //3* 3* 3* 3
		}
		
		System.out.println(x+"의 "+y+"승은 "+mul);
		System.out.println("-------------------");
		
		System.out.print("x값 입력 : ");
		x = System.in.read()-48; //1개의 문자
		System.in.read();//버퍼비우기
		System.in.read();//버퍼비우기
		
		System.out.print("y값 입력 : ");
		y = System.in.read()-'0';
		System.in.read();//버퍼비우기
		System.in.read();//버퍼비우기
		
		//System.out.println(x+"\t"+y); 디버깅
		mul = 1;
		for(int i=1; i<=y; i++) { //1, 2, 3, 4 => i 반복횟수
			mul *=x;//mul = mul*x //3* 3* 3* 3
		}
		
		System.out.println(x+"의 "+y+"승은 "+mul);
		System.out.println("------------");
		
		System.out.print("x값 입력 : ");
		x = System.in.read()-48; //1개의 문자
		System.in.read();//버퍼비우기
		System.in.read();//버퍼비우기
		
		System.out.print("y값 입력 : ");
		y = System.in.read()-'0';
		System.in.read();//버퍼비우기
		System.in.read();//버퍼비우기
		
		//System.out.println(x+"\t"+y); 디버깅
		mul = 1;
		for(int i=1; i<=y; i++) { //1, 2, 3, 4 => i 반복횟수
			mul *=x;//mul = mul*x //3* 3* 3* 3
		}//for i
		
		System.out.println(x+"의 "+y+"승은 "+mul);
		
		


	}//for j

	}
}
