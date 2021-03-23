package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class PersonSort {

	public static void main(String[] args) {
		String[] ar = {"orange", "apple", "banana", "pear", "peach", "applemango"};
		
		System.out.print("���� �� = ");
		for(String data : ar) {
			System.out.print(data+" ");
		}
		System.out.println();
		
		Arrays.sort(ar);
		
		System.out.print("���� �� = ");
		for(String data : ar) {
			System.out.print(data+" ");
		}
		System.out.println("\n");
		
		PersonDTO aa = new PersonDTO("ȫ�浿", 25);
		PersonDTO bb = new PersonDTO("��ġ", 40);
		PersonDTO cc = new PersonDTO("�����", 30);
		
		ArrayList<PersonDTO> list = new ArrayList<PersonDTO>();
		list.add(aa); // ����Ʈ �����
		list.add(bb);
		list.add(cc);
		
		System.out.println("���� �� = " + list);
		
		System.out.println("\n���̷� ����");
		Collections.sort(list); // ���� �ض� ��� �ϸ� �˾Ƽ� ����
		
		System.out.println("���� �� = " + list);
		System.out.println();
		
		//���� ������ �̸����� ���� (��������)
		Comparator<PersonDTO> com = new Comparator<PersonDTO>() {
			@Override
			public int compare(PersonDTO p1, PersonDTO p2) {// �͸�
				return p1.getName().compareTo(p2.getName());
				// ��ü������ -1, 0, 1 �� ����, -1 ���ϸ� ��������
			}
		};
		
		System.out.println("\n�̸����� ����");
		Collections.sort(list, com); // ������com �� ����ָ�
		
		System.out.println("���� �� = "+ list);
		System.out.println();
		

	}

}
