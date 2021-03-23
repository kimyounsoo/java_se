package abstractMethod;
/*
년도 입력 : 2002
월 입력 : 10   

        1   2   3    4    5
6   7   8   9   10   11   12
13  14  15  16  17   18   19
20  21  22  23  24   25   26
27  28  29  30  31

기본생성자 - 년도, 월 입력
calculator() - 매달 1일이 무슨 요일로 시작?, 매달 끝나는 일?
display() - 출력
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class CalendarMain {
	private int year, month, week, lastDay;

							// 숫자의 예외처리 그래서 이건 필요가없다 입력과 출력의 예외처리 (넘버 포멧의 부모)
	public CalendarMain() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("년도 입력 : ");
		year = Integer.parseInt(br.readLine());
		System.out.print("월 입력 : ");
		month = Integer.parseInt(br.readLine());
	}

	public void calculator() {
		Calendar cal = Calendar.getInstance(); // 클래스 생성 추상클래스 이기때문에 new 못함

		// 기준 - 2020 9 29(오늘날짜)
		// cal.set(Calendar.YEAR, year); // set 은 get 의반대 Calendar.YEAR 을 year로 바꾼다는 의미
		// cal.set(cal.MONTH, month-1); // Calendar 로 해도되지만 calculator 메소드에서 cal 객체를
		// 선언했기때문에 이렇게 해도된다
		// cal.set(cal.DAY_OF_MONTH, 1);

		cal.set(year, month - 1, 1); // 위에 3개를 묶어서 쓴게 이것 -1 항상 달만 신경쓰자 // 2002년 10월 1일
		week = cal.get(cal.DAY_OF_WEEK); // 2002년 10월 1일이 무슨 요일로 시작인지
		lastDay = cal.getActualMaximum(cal.DAY_OF_MONTH);// 매달 끝나는 일 28 29 30 31 알아서 조정해주는 메소드
	}

	public void display() {
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		for(int i=1; i<week; i++) {
			System.out.print("\t");
		}//for
		
		for (int i=1; i <=lastDay; i++) {
			System.out.print(i + "\t");
			
			if(week%7==0) System.out.println();
			week++;
		}//for
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		CalendarMain cm = new CalendarMain();
		cm.calculator();
		cm.display();

	}

}
