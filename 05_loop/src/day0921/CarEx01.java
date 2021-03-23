package day0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import day0915.Car;
import day0918.Board;

//�ڵ��� ���� ���α׷���  ArrayList�� �ۼ��ϼ���
public class CarEx01 {
	private static ArrayList<Car> list;
	private static BufferedReader bufferedReader;
	public static void main(String[] args) throws NumberFormatException, IOException {
		list = new ArrayList<>();
		bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		showMenu();
	}
	
	private static void showMenu() throws NumberFormatException, IOException {
		while(true) {
			System.out.println("���� ���� ���α׷�");
			System.out.println("1. �Է� 2. ��� 3. ����");
			int choice = validateNumber(1, 3);
			if (choice == 1) {
				add();
			}else if (choice == 2) {
				selectAll();
			}else if (choice == 3) {
			System.out.println("������ּż� �����մϴ�.");
			break;
		}
	}
}
	
	private static void selectAll() throws NumberFormatException, IOException {
	      System.out.println("===�������===");
	      for (int i = 0; i < list.size(); i++) {
	         System.out.printf("%d. %s\n", (i + 1), list.get(i).getNumber());
	      }
	      System.out.println("����������  ������ȣ�� �Է����ּ���(0�� ��������)");
	      int choice = validateNumber(0, list.size()) - 1;
	      if (choice == -1) {
	         System.out.println("���� �޴��� �̵��մϴ�.");
	      } else {
	         selectOne(choice);
	      }
	   }
	
		private static void selectOne(int index) throws NumberFormatException, IOException {
		Car c = list.get(index);
		System.out.println("������ȣ: "+ c.getNumber());
		System.out.println("��������: "+ c.getType());
		System.out.println("��������: "+ c.getYear());
		System.out.println("��������: "+ c.getPrice());
		System.out.println("��������: "+ c.getColor());
		System.out.println("========================");
		System.out.println("1. ���� 2. ���� 3. �������");
		int choice = validateNumber(1, 3);
		if (choice == 1){
			update(index);
		}else if (choice == 2) {
			delete(index);
		}else if (choice == 3) {
			selectAll();
		}
	}
	
	private static void update(int index) throws IOException {
		System.out.println("������ȣ: ");
		list.get(index).setNumber(bufferedReader.readLine());
		System.out.println("��������: ");
		list.get(index).setType(bufferedReader.readLine());
		System.out.println("��������: ");
		list.get(index).setYear(Integer.parseInt(bufferedReader.readLine()));
		System.out.println("��������: ");
		list.get(index).setPrice(Integer.parseInt(bufferedReader.readLine()));
		System.out.println("��������: ");
		list.get(index).setColor(bufferedReader.readLine());
	}
	
	   private static void delete(int index) throws IOException {
		      System.out.print("������ �����Ͻðڽ��ϱ�?(y/n) ");
		      String yn = bufferedReader.readLine();
		      if (yn.equals("y")) {
		         list.remove(index);
		      } else if (yn.equals("n")) {
		         selectOne(index);
		      }
		   }
	   private static void add() throws NumberFormatException, IOException {
		      Car c = new Car();
		      System.out.print("���� ��ȣ: ");
		      c.setNumber(bufferedReader.readLine());
		      while(list.contains(c)) {
		    	  System.out.println("�̹� �����ϴ� ���� ��ȣ�Դϴ�.");
		    	  System.out.print("���� ��ȣ: ");
		    	  c.setNumber(bufferedReader.readLine());
		      }

		      System.out.print("���� ����: ");
		      c.setType(bufferedReader.readLine());

		      System.out.print("���� ����: ");
		      c.setYear(Integer.parseInt(bufferedReader.readLine()));

		      System.out.print("���� ����: ");
		      c.setPrice(Integer.parseInt(bufferedReader.readLine()));
		      
		      System.out.print("���� ����: ");
		      c.setColor(bufferedReader.readLine());

		      list.add(c);
		   }
	private static int validateNumber(int minimum, int maximum) throws NumberFormatException, IOException {
		System.out.println("> ");
		int value = Integer.parseInt(bufferedReader.readLine());
		while (value < minimum || value > maximum) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			System.out.println("> ");
			value = Integer.parseInt(bufferedReader.readLine());
		}
		
		return value;
	}
	
}


