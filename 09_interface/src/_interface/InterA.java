package _interface;

public interface InterA {// 인터페이스는 상수와 추상메소드만 들어올수있다
	public static final String NAME = "홍기르동"; //상수
	public int AGE = 25; // 인터페이스안에서는 상수만 가능하기때문에 static final 생략 가능하다
	
	public abstract void aa(); //추상메소드
	public void bb(); // 인터페이스 안에는 추상만 올수있기 때문에 abstract 생략 가능하다
	
//	public void cc(){ 인터페이스는 추상만 올수 있어서 {} 안된다
//		
//	}
}
