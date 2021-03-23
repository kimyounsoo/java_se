package day0911;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class WeekendHomwork {
	
	static void showMenu() {
		System.out.println("----------------------");
	      System.out.println("비트고등학교 성적관리 프로그램");
	      System.out.println("\t1. 입력");
	      System.out.println("\t2. 출력");
	      System.out.println("\t3. 종료");
	}
   public static void main(String[] args) throws NumberFormatException, IOException {
	   BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	   
	   int[][] koreanArray = new int[3][4];
       int[][] engArray = new int[3][4];
       int[][] mathArray = new int[3][4];
	   
     
     
      
      while(true) {
    	  showMenu();

    	int userChoice = Integer.parseInt(bufferedReader.readLine());
          if(userChoice == 1) {
        	  System.out.print("학년: ");
        	  int year = Integer.parseInt(bufferedReader.readLine());
              while(year < 1 || year > 3){
                 System.out.println("잘못된 학년입니다.");
                 System.out.print("학년: ");
                 year = Integer.parseInt(bufferedReader.readLine());
              }
              
              System.out.print("몇번째? (1학기 중간=1~2학기기말=4): ");
              int number = Integer.parseInt(bufferedReader.readLine());
              while(number < 1 || number > 4) {
                 System.out.println("잘못된 입력입니다.");
                 System.out.print("몇번째? (1학기 중간 = 1, 1학기 기말 = 2, 2학기 중간 = 3, 2학기 기말 = 4): ");
                 number = Integer.parseInt(bufferedReader.readLine());
              }
              
              System.out.print("국어점수: ");
              int korean = Integer.parseInt(bufferedReader.readLine());
              while(korean < 0 || korean > 100) {
                 System.out.println("잘못된 점수입니다.");
                 System.out.print("국어점수: ");
                 korean = Integer.parseInt(bufferedReader.readLine());
              }
             
              System.out.print("영어점수: ");
              int eng = Integer.parseInt(bufferedReader.readLine());
              while(eng < 0 || eng > 100) {
                 System.out.println("잘못된 점수입니다.");
                 System.out.print("영어점수: ");
                 eng = Integer.parseInt(bufferedReader.readLine());
              }
              
              System.out.print("수학점수: ");
              int math = Integer.parseInt(bufferedReader.readLine());
              while(math < 0 || math > 100) {
                 System.out.println("잘못된 점수입니다.");
                 System.out.print("수학점수: ");
                 eng = Integer.parseInt(bufferedReader.readLine());
              }
              
              
           System.out.print(year+"학년 ");
              switch(number) {
              case 1:
                 System.out.print("1학기 중간");
                 break;
              case 2:
                 System.out.print("1학기 기말");
                 break;
              case 3:
                 System.out.print("2학기 중간");
                 break;
              case 4:
                 System.out.print("2학기 기말");
                 break;
                 
              
              
              }
              System.out.println(" 국어에 "+korean+" 점," + " 영어에 " +eng+" 점,"+ " 수학에 "+math+" 점,이 입력되었습니다.");
              
          }else if(userChoice == 2) {
        	  
              
              
        	  
        	  
      }else if (userChoice == 3) {
    	  System.out.println("사용해주셔서 감사합니다.");
    	  break;
      }else {
    	  System.out.println("잘못입력하셨습니다.");
      }
          
      }
   }
   static int vs(BufferedReader br) throws NumberFormatException, IOException {
	      System.out.print("점수를 입력하세요: ");
	      int score = Integer.parseInt(br.readLine());
	      
	      while(score < 0 || score > 100) {
	         System.out.println("잘못 입력하셨습니다.");
	         System.out.print("점수를 입력하세요: ");
	         score = Integer.parseInt(br.readLine());
	      }
		return score;
}
}
   
  
      

   







//주말 숙제
      //위 내용을 
      //1차: 국어, 영어, 수학 순으로 관리 할 수 있게 변경하고
      //2차: 무한루프를 이용하여 메뉴를 통해서 입력과 출력을 할 수 있게 바꾸고
      //3차: 메소드를 분리해보세요.
      
      //출력 예시: 













