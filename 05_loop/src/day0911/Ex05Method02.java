package day0911;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//����Ÿ���� ���� �޼ҵ�
//�׸��� �޼ҵ� �߰��� �����ϴ� �޼ҵ�
public class Ex05Method02 {
   //1. ���� Ÿ���� ���� �޼ҵ�
   //   �ƹ��͵� �������� ���� ������ void��� �����ְ�
   //   ���� �׷��� ��쿣 return ��ɾ ���� �ʴ´�.
   static void showMenu() {
      System.out.println("----------------------");
      System.out.println("��Ʈ����б� �������� ���α׷�");
      System.out.println("\t1. �Է�");
      System.out.println("\t2. ���");
      System.out.println("\t3. ����");
   }
   public static void main(String[] args) throws NumberFormatException, IOException {
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      int korean = 0, math = 0, english = 0;
      String name = new String();
      while(true) {
         showMenu();
         int userChoice = Integer.parseInt(bufferedReader.readLine());
         if(userChoice == 1) {
            //�Է� �޼ҵ� ����
            
            // ������ �Է¹޾Ƽ� ��ȿ�� ������ �������ִ� �޼ҵ带 ����
            // ������ ������ �Է� ��Ű�ÿ�
            System.out.print("�̸�: ");
            name = bufferedReader.readLine();
            
            System.out.print("���� ");
            korean = vs(bufferedReader);
            
            System.out.print("���� ");
            english = vs(bufferedReader);
            
            System.out.print("���� ");
            math = vs(bufferedReader);
         }else if(userChoice == 2) {
            //��� �޼ҵ� ����
            
            // �Ķ���ͷ� �Ѿ�� �̸�, ������ ������ 
            // ���ڰ� ����ϴ� �޼ҵ带 �ۼ��Ͻÿ�
            printScore(name, korean, english, math);
         }else if(userChoice == 3) {
            System.out.println("������ּż� �����մϴ�.");
            break;
         }
      }
   }
   static int vs(BufferedReader br) throws NumberFormatException, IOException {
      System.out.print("������ �Է��ϼ���: ");
      int score = Integer.parseInt(br.readLine());
      
      while(score < 0 || score > 100) {
         System.out.println("�߸� �Է��ϼ̽��ϴ�.");
         System.out.print("������ �Է��ϼ���: ");
         score = Integer.parseInt(br.readLine());
      }
      return score;
   }
   
   static void printScore(String name, int korean, int english, int math) {
      System.out.println("=========================");
      System.out.println("\t�̸�: "+name);
      System.out.printf("����: %d ����: %d ����: %d\n", korean, english, math);
      int sum = korean + english + math;
      double average = sum / (double)3;
      System.out.printf("����: %d ���: %.2f\n", sum, average);
   }
}








