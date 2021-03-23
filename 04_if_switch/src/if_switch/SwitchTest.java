package if_switch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchTest {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		
		System.out.print("원하는 월 입력 : ");
		int month = Integer.parseInt(br.readLine());
		int days=0;
		switch(month) {
		case 1 : 
		case 3 :
		case 5 : 
		case 7 : 
		case 8 :
		case 10 : 
		case 12 : days= 31; break; // switch를 벗어나라
		case 2 : days= 28; break;
		 
		case 4 : 
		case 6 : 
		case 9 : 
		case 11 : days= 30; break; //마지막것은 나갈곳이 한군데라 안해도됨
		default : days=0;         //default 는 그외값, 1도아니고 2도아니고 3도아니고 4도아니고
		}
		
		System.out.println(month+"월은 " +days+"일 입니다");

	}

}
