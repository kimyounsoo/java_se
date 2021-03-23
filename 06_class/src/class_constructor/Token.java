package class_constructor;

import java.util.StringTokenizer;

public class Token {

	public static void main(String[] args) {
		String str = "학원,집,,게임방";
		
		StringTokenizer st = new StringTokenizer(str,","); //, 를 가지고 문자를 분리 하겠다는 의미
		System.out.println("토큰 개수 = "+st.countTokens()); // 3개
		
		while(st.hasMoreTokens()) { // true /false
			System.out.println(st.nextToken());
		}//while
		System.out.println("---------------");
		
		String[] ar = str.split(","); // 배열을 만들어서 넘겨주는거라 new 를 안붙인다??
		for(String data : ar) {		  // split 은 항상 배열과 함께 쓴다
			System.out.println(data);
		}//for 결과를 보면 StringTokenizer 는 공백을 무시, 즉 표시하지 않고 split은 공백을 표시한다

	}

}
