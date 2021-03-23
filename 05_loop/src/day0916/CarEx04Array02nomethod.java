package day0916;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import day0915.Car;

//
public class CarEx04Array02nomethod {
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
				int index = -23; // -1 �� �ʱ�ȭ �ϴ� ������ for ���� ������  ??
				for(int i = 0; i < carArray.length; i++) {
					if(carArray[i] == null) { //carArray�� i��°�� ���̵Ǹ� index�� i�� �ٲ�� ����� �Ұ����� �ε��� �� -1
						index = i;
						break; // 0�� ���̸� 1�� �˻���ص� �ǰ� 1�� ���̸� 2�� �˻���ص� �Ǳ⶧����
					}
				}
				
				if(index == -23) { // null �ΰ����� ���� �� �������� car��ü���ִ�
					System.out.println("��ĭ�� �����ϴ�.");
				}else {
					Car c = new Car();			
					
					System.out.print("��ȣ: ");
					c.setNumber(bufferedReader.readLine());
					System.out.print("����: ");
					c.setType(bufferedReader.readLine());
					System.out.print("����: ");
					c.setYear(Integer.parseInt(bufferedReader.readLine()));
					System.out.print("����: ");
					c.setPrice(Integer.parseInt(bufferedReader.readLine()));
	               	System.out.print("����: ");
		            c.setColor(bufferedReader.readLine());
		            carArray[index] = c; // �ش�ĭ�� c�� �ּҰ��� ��������ذ� ���̿���  carArray�� index���� ĭ�� c�� ���ϰ� �ٲپ��ذ�
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
}

   
 

// ���� 1: ���� �Է� �ϴ� �ڵ���� 2���� �޼ҵ�� ��������
//       �޼ҵ� 1: �Է��� index�� ã�� �޼ҵ�
//       �޼ҵ� 2: �迭�� �ش���ġ�� Car ��ü�� �־ �迭�� �ٽ� �������ִ� �޼ҵ�
// ���� 2: ���� ��� �ϴ� �ڵ���� �޼ҵ�� �и��ϼ���
// ���� 3: �޴��� ����ϴ� �ڵ���� �޼ҵ�� �и��ϼ��� 

















