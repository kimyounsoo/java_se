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
			System.out.println("1. �Է� 2. ��� 3. ����");
			System.out.println("> ");
			int userChoice = Integer.parseInt(bufferedReader.readLine());
			if(userChoice == 1) {
				//���� �Է�
	            System.out.print("�̸�: ");
	            s.setName(bufferedReader.readLine());
	            System.out.print("�й�: ");
	            s.setId(Integer.parseInt(bufferedReader.readLine()));
	            System.out.print("����: ");
	            s.setKor(Integer.parseInt(bufferedReader.readLine()));
	            System.out.print("����: ");
	            s.setEng(Integer.parseInt(bufferedReader.readLine()));
	            System.out.print("����: "); 
	            s.setMath(Integer.parseInt(bufferedReader.readLine()));

			}else if(userChoice == 2) {
				//���� ���
				//���� �л��� �̸��� �����ϴ��� üũ�ϰ�
				//�������� ������ ���޽����� ���
				if(s.getName().isEmpty()) {
					System.out.println("���� �Էµ� ������ �����ϴ�.");
				}else {
					System.out.printf("�̸�: %s, ����: %d�� ����: %d�� ����: %d��\n", s.getName(), s.getKor(),s.getEng(),s.getMath());
					System.out.printf("%s �л��� ����: %d�� ���: %.2f��\n",s.getName(), s.calculateSum(), s.calculateAverage());
				}
			}else if(userChoice == 3) {
				//����
				System.out.println("������ּż� �����մϴ�.");
				break;
			}else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
	}

}
