package method;
/*
 * ch에 있는 데이터가 대문자이면 소문자로 출력하고 아니면(소문자) 대문자로 출력하시오

[실행결과]
T → t

또는

e → E
 * 
 */
public class CompTest2 {

	public static void main(String[] args) {
		char ch = 'A';
		int result = ch >='A' && ch <='Z' ? ch+32 : ch-32;
		System.out.println(ch + " -> " + (char)result);
		
		//char result = ch >='A' && ch <='Z' ? (char)(ch+32) : (char)(ch-32);

	}

}


