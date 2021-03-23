package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class PersonSort {

	public static void main(String[] args) {
		String[] ar = {"orange", "apple", "banana", "pear", "peach", "applemango"};
		
		System.out.print("정렬 전 = ");
		for(String data : ar) {
			System.out.print(data+" ");
		}
		System.out.println();
		
		Arrays.sort(ar);
		
		System.out.print("정렬 후 = ");
		for(String data : ar) {
			System.out.print(data+" ");
		}
		System.out.println("\n");
		
		PersonDTO aa = new PersonDTO("홍길동", 25);
		PersonDTO bb = new PersonDTO("또치", 40);
		PersonDTO cc = new PersonDTO("도우너", 30);
		
		ArrayList<PersonDTO> list = new ArrayList<PersonDTO>();
		list.add(aa); // 리스트 만들고
		list.add(bb);
		list.add(cc);
		
		System.out.println("정렬 전 = " + list);
		
		System.out.println("\n나이로 정렬");
		Collections.sort(list); // 정렬 해라 라고 하면 알아서 정렬
		
		System.out.println("정렬 후 = " + list);
		System.out.println();
		
		//정렬 기준을 이름으로 변경 (오름차순)
		Comparator<PersonDTO> com = new Comparator<PersonDTO>() {
			@Override
			public int compare(PersonDTO p1, PersonDTO p2) {// 익명
				return p1.getName().compareTo(p2.getName());
				// 자체적으로 -1, 0, 1 로 리턴, -1 곱하면 내림차순
			}
		};
		
		System.out.println("\n이름으로 정렬");
		Collections.sort(list, com); // 기준점com 만 잡아주면
		
		System.out.println("정렬 후 = "+ list);
		System.out.println();
		

	}

}
