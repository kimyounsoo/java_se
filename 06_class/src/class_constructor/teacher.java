package class_constructor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class teacher {

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String str, target, replaceing;
      int index, count;
      
      System.out.print("문자열 입력 : ");
      str = br.readLine();
      
      System.out.print("현재 문자열 입력 : ");
      target = br.readLine();
      
      System.out.print("바꿀 문자열 입력 : ");
      replaceing = br.readLine();
      
      if(str.length() < target.length())
         System.out.println("입력한 문자열의 크기가 작습니다");
      
      else {
         str = str.toLowerCase();//소문자 변환
         target = target.toLowerCase();
         
         index = count = 0; // 초기값 0으로 설정
         while( (index=str.indexOf(target, index)) != -1 ) {
            
            index += target.length(); // index =index + target.length()
            count++;
            
         }//while
         
         System.out.println(str.replace(target, replaceing));
         System.out.println(count+"개 치환");
         
      }//else
   }

}