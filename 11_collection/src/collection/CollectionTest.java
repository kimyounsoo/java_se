package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest {
	
	@SuppressWarnings("all")
	public static void main(String[] args) {
		Collection coll = new ArrayList();//어레이리스트는 일반클래스
		coll.add("호랑이");
		coll.add("사자");
		coll.add("호랑이"); // 중복 허용, 순서
		coll.add(25);
		coll.add(43.8);
		coll.add("기린");
		coll.add("코기리");
		
		//coll.get(0); 에러 // coll 은 Collection 만 참조 하고있다
		//스크린샷 85참조
		Iterator it = coll.iterator(); // Iterator 는 지정자 가르키는 사람 스크린샷 86 참조
		while(it.hasNext()) {
			System.out.println(it.next());
		}//while
	}	
}
