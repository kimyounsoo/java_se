package variable;

public class Variable2 {
	int a; // 필드. 인스턴스 변수 초기화
	static int b; // 필드, 클래스 변수, 초기화
	int c;
	String d; //클레스의 객체형은 null
	int f=7;
	//f = 7; error

	public static void main(String[] args) {
		int a=10; // 지역변수(local variable), 쓰레기값
		System.out.println("지역변수 a = "+a); 
		System.out.println("필드 b ="+b);//b앞에 클래스명 생략되어있다 
		System.out.println("필드 b ="+Variable2.b); 
		System.out.println("필드 a ="+new Variable2().a); 
		System.out.println("필드 c ="+new Variable2().c); 
		System.out.println("필드 d ="+new Variable2().d);
	}

	
	
	//무조건 메모리 생성 해야한다... static은 자동으로 생성
}
