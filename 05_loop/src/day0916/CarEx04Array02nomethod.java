package day0916;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import day0915.Car;

//
public class CarEx04Array02nomethod {
   private static int SIZE = 3;
   public static void main(String[] args) throws NumberFormatException, IOException {
      //사용자가 입력한 값으로 Car 객체를 만들어서
      //Car배열에 비어있는 칸에 넣고
      //비어있는 칸이 없으면 "빈 칸이 없습니다" 라고 나오는 프로그램을 만들어보자
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      Car[] carArray = new Car[SIZE];
      
      while(true) {
         System.out.println("1. 입력 2. 출력 3. 종료");
         int userChoice = Integer.parseInt(bufferedReader.readLine());
         //만약 입력을 눌렀을 때
         //빈칸인지 아닌지는 어떻게 알 수 있을까?
         if(userChoice == 1) {
				int index = -23; // -1 로 초기화 하는 이유는 for 문을 돌려서  ??
				for(int i = 0; i < carArray.length; i++) {
					if(carArray[i] == null) { //carArray의 i번째가 널이되면 index가 i로 바뀐다 절대로 불가능한 인덱스 값 -1
						index = i;
						break; // 0이 널이면 1은 검사안해도 되고 1이 널이면 2는 검사안해도 되기때문에
					}
				}
				
				if(index == -23) { // null 인공간이 없다 즉 모든공간에 car객체가있다
					System.out.println("빈칸이 없습니다.");
				}else {
					Car c = new Car();			
					
					System.out.print("번호: ");
					c.setNumber(bufferedReader.readLine());
					System.out.print("차종: ");
					c.setType(bufferedReader.readLine());
					System.out.print("연식: ");
					c.setYear(Integer.parseInt(bufferedReader.readLine()));
					System.out.print("가격: ");
					c.setPrice(Integer.parseInt(bufferedReader.readLine()));
	               	System.out.print("색상: ");
		            c.setColor(bufferedReader.readLine());
		            carArray[index] = c; // 해당칸을 c의 주소값을 연결시켜준것 널이였던  carArray의 index번쨰 칸을 c로 향하게 바꾸어준것
				} 	
				}else if(userChoice == 2) {
            //출력을 하되 해당칸이 null 이면 출력하지 않는다.
            for(int i = 0; i < carArray.length; i++) {
               if(carArray[i] != null) {
                  System.out.println(carArray[i]);
               }
            }
            
         }else if(userChoice == 3) {
            System.out.println("사용해주셔서 감사합니다.");
            break;
         }
      }
   }
}

   
 

// 예제 1: 현재 입력 하는 코드들을 2개의 메소드로 나누세요
//       메소드 1: 입력할 index를 찾는 메소드
//       메소드 2: 배열에 해당위치에 Car 객체를 넣어서 배열을 다시 리턴해주는 메소드
// 예제 2: 현재 출력 하는 코드들을 메소드로 분리하세요
// 예제 3: 메뉴를 출력하는 코드들을 메소드로 분리하세요 

















