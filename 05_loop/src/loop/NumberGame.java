package loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberGame {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int com, user, count;
		String yn;
		
		for(;;){
		com = (int)(Math.random()*99)+1; // 1~100난수 발생
		//System.out.println(com);
		
		count=0;
		while(true) {
			System.out.print("숫자 입력 : ");
			user = Integer.parseInt(br.readLine());
			count++;
		
			if(com > user)
				System.out.print(user+"보다 큽니다\n ");
			
			else if(com < user)
				System.out.print(user+"보다 작습니다\n ");
			
			else
				break; //while를 벗어나라
		}//while
		
		System.out.println("딩동뎅"+count+"번만에 맞추셨습니다");
		System.out.println("---------");
		
		System.out.println("continue(Y/N) : ");
		yn = br.readLine();
		
		if(yn.equals("n") || yn.equals("N")) break; //for를 벗어나라
		
		}//for
		
		System.out.println("프로그램을 종료합니다");
	}
}
