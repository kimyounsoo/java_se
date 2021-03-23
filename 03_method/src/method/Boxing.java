package method;

public class Boxing {

	public static void main(String[] args) {
		int a=25;
		double b =(double)a / 3; //강제형변환, Casting, Cast연산
		
		int c = 5;
		Integer d = c; // JDK 5.0 이상, AutoBoxing
	//	  객체형	   int(기본형)
		
		//Interger d = new Integer(c);
		
		Integer e = 5;
		int f = e;	// JDK 5.0 이상, unAutoBoxing
	//  기본형   = 객체형
	//	int f = e.intValue();
	}

}
