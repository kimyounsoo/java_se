package collection;

import java.util.ArrayList;

public class CollectionTest2 {

	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		//<String>을 제거하면 아래에 25 43.8 도 나오게 할수 있다 대신 노란줄이 많이보이게 된다
		list.add("호랑이");
		list.add("사자");
		list.add("호랑이"); // Collection 은 중복 허용, 순서
		//list.add(25);
		//list.add(43.8);
		list.add("기린");
		list.add("코기리");
		list.get(0); //ArrayList 의 list 는 get을 참조하고있다 
					 //스크린샷 85참조
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("----------");
		
		for(String data : list) {
			System.out.println(data);
		}

	}
}
//배열.length
//문자열.length(); ??