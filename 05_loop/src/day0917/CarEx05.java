package day0917;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import day0915.Car;

//���� �� ����
//���� �տ� �ź��� �����ϰ�
//��ĭ�� ���ܼ� �� �������� ������ ��������
//�迭�� �����ϴ� ���α׷�
public class CarEx05 {
	private static int SIZE = 3;
	public static void main(String[] args) throws NumberFormatException, IOException {
		Car[] carArray = new Car[SIZE];
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			showMenu();
			int userChoice = Integer.parseInt(bufferedReader.readLine());
			if(userChoice == 1) {
				//�Է� �޼ҵ� ����
				carArray = add(carArray);
			}else if(userChoice == 2) {
				//��� �޼ҵ� ����
				printArray(carArray);
			}else if(userChoice == 3) {
				//�޽��� ��� �� ����
				System.out.println("������ּż� �����մϴ�.");
				break;
				
			}else {
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}
		}
	}
	
	private static void printArray(Car[] carArray) {
		for(int i = 0; i < carArray.length; i++) {
			if(carArray[i]!= null) {
				System.out.println(carArray[i]);
			}
		}
	}
	
	private static Car[] add(Car[] carArray) throws IOException { // �� �޼ҵ��� ���� 'Ÿ��' �� Car
		int index = findEmptyIndex(carArray); 
		if(index != -1) {
			//index �� -1 �� �ƴϸ�
			//��ĭ�� �����ϹǷ� index �� ĭ��
			//Car ��ü�� �־��ش�.
			carArray[index] = setCarinfo();
		}else {
			//�迭�� ��δ� �� á���Ƿ� �迭�� ��ĭ�� ���ܼ�
			//�� ���ڹ� ĭ�� ���ο� �Էµ� c�� �ְ� ���������
			for(int i = 1; i < carArray.length; i++) {
				carArray[i-1] = carArray[i]; // ��ĭ�� �����ְ�
			}
			carArray[SIZE - 1] = setCarinfo(); // carArray ���� ������ĭ�� ���ο� Car ��ü�� �־��ִ°�
		}
		
		return carArray;
	}
	
	private static Car setCarinfo() throws IOException { // �޼ҵ��� ���� 'Ÿ��' �� Car, CarŬ������ ��ü�� �ȴ�
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		Car c = new Car();
		
		System.out.println("���� ��ȣ: ");
		c.setNumber(bufferedReader.readLine());
		
		System.out.println("���� ����: ");
		c.setType(bufferedReader.readLine());
		
		System.out.println("���� ����: ");
		c.setYear(Integer.parseInt(bufferedReader.readLine()));
		
		System.out.println("���� ����: ");
		c.setPrice(Integer.parseInt(bufferedReader.readLine()));
		
		System.out.println("���� ����: ");
		c.setColor(bufferedReader.readLine());
		
		return c;
	}
	
	private static int findEmptyIndex(Car[] carArray) {
		for(int i = 0; i < carArray.length; i++) {
			if(carArray[i] == null) {
				return i;
			}
		}
		return -1;
	}
	
	private static void showMenu() {
		System.out.println("��Ʈ �������� ���α׷� ver 2.0");
		System.out.println("1. �Է� 2. ��� 3. ����");
		System.out.println("> ");
	}

}
