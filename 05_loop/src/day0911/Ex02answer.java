package day0911;
//Ex01 업그레이드버젼
//총점이 아니라 
//국영수 점수를 관리하는
//무한루프 프로그램을 작성하시오(20분까지)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//조건 1. 처음 입력시에는 for 반복문을 사용해서 5명의 이름과 국영수 점수를 다 입력한다.
//조건 2. 입력후에는 무한루프를 통해서
//      내가 보고 싶은 학생의 이름과 점수, 총점, 평균만 볼수 있게 한다.
//예시:
//보고 싶은 학생의 번호를 입력하세요: (1입력)
//1번 김땡땡 학생
//국어: 80점 영어: 80점 수학: 81점
//총점: 241점 평균: 80.33점
//보고 싶은 학생의 번호를 입력하세요: (20000 입력)
//잘못입력하셨습니다.
//보고 싶은 학생의 번호를 입력하세요: (2입력)
//2번 최동동 학생
//국어: 70점 영어: 69점 수학: 68점
//총점: 207점 평균: 69점
//보고 싶은 학생의 점수를 입력하세요: (-1입력)
//사용해주셔서 감사합니다.

public class Ex02answer {
   final static int SIZE = 5;
   final static int NUMBER_OF_SUBJECTS = 3;
   public static void main(String[] args) throws IOException {
      String[] nameArray = new String[SIZE];
      int[] koreanArray = new int[SIZE];
      int[] englishArray = new int[SIZE];
      int[] mathArray = new int[SIZE];
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      for(int i = 0; i < SIZE; i++) {
         System.out.print((i+1)+"번 학생의 이름: ");
         nameArray[i] = bufferedReader.readLine();
         
         System.out.print((i+1)+"번 학생의 국어점수: ");
         koreanArray[i] = Integer.parseInt(bufferedReader.readLine());
         while(koreanArray[i] < 0 || koreanArray[i] > 100) {
            System.out.println("잘못입력하셨습니다.");
            System.out.print((i+1)+"번 학생의 국어점수: ");
            koreanArray[i] = Integer.parseInt(bufferedReader.readLine());
         }
         
         System.out.print((i+1)+"번 학생의 영어: ");
         englishArray[i] = Integer.parseInt(bufferedReader.readLine());
         while(englishArray[i] < 0 || englishArray[i] > 100) {
            System.out.println("잘못입력하셨습니다.");
            System.out.print((i+1)+"번 학생의 영어: ");
            englishArray[i] = Integer.parseInt(bufferedReader.readLine());
         }
         
         System.out.print((i+1)+"번 학생의 수학: ");
         mathArray[i] = Integer.parseInt(bufferedReader.readLine());
         while(mathArray[i] < 0 || mathArray[i] > 100) {
            System.out.println("잘못입력하셨습니다.");
            System.out.print((i+1)+"번 학생의 수학: ");
            mathArray[i] = Integer.parseInt(bufferedReader.readLine());
         }
      }
      
      //학생의 성적 출력을 담당하는 무한 루프
      while(true) {
         System.out.println("출력을 원하는 학생의 번호를 입력하세요 (-1은 종료)");
         System.out.print("> ");
         int userChoice = Integer.parseInt(bufferedReader.readLine());
         if(userChoice == -1) {
            //메시지 출력후 종료
            System.out.println("사용해주셔서 감사합니다.");
            break;
            
         }else if(userChoice <=0 || userChoice > SIZE) {
            //잘못된 입력 메시지 출력
            System.out.println("잘못 입력하셨습니다.");
            
         }else {
            //userChoice를 인덱스로 변환하고 
            //해당 인덱스의 학생 정보를 출력
            int index = userChoice - 1; //1번 학생이면 0번의 점수를 불러와야하기 때문
            int sum = koreanArray[index] + englishArray[index] + mathArray[index];
            double average = sum / (double)NUMBER_OF_SUBJECTS;
            System.out.print(userChoice+"번 ");
            System.out.println(nameArray[index]+"학생의 정보");
            
            System.out.printf("국어: %d점 영어: %d점 수학: %d점\n", koreanArray[index], englishArray[index], mathArray[index]);
            System.out.printf("총점: %d점 평균: %.2f점\n", sum, average);
         }
      }
      
   }
}
















