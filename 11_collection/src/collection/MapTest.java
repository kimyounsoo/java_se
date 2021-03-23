package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapTest {

	public static void main(String[] args) {
		
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("book101", "�鼳����");
		map.put("book201", "�ξ����");
		map.put("book102", "�鼳����");//Value �ߺ����
		map.put("book301", "�ǿ���");
		map.put("book101", "��������");//Key�� �ߺ����
		
		System.out.println(map.get("book101")); // �鼳���ְ� �ƴϰ� �������ְ� ���´�
		System.out.println(map.get("book102")); // 101 �� 102�� ���� �鼳���� ���� �޸𸮴� ���ε��� ��� �ִ�
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�ڵ� �Է� : ");
		String key = scan.next(); // key �Է�
		
//		if(map.get(key) == null) { //equals �δ� �ȵȴٰ���
//			System.out.println("���� key �Դϴ�");
//		}else {
//			System.out.println(map.get(key));
//		}
		
		if(map.containsKey(key)) { // key�� �����ϰ� �ִ���
			System.out.println(map.get(key));
		}else {
			System.out.println("���� key�Դϴ�.");
		}
		
		//�ڵ� �Է� : book501
		//����  Key�Դϴ�
		
		//�ڵ� �Է� : book201
		//�ξ����
	}

}
