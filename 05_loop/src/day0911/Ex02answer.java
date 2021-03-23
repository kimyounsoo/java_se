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
//      ���� ���� ���� �л��� �̸��� ����, ����, ��ո� ���� �ְ� �Ѵ�.
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

public class Ex02answer {
   final static int SIZE = 5;
   final static int NUMBER_OF_SUBJECTS = 3;
   public static void main(String[] args) throws IOException {
      String[] nameArray = new String[SIZE];
      int[] koreanArray = new int[SIZE];
      int[] englishArray = new int[SIZE];
      int[] mathArray = new int[SIZE];
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      for(int i = 0; i < SIZE; i++) {
         System.out.print((i+1)+"�� �л��� �̸�: ");
         nameArray[i] = bufferedReader.readLine();
         
         System.out.print((i+1)+"�� �л��� ��������: ");
         koreanArray[i] = Integer.parseInt(bufferedReader.readLine());
         while(koreanArray[i] < 0 || koreanArray[i] > 100) {
            System.out.println("�߸��Է��ϼ̽��ϴ�.");
            System.out.print((i+1)+"�� �л��� ��������: ");
            koreanArray[i] = Integer.parseInt(bufferedReader.readLine());
         }
         
         System.out.print((i+1)+"�� �л��� ����: ");
         englishArray[i] = Integer.parseInt(bufferedReader.readLine());
         while(englishArray[i] < 0 || englishArray[i] > 100) {
            System.out.println("�߸��Է��ϼ̽��ϴ�.");
            System.out.print((i+1)+"�� �л��� ����: ");
            englishArray[i] = Integer.parseInt(bufferedReader.readLine());
         }
         
         System.out.print((i+1)+"�� �л��� ����: ");
         mathArray[i] = Integer.parseInt(bufferedReader.readLine());
         while(mathArray[i] < 0 || mathArray[i] > 100) {
            System.out.println("�߸��Է��ϼ̽��ϴ�.");
            System.out.print((i+1)+"�� �л��� ����: ");
            mathArray[i] = Integer.parseInt(bufferedReader.readLine());
         }
      }
      
      //�л��� ���� ����� ����ϴ� ���� ����
      while(true) {
         System.out.println("����� ���ϴ� �л��� ��ȣ�� �Է��ϼ��� (-1�� ����)");
         System.out.print("> ");
         int userChoice = Integer.parseInt(bufferedReader.readLine());
         if(userChoice == -1) {
            //�޽��� ����� ����
            System.out.println("������ּż� �����մϴ�.");
            break;
            
         }else if(userChoice <=0 || userChoice > SIZE) {
            //�߸��� �Է� �޽��� ���
            System.out.println("�߸� �Է��ϼ̽��ϴ�.");
            
         }else {
            //userChoice�� �ε����� ��ȯ�ϰ� 
            //�ش� �ε����� �л� ������ ���
            int index = userChoice - 1; //1�� �л��̸� 0���� ������ �ҷ��;��ϱ� ����
            int sum = koreanArray[index] + englishArray[index] + mathArray[index];
            double average = sum / (double)NUMBER_OF_SUBJECTS;
            System.out.print(userChoice+"�� ");
            System.out.println(nameArray[index]+"�л��� ����");
            
            System.out.printf("����: %d�� ����: %d�� ����: %d��\n", koreanArray[index], englishArray[index], mathArray[index]);
            System.out.printf("����: %d�� ���: %.2f��\n", sum, average);
         }
      }
      
   }
}
















