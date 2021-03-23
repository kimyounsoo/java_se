package day0916;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import day0915.Student;

public class Ex01Student02 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Student s = new Student();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("1. 입력 2. 출력 3. 종료");
			System.out.println("> ");
			int userChoice = Integer.parseInt(bufferedReader.readLine());
			if(userChoice == 1) {
				//정보 입력
	            System.out.print("이름: ");
	            s.setName(bufferedReader.readLine());
	            System.out.print("학번: ");
	            s.setId(Integer.parseInt(bufferedReader.readLine()));
	            System.out.print("국어: ");
	            s.setKor(Integer.parseInt(bufferedReader.readLine()));
	            System.out.print("영어: ");
	            s.setEng(Integer.parseInt(bufferedReader.readLine()));
	            System.out.print("수학: "); 
	            s.setMath(Integer.parseInt(bufferedReader.readLine()));

			}else if(userChoice == 2) {
				//정보 출력
				//먼저 학생의 이름이 존재하는지 체크하고
				//존재하지 않으면 경고메시지만 출력
				if(s.getName().isEmpty()) {
					System.out.println("아직 입력된 정보가 없습니다.");
				}else {
					System.out.printf("이름: %s, 국어: %d점 영어: %d점 수학: %d점\n", s.getName(), s.getKor(),s.getEng(),s.getMath());
					System.out.printf("%s 학생의 총점: %d점 평균: %.2f점\n",s.getName(), s.calculateSum(), s.calculateAverage());
				}
			}else if(userChoice == 3) {
				//종료
				System.out.println("사용해주셔서 감사합니다.");
				break;
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}

}
