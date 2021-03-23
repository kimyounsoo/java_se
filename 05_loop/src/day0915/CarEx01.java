package day0915;

public class CarEx01 {
	public static void main(String[] args) {
		// Car 객체를 여러개 만들어보자
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		
		
		//c1, c2, c3 에 셋터를 이용해서 정보를 입력해보자
		
		c1.setType("포르쉐");
		c1.setColor("빨강");
		c1.setNumber("8277");
		c1.setYear(2020);
		c1.setPrice(10);
		
		c2.setType("람보르기니");
		c2.setColor("노랑");
		c2.setNumber("7777");
		c2.setYear(2020);
		c2.setPrice(19);
		
		c3.setType("구아방");
		c3.setColor("검정");
		c3.setNumber("8277");
		c3.setYear(2020);
		c3.setPrice(11);
	
		
		c1.printInfo();
		c2.printInfo();
		c3.printInfo();
		
		c3.setType("벤틀리");
		c3.setColor("노랑");
		c3.setNumber("7777");
		c3.setYear(2020);
		c3.setPrice(19);
		
		c2.printInfo();
		c3.printInfo();
		
		//c2와 c3에는 똑같은 정보가 들어가 있다
		//그렇다면 c2.equals(c3)는 어떻게될까?
		System.out.println("c2.equals(c3): " + c2.equals(c3));
		// 정보는 같지만 주소값을 비교한 것 이기떄문에 false가 출력된다
		System.out.println("c2.equals(abc): " + c2.equals("abc"));
		
		System.out.println(c1); // == System.out.println(c1.toString());
	}
	

}
