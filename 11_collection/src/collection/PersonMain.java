package collection;

import java.util.ArrayList;

public class PersonMain {
	
	public ArrayList<PersonDTO> init() { // ��̸���Ʈ�� ���̵���ο� ���������� list ��� ���� �޸��������� ��ũ���� 88����
		//void -> ArrayList<PersonDTO>
		
		PersonDTO aa = new PersonDTO("ȫ�浿", 25);
		PersonDTO bb = new PersonDTO("��ġ", 40);
		PersonDTO cc = new PersonDTO("�����", 30);
		ArrayList<PersonDTO> list = new ArrayList<PersonDTO>(); // init �� list �� list �� �ּҿ� �̸��� ������ ���� list �� �ƴϴ�
		list.add(aa);
		list.add(bb);
		list.add(cc);
		
		return list; // 
		
		}
		
	

	public static void main(String[] args) {
		PersonMain dd = new PersonMain();
		ArrayList<PersonDTO> list = dd.init(); // void main �� list ��ũ���� 87 ����
		for(int i=0; i<dd.init().size(); i++) {
			System.out.println("�̸� : "+dd.init().get(i).getName()+","+" ���� : "+dd.init().get(i).getAge());
					
		dd.init(); // �Ƚᵵ��
		

		}
		
		
		

	}
	}

