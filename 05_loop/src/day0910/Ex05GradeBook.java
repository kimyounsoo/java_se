package day0910;
/*성적관리 프로그램
 *우리가 사용자로부터 입력을 받되
 *제일 마지막에 사용자로 부터 계속할지 말지를 입력받아서
 *만약 사용자가 종료를 선택하면 프로그램이 종료가 되는 형식을 만들어보자
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex05GradeBook {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//스트링 초기화 해주는방법
		//1번
		String yn = new String();
//		 System.out.println("1번: "+yn);
//		//2번
//		yn = null;
//		System.out.println("2번: "+yn);
//		//3번
//		yn="";
//		System.out.println("3번: "+yn);
//		//4번
//		yn="스트링";
//		System.out.println("4번: "+yn);
		do {
			System.out.print("이름: ");
			String name = br.readLine();
			
			System.out.print("국어: ");
			int kor = Integer.parseInt(br.readLine());
			
			System.out.print("영어: ");
			int eng = Integer.parseInt(br.readLine());
			
			System.out.print("수학: ");
			int math = Integer.parseInt(br.readLine());
			
			int sum = kor + eng + math;
			System.out.println("총점 "+sum);
			
			System.out.print("계속하시겠습니까? (y/n)");
			yn = br.readLine();
			yn = yn.toUpperCase();
			//toUpperCase()메소드는
			//해당 내용을 모두 대문자로 바꿔주는 메소드이다.
		}while(yn.equals("Y"));
		System.out.println("프로그램 종료");

	}

}
