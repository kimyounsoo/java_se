package inheritance;

public class SuperTest {
	protected double weight;
	protected double height;
	
	public SuperTest() {
		System.out.println("SuperTest 기본 생성자");
	}
	public SuperTest(double weight, double height) { //파라미터 매게변수는 1:1 개념으로 따로따로 잡아주어야한다
		System.out.println("SuperTest 생성자");
		this.weight = weight;						// 생성자가여러개일 경우는 기본생성자가 꼭 있어야한다
		this.height = height;
	}
	
	public void disp() {
		System.out.println("SuperTest클래스의 disp()");
		System.out.println("몸무게 = " +weight);
		System.out.println("키 = " +height);
	}

}


