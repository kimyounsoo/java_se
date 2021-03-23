package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class SungJukService {
	private ArrayList<SungJukDTO> list; //= new ArrayList<SungJukDTO>;
	
	public SungJukService() { // �̷��� �����ڸ� ��Ƶ� �ǰ� �ƴϸ� 7��° ��ó�� �ص��ȴ�
		list = new ArrayList<SungJukDTO>();
	}
	public void menu() {
		Scanner scan = new Scanner(System.in);
		int choice;
		
		while(true) {
			System.out.println("***********");
			System.out.println("1. �Է�\n2. ���\n3. �˻�\n4. ����\n5. ����\n6. ��");
			System.out.println("***********");
			System.out.print("��ȣ : ");
			choice = scan.nextInt();
			if(choice == 1) {
				insertArticle();
			}else if(choice == 2){
				printArticle();
			}else if(choice == 3) {
				searchArticle();
			}else if(choice == 4) {
				deleteArticle();
			}else if(choice == 5) {
				sortArticle();
			}else if(choice == 6) {
				break;
			}
			
		}
	}

	private void sortArticle() {		
		Scanner scan = new Scanner(System.in);
		int choice;
		
		while(true) {
			System.out.println("1. �̸����� ��������\n2. �������� ��������\n3. ��ȣ�� �������� \n4. �����޴�");
			System.out.print("��ȣ �Է� : ");
			choice = scan.nextInt();
			if(choice == 1) {
				Comparator<SungJukDTO> com = new Comparator<SungJukDTO>() {

					@Override
					public int compare(SungJukDTO o1, SungJukDTO o2) {
						return o1.getName().compareTo(o2.getName());
							
					}
			};
				Collections.sort(list, com);
				printArticle();
			}else if(choice == 2) {
				Collections.sort(list);
				printArticle();
			}else if(choice == 3) {
				Comparator<SungJukDTO> com = new Comparator<SungJukDTO>() {//�͸� ���� SunJukDTO �� ���� �մϴ�
					public int compare(SungJukDTO p1, SungJukDTO p2) {
						//���� ������ ? �� : ����;
						//return p1.getNumber()<p2.getNumber() ? -1 : 1; //��������
						return p1.getNumber()<p2.getNumber() ? 1 : -1; // ��������
					}// �̹���� choice == 2 �� ��� �ΰ����� �ִ�.
				};
				Collections.sort(list, com); // list �׸��� �ָ� com�� ����������
				printArticle();
					
				
			}else if (choice == 4) {
				menu();
			}
			
		}
}
	private void insertArticle() {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("��ȣ �Է� : ");
		int number = scan.nextInt();
		System.out.print("�̸� �Է� : ");
		String name = scan.next();
		System.out.print("���� �Է� : ");
		int kor = scan.nextInt();
		System.out.print("���� �Է� : ");
		int eng = scan.nextInt();
		System.out.print("���� �Է� : ");
		int math = scan.nextInt();
		
		SungJukDTO dto = new SungJukDTO(); //����
		dto.setNumber(number);// ������ ���
		dto.setName(name);
		dto.setKor(kor);
		dto.setEng(eng);
		dto.setMath(math);
		
		dto.calc();
		
		list.add(dto); // ����Ʈ�� ������ ���
		
		
	}
	private void printArticle() {
		System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���");
			for(SungJukDTO dto:list) {
				System.out.println(dto);
				//dto.calc();
//				System.out.println(dto.getNumber()+"\t"+
//							  dto.getName()+"\t"+
//							  dto.getKor()+"\t"+
//							  dto.getEng()+"\t"+
//							  dto.getMath()+"\t"+
//							  dto.getTot()+"\t"+
//							  dto.getAvg());
			
		}
		
	}
	private void searchArticle() {
		Scanner scan = new Scanner(System.in);
		int sw = 0;
		
		System.out.println("�˻��� �̸� �Է� : ");
		String name = scan.next();
		
		for(SungJukDTO dto : list) {
			if(dto.getName().equals(name))
				System.out.println(dto);
					sw = 1;
		}
		if(sw == 0) {
			System.out.println("ã���� �ϴ� �̸��� �����ϴ�.");
		}
		
		
	}
	private void deleteArticle() {
		Scanner scan = new Scanner(System.in);
		int sw = 0;
		
		System.out.println("���� �� �̸� �Է� : ");
		String name = scan.next();
		
		Iterator<SungJukDTO> it = list.iterator();
		while(it.hasNext()) {
			SungJukDTO dto = it.next();
			if(dto.getName().equals(name)) {
				it.remove();
				sw = 1;
			}
		}
		if(sw == 0) {
			System.out.println("������ �̸��� �����ϴ�.");
		}else {
			System.out.println("�����͸� �����Ͽ����ϴ�.");
		}
	}

}

