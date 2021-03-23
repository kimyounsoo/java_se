package exception;

public class SingleTon {
	private int num = 3;
	private static SingleTon instance = null;
	
	public static SingleTon getInstance(){ // 이름은 바꿔도 되지만 일반적으로 이렇게쓰면 싱글톤 메소드이름이다
		if(instance == null) {
			synchronized (SingleTon.class) {
				instance = new SingleTon();
			}
		}
		
		return instance;
	}
	
	public static void main(String[] args) {
		SingleTon aa = new SingleTon();
		aa.num++;
		System.out.println("aa = " + aa);
		System.out.println("num = "+ aa.num);
		System.out.println();
		
		SingleTon bb = new SingleTon();
		bb.num++;
		System.out.println("bb = " + bb);
		System.out.println("num = " + bb.num);
		System.out.println();
		
		System.out.println("** 싱글톤 **");
		SingleTon cc = SingleTon.getInstance();//생성
		cc.num++;
		System.out.println("cc = " + cc);
		System.out.println("num = "+ cc.num);
		System.out.println();
		
		SingleTon dd = SingleTon.getInstance();//생성 싱글톤은 동일한 주소값을 가진 클래스가 계속 이어저서 값이 늘어난다
		dd.num++;
		System.out.println("dd = " + dd);
		System.out.println("num = "+ dd.num);
		System.out.println();
		
	}


}
