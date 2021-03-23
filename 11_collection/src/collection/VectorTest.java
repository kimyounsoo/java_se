package collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorTest {
// 이것도 이런게 있다 정도만
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		System.out.println("벡터 크기 = " + v.size());//0
		System.out.println("벡터 용량 = " + v.capacity());//기본용량 10개, 10개씩 증가
		System.out.println();
		
		System.out.println("항목 추가");
		for(int i=1; i<=10; i++) {
			v.add(i+"");// 제너릭 스트링형이라 "" 해놓음
		}
		System.out.println("벡터 크기 = " + v.size());//10
		System.out.println("벡터 용량 = " + v.capacity());//10
		System.out.println();
		
		v.addElement(5+"");//중복허용, 순서
		System.out.println("벡터 크기 = " + v.size());//11
		System.out.println("벡터 용량 = " + v.capacity());//20
		System.out.println();
		
		for(int i=0; i<v.size(); i++) {
			System.out.print(v.get(i)+"  ");// 1 2 3 4 5 6 7 8 9 10 5
		}
		System.out.println();
		
		v.remove("5"); //앞에 있는 5가 제거
		//v.remove(10);// 뒤에있는 5가 제거
		Iterator<String> it = v.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+"  ");
		}
		System.out.println();
		
		Vector<String> v2 = new Vector<String>(5,2); // 기본용량 5개, 2개씩 증가

	}

}
