package collection;

import java.util.ArrayList;

public class PersonMain {
	
	public ArrayList<PersonDTO> init() { // 어레이리스트로 보이드메인에 보내기위해 list 묶어서 보냄 메모리저장방식은 스크린샷 88참조
		//void -> ArrayList<PersonDTO>
		
		PersonDTO aa = new PersonDTO("홍길동", 25);
		PersonDTO bb = new PersonDTO("또치", 40);
		PersonDTO cc = new PersonDTO("도우너", 30);
		ArrayList<PersonDTO> list = new ArrayList<PersonDTO>(); // init 의 list 두 list 는 주소와 이름은 같지만 같은 list 가 아니다
		list.add(aa);
		list.add(bb);
		list.add(cc);
		
		return list; // 
		
		}
		
	

	public static void main(String[] args) {
		PersonMain dd = new PersonMain();
		ArrayList<PersonDTO> list = dd.init(); // void main 의 list 스크린샷 87 참조
		for(int i=0; i<dd.init().size(); i++) {
			System.out.println("이름 : "+dd.init().get(i).getName()+","+" 나이 : "+dd.init().get(i).getAge());
					
		dd.init(); // 안써도됨
		

		}
		
		
		

	}
	}

