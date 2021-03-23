package inheritance;

public class ThisTest {
	private String name;
	private int age;
	
	public ThisTest() {
		System.out.println("default 생성자");
		System.out.println("this = "+this);
	}

	public ThisTest(String name) {
		this();
		System.out.println("this = "+this);
		this.name = name; // this 를 안쓰면 name 은 다 메소드의 파라미터 것이된다 this 를 쓰면 클래스의 것이된다
	}
	
	public ThisTest(int age) {
		this("코난"); // 반드시 생성자 안에서 첫번째 줄에 써야한다 this() 는 오버로드 끼리만 가능하다
		this.age = age;
		
	}

	public static void main(String[] args) {
		ThisTest aa = new ThisTest(); // 기본생성자 () 가 없어도 자동으로 처리된다
		System.out.println("객체 aa = "+aa);
		System.out.println("이름  = "+aa.name+"\t 나이 = "+aa.age);
		System.out.println();
		
		ThisTest bb = new ThisTest("홍길동");
		System.out.println("객체 bb = "+bb);
		System.out.println("이름  = "+bb.name+"\t 나이 = "+bb.age);
		System.out.println();
		
		ThisTest cc = new ThisTest(25);
		System.out.println("객체 cc = "+cc);
		System.out.println("이름  = "+cc.name+"\t 나이 = "+cc.age);
		System.out.println();
	}

}
