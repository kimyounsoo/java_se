package abstractMethod;

public class AbstractMain extends AbstractTest {
	
	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		//AbstractTest at = new AbstractTest();//생성, 추상클래스는 new가 안된다
		
		AbstractTest at = new AbstractMain();
		at.setName("홍길동");
		System.out.println(at.getName());
	}

	
	

}

//1.상속
//2.반드시 자식클래스 추상메소드를 Override
//3.Override 안해주면 class 앞에 abstract 붙여서 다음자식클래스에게 넘겨버리면 된다