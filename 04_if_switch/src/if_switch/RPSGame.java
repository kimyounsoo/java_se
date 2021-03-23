package if_switch;

import java.io.IOException;

/*
 가위(1), 바위(2), 보(3) 게임

[실행결과]
가위(1),바위(2),보(3) 중 번호 입력 : 3 (user)
컴퓨터 : 바위   나 : 보자기
You Win!!

가위(1),바위(2),보(3) 중 번호 입력 : 3 (user)
컴퓨터 : 가위   나 : 보자기
You Lose!!

가위(1),바위(2),보(3) 중 번호 입력 : 1 (user)
컴퓨터 : 가위   나 : 가위
You Draw!!
 */
public class RPSGame  {

	public static void main(String[] args) throws IOException {
		
		  int com, user;
	      
	      com = (int)(Math.random()*3)+1; //1~3 난수 발생
	      
	      System.out.print("가위(1),바위(2),보(3) 중 번호 입력 : ");
	      //user = System.in.read()-48; //1개 문자 입력
	      user = System.in.read()-'0';
	      
	      if(com==1) {//컴이 가위인 경우
	         if(user==1) {
	            System.out.println("컴퓨터 : 가위\t 사용자 : 가위");
	            System.out.println("Draw!!");
	         }else if(user==2){
	            System.out.println("컴퓨터 : 가위\t 사용자 : 바위");
	            System.out.println("Win!!");
	         }else if(user==3){ // 마지막것이라 else 로 해도 상관무
	            System.out.println("컴퓨터 : 가위\t 사용자 : 보자기");
	            System.out.println("Lose!!");
	         }
	         
	      }else if(com==2) {//컴이 바위인 경우
	         if(user==1){
	            System.out.println("컴퓨터 : 바위\t 사용자 : 가위");
	            System.out.println("Lose!!");
	         }
	         else if(user==2){
	            System.out.println("컴퓨터 : 바위\t 사용자 : 바위");
	            System.out.println("Draw!!");
	         }
	         else if(user==3){ // 마지막것이라 else 로 해도 상관무
	            System.out.println("컴퓨터 : 바위\t 사용자 : 보자기");
	            System.out.println("Win!!");
	         }
	         
	      }else if(com==3) {//컴이 보자기인 경우, 마지막것이라 else 로 해도 상관무
	         if(user==1){
	            System.out.println("컴퓨터 : 보자기\t 사용자 : 가위");
	            System.out.println("Win!!");
	         }
	         else if(user==2){
	            System.out.println("컴퓨터 : 보자기\t 사용자 : 바위");
	            System.out.println("Lose!!");
	         }
	         else if(user==3){ // 마지막것이라 else 로 해도 상관무
	            System.out.println("컴퓨터 : 보자기\t 사용자 : 보자기");
	            System.out.println("Draw!!");
	         }
	      }
	}
}
	      
	