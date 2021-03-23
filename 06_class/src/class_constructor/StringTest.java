package class_constructor;

public class StringTest {

	public static void main(String[] args) {
		String a = "apple"; //문자열 literal생성 이것은 문자열 즉 String 밖에 안된다
		String b = "apple";
		if(a==b) System.out.println("a와 b의 참조값은 같다");
		else System.out.println("a와 b의 참조값은 다르다");
		if(a.equals(b))System.out.println("a와b의 문자열은 같다");
		else System.out.println("a와 b의 문자열은 다르다");
		System.out.println();
		
		String c = new String("apple");
		String d = new String("apple");
		if(c==d) System.out.println("c와 d의 참조값은 같다");
		else System.out.println("c와 d의 참조값은 다르다");
		if(c.equals(d))System.out.println("c와d의 문자열은 같다");
		else System.out.println("c와 d의 문자열은 다르다");
		System.out.println();
		
		String e = "Have a nice day!!";
		System.out.println("e = " + e);
		//문자열은 편집이 안되므로 메모리 4번 생성된다
//		JVM에 의해서 삭제 시 Garbage Collecteor로 보낸다, 아래 e ----> 제외하고 보낸다
//		Garbage Collector가 실행되면 컴퓨터는 멈춘다. 아주 빠르게 잠깐
//		"오늘 날짜는"
//		"오늘 날짜는 2020"
//		"오늘 날짜는 20209"
//		e----->"오늘 날짜는 2020925" 
		
		System.out.println("문자열의 크기 = "+e.length());
		for(int i=0; i<e.length(); i++) {
			System.out.println(i+":"+e.charAt(i));
		}
		System.out.println();
		
		System.out.println("부분 문자열 추출="+e.substring(7));
		System.out.println("부분 문자열 추출="+e.substring(7,8)); //7번부터 11번 '이전' 까지 11번 포함안됨
		
		System.out.println("대문자 변경 = " + " Hello".toUpperCase());
		System.out.println("소문자 변경 = " + " Hello".toLowerCase());
		
		System.out.println("문자열 검색="+e.indexOf("짜"));
		System.out.println("문자열 검색="+e.indexOf("날짜")); // 날 글자 의 번호 3
 		System.out.println("문자열 검색="+e.indexOf("개바부")); // 무조건 -1
		
 							
		

	}

}
