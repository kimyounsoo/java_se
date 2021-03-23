package day0911;
//������ �迭
//�Ȱ��� ������Ÿ���� ���ִ� ���� �츮�� �迭�̶�� �Ѵ�.
//�׷� �迭�� ���ִ°�?

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//��ǥ���� ������ �迭�� ���ð�
//�б��� �л����� �������� �迭
//[1�г�][���][����� ����]
//[2�г�][���][����� ����]
//[3�г�][���][����� ����]

public class Ex06MultiDimensionArray {
   public static void main(String[] args) throws NumberFormatException, IOException {
      //int 2���� �迭�� ������
      int[][] array = new int[2][3];
      //�� 2���� �迭��
      //int�� 3�� �� �� �ִ� �迭 2���� ���ִ� ��� ���� �ȴ�.
      
      for(int i = 0; i < array.length; i++) {
         for(int j = 0; j < array[i].length; j++) {
            System.out.println("i: "+i+", j: "+j);
         }
      }
      
      //�츮�� �� �迭�� ���� ���� ������
      //1����������
      //�迭�̸�[�ε���] = ��;
      //�䷸�� �־�����
      
      //2����������
      //�迭�̸�[���°�迭][�ε���] = ��
      //�䷸�� �־�� �Ѵ�.
      
      //�׷� array�� 0��° �迭 2�� �ε����� 10�� �־����
      array[0][2] = 10;
      
      //�л��� ���� ������ �����ϴ� �迭�� ���� ��
      //1, 2, 3�г�
      //������ 1�б� �߰� 1�б� �⸻ 2�б� �߰� 2�б� �⸻ �� �����ϴ�
      //�迭�� �����غ�����!
      int[][] koreanArray = new int[3][4];
      
      //����ڷκ��� ���г� ���° ������������ �Է� �޾Ƽ�
      //�ش� ��ġ�� ������ �ִ� �ڵ带 �����Ͻÿ�(15��)
      //����1. �߸��� �г��� �Էµ��� �ʰ� �Ͻÿ�
      //����2. ���° ���������� �Է� ���� �� �߸��� ������ �Էµ��� �ʰ� �Ͻÿ�
      //����3. ������ �ùٸ� ������ �Էµǰ� �Ͻÿ�
      
      //����
      //���г� �����Դϱ�? (�Է� 4)
      //�ùٸ��� ���� �г��Դϴ�.
      //���г� �����Դϱ�? (�Է� 2)
      //���° �����Դϱ�? (�Է� -2)
      //�ùٸ��� ���� �����Դϴ�.
      //���° �����Դϱ�? (�Է� 1)
      //�����Դϱ�? (�Է� 80)
      //2�г� 1�б� �߰� ��� ��� 80���� �ԷµǾ����ϴ�.
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("�г�: ");
      int year = Integer.parseInt(bufferedReader.readLine());
      while(year < 1 || year > 3){
         System.out.println("�߸��� �г��Դϴ�.");
         System.out.print("�г�: ");
         year = Integer.parseInt(bufferedReader.readLine());
      }
      
      System.out.print("���°? (1�б� �߰�=1~2�б�⸻=4): ");
      int number = Integer.parseInt(bufferedReader.readLine());
      while(number < 1 || number > 4) {
         System.out.println("�߸��� �Է��Դϴ�.");
         System.out.print("���°? (1�б� �߰� = 1, 1�б� �⸻ = 2, 2�б� �߰� = 3, 2�б� �⸻ = 4): ");
         number = Integer.parseInt(bufferedReader.readLine());
      }
      
      System.out.print("��������: ");
      int korean = Integer.parseInt(bufferedReader.readLine());
      while(korean < 0 || korean > 100) {
         System.out.println("�߸��� �����Դϴ�.");
         System.out.print("��������: ");
         korean = Integer.parseInt(bufferedReader.readLine());
      }
      
      koreanArray[year-1][number-1] = korean;
      System.out.print(year+"�г� ");
      switch(number) {
      case 1:
         System.out.print("1�б� �߰�");
         break;
      case 2:
         System.out.print("1�б� �⸻");
         break;
      case 3:
         System.out.print("2�б� �߰�");
         break;
      case 4:
         System.out.print("2�б� �⸻");
         break;
      }
      
      System.out.println(" ��� "+korean+"���� �ԷµǾ����ϴ�.");
      
      //�ָ� ����
      //�� ������ 
      //1��: ����, ����, ���� ������ ���� �� �� �ְ� �����ϰ�
      //2��: ���ѷ����� �̿��Ͽ� �޴��� ���ؼ� �Է°� ����� �� �� �ְ� �ٲٰ�
      //3��: �޼ҵ带 �и��غ�����.
      
      //��� ����: 
   }
}













