package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest {
	
	@SuppressWarnings("all")
	public static void main(String[] args) {
		Collection coll = new ArrayList();//��̸���Ʈ�� �Ϲ�Ŭ����
		coll.add("ȣ����");
		coll.add("����");
		coll.add("ȣ����"); // �ߺ� ���, ����
		coll.add(25);
		coll.add(43.8);
		coll.add("�⸰");
		coll.add("�ڱ⸮");
		
		//coll.get(0); ���� // coll �� Collection �� ���� �ϰ��ִ�
		//��ũ���� 85����
		Iterator it = coll.iterator(); // Iterator �� ������ ����Ű�� ��� ��ũ���� 86 ����
		while(it.hasNext()) {
			System.out.println(it.next());
		}//while
	}	
}
