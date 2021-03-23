package inheritance;

public class ChildTest extends SuperTest {
	protected String name;
	protected int age;
	
	public ChildTest() {
		System.out.println("ChildTest 기본 생성자");
	}
	
	public ChildTest(double weight, double height, String name, int age) {
		super(weight, height); // 코드의 반복을 방지하기 위해  super.weight = weight;
		System.out.println("ChildTest 생성자");	//  super.height = height; 이 두줄을 지우고 이렇게 한다(16,17줄)
		//this.weight = weight; // this 로써도 부모것도 자기것 처럼 쓸수 있기 때문에상관이 없다
		//this.height = height;	// this 는 나자신의 참조값
		//super.weight = weight;  // super 정확하게 부모것을 지칭
		//super.height = height;	// super 는 부모 클래스의 참조값
		this.name = name;
		this.age = age;
		// super(weight, height); 이건 SuperTest의 생성자를 뺴서 써서 SuperTest 생성자가 나오고
	}	// super.weight = weight; 이건 SuperTest 생성자를 자기것 인거처럼써서 SuperTest 기본생성자 가 나오는것??
		// super.height = height;
	
	public void disp() {
		System.out.println("ChildTest클래스의 disp()");
		System.out.println("몸무게 = " + weight);
		System.out.println("키 = " + height);
		System.out.println("이름 = " + name);
		System.out.println("나이 = " + age);
	
}

	public static void main(String[] args) {
		ChildTest aa = new ChildTest(75.3, 185.5, "홍길동",25);
		aa.disp(); // disp()를 ChildTest에서 찾는다. 없으면 부모클래스에서 가서 찾는다
		System.out.println();
		
		System.out.println("-----------------------");
		SuperTest bb = new ChildTest(35.8, 156.3, "코난",13);
		bb.disp(); // 오버라이드(이름이 같은메소드)가 되면 무조건 자식클래스의 메소드를 부른다
		System.out.println();
	}

}
