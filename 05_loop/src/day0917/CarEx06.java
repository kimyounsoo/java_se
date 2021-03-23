package day0917;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import day0915.Car;
import util.ArrayUtil;

//동적할당이 되는 배열버젼
public class CarEx06 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Car[] carArray = new Car[0]; // 늘렸다 줄였다 할거라서 시작은 0인것
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			showMenu();
			int userChoice = Integer.parseInt(bufferedReader.readLine());
			if(userChoice == 1) {
				//carArray 추가 메소드 실행
				 carArray = add(carArray, bufferedReader);
			}else if(userChoice == 2) {
				//carArray 출력 메소드 실행
				printArray(carArray);
			}else if(userChoice == 3) {
				System.out.println("사용해주셔서 감사합니다.");
				break;
			}else {
				System.out.println("잘못입력하셨습니다.");
			}
		}
	}
	private static void showMenu() {
		System.out.println("1. 입력 2. 출력 3. 종료");
		System.out.println("> ");
	}
	
	private static Car[] add(Car[] carArray, BufferedReader bufferedReader) throws NumberFormatException, IOException { // 버퍼드리더 여러번선언 안하고 한번만 선언할수 있게 파라미터로 왔다갔다할거에요
		carArray = ArrayUtil.add(carArray, setCarInfo(bufferedReader));
		
		return carArray;
	}
	
	private static Car setCarInfo(BufferedReader bufferedReader) throws NumberFormatException, IOException {
		Car c = new Car();
		
		System.out.println("차량 번호: ");
		c.setNumber(bufferedReader.readLine());
		
		System.out.println("차량 연식: ");
		c.setYear(Integer.parseInt(bufferedReader.readLine()));
		
		System.out.println("차량 가격: ");
		c.setPrice(Integer.parseInt(bufferedReader.readLine()));
		
		System.out.println("차량 색상: ");
		c.setColor(bufferedReader.readLine());
		
		System.out.println("차량 종류: ");
		c.setType(bufferedReader.readLine());
		
		return c; // 리턴타입이 Car 이므로 Car 클래스의 c 객체를 반환하겠다는 의미임
	}			  // setCarinfo에주소값을 넘긴다 ??
				  // 핸드폰 단축키를 지운다고해서 그 번호 자체가 없어지는것은 아닌것과 같은 원리
	
	private static void printArray(Car[] carArray) {
		for(int i = 0; i < carArray.length; i++) {
			System.out.println(carArray[i]);
		}
	}
}
