package loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 ���ϱ� ���� ���α׷�
 10~99 ������ ������ 2��(a, b) �߻��Ͽ� ���� ���ϴ� ���α׷�
 �������� �� 5������ �����Ѵ� - for ?????
 1������ ���� 20���� ���
 
 [������]
 [1] 25 + 36 = 45
 Ʋ�ȴ�
 
 [2] 78 + 10 = 88
 ������
 
 [3] 12 + 25 = 37
 ������
 
 ����� �� x������ ���߾ xx�� �Դϴ�
 */
public class AddGame {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a, b;
		int i;
		int count=0;
		String yn;
		
		while(true) {
		for(i=1; i<=5; i++) {
			a = (int)(Math.random()*90)+10;//10~99
			b = (int)(Math.random()*90)+10;
			
		
		
        System.out.print("["+ i +"] " + a +" + " + b + " = "  );
        int user = Integer.parseInt(br.readLine());
        
        if(a+b==user) {
        	System.out.println("����");
        	count++;
        }else if((a+b)!=user){
        	System.out.println("����");
        	
        }else 
        	break;
        	
        	
        	
        }//for
		System.out.println();
        System.out.println("��� ��" +" "+ count+" " + "������ ���߾�" +" "+ count*20+" " + "�� �Դϴ�.");

        while(true) {
			System.out.println("����Ͻðڽ��ϱ�?(Y/N) : ");
			yn = br.readLine();
			
			if(yn.equals("y")||yn.equals("Y")||yn.equals("n")||yn.equals("N")) break;
			else System.out.println("�߸��� �����Դϴ�.");
		}//while	
		
		if(yn.equals("n")||yn.equals("N"))break;
			
		
		} //while
		System.out.println("���α׷��� �����մϴ�.");

	}
}
