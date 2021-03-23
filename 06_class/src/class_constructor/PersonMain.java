package class_constructor;

class PersonTest{ // 데이터 넣는것 생성자 와 setter, 빼는것 getter
	private String name = null; // 필드, 속성		// 식당 메뉴판, 메뉴판은 하나만 있으면 된다
	private int age;	// 필드, 속성
	//이름, 나이, 키, 몸무게,,, - 속성, 필드
	
	// 걷는다 뛴다 먹는다,,, - 기능, 메소드
	public PersonTest() {	//생성자는 void 를 쓰면 안된다 void 를쓰면 생성자 자격 박탈된다
		System.out.println("default 생성자"); //() 안에 아무것도 없는 생성자
	}
	
	public PersonTest(String n) { // 생성자 오버로딩 쌍둥이 22번째 줄과 똑같은것 하는일도 똑같다
		name = n;
	}
	
	public PersonTest(String n, int a) { // 생성자 오버로딩 26번째 줄과 똑같은것 
		name = n;
		age = a;
	}
	
	public void setName(String n) {	// setter 생성자
		name = n;
	}
	
	public void setData(String n, int a) { // setter 생성자
		name = n;
		age = a;
	}
	public void setData() {
	
	}
	
	public String getName(){
		return name;
	}
	public int getAge() {
		return age;
	}
}

public class PersonMain { // public은 팀장개념 하나씩밖에 안됨
	public static void main(String[] args) { //main 프로그램의 시작점
		PersonTest aa; // 클래스 변수 X, - 객체
		//aa = new PersonTest("홍길동"); // new 클래스 + 생성자	// 음식주문
		aa = new PersonTest("홍길동", 25);
		System.out.println("객체 aa ="+aa);

		System.out.println("이름  = "+aa.getName()+"\t 나이 = "+aa.getAge());
		System.out.println();
		
		PersonTest bb = new PersonTest();
		System.out.println("객체 bb = "+bb);
		bb.setData("코난", 13);
		System.out.println("이름  = "+bb.getName()+"\t 나이 = "+bb.getAge());
		
		PersonTest cc = new PersonTest();
		cc.setData();
		System.out.println("이름  = "+cc.getName()+"\t 나이 = "+cc.getAge());
		
		
	}	// 끝(main)

}
