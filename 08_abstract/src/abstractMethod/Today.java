package abstractMethod;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Today {

	public static void main(String[] args) throws ParseException {
		Date date = new Date();
		System.out.println("오늘날짜 : " + date);

		SimpleDateFormat sdf = new SimpleDateFormat("y년  MM월 dd일 E요일 HH:mm:ss");// 시각은 소문자 h로하면 04시로 나온다
		System.out.println("오늘날짜 : " + sdf.format(date));
		System.out.println();

		//입력 - 내 생일 yyyyMMddHHmmss
		//예) 19980904222222
		SimpleDateFormat input = new SimpleDateFormat("yyyyMMddHHmmss");
		Date birth = input.parse("19980904222222"); //String -> Date 형으로 변환
		
		System.out.println("내생일은 = "+birth);
		System.out.println("내생일은 = "+sdf.format(birth));
		System.out.println();
		
		//Calendar cal = new Calendar(); - error // 추상클래스 abstract 는 new 할수 없다
		//Calendar를 생성하면 시스템의 현재 시간만 얻어온다
		//Calendar cal = new GregorianCalendar(); // Sub class를이용하여 생성
		Calendar cal = Calendar.getInstance(); // 메소드 이용하여 생성, 이벤트라 돈안내고 new 안하고 공짜로 사옴
					 //이게 바로 new 대신 클래스를 생성하는 작업이다
		
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;// 1월 => 0, 2월=> 1 달만 이렇다
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int week = cal.get(Calendar.DAY_OF_WEEK); // 일요일 => 1
		
		String dayOfWeek = null;
		switch(week) {
		case 1 : dayOfWeek = "일요일"; break;
		case 2 : dayOfWeek = "월요일"; break;
		case 3 : dayOfWeek = "화요일"; break;
		case 4 : dayOfWeek = "수요일"; break;
		case 5 : dayOfWeek = "목요일"; break;
		case 6 : dayOfWeek = "금요일"; break;
		case 7 : dayOfWeek = "토요일"; break;
		
		}
		System.out.println("오늘날짜 : "+year+"년 "+month+"월 "+day+"일 "+dayOfWeek);
		
	}

}
