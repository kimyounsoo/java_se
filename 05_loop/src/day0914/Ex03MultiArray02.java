package day0914;
//반 별로, 국영수 점수를 따로 관리하는 프로그램을 작성해보세요
//반의 총 갯수는 4개입니다.
//한 반의 최대 학생수는 10명입니다.
//만약 입력이 안된반은
//입력이 안되었다고 출력되게 하세요.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//입력을 선택하면
//몇반인지 입력을 받고
//그리고 그반 학생들의 국영수 점수를 차례대로 입력받게 하세요.
public class Ex03MultiArray02 {
	final static int STUDENT_SIZE = 10;
	final static int CLASS_NUMBER = 4;
	public static void main(String[] args) throws NumberFormatException, IOException {
		String[][] nameArray = new String[4][];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] korArray = new int [4][];
		int[][]	engArray = new int [4][];
		int[][]	mathArray = new int [4][];
		
		while(true) {
			System.out.println("비트고등학교 이름 관리 프로그램");
			System.out.println("1. 입력 2. 출력 3. 종료");
			System.out.println("> ");
			int choice = Integer.parseInt(br.readLine());
			if(choice == 1) {
				int ban = selectBan(br);
				int stSize = stSizenumber(br);
	           
				korArray[ban] = new int[stSize];
	            engArray[ban] = new int[stSize];
	            mathArray[ban] = new int[stSize];
				
				
				for(int i = 0; i < korArray[ban].length; i++) {
		               System.out.println((i+1)+"번 학생의 점수 입력");
		             
				        korArray[ban-1][stSize-1] = validateScore(br,1);
						engArray[ban-1][stSize-1] = validateScore(br,2); 
						mathArray[ban-1][stSize-1] = validateScore(br,3);}
			
			}else if(choice == 2) {
				
			}else if(choice == 3) {
				System.out.println("사용해주셔서 감사합니다.");
				break;
			}
		}

	}
	static int selectBan(BufferedReader bufferedReader) throws NumberFormatException, IOException {
	      System.out.println("반을 선택해주세요: ");
	      System.out.print("> ");
	      int ban = Integer.parseInt(bufferedReader.readLine());
	      while(ban < 1 || ban > CLASS_NUMBER) {
	         System.out.println("잘못된 입력입니다.");
	         System.out.println("반을 선택해주세요");
	         System.out.println("> ");
	         ban = Integer.parseInt(bufferedReader.readLine());

	      }
	      return ban-1;
	}
	static int stSizenumber(BufferedReader bufferedReader) throws NumberFormatException, IOException {
		System.out.println("학생의 숫자를 입력해주세요: ");
		int stSize = Integer.parseInt(bufferedReader.readLine());
		while(stSize < 0 || stSize > STUDENT_SIZE) {
			System.out.println("잘못입력하셨습니다.");
			System.out.println("학생의 숫자를 입력해 주세요: ");
			System.out.println("> ");
			stSize = Integer.parseInt(bufferedReader.readLine());
		}
		return stSize; //인덱스가 아니라 크기라서 -1 해줄필요가없음 (??)
	}
	static int validateScore(BufferedReader br, int code) throws NumberFormatException, IOException {
	      String message = new String();
	      switch(code) {
	      case 1:
	         message = "국어 점수를 입력해주세요: ";
	         break;
	      case 2:
	         message = "영어 점수를 입력해주세요: ";
	         break;
	      case 3:
	         message = "수학 점수를 입력해주세요: ";
	         break;
	      }
	      System.out.print(message);
	      int score = Integer.parseInt(br.readLine());
	      
	      while(score < 0 || score > 100) {
	         System.out.println("잘못입력하셨습니다.");
	         System.out.print(message);
	         score = Integer.parseInt(br.readLine());
	      }
	      return score;
}
}
