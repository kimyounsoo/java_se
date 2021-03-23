package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapTest {

	public static void main(String[] args) {
		
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("book101", "백설공주");
		map.put("book201", "인어공주");
		map.put("book102", "백설공주");//Value 중복허용
		map.put("book301", "피오나");
		map.put("book101", "엄지공주");//Key도 중복허용
		
		System.out.println(map.get("book101")); // 백설공주가 아니고 엄지공주가 나온다
		System.out.println(map.get("book102")); // 101 과 102가 같은 백설공주 여도 메모리는 따로따로 잡고 있다
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("코드 입력 : ");
		String key = scan.next(); // key 입력
		
//		if(map.get(key) == null) { //equals 로는 안된다고함
//			System.out.println("없는 key 입니다");
//		}else {
//			System.out.println(map.get(key));
//		}
		
		if(map.containsKey(key)) { // key를 포함하고 있느냐
			System.out.println(map.get(key));
		}else {
			System.out.println("없는 key입니다.");
		}
		
		//코드 입력 : book501
		//없는  Key입니다
		
		//코드 입력 : book201
		//인어공주
	}

}
