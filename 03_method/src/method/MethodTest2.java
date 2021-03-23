package method;

public class MethodTest2 {
	public void de(){//구현
	       System.out.println("non-static method");
	}

	public static void output(){//구현
		System.out.println("static method");
	}
	
	public static void main(String[] args) {	
		MethodTest2.output();
		MethodTest2 d = new MethodTest2();
		d.de();
		
		
		
		
		
		
		
		
		//MethodTest2.output();//호출  모든 메소드는 반드시 호출한 곳으로 되돌아 와야한다
		
		//MethodTest2 d = new MethodTest2();
		//d.de(); //호출
	
	 
	}
	

}//MethodTest2 
