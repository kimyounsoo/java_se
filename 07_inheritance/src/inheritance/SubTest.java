package inheritance;

public class SubTest extends SuperTest {
	protected String name;	//부모의 것도 쓸수 있기때문에
	protected int age;		//총 4개의 필드를 쓸수 있다(weight height)포함 그래서 12번쨰 줄처럼 가능
							
	public SubTest() {
		System.out.println("SubTest 기본 생성자");
	}
	
	public SubTest(double weight, double height, String name, int age) {
		System.out.println("SubTest 생성자");
		//this.weight = weight; // this 로써도 부모것도 자기것 처럼 쓸수 있기 때문에상관이 없다
		//this.height = height;	// this 는 나자신의 참조값
		super.weight = weight;  // super 정확하게 부모것을 지칭
		super.height = height;	// super 는 부모 클래스의 참조값
		this.name = name;
		this.age = age;
		
	}
		public void output() {
			System.out.println("몸무게 = " + weight);
			System.out.println("키 = " + height);
			System.out.println("이름 = " + name);
			System.out.println("나이 = " + age);
		
	}
	
	public static void main(String[] args) {
		//SubTest aa = new SubTest(); // 부모 기본생성자 + 자기것도 기본생성자
		
		SubTest aa = new SubTest(75.3, 185.5, "홍길동",25); // 부모기본생성자 + 자기것은 파라미터가 있는 생성자
		aa.output(); //output()를 SubTest에서 찾는다. 없으면 부모클래스에 가서 찾는다.
		System.out.println();
		
		aa.disp(); //disp()를 SubTest에서 찾는다. 없으면 부모클래스에서 찾는다
		System.out.println("------------------------");
		
		SuperTest bb = new SubTest(35.8, 156.3, "코난",13);
		// bb.output(); - error: bb. 은 SuperTest의 주소값을 가지고 있기때문에 output을 가져올수없다.
		bb.disp();
	}

}

//자식 클래스는 부모 생성자를 선택해서 호출할 수 있다
//아무 말이 없으면 부모의 기본 생성자를 호출한다