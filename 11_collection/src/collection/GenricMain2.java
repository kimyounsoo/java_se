package collection;

class GenericTest2<T>{ // 세터는 여러번 불러낼 수 있지만 생성자는 한번밖에 불러낼수 없다
	private T a;
	
	public GenericTest2(T a) {
		this.a = a;
	}
	
	public void setA(T a) {
		this.a = a;
	}
	
	public T getA() {
		return a;
	}
}
//---------------

public class GenricMain2 {

	public static void main(String[] args) {
		GenericTest2<?> aa = new GenericTest2<String>("홍길동"); // 기본생성자 -클래스안에 생성자가 1도없으면 자동으로 생성
		//<?> 는 오브젝트형 객체
		//<?> 는 다시 오브젝트화 시킨것
		//<?> 는 aa.setA("홍길동"); - 반드시 생성자를 통해서만 데이터가 전달이 된다. setA X
		//이 형태는 많이 쓰이지 않는다
		
		String name = (String)aa.getA(); //자식 = (자식)부모
		System.out.println("이름  = "+name);
		
		GenericTest2<?> bb = new GenericTest2<Integer>(25);
		int age = (int)bb.getA();// 객체형은 기본형으로 형변환이 안되지만 unAutoBoxing이되어서 에러가 안난다
		//		  (Integer) 로써도 된다
		System.out.println("나이 = "+age);
	}

}
