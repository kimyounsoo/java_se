package day0917;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import day0915.Car;
import util.ArrayUtil;

//�����Ҵ��� �Ǵ� �迭����
public class CarEx06 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Car[] carArray = new Car[0]; // �÷ȴ� �ٿ��� �ҰŶ� ������ 0�ΰ�
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			showMenu();
			int userChoice = Integer.parseInt(bufferedReader.readLine());
			if(userChoice == 1) {
				//carArray �߰� �޼ҵ� ����
				 carArray = add(carArray, bufferedReader);
			}else if(userChoice == 2) {
				//carArray ��� �޼ҵ� ����
				printArray(carArray);
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
	
	private static Car[] add(Car[] carArray, BufferedReader bufferedReader) throws NumberFormatException, IOException { // ���۵帮�� ���������� ���ϰ� �ѹ��� �����Ҽ� �ְ� �Ķ���ͷ� �Դٰ����Ұſ���
		carArray = ArrayUtil.add(carArray, setCarInfo(bufferedReader));
		
		return carArray;
	}
	
	private static Car setCarInfo(BufferedReader bufferedReader) throws NumberFormatException, IOException {
		Car c = new Car();
		
		System.out.println("���� ��ȣ: ");
		c.setNumber(bufferedReader.readLine());
		
		System.out.println("���� ����: ");
		c.setYear(Integer.parseInt(bufferedReader.readLine()));
		
		System.out.println("���� ����: ");
		c.setPrice(Integer.parseInt(bufferedReader.readLine()));
		
		System.out.println("���� ����: ");
		c.setColor(bufferedReader.readLine());
		
		System.out.println("���� ����: ");
		c.setType(bufferedReader.readLine());
		
		return c; // ����Ÿ���� Car �̹Ƿ� Car Ŭ������ c ��ü�� ��ȯ�ϰڴٴ� �ǹ���
	}			  // setCarinfo���ּҰ��� �ѱ�� ??
				  // �ڵ��� ����Ű�� ����ٰ��ؼ� �� ��ȣ ��ü�� �������°��� �ƴѰͰ� ���� ����
	
	private static void printArray(Car[] carArray) {
		for(int i = 0; i < carArray.length; i++) {
			System.out.println(carArray[i]);
		}
	}
}
