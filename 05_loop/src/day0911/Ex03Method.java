package day0911;
// �޼ҵ�
// �޼ҵ�� �ش� Ŭ������ ����� ���ǵǾ��ִ� �����
// �츮�� �޼ҵ��� �Ѵ�.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// �츮�� ���нð��� ����� �Լ��� �����غ���
// f(x) = 3x;
// �츮�� �ִ� ���ڿ� 3�� ������ ���� ����� ������ �ȴ�.

// �ڹ��� �޼ҵ嵵 ��������
// �츮�� � Ÿ���� ���� �������� �����ְ�
// �� ���� ���ؼ� � ����� ������ ������ �����ְ�
// �� ������� ȣ��� ������ ������ �ڷ����� �����ָ� �ȴ�.

// �޼ҵ带 �����غ���
// �޼ҵ带 ������ ������
// ����Ÿ�� �޼ҵ��̸�(�Ķ����) 
// �� �����Ҽ� �ִ�.

// ����Ÿ��: �ش� �޼ҵ尡 ȣ��� ������ ������ ���� ������Ÿ��
//         ���� ȣ��� ������ ������ ���� �ִ� ��쿡�� �޼ҵ� ���ο��� 
//         �ݵ��!!!! return �̶�� ��ɾ ���ؼ� ���� �ǵ������ �Ѵ�!
//         ���� �ƹ��� ���� �������� �������̶�� ���� Ÿ���� void�� �ȴ�.
// �޼ҵ��̸�: �ҹ��ڷ� �����ϴ� ����(��Ÿ�� ǥ���)
// �Ķ����: �ش� �޼ҵ尡 �����Ҷ� �ʿ�� �ϴ� �ܺ��� ��. �޼ҵ� ���ο��� ����ó�� ���̱� ������ �Ű�������� �Ѵ�. 
public class Ex03Method {
   //����ڷκ��� ���� 2���� �޾Ƽ� �� ���� �����ִ� �޼ҵ�
   static int plus(int a, int b) {
      int mul = a * b;
      
      
      return mul;
   }
   
   public static void main(String[] args) throws NumberFormatException, IOException {
      int userNumber1 = 10;
      int userNumber2 = 150;
      
      int result = plus(userNumber1, userNumber2);
      System.out.println("result: "+result);
      
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      
      Ex03Method e  = new Ex03Method();
      
      System.out.println("����");
      int korean = e.vt(bufferedReader);
      System.out.println("����");
      int english = e.vt(bufferedReader);
      System.out.println("����");
      int math = e.vt(bufferedReader);
      
      //int sum = korean + english + math;
   }
   
   //����ڷκ��� ���ڸ� �Է� �޾Ƽ�
   //���� �ش� ���ڰ� 0~100 �� ������ �����
   //�ٽ� �Է��� �ϰ� ����
   //�������� ���ڰ� �Էµ������� �� ���ڸ� return �ϴ� �޼ҵ�
   
   public int vt(BufferedReader br) throws NumberFormatException, IOException {
      System.out.print("������ �Է����ּ���: ");
      int score = Integer.parseInt(br.readLine());
      while(score < 0 || score > 100) {
         System.out.println("�߸��Է��ϼ̽��ϴ�.");
         System.out.print("������ �Է����ּ���: ");
         score = Integer.parseInt(br.readLine());
      }
      
      return score;
   }
}




















