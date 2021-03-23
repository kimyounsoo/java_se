package class_constructor;

public class FinalMain {
	public final String FRUIT = "사과"; // 초기값은 이렇게 다이렉트로 줘도되지만
	private final String FRUIT2;	  // public을 많이쓴다 
	
	public static final String ANIMAL = "사자"; // final 은 어차피 이름을 바꿀수 없게 해놓은 것 이기때문에 public 으로 많이쓴다 private 도상관은 없다.
	public static final String ANIMAL2;
	static {	//스태틱 초기화값은 이렇게 할수도있다 스태틱초기화는 스태틱 구역에서만 할수있다
		ANIMAL2 = "기린";	
	}
	
	public FinalMain() {
		FRUIT2 = "딸기";					// 기본생성자로 초기값을 부여해줄수도 있다
	}

	public static void main(String[] args) {
		final int AGE = 10;
		//AGE++; - error, final 을 붙이면 변할 수 없는상수가 되기 떄문에 에러가 발생
		System.out.println("상수 = " + AGE);
		
		final int AGE2;
		AGE2 = 20; // 상수는 반드시 초기값이 필요하다
		//AGE2 = 30; - error 한번 값을 고정시켰기때문에 에러
		
		FinalMain fm = new FinalMain(); // 사과를 부르기위해서는 반드시 클래스를 생성해야한다
		System.out.println("FRUIT = " + fm.FRUIT);
		System.out.println("FRUIT = " + fm.FRUIT2);
		
		System.out.println("ANIMAL = " + FinalMain.ANIMAL); // fm.ANIMAL 해도된다
															// static 이라 new안하고 바로접근해도 된다
		System.out.println("ANIMAL = " + FinalMain.ANIMAL2);


	}

}
//부모 클래스의 메소드에 final 을 붙이면 오버라이드가 안되고
//부모 클래스에 final 을 붙이면 상속이 안된다
