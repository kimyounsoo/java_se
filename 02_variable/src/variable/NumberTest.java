package variable;

public class NumberTest {

	public static void main(String[] args) {
		System.out.print("안녕하세요\n");
		System.out.print("25+36\n");
		System.out.println(25+36);
		System.out.println("25+36 = " + 25+36);
		System.out.println("25+36 = " + (25+36));
		System.out.println("25/36 = " + (25/36));
		System.out.println("25/36 = " + (25.0/36));
		System.out.printf("25/36 = %.1f\n", (25/36.0));
		System.out.printf("25/36 = %.2f\n", (25/36.0));
		System.out.printf("25/36 = %.1f\n", (25/36.0));
		System.out.printf("%d/%d = %.1f\n", 25, 36, (25.0/36));
		System.out.println("25/36 = " + String.format("%.2f", (25.0/36)));
		System.out.println();
		
		System.out.println('A' + 3);
		System.out.println('A'+32 );
		System.out.println((char)('A'+32)); //형변환
		System.out.println();
		
		System.out.println(2+5);
		System.out.println('2'+'5'); //103
		System.out.println('2'-48 +'5'-48);//문자를 숫자로 변환, 7
		System.out.println("2"+"5"); // "25"
		System.out.println(Integer.parseInt("2")+Integer.parseInt("5"));//문자열을 숫자로 변환, 7
		System.out.println("25.3"+"45.6");
		System.out.println(Double.parseDouble("25.3")+Double.parseDouble("45.6"));//문자열을 실수로 변환
        System.out.println();
	}

}
//%전체자리수 .소수이하자리수f
//25.3 -> %4.1f
