package collection;

import java.util.Stack;
import static java.lang.System.out; // import 는 알려만 주는것 System 삭제

public class StrackTest { //스택은 많이 사용되진 않는다. 

	public static void main(String[] args) {
		String[] groupA = {"우지베키스탄", "쿠웨이트", "사우디", "대한민국"};
		Stack<String> stack = new Stack<String>();
		
		for(int i=0; i<groupA.length; i++) //문장 하나면 중괄호 빼도됨
			stack.push(groupA[i]); //스택은 데이터를 push로 넣고 pop 으로 뺀다
		
		while( ! stack.isEmpty()) // ! 부정연산자 스택이 비어있느냐 의 부정 
			out.println( stack.pop() ); // 와일문도 마찬가지
	}

}
