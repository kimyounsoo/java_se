package collection;

import java.util.LinkedList;
import static java.lang.System.out;

public class QueueTest {//링크드리스트도 그냥 이런게 있다정도로만 알아두자

	public static void main(String[] args) {
		String[] item = {"소나타", "렉스톤", "제규어"};
		LinkedList<String> q = new LinkedList<String>();// first it first out
		//링크드리스트는 먼저들어간게 먼저나온다
		for(String n : item)
			q.offer(n); // 요소 추가
		
		out.println("q의 크기 : "+q.size()+"\n");
		String data = "";
		
		while( (data = q.poll()) != null) {
			out.println(data+"삭제!");
			out.println("q의 크기:"+q.size()+"\n");
			//스크린샷 2 참조
		}

	}

}
