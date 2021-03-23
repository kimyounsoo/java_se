package day0918;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import day0915.Student;
import util.ArrayUtil;

//���� �Ҵ��� �Ǵ� �迭 student ����						  // ���۵帮���� �������̱⶧���� �η� �ʱ�ȭ�Ѵ�
public class StudentEx01 {						  // ��ҿ��� ���۵帮���� �׻� �Ķ���Ϳ� �Է��ؼ� ����߾����� ���⼭�� ���۵帮���� �ʵ�ȭ�ؼ� ����Ѵ�
	private static BufferedReader bufferedReader; // ���۵帮���� �ʵ�ȭ�ؼ� �ϳ�������ش�
	private static Student[] studentArray; //Car[] add�޼ҵ忡�� carArray�� �������־����� ���⼱ ���ص��Ǵ�������
										   // Student[]���⼭ �ʵ�ȭ �߱⶧���� ������ �ҷ��� �ʿ䰡���?? ����Ѵ�
	public static void main(String[] args) throws NumberFormatException, IOException {
		// �ؿ� �� �̾����� �̰͵��ʵ�� �ٲ��
		//Student[] student = new Student[0];		  
		studentArray = new Student[0];
		bufferedReader = new BufferedReader(new InputStreamReader(System.in));// ���۵帮���� �ʱ�ȭ�� ���ְ���
																  			  // ���θ޼ҵ忡�� �ʱ�ȭ, �� �����ڸ� ȣ���ϰ� �������ʹ�
			showMenu();														  // ���� ���θ޼ҵ尡 �ٸ� �޼ҵ带 �� ���Ŀ� ȣ���ϰ� �ȴٸ�
	}			  															  // �̹� �ʱ�ȭ�� �� ���� �̱⶧���� NullPointException �� �߻����� �ʰ�
			 																  // ���������� ����� �� �ִ�.
	private static void showMenu() throws NumberFormatException, IOException {
		while(true) {
			System.out.println("��Ʈ ���� ���� ���α׷�");
			System.out.println("1. �Է� 2. ��� 3. ����");
			System.out.println("> ");
			int userChoice = Integer.parseInt(bufferedReader.readLine());
			if(userChoice == 1) {											 
				//�Է� �޼ҵ� ����
				add();
			}else if(userChoice == 2) {
				//��¸޼ҵ� ����
				printArray();
			}else if(userChoice == 3) {
				System.out.println("������ּż� �����մϴ�.");
				break;
			}else {
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}
		}
	}
	
	private static void printArray() {
		for(int i = 0; i < studentArray.length; i++) {
			System.out.println(studentArray[i]);// pirntln�� �Ķ���͸� ������ toString ��ü�� ȭ�鿡 ��µǵ��� �ڹٰ� �˾Ƽ��߱⶧���� toString �̳��´�??		
			}									// �׷��� toString�� ������ �ּҰ��� �״�� ���´ٰ��Ѵ�
	}
			
		private static void add() throws NumberFormatException, IOException {
		studentArray = ArrayUtil.add(studentArray, setStudentInfo());
	}
	
	private static Student setStudentInfo() throws NumberFormatException, IOException {
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
}

