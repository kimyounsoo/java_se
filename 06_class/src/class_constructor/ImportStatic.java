package class_constructor;

//import static java.lang.Math.random; // static 에만 해당사항이 있어서 static 을 꼭 붙여주어야만한다
//import static java.lang.Math.pow;

import static java.lang.Math.*; //와일드 카드, all 이렇게 하면 위에꺼 두개를 축약해서 쓴 것 이다.
import static java.lang.String.format;
import static java.lang.System.out; // 이걸하면 System 들을 다 날려도 된다

public class ImportStatic {

	public static void main(String[] args) {
		out.println("난수 = " + random()); // random 앞에 .Math 생략
		out.println("제곱승 = " + pow(2, 10));//pow 앞에 .Math 생략
		out.println("소수 이하 둘째자리 = " + format("%.2f", 123.456)); // format 앞에 String. 생략

	}

} // 편하긴하지만 해깔릴수 있어서 강사님께선 비추천 나도 해깔릴듯....
