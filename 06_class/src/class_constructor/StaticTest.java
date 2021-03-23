package class_constructor;

public class StaticTest {
	private int a;		 //필드, 인스턴스 변수 11번쨰 줄 초기화
	private static int b;//필드, 클래스 변수	7번줄 초기화
	
	static {
		System.out.println("초기화 영역"); // static 은 static 영역에서 초기화
		b=3;
	}
	
	public StaticTest() {
		System.out.println("기본 생성자"); // 얘는 기본생성자 에서 초기화
		this.a = 3; // 초기화
		
	}
	
	public void calc() {
		a++;
		b++;
	}
	
	public void disp() {
		System.out.println("a="+this.a+"\t b="+StaticTest.b); // a 앞에는this. 을 생략, b앞에는 StaticTest가생략 되어있는 것이다
	}
	
	public static void output() {
		//System.out.println("a =" + this.a + "\t b=" +StaticTest.b); - error
		// static 메소드 안에서는 static 변수만 사용 가능하다 this super 둘다 불가능
		System.out.println("static method...");
	}

	public static void main(String[] args) {
		StaticTest st = new StaticTest();
		st.calc();
		st.disp();
		System.out.println();
		
		StaticTest st2 = new StaticTest();
		st2.calc();
		st2.disp();
		System.out.println();
		
		StaticTest st3 = new StaticTest(); // a는 static 이 없어서 
		st3.calc();						   // new 해줄때마다 새로운 메모리에 계속 만들어주기 때문에 
		st3.disp();						   // 값이 1로 나온다 b는 같은 메모리 영역에 계속 덮어지기 때문에 증가한다
		System.out.println();			   // st.a st2.a st3.a 는 값은 같지만 다 다른 영역에 있는 a 이기때문에 같은 a가 아니다
										   // st.b st2.b st3.b 는 값은 다르지만 같은영역에 있는 b이기때문에 b는 다 같은 b이다
		System.out.println("static 메소드 호출");
		StaticTest.output();  // 이렇게 해도 되지만
		output();			  // StaticTest 구역이기때문에 이렇게 써도된다
		st.output();
		st2.output();	 	  // a와 b는 모든 객체를 공유하기때문에 써도된다
		st3.output();
	}									   
	
}//class StaticTest
