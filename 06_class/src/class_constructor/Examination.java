package class_constructor;

import java.util.Scanner;

public class Examination {
	private String name;
	private String dap; // "12311"
	private char[] ox; // = new char[5]; �̷��� �ص��ǰ� 22��° ��ó�� �ص��ȴ�
	private int score;
	public static final String JUNG = "11111";
	
//	������
	public Examination() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�̸� �Է� : ");
		this.name = scan.next();
		
		System.out.print("�� �Է� : ");
		this.dap = scan.next();
		
		ox = new char[dap.length()];

	}
//	
//	compare() - ��
	public void compare() {
		//for(int i=0; i<dap.length(); i++) {// length �� ��ȣ�� �ְ� ����
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
//	getter ��� ���� �ʿ���ٰ� �Ѵ�
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
