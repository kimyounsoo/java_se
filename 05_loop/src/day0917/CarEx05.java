package day0917;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import day0915.Car;

//만약 꽉 차면
//가장 앞에 거부터 제거하고
//한칸씩 땡겨서 맨 마지막에 덮어씌우는 형식으로
//배열을 관리하는 프로그램
public class CarEx05 {
	private static int SIZE = 3;
	public static void main(String[] args) throws NumberFormatException, IOException {
		Car[] carArray = new Car[SIZE];
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			showMenu();
			int userChoice = Integer.parseInt(bufferedReader.readLine());
			if(userChoice == 1) {
				//입력 메소드 실행
				carArray = add(carArray);
			}else if(userChoice == 2) {
				//출력 메소드 실행
				printArray(carArray);
			}else if(userChoice == 3) {
				//메시지 출력 후 종료
				System.out.println("사용해주셔서 감사합니다.");
				break;
				
			}else {
				System.out.println("잘못입력하셨습니다.");
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
	
	private static Car[] add(Car[] carArray) throws IOException { // 이 메소드의 리턴 '타입' 은 Car
		int index = findEmptyIndex(carArray); 
		if(index != -1) {
			//index 가 -1 이 아니면
			//빈칸이 존재하므로 index 번 칸에
			//Car 객체를 넣어준다.
			carArray[index] = setCarinfo();
		}else {
			//배열이 모두다 꽉 찼으므로 배열을 한칸씩 땡겨서
			//맨 마자믹 칸에 새로운 입력된 c를 넣게 만들어주자
			for(int i = 1; i < carArray.length; i++) {
				carArray[i-1] = carArray[i]; // 한칸씩 땡겨주고
			}
			carArray[SIZE - 1] = setCarinfo(); // carArray 가장 마지막칸에 새로운 Car 객체를 넣어주는것
		}
		
		return carArray;
	}
	
	private static Car setCarinfo() throws IOException { // 메소드의 리턴 '타입' 은 Car, Car클래스의 객체가 된다
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		Car c = new Car();
		
		System.out.println("차량 번호: ");
		c.setNumber(bufferedReader.readLine());
		
		System.out.println("차량 종류: ");
		c.setType(bufferedReader.readLine());
		
		System.out.println("차량 연식: ");
		c.setYear(Integer.parseInt(bufferedReader.readLine()));
		
		System.out.println("차량 가격: ");
		c.setPrice(Integer.parseInt(bufferedReader.readLine()));
		
		System.out.println("차량 색상: ");
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
		System.out.println("비트 차량관리 프로그램 ver 2.0");
		System.out.println("1. 입력 2. 출력 3. 종료");
		System.out.println("> ");
	}

}
