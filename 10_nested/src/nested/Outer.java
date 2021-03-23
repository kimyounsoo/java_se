package nested;

public class Outer { //메뉴판
	private String name;
	
	public void output() { // 아웃풋이 불려질때마다 메모리를 계속만든다
		Inner in = new Inner(); // 이너클래스를 쓰려면 객체 생성을 해줘야한다
		System.out.println("이름 = "+name+"\t 나이 = "+in.age);
		//위의 두줄과 같은 것
		//System.out.println("이름 = "+name+"\t 나이 = "+new Inner().age);
	}
	class Inner {
		private int age;
		
		public void disp() {
			System.out.println("이름1 = "+name+"\t 나이1 = "+age); //이너클래스는 아우터 클래스의 것을 자유롭게 사용할수 있다 (객체생성 x)
		}
	}
	public static void main(String[] args) { //static
		Outer ou = new Outer();
		ou.name = "홍길동";
		ou.output();
		System.out.println();
		
		//아우터 안의 이너 	 ou 안에 초기화
		Outer.Inner in = ou.new Inner();
		in.age = 25;
		in.disp();
		ou.output();
		//ou.disp(); 부를수 없음
		//in.output(); 부를수 없음
		System.out.println();
		
		Outer.Inner in2 = ou.new Inner();
		in2.age = 30;
		in2.disp();
		System.out.println();
		
		//?? 대충은 알겠음
		Outer.Inner in3 = new Outer().new Inner();
		in3.age = 35;
		in3.disp();

	}

}//class Outer

//상속은 new 자식() 하면 메모리에는
//부모 + 자식 다 생성하지만
//이너 클래스는 Outer ou = new Outer(); 하면 메모리에 Inner 클래스는 생성되지 않는다

