package collection;

import java.util.ArrayList;

public class CollectionTest2 {

	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		//<String>�� �����ϸ� �Ʒ��� 25 43.8 �� ������ �Ҽ� �ִ� ��� ������� ���̺��̰� �ȴ�
		list.add("ȣ����");
		list.add("����");
		list.add("ȣ����"); // Collection �� �ߺ� ���, ����
		//list.add(25);
		//list.add(43.8);
		list.add("�⸰");
		list.add("�ڱ⸮");
		list.get(0); //ArrayList �� list �� get�� �����ϰ��ִ� 
					 //��ũ���� 85����
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("----------");
		
		for(String data : list) {
			System.out.println(data);
		}

	}
}
//�迭.length
//���ڿ�.length(); ??