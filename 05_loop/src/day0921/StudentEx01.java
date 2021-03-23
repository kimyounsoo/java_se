package day0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import day0915.Student;

//숙제:
//Student를 어레이리스트 버젼으로 만드세요
//단 숫자를 입력할때 문자가 입력되면
//잘못입력하셨으니 다시 숫자만 입력하세요
//가 뜨도록 만드세요
public class StudentEx01 {
	private static ArrayList<Student> list;
	private static BufferedReader bufferedReader;
	private static int id;
	public static void main(String[] args) throws NumberFormatException, IOException {
		bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		list = new ArrayList<>();
		id = 1;
		
		showMenu();
	}
	
	private static void showMenu() throws NumberFormatException, IOException {
		while (true) {
			System.out.println("비트 학생관리프로그램");
			System.out.println("1. 입력 2. 출력 3. 종료");
			int userChoice = validateIntegerValue(1, 3);
			if(userChoice == 1) {
				add();
			}else if(userChoice == 2) {
				printAll();
			}else if(userChoice == 3) {
				System.out.println("종료되었습니다.");
				break;
			}
		}
	}
	
	private static void add() throws IOException {
		Student s = new Student();
		System.out.print("이름 : ");
		s.setName(bufferedReader.readLine());
		System.out.print("학번 : ");
		s.setId(Integer.parseInt(bufferedReader.readLine()));
		while(list.contains(s)) {
			System.out.println("이미 존재하는 학생입니다.");
			System.out.print("학생 이름: ");
			s.setName(bufferedReader.readLine());
			
			System.out.print("학번: ");
			s.setId(Integer.parseInt(bufferedReader.readLine()));
		}
		
		System.out.print("국어 : ");
		s.setKor(validateScore());
		System.out.print("영어 : ");
		s.setEng(validateScore());
		System.out.print("수학 : ");
		s.setMath(validateScore());
		
		list.add(s);
	}

	private static void printAll() throws NumberFormatException, IOException {
	System.out.println("===================");
	for(int i = 0; i < list.size(); i++) {
		System.out.printf("%d. %s\n", (i+1), list.get(i).getName());
	}
	System.out.println("===================");
	System.out.println("개별 보기할 학생의 번호를 입력해주세요 (0은 종료)");
	System.out.print("> ");
	int userChoice = validateIntegerValue(0, list.size()) - 1;
	if(userChoice == -1) {
		System.out.println("메인화면으로 돌아갑니다.");
	}else {
		printOne(userChoice);
	}
	
	}

	private static void printOne(int index) throws NumberFormatException, IOException {
		System.out.println("============================");
		System.out.printf("\t%s 학생정보\n", list.get(index).getName());
		System.out.printf("학번: %d 이름: %s\n", list.get(index).getId(), list.get(index).getName());
		System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n",
				list.get(index).getKor(), list.get(index).getEng(),list.get(index).getMath());
		System.out.printf("총점: %03d점 평균: %.2f점\n", list.get(index).calculateSum(),list.get(index).calculateAverage());
        System.out.println("=========================================");
        System.out.println("1. 수정 2. 삭제 3. 목록으로");
        System.out.print("> ");
        int userChoice = validateIntegerValue(1, 3);
        if(userChoice == 1) {
        	update(index);
        }else if(userChoice == 2) {
        	delete(index);
        }else if(userChoice == 3) {
        	printAll();
        }
}

	private static void update(int index) throws IOException {
		System.out.print("이름 : ");
		list.get(index).setName(bufferedReader.readLine());
		System.out.print("학번 : ");
		list.get(index).setId(Integer.parseInt(bufferedReader.readLine()));
		System.out.print("영어 : ");
		list.get(index).setEng(validateScore());
		System.out.print("국어 : ");
		list.get(index).setKor(validateScore());
		System.out.print("수학 : ");
		list.get(index).setMath(validateScore());
		
		printOne(index);
	}
		
	private static void delete(int index) throws IOException {
		System.out.println("해당 학생목록을 삭제하시겠습니까? (y/n)");
		System.out.print("> ");
		String yn = bufferedReader.readLine().toLowerCase(); // 대문자로써도 소문자로 출력되게하는 스트링메소드
		if(yn.equals("y")) {
			list.remove(index);
			printAll();
		}else if(yn.equals("n")) {
			printOne(index);
		}
		
	}
	
	private static int validateIntegerValue(int min, int max) throws NumberFormatException, IOException {
		int value = Integer.parseInt(bufferedReader.readLine()); 
		while(value < min || value > max) {
			System.out.println("잘못 입력하셨습니다.");
			System.out.println("다시 입력해주세요.");
			System.out.print("> ");
			value = Integer.parseInt(bufferedReader.readLine()); 
		}
		return value;
	}
	private static int validateScore() throws NumberFormatException, IOException {
		int score = Integer.parseInt(bufferedReader.readLine());
		while(0 > score || score > 100) {
			System.out.println("잘못 입력하셨습니다.");
			System.out.println("다시 입력해 주세요. ");
			System.out.print("> ");
			score = Integer.parseInt(bufferedReader.readLine());
		}
		return score;
	}
}