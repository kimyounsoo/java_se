package day0917;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import day0915.Student;
import util.ArrayUtil;

//���� �Ҵ��� �Ǵ� �迭 student ����
public class StudentEx03 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Student[] studentArray = new Student[0];
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			showMenu();
			int userChoice = Integer.parseInt(bufferedReader.readLine());
			if(userChoice == 1) {
				//studentArray �߰��޼ҵ� ����
				studentArray = add(studentArray, bufferedReader);
			}else if(userChoice == 2) {
				//studentArray ��¸޼ҵ� ����
				printArray(studentArray);
			}else if(userChoice == 3) {
				System.out.println("������ּż� �����մϴ�.");
				break;
			}else {
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}
		}
	}
	private static void showMenu() {
		System.out.println("1. �Է� 2. ��� 3. ����");
		System.out.println("> ");
	}
	
	private static Student[] add(Student[] studentArray, BufferedReader bufferedReader) throws NumberFormatException, IOException { // ���۵帮�� ���������� ���ϰ� �ѹ��� �����Ҽ� �ְ� �Ķ���ͷ� �Դٰ����Ұſ���
		studentArray = ArrayUtil.add(studentArray, setStudentInfo(bufferedReader));
		
		return studentArray;
	}
	
	private static Student setStudentInfo(BufferedReader bufferedReader) throws NumberFormatException, IOException {
		Student s = new Student();
		
		System.out.println("�̸�: ");
		s.setName(bufferedReader.readLine());
		
		System.out.println("�й�: ");
		s.setId(Integer.parseInt(bufferedReader.readLine()));
		
		System.out.println("��������: ");
		s.setKor(Integer.parseInt(bufferedReader.readLine()));
		
		System.out.println("��������: ");
		s.setEng(Integer.parseInt(bufferedReader.readLine()));
		
		System.out.println("��������: ");
		s.setMath(Integer.parseInt(bufferedReader.readLine()));
		
		return s;

}
	
	private static void printArray(Student[] studentArray) {
		for(int i = 0; i < studentArray.length; i++) {
			System.out.println(studentArray[i]);
	
		}
	}
}
