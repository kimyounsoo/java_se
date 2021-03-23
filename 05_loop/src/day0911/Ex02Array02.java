package day0911;
//Ex01 ���׷��̵����
//������ �ƴ϶� 
//������ ������ �����ϴ�
//���ѷ��� ���α׷��� �ۼ��Ͻÿ�(20�б���)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//���� 1. ó�� �Է½ÿ��� for �ݺ����� ����ؼ� 5���� �̸��� ������ ������ �� �Է��Ѵ�.
//���� 2. �Է��Ŀ��� ���ѷ����� ���ؼ�
//    ���� ���� ���� �л��� �̸��� ����, ����, ��ո� ���� �ְ� �Ѵ�.
//����:
//���� ���� �л��� ��ȣ�� �Է��ϼ���: (1�Է�)
//1�� �趯�� �л�
//����: 80�� ����: 80�� ����: 81��
//����: 241�� ���: 80.33��
//���� ���� �л��� ��ȣ�� �Է��ϼ���: (20000 �Է�)
//�߸��Է��ϼ̽��ϴ�.
//���� ���� �л��� ��ȣ�� �Է��ϼ���: (2�Է�)
//2�� �ֵ��� �л�
//����: 70�� ����: 69�� ����: 68��
//����: 207�� ���: 69��
//���� ���� �л��� ������ �Է��ϼ���: (-1�Է�)
//������ּż� �����մϴ�.
public class Ex02Array02 {
	final static int SIZE = 5;
	final static int NUMBER_OF_SUBJECTS = 3;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] nameArray = new String[SIZE];
		int[] sumArray = new int[SIZE];// ������ ����� ���ص��ȴٴ� ���
		double[] avgArray = new double[SIZE];// ������ ����� ���ص��ȴٴ� ���
		int[] korean = new int[SIZE];
	    int[] english = new int[SIZE];
	    int[] math = new int[SIZE];

		
		for(int i = 0; i < SIZE; i++) {
	         System.out.print((i+1)+"�� �л��� �̸�: ");
	         nameArray[i] = br.readLine();
	         
	         System.out.print(nameArray[i]+" �л��� ��������: ");
	         korean[i] = Integer.parseInt(br.readLine());
	         while(korean[i] < 0 || korean[i] > 100) {
	            System.out.println("�߸��Է��ϼ̽��ϴ�.");
	            System.out.print(nameArray[i]+" �л��� ��������: ");
	            korean[i] = Integer.parseInt(br.readLine());
	         }
	         System.out.print(nameArray[i]+" �л��� ��������: ");
	         english[i] = Integer.parseInt(br.readLine());
	         while(english[i] < 0 || english[i] > 100) {
	            System.out.println("�߸��Է��ϼ̽��ϴ�.");
	            System.out.print(nameArray[i]+" �л��� ��������: ");
	            english[i] = Integer.parseInt(br.readLine());
	         }
	         
	         System.out.print(nameArray[i]+" �л��� ��������: ");
	         math[i] = Integer.parseInt(br.readLine());
	         while(math[i] < 0 || math[i] > 100) {
	            System.out.println("�߸��Է��ϼ̽��ϴ�.");
	            System.out.print(nameArray[i]+" �л��� ��������: ");
	            math[i] = Integer.parseInt(br.readLine());
	         }
	         
	         sumArray[i] = korean[i]+english[i]+math[i];
	         avgArray[i] = (sumArray[i])/(double)NUMBER_OF_SUBJECTS;
	      }
		while(true) {
			System.out.println("���� ���� �л��� ��ȣ�� �Է��ϼ��� -1�� ����");
			System.out.print("> ");
			int userChoice = Integer.parseInt(br.readLine());
			
			if(userChoice == -1) {
				System.out.println(" ������ּż� �����մϴ�. ");
				break;
			
			}else if(userChoice < 1 || userChoice >SIZE) {
				System.out.println("�߸��Է��ϼ˽��ϴ�.");
				
			}else{
				int index = userChoice - 1;
				System.out.println(userChoice+" �� "+ nameArray[index]+" �л�");
				System.out.println("���� : "+korean[index]+" ����: "+english[index]+" ����: "+math[index]);
				System.out.println(" ����: "+sumArray[index]+" ���: "+String.format("%.2f",avgArray[index]));
	
			}
		}
		
		

	}

}
