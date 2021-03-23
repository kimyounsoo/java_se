package inheritance;

class Test {
	int a=3;
	
	public void disp() {
		a += 5; // a = a + 5
		System.out.println("Test : a = "+a);
	}
}

class Sample extends Test{
	int a=8;
	
	@Override
	public void disp() {
		a += 5; // a = a + 5 
		System.out.println("Sample : a = "+a);
	}
}

public class OverrideMain {
	public static void main(String[] args) {
		Sample aa = new Sample(); // Test 기본생성자 -> Sample 기본 생성자 호출
		aa.disp(); //Sample 클래스의 disp() 호출
		System.out.println("aa : "+ aa.a);
		System.out.println();
		
		Test bb = new Sample(); //부모 = 자식
		bb.disp(); //Sample 클래스의 disp() 호출, 오버라이드 됐기때문에
		System.out.println("bb : "+ bb.a); //Test 클래스의 필드 a가 된다
		System.out.println();
		
		Sample dd = (Sample)bb;//자식 = (자식)부모 자식이 부모를 참조하기 위해서는 형변환이 필요하다
		dd.disp();			   // Sample dd = bb; x 그냥은 참조할수 없다
		System.out.println("dd : " + dd.a);
		System.out.println();
		
		Test cc = new Test();
		cc.disp(); //Test 클래스의 disp() 호출
		System.out.println("cc : "+ cc.a);
		System.out.println();
		
		//Sample ee = (Sample)cc; //자식 = (자식)부모
		//실행시 에러 메모리가 안잡혀있어서 월요일에 다시설명
		
		
		
	}

}

