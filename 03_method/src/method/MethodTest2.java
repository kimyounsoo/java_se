package method;

public class MethodTest2 {
	public void de(){//����
	       System.out.println("non-static method");
	}

	public static void output(){//����
		System.out.println("static method");
	}
	
	public static void main(String[] args) {	
		MethodTest2.output();
		MethodTest2 d = new MethodTest2();
		d.de();
		
		
		
		
		
		
		
		
		//MethodTest2.output();//ȣ��  ��� �޼ҵ�� �ݵ�� ȣ���� ������ �ǵ��� �;��Ѵ�
		
		//MethodTest2 d = new MethodTest2();
		//d.de(); //ȣ��
	
	 
	}
	

}//MethodTest2 
