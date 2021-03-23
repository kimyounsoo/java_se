package day0910;
//로또번호 제작기

import java.util.Random;

public class Ex09LottoNumbers {
   //로또 번호는 1~45까지 6개의 숫자가 필요하니깐
   //우리가 미리 상수를 만들어놓자
   
   //하드코딩
   //하드코딩이란 경직된 코딩 이란 뜻으로써
   //코딩의 난이도는 낮지만 유지보수는 어려워지는 형태의 코딩을
   //하드코딩이라고 한다.
   
   final static int SIZE = 6;
   final static int MAX = 45;
   public static void main(String[] args) {
      //로또 번호를 저장할 인트배열을 만들어주자
      int[] lottoNumbers = new int[SIZE];
      Random random = new Random();
      
      //for문을 통해서 랜덤 숫자를 배열에 차례대로 넣어보자
      for(int i = 0; i < lottoNumbers.length; i++) {
         //랜덤 변수의 nextInt() 메소드는
         //괄호안의 최대값을 지정해줄 수 있다.
         //하지만 최대값을 넣어주면
         //0부터 최대값 - 1까지 의 숫자가 나오기 때문에
         //만약 1부터 최대값까지를 뽑아내고 싶으면
         //무조건 결과값에 1을 더해주면 된다.
         
         
         lottoNumbers[i] = random.nextInt(MAX) + 1; // (0~44) + 1 => 1~45 난수
      }
      
      //배열에 들어간값들을 확인해보자
      System.out.println("난수 생성 직후");
      for(int i = 0 ; i < lottoNumbers.length; i++) {
         System.out.println(lottoNumbers[i]);
      }
      
      //여기까지는 우리가 중복값도 제거가 안되어있고
      //순서도 뒤죽박죽이다.
      //따라서 중복값을 제거해주고
      //새로운 값을 넣어주고
      //그리고 마지막으로 정렬까지 해주어야 한다.
      
      //중복이란?
      //확인하는 두 인덱스가 다르지만
      //해당 인덱스에 저장되어있는 값이 같을 때를 중복이라고 한다.
      
      //예시: 5 13 2 13 4 8
      // 이 저장되어 있는 인덱스에서
      // 1번째와 3번째는 인덱스는 다르지만
      // 저장된 값이 같으므로 중복이다.
      
      // 우리는 이중 for문을 사용해서
      // i번째와 j번째를 비교해서
      // 만약 i와 j가 다르지만
      // i번째와 j번째의 값이 같다면?
      // 그렇다면 중복이므로
      // i번째에 새로운 값을 넣어준다.
      
      for(int i = 0; i < SIZE; i++) {
         for(int j = 0; j < SIZE; j++) {
            //i가 0일때
            //j가 0~5까지 검사해서
            //같은 값이 있으면
            //i번째에 새로운 값을 넣어주고
            //j를 -1로 초기화해준다.
            //왜냐하면 j를 -1로 초기화해주고 나서
            //실행되는 명령어는 j++이기 때문에
            //j는 0이 된다.
            //따라서 처음부터 다시 검사가 된다.
            
            //만약 i와 j는 다르지만
            //lottoNumbers[i]와 lottoNumbers[j]가 같으면
            //중복이라고 한다.
            
            //18 14 29 5 23 45
            //i: 1
            //j: 4
            //lottoNumbers[i]: 14
            //lottoNumbers[j]: 23
            if(i != j && lottoNumbers[i] == lottoNumbers[j]) {
               lottoNumbers[i] = random.nextInt(MAX) + 1;
               j = -1;
            }
         }
      }
      
      System.out.println("중복제거 후");
      for(int i = 0; i < lottoNumbers.length; i++) {
         System.out.println(lottoNumbers[i]);
      }
      
      //정렬을 해보자
      //정렬의 경우
      //i번째가 i+1보다 값이 크면?
      //2개의 위치를 바꿔주면 된다.
      //바꾸고 나서는 i를 -1로 초기화하면
      //i++ 때문에
      //i는 0부터 다시 검사한다.
      
      //18 23 29 5 23 45
      //i가 1일때
      //lottoNumbers[i]:
      //lottoNumbers[i+1]:
      
      //프로그램적으로 두 변수의 값을 교환할려면 어떻게 해야할까?
      
      // int a = 5;
      // int b = 6;
      // int temp = a;
      // a = b;
      // a가 6이 된다
      // b = temp;
      
      
      
      //1 15 16 22 23 41
      //i: 2
      //lottoNumbers[i]:15
      //lottoNumbers[i+1]:16
      for(int i = 0; i < lottoNumbers.length -1; i++) {
    	  if(lottoNumbers[i] > lottoNumbers[i+1]) {
    		  int temp = lottoNumbers[i];
    		  lottoNumbers[i] = lottoNumbers[i+1];
    		  lottoNumbers[i+1] = temp;
    		  i = -1;
    	  }
      }
      
      System.out.println("정렬 후 : ");
      
      for(int i = 0; i < lottoNumbers.length; i++) {
    	  System.out.println(lottoNumbers[i]);
      }
   }
}













