package class_constructor;

import java.util.Scanner;

public class Examination {
	private String name;
	private String dap; // "12311"
	private char[] ox; // = new char[5]; 이렇게 해도되고 22번째 줄처럼 해도된다
	private int score;
	public static final String JUNG = "11111";
	
//	생성자
	public Examination() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		this.name = scan.next();
		
		System.out.print("답 입력 : ");
		this.dap = scan.next();
		
		ox = new char[dap.length()];

	}
//	
//	compare() - 비교
	public void compare() {
		//for(int i=0; i<dap.length(); i++) {// length 옆 괄호가 있고 없고
		for(int i=0; i<ox.length; i++) {	
			if(dap.charAt(i) == JUNG.charAt(i)) {
				ox[i] = 'O';
				score += 20;
			}else {
				ox[i] = 'X';
			}
		}//for
	}
//	
//	getter 답과 정은 필요없다고 한다
	public String getName() {
		return name;
	}
	public String getDap() {
		return dap;
	}
	public char[] getOx() {
		return ox;
	}
	public int getScore() {
		return score;
	}
	public String getJung() {
		return JUNG;
	}
	
}
