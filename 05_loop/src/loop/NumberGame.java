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
		com = (int)(Math.random()*99)+1; // 1~100���� �߻�
		//System.out.println(com);
		
		count=0;
		while(true) {
			System.out.print("���� �Է� : ");
			user = Integer.parseInt(br.readLine());
			count++;
		
			if(com > user)
				System.out.print(user+"���� Ů�ϴ�\n ");
			
			else if(com < user)
				System.out.print(user+"���� �۽��ϴ�\n ");
			
			else
				break; //while�� �����
		}//while
		
		System.out.println("������"+count+"������ ���߼̽��ϴ�");
		System.out.println("---------");
		
		System.out.println("continue(Y/N) : ");
		yn = br.readLine();
		
		if(yn.equals("n") || yn.equals("N")) break; //for�� �����
		
		}//for
		
		System.out.println("���α׷��� �����մϴ�");
	}
}
