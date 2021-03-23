package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class SungJukService {
	private ArrayList<SungJukDTO> list; //= new ArrayList<SungJukDTO>;
	
	public SungJukService() { // 이렇게 생성자를 잡아도 되고 아니면 7번째 줄처럼 해도된다
		list = new ArrayList<SungJukDTO>();
	}
	public void menu() {
		Scanner scan = new Scanner(System.in);
		int choice;
		
		while(true) {
			System.out.println("***********");
			System.out.println("1. 입력\n2. 출력\n3. 검색\n4. 삭제\n5. 정렬\n6. 끝");
			System.out.println("***********");
			System.out.print("번호 : ");
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
			System.out.println("1. 이름으로 오름차순\n2. 총점으로 내림차순\n3. 번호로 내림차순 \n4. 이전메뉴");
			System.out.print("번호 입력 : ");
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
				Comparator<SungJukDTO> com = new Comparator<SungJukDTO>() {//익명 나는 SunJukDTO 를 정렬 합니다
					public int compare(SungJukDTO p1, SungJukDTO p2) {
						//조건 연산자 ? 참 : 거짓;
						//return p1.getNumber()<p2.getNumber() ? -1 : 1; //오름차순
						return p1.getNumber()<p2.getNumber() ? 1 : -1; // 내림차순
					}// 이방법과 choice == 2 의 방법 두가지가 있다.
				};
				Collections.sort(list, com); // list 항목을 주면 com을 기준점으로
				printArticle();
					
				
			}else if (choice == 4) {
				menu();
			}
			
		}
}
	private void insertArticle() {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("번호 입력 : ");
		int number = scan.nextInt();
		System.out.print("이름 입력 : ");
		String name = scan.next();
		System.out.print("국어 입력 : ");
		int kor = scan.nextInt();
		System.out.print("영어 입력 : ");
		int eng = scan.nextInt();
		System.out.print("수학 입력 : ");
		int math = scan.nextInt();
		
		SungJukDTO dto = new SungJukDTO(); //생성
		dto.setNumber(number);// 데이터 담기
		dto.setName(name);
		dto.setKor(kor);
		dto.setEng(eng);
		dto.setMath(math);
		
		dto.calc();
		
		list.add(dto); // 리스트에 데이터 담기
		
		
	}
	private void printArticle() {
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
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
		
		System.out.println("검색할 이름 입력 : ");
		String name = scan.next();
		
		for(SungJukDTO dto : list) {
			if(dto.getName().equals(name))
				System.out.println(dto);
					sw = 1;
		}
		if(sw == 0) {
			System.out.println("찾고자 하는 이름이 없습니다.");
		}
		
		
	}
	private void deleteArticle() {
		Scanner scan = new Scanner(System.in);
		int sw = 0;
		
		System.out.println("삭제 할 이름 입력 : ");
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
			System.out.println("삭제할 이름이 없습니다.");
		}else {
			System.out.println("데이터를 삭제하였습니다.");
		}
	}

}

