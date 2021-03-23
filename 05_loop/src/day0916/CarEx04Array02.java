package day0916;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import day0915.Car;

//
public class CarEx04Array02 {
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
            if(findEmptyIndex(carArray) == -1) {
               // 빈칸이 없으므로 경고 메시지만 출력
               System.out.println("빈칸이 없습니다.");
            }else {
               // 빈칸이 있으니깐 C 객체 를 만들어주자
               Car c = new Car();

                System.out.print("차량 번호: ");
               c.setNumber(bufferedReader.readLine());
               
               System.out.print("차량 종류: ");
               c.setType(bufferedReader.readLine());
               
               System.out.print("차량 연식: ");
               c.setYear(Integer.parseInt(bufferedReader.readLine()));
               
               System.out.print("차량 가격: ");
               c.setPrice(Integer.parseInt(bufferedReader.readLine()));
               
               System.out.print("차량 색상: ");
               c.setColor(bufferedReader.readLine());
               
               carArray = add(carArray, c);
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
   
   // 1. 배열의 빈칸을 찾아주는 findEmptyIndex(Car[] carArray) 메소드
   private static int findEmptyIndex(Car[] carArray) {
      for(int i = 0; i < carArray.length; i++) {
         if(carArray[i] == null) {
            return i;
         }
      }
      
      return -1; // null인공간이 없다 즉 car 객체가 모든공간에 있다
   }
   
   // 2. 파라미터로 Car 배열과 Car 객체를 받아서 Car 객체를 배열에 넣어서
   // 그 배열을 리턴하는 add(Car[] carArray, Car c) 메소드
   private static Car[] add(Car[] carArray, Car c) {
      int index = findEmptyIndex(carArray);
      carArray[index] = c; //덮어씌어 줘서 그 칸은  널이 아니니까 출력해라
      
      return carArray;
   }
   
   private static void printArray(Car[] carArray) {
      for(int i = 0; i < carArray.length; i++) {
         if(carArray[i] != null) {
            System.out.println(carArray[i]);
         }
      }
   }
   
   private static void showMenu() {
      System.out.println("차량관리 프로그램");
      System.out.println("1. 입력 2. 출력 3. 종료");
      System.out.print("> ");
   }
}

// 예제 1: 현재 입력 하는 코드들을 2개의 메소드로 나누세요
//       메소드 1: 입력할 index를 찾는 메소드
//       메소드 2: 배열에 해당위치에 Car 객체를 넣어서 배열을 다시 리턴해주는 메소드
// 예제 2: 현재 출력 하는 코드들을 메소드로 분리하세요
// 예제 3: 메뉴를 출력하는 코드들을 메소드로 분리하세요 

















