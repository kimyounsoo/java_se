package day0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import day0915.Student;

//����:
//Student�� ��̸���Ʈ �������� ���弼��
//�� ���ڸ� �Է��Ҷ� ���ڰ� �ԷµǸ�
//�߸��Է��ϼ����� �ٽ� ���ڸ� �Է��ϼ���
//�� �ߵ��� ���弼��
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
			System.out.println("��Ʈ �л��������α׷�");
			System.out.println("1. �Է� 2. ��� 3. ����");
			int userChoice = validateIntegerValue(1, 3);
			if(userChoice == 1) {
				add();
			}else if(userChoice == 2) {
				printAll();
			}else if(userChoice == 3) {
				System.out.println("����Ǿ����ϴ�.");
				break;
			}
		}
	}
	
	private static void add() throws IOException {
		Student s = new Student();
		System.out.print("�̸� : ");
		s.setName(bufferedReader.readLine());
		System.out.print("�й� : ");
		s.setId(Integer.parseInt(bufferedReader.readLine()));
		while(list.contains(s)) {
			System.out.println("�̹� �����ϴ� �л��Դϴ�.");
			System.out.print("�л� �̸�: ");
			s.setName(bufferedReader.readLine());
			
			System.out.print("�й�: ");
			s.setId(Integer.parseInt(bufferedReader.readLine()));
		}
		
		System.out.print("���� : ");
		s.setKor(validateScore());
		System.out.print("���� : ");
		s.setEng(validateScore());
		System.out.print("���� : ");
		s.setMath(validateScore());
		
		list.add(s);
	}

	private static void printAll() throws NumberFormatException, IOException {
	System.out.println("===================");
	for(int i = 0; i < list.size(); i++) {
		System.out.printf("%d. %s\n", (i+1), list.get(i).getName());
	}
	System.out.println("===================");
	System.out.println("���� ������ �л��� ��ȣ�� �Է����ּ��� (0�� ����)");
	System.out.print("> ");
	int userChoice = validateIntegerValue(0, list.size()) - 1;
	if(userChoice == -1) {
		System.out.println("����ȭ������ ���ư��ϴ�.");
	}else {
		printOne(userChoice);
	}
	
	}

	private static void printOne(int index) throws NumberFormatException, IOException {
		System.out.println("============================");
		System.out.printf("\t%s �л�����\n", list.get(index).getName());
		System.out.printf("�й�: %d �̸�: %s\n", list.get(index).getId(), list.get(index).getName());
		System.out.printf("����: %03d�� ����: %03d�� ����: %03d��\n",
				list.get(index).getKor(), list.get(index).getEng(),list.get(index).getMath());
		System.out.printf("����: %03d�� ���: %.2f��\n", list.get(index).calculateSum(),list.get(index).calculateAverage());
        System.out.println("=========================================");
        System.out.println("1. ���� 2. ���� 3. �������");
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
		System.out.print("�̸� : ");
		list.get(index).setName(bufferedReader.readLine());
		System.out.print("�й� : ");
		list.get(index).setId(Integer.parseInt(bufferedReader.readLine()));
		System.out.print("���� : ");
		list.get(index).setEng(validateScore());
		System.out.print("���� : ");
		list.get(index).setKor(validateScore());
		System.out.print("���� : ");
		list.get(index).setMath(validateScore());
		
		printOne(index);
	}
		
	private static void delete(int index) throws IOException {
		System.out.println("�ش� �л������ �����Ͻðڽ��ϱ�? (y/n)");
		System.out.print("> ");
		String yn = bufferedReader.readLine().toLowerCase(); // �빮�ڷνᵵ �ҹ��ڷ� ��µǰ��ϴ� ��Ʈ���޼ҵ�
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
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			System.out.println("�ٽ� �Է����ּ���.");
			System.out.print("> ");
			value = Integer.parseInt(bufferedReader.readLine()); 
		}
		return value;
	}
	private static int validateScore() throws NumberFormatException, IOException {
		int score = Integer.parseInt(bufferedReader.readLine());
		while(0 > score || score > 100) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			System.out.println("�ٽ� �Է��� �ּ���. ");
			System.out.print("> ");
			score = Integer.parseInt(bufferedReader.readLine());
		}
		return score;
	}
}