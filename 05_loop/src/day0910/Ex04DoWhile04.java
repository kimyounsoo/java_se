package day0910;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//�� ������ �ٽ� �ѹ� �ĺ��ô�.
public class Ex04DoWhile04 {
   public static void main(String[] args) throws IOException{
      //���� ���ߴ� ����
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      //���� while�� ��쿡��
      //while ���� ���ǽ��� false�� ������
      //�ݺ��� �ߴܵǰ�
      //true�� ������ �ݺ��Ǵ� �����̾���.
      System.out.print("���ڸ� �ϳ� �Է����ּ���: ");
      int number = Integer.parseInt(bufferedReader.readLine());
      while(number < 0) {
         System.out.println("�ڿ����� �Է����ּ���.");
         System.out.print("���ڸ� �ϳ� �Է����ּ���: ");
         number = Integer.parseInt(bufferedReader.readLine());
      }
      //�� while���� ���
      //����ڰ� �� ó���� 0���� ũ�ų� ���� ���� �Է��ϸ�
      //number < 0 �̶�� ���ǽ��� false�� �����Ƿ� 
      //�ݺ��� ���� �ʰ� �ȴ�.
      
      System.out.println("����ڰ� �Է��� ����: "+number);
      
      //�׿� ���ؼ� do while ����������
      //������ �ѹ��� ������ �ȴ�.
      do {
         System.out.println("�� ���� ù��° ��");
      }while(number < 0);
   }
}
//while�� false������� �ƿ������ʾ� �ݺ��� �����ʰ�
//do while�� false���� �ѹ��� ������ �ݺ��� ���� �ʴ´�
//do while���� while���� ������ true�̸� �ݺ� ����



