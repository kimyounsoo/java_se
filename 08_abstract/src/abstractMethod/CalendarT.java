package abstractMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class CalendarT {
	private int year, month, week, lastDay;
	
	public CalendarT() throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("�⵵ �Է� : ");
		year = Integer.parseInt(br.readLine());
		
		System.out.print("�� �Է� : ");
		month = Integer.parseInt(br.readLine());
	}
	
	public void calculator() {
		Calendar cal = Calendar.getInstance();
		cal.set(cal.YEAR, year);
		cal.set(cal.MONTH, month - 1);
		cal.set(cal.DAY_OF_MONTH, 1);
		
		week = cal.get(cal.DAY_OF_WEEK);
		lastDay = cal.getActualMaximum(cal.DAY_OF_MONTH);
	}
	
	public void display() {
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		
		for(int i=1; i<week; i++) {
			System.out.print("\t");
		}
		for(int i=1; i<lastDay; i++) {
			System.out.print(i+"\t");
			if(week%7==0) System.out.println();
			week++;
			
		}
	}
	
	public static void main(String[] args)throws IOException {
		CalendarT tt = new CalendarT();
		tt.calculator();
		tt.display();

	}
}
