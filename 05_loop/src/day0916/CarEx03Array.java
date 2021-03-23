package day0916;

import day0915.Car;

//클래스 배열
public class CarEx03Array {
	final static int SIZE = 3;
	public static void main(String[] args) {
		Car[] carArray = new Car[SIZE];
		for(int i =0; i < carArray.length; i++) {
			//클래스의 배열은 배열 생성과 초기화 이후에
			//각 위치마다 우리가 생성자를 호출해서
			//해당 인덱스에 초기화를 해주어야 한다.
			//하지 않으면 NullPointException이 발생한다.
			//똑같은 자료형의 변수가 여러개 모여있는것이 배열
			carArray[i] = new Car(); // carArray[1] = new Car(); 1~i 초기화
			carArray[i].setType("스포츠카");
			carArray[i].setColor("노란색");
			carArray[i].setNumber("7777");
			carArray[i].setPrice(17);
		}
		
		for(int i = 0; i < carArray.length; i++) {
			System.out.println(carArray[i]);
		}

	}
}
