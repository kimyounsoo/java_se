package day0910;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//두 와일을 다시 한번 파봅시다.
public class Ex04DoWhile04 {
   public static void main(String[] args) throws IOException{
      //점수 맞추는 게임
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      //기존 while의 경우에는
      //while 옆의 조건식이 false가 나오면
      //반복이 중단되고
      //true가 나오면 반복되는 형식이었다.
      System.out.print("숫자를 하나 입력해주세요: ");
      int number = Integer.parseInt(bufferedReader.readLine());
      while(number < 0) {
         System.out.println("자연수를 입력해주세요.");
         System.out.print("숫자를 하나 입력해주세요: ");
         number = Integer.parseInt(bufferedReader.readLine());
      }
      //위 while문의 경우
      //사용자가 맨 처음에 0보다 크거나 같은 수를 입력하면
      //number < 0 이라는 조건식이 false가 나오므로 
      //반복이 되지 않게 된다.
      
      System.out.println("사용자가 입력한 숫자: "+number);
      
      //그에 반해서 do while 구조에서는
      //무조건 한번은 실행이 된다.
      do {
         System.out.println("두 와일 첫번째 줄");
      }while(number < 0);
   }
}
//while은 false면실행이 아예되지않아 반복도 되지않고
//do while은 false여도 한번은 실행후 반복이 되지 않는다
//do while에서 while안의 조건이 true이면 반복 실행



