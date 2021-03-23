package day0918;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import day0915.Student;
import util.ArrayUtil;

//동적 할당이 되는 배열 student 버젼						  // 버퍼드리더도 참조형이기때문에 널로 초기화한다
public class StudentEx01 {						  // 평소에는 버퍼드리더를 항상 파라미터에 입력해서 사용했었지만 여기서는 버퍼드리더를 필드화해서 사용한다
	private static BufferedReader bufferedReader; // 버퍼드리더를 필드화해서 하나만들어준다
	private static Student[] studentArray; //Car[] add메소드에서 carArray를 리턴해주었지만 여기선 안해도되는이유는
										   // Student[]여기서 필드화 했기때문에 일일이 불러올 필요가없어서?? 라고한다
	public static void main(String[] args) throws NumberFormatException, IOException {
		// 밑에 것 이었지만 이것도필드로 바꿨다
		//Student[] student = new Student[0];		  
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
			System.out.println("> ");
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
	
	private static void printArray() {
		for(int i = 0; i < studentArray.length; i++) {
			System.out.println(studentArray[i]);// pirntln에 파라미터를 넣으면 toString 객체가 화면에 출력되도록 자바가 알아서했기때문에 toString 이나온다??		
			}									// 그래서 toString이 없으면 주소값이 그대로 나온다고한다
	}
			
		private static void add() throws NumberFormatException, IOException {
		studentArray = ArrayUtil.add(studentArray, setStudentInfo());
	}
	
	private static Student setStudentInfo() throws NumberFormatException, IOException {
		Student s = new Student();
		
		System.out.println("이름: ");
		s.setName(bufferedReader.readLine());
		
		System.out.println("학번: ");
		s.setId(Integer.parseInt(bufferedReader.readLine()));
		
		System.out.println("국어점수: ");
		s.setKor(Integer.parseInt(bufferedReader.readLine()));
		
		System.out.println("영어점수: ");
		s.setEng(Integer.parseInt(bufferedReader.readLine()));
		
		System.out.println("수학점수: ");
		s.setMath(Integer.parseInt(bufferedReader.readLine()));
		
		return s;

	}
}

