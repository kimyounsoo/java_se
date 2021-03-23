package method;

public class Operator2 {

	public static void main(String[] args) {
		boolean a = 25 > 36;
		System.out.println("a = " + a); //a = false
		System.out.println("!a = " + !a);//a = true
		
		String b = "apple"; //literal 생성 String 만 가능
		String c = new String("apple"); //생성
		
		String result = b == c ? "같다" : "다르다"; // apple이란 글자를 물어보는게 아니라 주소를 물어보는것
		System.out.println("b == c : " + result);
		result = b != c ? "참" : "다르다";
		System.out.println("b != c : " + result);
		
		result = b.equals(c) ? "같다" : "다르다";// 그 주소안에 살고있는 문자열 글씨가 같은지를 물어보는것 equals
		System.out.println("b.equals(c) == c : " + result);
		result = !b.equals(c) ? "참" : "거짓";// 그 주소안에 살고있는 문자열 글씨가 같은지를 물어보는것 equals
		System.out.println("!b.equals(c) == c : " + result);
		
		
		
		
		

	}

}
