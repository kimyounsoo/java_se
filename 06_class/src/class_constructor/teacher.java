package class_constructor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class teacher {

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String str, target, replaceing;
      int index, count;
      
      System.out.print("���ڿ� �Է� : ");
      str = br.readLine();
      
      System.out.print("���� ���ڿ� �Է� : ");
      target = br.readLine();
      
      System.out.print("�ٲ� ���ڿ� �Է� : ");
      replaceing = br.readLine();
      
      if(str.length() < target.length())
         System.out.println("�Է��� ���ڿ��� ũ�Ⱑ �۽��ϴ�");
      
      else {
         str = str.toLowerCase();//�ҹ��� ��ȯ
         target = target.toLowerCase();
         
         index = count = 0; // �ʱⰪ 0���� ����
         while( (index=str.indexOf(target, index)) != -1 ) {
            
            index += target.length(); // index =index + target.length()
            count++;
            
         }//while
         
         System.out.println(str.replace(target, replaceing));
         System.out.println(count+"�� ġȯ");
         
      }//else
   }

}