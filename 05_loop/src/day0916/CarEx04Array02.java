package day0916;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import day0915.Car;

//
public class CarEx04Array02 {
   private static int SIZE = 3;
   public static void main(String[] args) throws NumberFormatException, IOException {
      //����ڰ� �Է��� ������ Car ��ü�� ����
      //Car�迭�� ����ִ� ĭ�� �ְ�
      //����ִ� ĭ�� ������ "�� ĭ�� �����ϴ�" ��� ������ ���α׷��� ������
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      Car[] carArray = new Car[SIZE];
      
      while(true) {
         System.out.println("1. �Է� 2. ��� 3. ����");
         int userChoice = Integer.parseInt(bufferedReader.readLine());
         //���� �Է��� ������ ��
         //��ĭ���� �ƴ����� ��� �� �� ������?
         if(userChoice == 1) {
            if(findEmptyIndex(carArray) == -1) {
               // ��ĭ�� �����Ƿ� ��� �޽����� ���
               System.out.println("��ĭ�� �����ϴ�.");
            }else {
               // ��ĭ�� �����ϱ� C ��ü �� ���������
               Car c = new Car();

                System.out.print("���� ��ȣ: ");
               c.setNumber(bufferedReader.readLine());
               
               System.out.print("���� ����: ");
               c.setType(bufferedReader.readLine());
               
               System.out.print("���� ����: ");
               c.setYear(Integer.parseInt(bufferedReader.readLine()));
               
               System.out.print("���� ����: ");
               c.setPrice(Integer.parseInt(bufferedReader.readLine()));
               
               System.out.print("���� ����: ");
               c.setColor(bufferedReader.readLine());
               
               carArray = add(carArray, c);
            }
            
         }else if(userChoice == 2) {
            //����� �ϵ� �ش�ĭ�� null �̸� ������� �ʴ´�.
            for(int i = 0; i < carArray.length; i++) {
               if(carArray[i] != null) {
                  System.out.println(carArray[i]);
               }
            }
         }else if(userChoice == 3) {
            System.out.println("������ּż� �����մϴ�.");
            break;
         }
      }
   }
   
   // 1. �迭�� ��ĭ�� ã���ִ� findEmptyIndex(Car[] carArray) �޼ҵ�
   private static int findEmptyIndex(Car[] carArray) {
      for(int i = 0; i < carArray.length; i++) {
         if(carArray[i] == null) {
            return i;
         }
      }
      
      return -1; // null�ΰ����� ���� �� car ��ü�� �������� �ִ�
   }
   
   // 2. �Ķ���ͷ� Car �迭�� Car ��ü�� �޾Ƽ� Car ��ü�� �迭�� �־
   // �� �迭�� �����ϴ� add(Car[] carArray, Car c) �޼ҵ�
   private static Car[] add(Car[] carArray, Car c) {
      int index = findEmptyIndex(carArray);
      carArray[index] = c; //����� �༭ �� ĭ��  ���� �ƴϴϱ� ����ض�
      
      return carArray;
   }
   
   private static void printArray(Car[] carArray) {
      for(int i = 0; i < carArray.length; i++) {
         if(carArray[i] != null) {
            System.out.println(carArray[i]);
         }
      }
   }
   
   private static void showMenu() {
      System.out.println("�������� ���α׷�");
      System.out.println("1. �Է� 2. ��� 3. ����");
      System.out.print("> ");
   }
}

// ���� 1: ���� �Է� �ϴ� �ڵ���� 2���� �޼ҵ�� ��������
//       �޼ҵ� 1: �Է��� index�� ã�� �޼ҵ�
//       �޼ҵ� 2: �迭�� �ش���ġ�� Car ��ü�� �־ �迭�� �ٽ� �������ִ� �޼ҵ�
// ���� 2: ���� ��� �ϴ� �ڵ���� �޼ҵ�� �и��ϼ���
// ���� 3: �޴��� ����ϴ� �ڵ���� �޼ҵ�� �и��ϼ��� 

















