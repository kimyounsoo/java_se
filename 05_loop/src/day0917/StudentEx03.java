package day0917;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import day0915.Student;
import util.ArrayUtil;

//동적 할당이 되는 배열 student 버젼
public class StudentEx03 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Student[] studentArray = new Student[0];
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			showMenu();
			int userChoice = Integer.parseInt(bufferedReader.readLine());
			if(userChoice == 1) {
				//studentArray 추가메소드 실행
				studentArray = add(studentArray, bufferedReader);
			}else if(userChoice == 2) {
				//studentArray 출력메소드 실행
				printArray(studentArray);
			}else if(userChoice == 3) {
				System.out.println("사용해주셔서 감사합니다.");
				break;
			}else {
				System.out.println("잘못입력하셨습니다.");
			}
		}
	}
	private static void showMenu() {
		System.out.println("1. 입력 2. 출력 3. 종료");
		System.out.println("> ");
	}
	
	private static Student[] add(Student[] studentArray, BufferedReader bufferedReader) throws NumberFormatException, IOException { // 버퍼드리더 여러번선언 안하고 한번만 선언할수 있게 파라미터로 왔다갔다할거에요
		studentArray = ArrayUtil.add(studentArray, setStudentInfo(bufferedReader));
		
		return studentArray;
	}
	
	private static Student setStudentInfo(BufferedReader bufferedReader) throws NumberFormatException, IOException {
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
	
	private static void printArray(Student[] studentArray) {
		for(int i = 0; i < studentArray.length; i++) {
			System.out.println(studentArray[i]);
	
		}
	}
}
