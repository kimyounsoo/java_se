package day0910;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//사용자로부터 국어, 영어, 수학 점수를 입력받아서 
//총점을 계산해주는 프로그램
//단 사용자가 입력한 점수가 잘못된 형식(0보다 작거나 100보다 큰 경우)
//일 때에는 
//올바른 점수가 들어올 때 까지 
//다시 입력을 받는다.
//입력을 할 때에는 do while을 사용하도록 한다. (10시 45분까지)
public class Ex02DoWhile02 {
   public static void main(String[] args) throws NumberFormatException, IOException {
      int kor = 0, eng = 0, math = 0;// 초기화 값
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      
      do {
         if(kor > 100 || kor < 0) {
            System.out.println("잘못 입력하셨습니다.");
         }
         System.out.print("국어점수: ");
         kor = Integer.parseInt(bufferedReader.readLine());
      }while(kor > 100 || kor < 0);
      
      do {
         if(eng > 100 || eng < 0) {
            System.out.println("잘못 입력하셨습니다.");
         }
         System.out.print("영어점수: ");
         eng = Integer.parseInt(bufferedReader.readLine());
      }while(eng > 100 || eng < 0);
      
      do {
         if(math > 100 || math < 0) {
            System.out.println("잘못입력하셨습니다.");
         }
         System.out.print("수학점수: ");
         math = Integer.parseInt(bufferedReader.readLine());
      }while(math > 100 || math < 0);
      
      int sum = kor + eng + math;
      System.out.println("총점: "+sum);
   }
}






