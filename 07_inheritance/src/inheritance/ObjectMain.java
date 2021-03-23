package inheritance;

/*
class Object {
	public boolean equals(Object ob){} //참조값 비교 (주소)
	public String toString(){} 패키지명.클래스명@16진수
	public int hashCode(){}
}

final calss String extends Object {
	public boolean equals(Object ob){} //문자열 비교
	public String toString(){} // 문자열
	public int hashCode(){}	//문자열을 10진수 변환
							//문자열 계산식에 의해서 만들어진 값
						* 	//다른 문자열이어도 같은 해시값이 발생 할 수 있다
						* 	//int 21억개이고 문자열은 무한대라서 표시 불가능
}
*/


class Test2 extends Object{ // 모든 클래스는 모두 object 에게 상속 생략 되어있는것
	@Override
	public String toString() {
		//return super.toString();
		return "개바부";
	}
	
}

public class ObjectMain {

	public static void main(String[] args) {
		Test2 t = new Test2();
		System.out.println("객체 t = "+t);// toString 이 생략되어있는것 ObjectMain 역시 object에게 상속 되어있기때문에
		System.out.println("객체 t = "+t.toString());
		System.out.println("객체 t = "+t.hashCode());
		System.out.println();
		
		String str = "apple";
		System.out.println("객체 str = " + str);
		System.out.println("객체 str = " + str.toString());
		System.out.println("객체 str = " + str.hashCode()); //믿으면 안된다
		
		String aa = new String("apple");
		String bb = new String("apple");
		System.out.println("aa==bb : " + (aa==bb)); // ==는 주소를 묻는것이라 false
		System.out.println("aa.equals(bb) : "+aa.equals(bb)); //문자열 자체를 비교 true
		
		Object cc = new Object();
		Object dd = new Object();
		System.out.println("cc==dd : " + (cc==dd)); //주소, false
		System.out.println("cc.equals(dd) : " + cc.equals(dd)); //주소, false 이퀄스지만 오브젝트를 생성했기때문에 주소비교
		System.out.println();
		
		Object ee = new String("apple");
		Object ff = new String("apple");
		System.out.println("ee==ff : " + (ee==ff)); //주소, false
		System.out.println("ee.equals(ff) : "+ee.equals(ff)); //문자열, true 스트링을 생성했기때문에 문자열 비교
		System.out.println();
	}

}

//Object의 toString과 
//String의 toString만 
//존재하는데 Object의 toString은 
//주소값반환 String의 toString은 
//문자열반환이라는 말씀이신가요? ok

