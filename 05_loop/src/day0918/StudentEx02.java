package day0918;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import day0915.Student;
import util.ArrayUtil;

//학생 등록에 추가적인 메소드를 더 만들어보자
//1. 만약 학생번호와 이름이 같은 학생이 입력 되면 
// 잘못 입력했다고 알려주고 
// 중복이 아닌 학생이 입력될때까지 다시 입력을 받자
//2. 잘못된 점수는 잘못 입력했다고 알려주고
// 올바른 점수가 들어올때 까지 다시 입력을 받자
//동적 할당이 되는 배열 student 버젼						  // 버퍼드리더도 참조형이기때문에 널로 초기화한다
public class StudentEx02 {						  // 평소에는 버퍼드리더를 항상 파라미터에 입력해서 사용했었지만 여기서는 버퍼드리더를 필드화해서 사용한다
	private static BufferedReader bufferedReader; // 버퍼드리더를 필드화해서 하나만들어준다
	private static Student[] studentArray; //Car[] add메소드에서 carArray를 리턴해주었지만 여기선 안해도되는이유는
										   // Student[]여기서 필드화 했기때문에 일일이 불러올 필요가없어서?? 라고한다
	public static void main(String[] args) throws NumberFormatException, IOException {
		// 밑에 것 이었지만 이것도필드로 바꿨다
		//Student[] studentArray = new Student[0];		  
		studentArray = new Student[0];
		bufferedReader = new BufferedReader(new InputStreamReader(System.in));// 버퍼드리더를 초기화를 해주고나서
																  			  // 메인메소드에서 초기화, 즉 생성자를 호출하고 나서부터는
			showMenu();														  // 만약 메인메소드가 다른 메소드를 그 이후에 호출하게 된다면
	}			  															  // 이미 초기화가 된 상태 이기때문에 NullPointException 이 발생하지 않고
			 																  // 정상적으로 사용할 수 있다.
	private static void showMenu() throws NumberFormatException, IOException {
		while(true) {
			System.out.println("비트 성적 관리 프로그램");
			System.out.println("1. 입력 2. 출력 3. 종료");
			System.out.print("> ");
			int userChoice = Integer.parseInt(bufferedReader.readLine());
			if(userChoice == 1) {											 
				//입력 메소드 실행
				add();
			}else if(userChoice == 2) {
				//출력메소드 실행
				printArray();
			}else if(userChoice == 3) {
				System.out.println("사용해주셔서 감사합니다.");
				break;
			}else {
				System.out.println("잘못입력하셨습니다.");
			}
		}
	}
	
	private static void printArray() throws NumberFormatException, IOException {
		System.out.println("=======================");
		System.out.println("번호\t이름");
		System.out.println("=======================");
		for(int i = 0; i < studentArray.length; i++) {
			System.out.printf("%d\t%s\n", (i+1),studentArray[i].getName());	
		}								// 0번째부터 시작이니까 +1
		System.out.println("상세보기할 번호를 눌러주세요(0은 뒤로가기): ");
		int userChoice = Integer.parseInt(bufferedReader.readLine()) -1;
		//만약 userChoice가 올바르지 않으면, 다시 입력을 하도록 시킨다.
		//userChoice가 올바르지 않은 경우는 몇부터 몇인가?
		//userChoice가 -1미만이거나 studentArray.length -1 초과이면
		while(userChoice < -1 || userChoice > studentArray.length - 1) {
			System.out.println("잘못된 번호입니다.");
			System.out.print("상세보기할 번호를 눌러주세요");
			userChoice = Integer.parseInt(bufferedReader.readLine()) - 1;
		}
		if(userChoice == -1) {
			//메시지 만 출력
			System.out.println("메뉴로 돌아갑니다.");
		}else {
			//상세보기 메소드 호출
			printOne(userChoice);
		}
	}
	
	private static void printOne(int index) throws NumberFormatException, IOException {
		System.out.printf("%s학생의 정보\n", studentArray[index].getName());
		System.out.printf("학번: %d 이름: %s\n", studentArray[index].getId(), studentArray[index].getName());
		System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n",
				studentArray[index].getKor(), studentArray[index].getEng(),studentArray[index].getMath());
		System.out.printf("총점: %03d점 평균: %.2f점\n", studentArray[index].calculateSum(),studentArray[index].calculateAverage());
		//수정, 삭제를 위한 입력을 받는다.
		System.out.println("=======================");
		System.out.println("1. 수정 2. 삭제 3. 목록으로");
		int userChoice = Integer.parseInt(bufferedReader.readLine());
		if(userChoice == 1) {
			//수정메소드 호출
			System.out.println("국어: "); //Integer.parseInt(bufferedReader.readLine() 대신 validateScore 를 넣어도 된다
			studentArray[index].setKor(Integer.parseInt(bufferedReader.readLine()));
			
			System.out.println("영어: ");
			studentArray[index].setEng(Integer.parseInt(bufferedReader.readLine()));
			
			System.out.println("수학: ");
			studentArray[index].setMath(Integer.parseInt(bufferedReader.readLine()));
			
			printOne(index);
		
		}else if(userChoice == 2) {
			//삭제 메소드 호출
			//삭제시에는 정말 삭제하시겠습니까? y/n 물어봐서
			//다시 이 메소드로 돌아온다
			System.out.print("정말 삭제하시겠습니까? (y/n): ");
			String agree = bufferedReader.readLine();
			if(agree.equals("y")) {
				//삭제하고 학생목록 보기로 이동
				studentArray = ArrayUtil.removeByIndex(studentArray, index);
				printArray();
			}else if(agree.equals("n")) {
				printOne(index);
			}
		}else if(userChoice == 3) {
			printArray();
		}
	}
		
	private static void add() throws NumberFormatException, IOException {
		studentArray = ArrayUtil.add(studentArray, setStudentInfo());
	}
	
	private static Student setStudentInfo() throws NumberFormatException, IOException {
		Student s = new Student();
		
		System.out.print("이름: ");
		s.setName(bufferedReader.readLine());
		
		System.out.print("학번: ");
		s.setId(Integer.parseInt(bufferedReader.readLine()));
		// 우리가 이름과 학번을 입력하고나서
		// 만약 해당 이름과 번호가 중복이면
		// 중복인걸 알려주고
		// 다시 이름과 번호를 입력받게 한다.
		// 어레이유틸의 contains 메소드의 결과값이 true 인동안에는
		// 계속 입력을 받으면 되는 것이다!
		while(ArrayUtil.contains(studentArray,s)) {
			//중복된 이름과 번호이므로 다시 입력을 받는다.
			System.out.println("중복된 학생입니다.");
			System.out.println("다시 입력해주세요: ");
			System.out.print("학생 이름: ");
			s.setName(bufferedReader.readLine());
			
			System.out.print("학번: ");
			s.setId(Integer.parseInt(bufferedReader.readLine()));
		
		}
		
		System.out.print("국어점수: ");
		s.setKor(validateScore());
		
		System.out.print("영어점수: ");
		s.setEng(validateScore());
		
		System.out.print("수학점수: ");
		s.setMath(validateScore());
		
		return s;

	}
	
	private static int validateScore() throws NumberFormatException, IOException {
		int score = Integer.parseInt(bufferedReader.readLine());
		
		while(score < 0 || score > 100) {
			System.out.println("잘못 입력하셨습니다.");
			System.out.print("다시 입력해주세요");
			score = Integer.parseInt(bufferedReader.readLine());
		}
		
		return score;
	}
}

