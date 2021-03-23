package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class PersonMainAnswer {
	   public ArrayList<PersonDTO> init() {
	      PersonDTO aa = new PersonDTO("홍길동", 25);
	      PersonDTO bb = new PersonDTO("또치", 40);
	      PersonDTO cc = new PersonDTO("도우너", 30);
	      
	      ArrayList<PersonDTO> list = new ArrayList<PersonDTO>();
	      list.add(aa);
	      list.add(bb);
	      list.add(cc);
	      
	      return list;
	   }

	   public static void main(String[] args) {
	      PersonMain pm = new PersonMain();
	      
	      ArrayList<PersonDTO> list = pm.init();
	      
	      for(int i=0; i<list.size(); i++) {
	         System.out.println("이름 = "+list.get(i).getName()+"\t 나이 = "+list.get(i).getAge());
	      }
	      System.out.println("---------------------");
	      
	      for(PersonDTO dto : list) {
	         System.out.println("이름 = "+dto.getName()+"\t 나이 = "+dto.getAge());
	      }
	      System.out.println("---------------------");
	      
	      Iterator<PersonDTO> it = list.iterator();
	      while(it.hasNext()) { // hasNext 는 넘어가는 것이 아니라 있는지 없는지만 확인 T/F 만 확인 스크린샷 86 참조
	         PersonDTO dto = it.next();
	         System.out.println("이름 = "+dto.getName()+"\t 나이 = "+dto.getAge());
	      }

	   }

	}