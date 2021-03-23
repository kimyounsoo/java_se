package day0911;
//20분동안 여러분들은 출력하는 부분을 
//무한루프로 만드시고
//만약 사용자가 보고 싶은 학생의 번호를 입력할 때 - 1을 입력하면 프로그램이 종료
//혹은 사용자가 잘못된 번호를 입력하면 잘못입력하셨습니다. 다시 입력해주세요~라고 입력하게 프로그램을 개조해보세요.
//예시
//보고싶은 학생: 3
//3번 학생의 총점: 218점
//보고싶은 학생: 4
//4번 학생의 총점: 299점
//보고싶은 학생: 99
//잘못입력하셨습니다.
//보고싶은 학생: -1
//사용해주셔서 감사합니다.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PracTice {
	final static int SIZE=5;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] nameArray = new String[SIZE];
		int[] sumArray = new int[SIZE];
		
		for(int i = 0; i < SIZE; i++) {
			
			System.out.print((1+i)+" 번 학생의 이름: ");
			nameArray[i] = br.readLine();
			System.out.print((nameArray[i])+" 학생의 국어점수: ");
			int kor = Integer.parseInt(br.readLine());
			while(kor < 0 || kor > 100) {
				System.out.println("잘못 입력하셨습니다.");
				System.out.print((nameArray[i])+" 학생의 국어점수: ");
				kor = Integer.parseInt(br.readLine());
			}
			
			System.out.print((nameArray[i])+" 학생의 영어점수: ");
			int eng = Integer.parseInt(br.readLine());
			while(eng < 0 || eng > 100 ) {
				System.out.println("잘못 입력하셨습니다");
				System.out.print((nameArray[i])+" 학생의 영어점수: ");
				eng = Integer.parseInt(br.readLine());
			}
			
			System.out.print(nameArray[i]+" 학생의 수학점수: ");
			int math = Integer.parseInt(br.readLine());
			while(math < 0 || math > 100) {
				System.out.println("잘못 입력하셨습니다");
				System.out.print(nameArray[i]+" 학생의 수학점수: ");
				math = Integer.parseInt(br.readLine());
				
			}
			
			sumArray[i] = kor+math+eng;
	
			
		}
		
		while(true) {
			System.out.println("보고 싶은 학생의 번호를 입력하세요(1~5, -1은 종료)");
			System.out.println("> ");
			
			int userChoice = Integer.parseInt(br.readLine());
			if(userChoice == -1) {
				System.out.println("종료되었습니다.");
				break;
				
				
			}else if(userChoice >= 1 && userChoice <= 5) {
				int index = userChoice - 1;
				System.out.println(nameArray[index]+" 학생의 총점: "+ sumArray[index]+" 점");
				
				
				
			}else {
				System.out.println("wrong number");
				
				
		}
				
			
		}
		
		
			
		}

	}


