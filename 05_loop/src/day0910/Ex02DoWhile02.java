package day0910;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//����ڷκ��� ����, ����, ���� ������ �Է¹޾Ƽ� 
//������ ������ִ� ���α׷�
//�� ����ڰ� �Է��� ������ �߸��� ����(0���� �۰ų� 100���� ū ���)
//�� ������ 
//�ùٸ� ������ ���� �� ���� 
//�ٽ� �Է��� �޴´�.
//�Է��� �� ������ do while�� ����ϵ��� �Ѵ�. (10�� 45�б���)
public class Ex02DoWhile02 {
   public static void main(String[] args) throws NumberFormatException, IOException {
      int kor = 0, eng = 0, math = 0;// �ʱ�ȭ ��
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      
      do {
         if(kor > 100 || kor < 0) {
            System.out.println("�߸� �Է��ϼ̽��ϴ�.");
         }
         System.out.print("��������: ");
         kor = Integer.parseInt(bufferedReader.readLine());
      }while(kor > 100 || kor < 0);
      
      do {
         if(eng > 100 || eng < 0) {
            System.out.println("�߸� �Է��ϼ̽��ϴ�.");
         }
         System.out.print("��������: ");
         eng = Integer.parseInt(bufferedReader.readLine());
      }while(eng > 100 || eng < 0);
      
      do {
         if(math > 100 || math < 0) {
            System.out.println("�߸��Է��ϼ̽��ϴ�.");
         }
         System.out.print("��������: ");
         math = Integer.parseInt(bufferedReader.readLine());
      }while(math > 100 || math < 0);
      
      int sum = kor + eng + math;
      System.out.println("����: "+sum);
   }
}






