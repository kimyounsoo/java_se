package variable;

public class NumberTest {

	public static void main(String[] args) {
		System.out.print("�ȳ��ϼ���\n");
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
		System.out.println((char)('A'+32)); //����ȯ
		System.out.println();
		
		System.out.println(2+5);
		System.out.println('2'+'5'); //103
		System.out.println('2'-48 +'5'-48);//���ڸ� ���ڷ� ��ȯ, 7
		System.out.println("2"+"5"); // "25"
		System.out.println(Integer.parseInt("2")+Integer.parseInt("5"));//���ڿ��� ���ڷ� ��ȯ, 7
		System.out.println("25.3"+"45.6");
		System.out.println(Double.parseDouble("25.3")+Double.parseDouble("45.6"));//���ڿ��� �Ǽ��� ��ȯ
        System.out.println();
	}

}
//%��ü�ڸ��� .�Ҽ������ڸ���f
//25.3 -> %4.1f
