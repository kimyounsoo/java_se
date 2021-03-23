package day0914;
//�� ����, ������ ������ ���� �����ϴ� ���α׷��� �ۼ��غ�����
//���� �� ������ 4���Դϴ�.
//�� ���� �ִ� �л����� 10���Դϴ�.
//���� �Է��� �ȵȹ���
//�Է��� �ȵǾ��ٰ� ��µǰ� �ϼ���.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//�Է��� �����ϸ�
//������� �Է��� �ް�
//�׸��� �׹� �л����� ������ ������ ���ʴ�� �Է¹ް� �ϼ���.
public class Ex03MultiArray02 {
	final static int STUDENT_SIZE = 10;
	final static int CLASS_NUMBER = 4;
	public static void main(String[] args) throws NumberFormatException, IOException {
		String[][] nameArray = new String[4][];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] korArray = new int [4][];
		int[][]	engArray = new int [4][];
		int[][]	mathArray = new int [4][];
		
		while(true) {
			System.out.println("��Ʈ����б� �̸� ���� ���α׷�");
			System.out.println("1. �Է� 2. ��� 3. ����");
			System.out.println("> ");
			int choice = Integer.parseInt(br.readLine());
			if(choice == 1) {
				int ban = selectBan(br);
				int stSize = stSizenumber(br);
	           
				korArray[ban] = new int[stSize];
	            engArray[ban] = new int[stSize];
	            mathArray[ban] = new int[stSize];
				
				
				for(int i = 0; i < korArray[ban].length; i++) {
		               System.out.println((i+1)+"�� �л��� ���� �Է�");
		             
				        korArray[ban-1][stSize-1] = validateScore(br,1);
						engArray[ban-1][stSize-1] = validateScore(br,2); 
						mathArray[ban-1][stSize-1] = validateScore(br,3);}
			
			}else if(choice == 2) {
				
			}else if(choice == 3) {
				System.out.println("������ּż� �����մϴ�.");
				break;
			}
		}

	}
	static int selectBan(BufferedReader bufferedReader) throws NumberFormatException, IOException {
	      System.out.println("���� �������ּ���: ");
	      System.out.print("> ");
	      int ban = Integer.parseInt(bufferedReader.readLine());
	      while(ban < 1 || ban > CLASS_NUMBER) {
	         System.out.println("�߸��� �Է��Դϴ�.");
	         System.out.println("���� �������ּ���");
	         System.out.println("> ");
	         ban = Integer.parseInt(bufferedReader.readLine());

	      }
	      return ban-1;
	}
	static int stSizenumber(BufferedReader bufferedReader) throws NumberFormatException, IOException {
		System.out.println("�л��� ���ڸ� �Է����ּ���: ");
		int stSize = Integer.parseInt(bufferedReader.readLine());
		while(stSize < 0 || stSize > STUDENT_SIZE) {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
			System.out.println("�л��� ���ڸ� �Է��� �ּ���: ");
			System.out.println("> ");
			stSize = Integer.parseInt(bufferedReader.readLine());
		}
		return stSize; //�ε����� �ƴ϶� ũ��� -1 �����ʿ䰡���� (??)
	}
	static int validateScore(BufferedReader br, int code) throws NumberFormatException, IOException {
	      String message = new String();
	      switch(code) {
	      case 1:
	         message = "���� ������ �Է����ּ���: ";
	         break;
	      case 2:
	         message = "���� ������ �Է����ּ���: ";
	         break;
	      case 3:
	         message = "���� ������ �Է����ּ���: ";
	         break;
	      }
	      System.out.print(message);
	      int score = Integer.parseInt(br.readLine());
	      
	      while(score < 0 || score > 100) {
	         System.out.println("�߸��Է��ϼ̽��ϴ�.");
	         System.out.print(message);
	         score = Integer.parseInt(br.readLine());
	      }
	      return score;
}
}
