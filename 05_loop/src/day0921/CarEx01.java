package day0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import day0915.Car;
import day0918.Board;

//자동차 관리 프로그램을  ArrayList로 작성하세요
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
			System.out.println("차량 관리 프로그램");
			System.out.println("1. 입력 2. 출력 3. 종료");
			int choice = validateNumber(1, 3);
			if (choice == 1) {
				add();
			}else if (choice == 2) {
				selectAll();
			}else if (choice == 3) {
			System.out.println("사용해주셔서 감사합니다.");
			break;
		}
	}
}
	
	private static void selectAll() throws NumberFormatException, IOException {
	      System.out.println("===차량목록===");
	      for (int i = 0; i < list.size(); i++) {
	         System.out.printf("%d. %s\n", (i + 1), list.get(i).getNumber());
	      }
	      System.out.println("개별보기할  차량번호를 입력해주세요(0은 메인으로)");
	      int choice = validateNumber(0, list.size()) - 1;
	      if (choice == -1) {
	         System.out.println("메인 메뉴로 이동합니다.");
	      } else {
	         selectOne(choice);
	      }
	   }
	
		private static void selectOne(int index) throws NumberFormatException, IOException {
		Car c = list.get(index);
		System.out.println("차량번호: "+ c.getNumber());
		System.out.println("차량종류: "+ c.getType());
		System.out.println("차량연식: "+ c.getYear());
		System.out.println("차량가격: "+ c.getPrice());
		System.out.println("차량색깔: "+ c.getColor());
		System.out.println("========================");
		System.out.println("1. 수정 2. 삭제 3. 목록으로");
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
		System.out.println("차량번호: ");
		list.get(index).setNumber(bufferedReader.readLine());
		System.out.println("차량종류: ");
		list.get(index).setType(bufferedReader.readLine());
		System.out.println("차량연식: ");
		list.get(index).setYear(Integer.parseInt(bufferedReader.readLine()));
		System.out.println("차량가격: ");
		list.get(index).setPrice(Integer.parseInt(bufferedReader.readLine()));
		System.out.println("차량색깔: ");
		list.get(index).setColor(bufferedReader.readLine());
	}
	
	   private static void delete(int index) throws IOException {
		      System.out.print("정말로 삭제하시겠습니까?(y/n) ");
		      String yn = bufferedReader.readLine();
		      if (yn.equals("y")) {
		         list.remove(index);
		      } else if (yn.equals("n")) {
		         selectOne(index);
		      }
		   }
	   private static void add() throws NumberFormatException, IOException {
		      Car c = new Car();
		      System.out.print("차량 번호: ");
		      c.setNumber(bufferedReader.readLine());
		      while(list.contains(c)) {
		    	  System.out.println("이미 존재하는 차량 번호입니다.");
		    	  System.out.print("차량 번호: ");
		    	  c.setNumber(bufferedReader.readLine());
		      }

		      System.out.print("차량 종류: ");
		      c.setType(bufferedReader.readLine());

		      System.out.print("차량 연식: ");
		      c.setYear(Integer.parseInt(bufferedReader.readLine()));

		      System.out.print("차량 가격: ");
		      c.setPrice(Integer.parseInt(bufferedReader.readLine()));
		      
		      System.out.print("차량 색깔: ");
		      c.setColor(bufferedReader.readLine());

		      list.add(c);
		   }
	private static int validateNumber(int minimum, int maximum) throws NumberFormatException, IOException {
		System.out.println("> ");
		int value = Integer.parseInt(bufferedReader.readLine());
		while (value < minimum || value > maximum) {
			System.out.println("잘못 입력하셨습니다.");
			System.out.println("> ");
			value = Integer.parseInt(bufferedReader.readLine());
		}
		
		return value;
	}
	
}


