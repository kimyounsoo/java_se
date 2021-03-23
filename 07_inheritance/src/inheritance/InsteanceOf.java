package inheritance;

class AA{}

class BB extends AA{}

public class InsteanceOf {

	public static void main(String[] args) {
		AA aa = new AA();
		BB bb = new BB();
		AA aa2 = new BB();		
		
		AA aa3 = aa; 
		
		if(aa instanceof AA) // aa 가 가리키는 주소값에 클래스 AA가 있는가(aa 가 AA로 형변환(cating))
			System.out.println("1. TRUE");
		else 
			System.out.println("1. FALSE");
		
		AA aa44 = bb; //부모 = 자식
		if(bb instanceof AA) // bb 가 가리키는 주소값을 따라가면  AA의 클래스 타입이 있는가(aa 가 AA로 형변환(cating))
			System.out.println("1. TRUE");
		else 
			System.out.println("1. FALSE");
		
		BB bb2 = (BB)aa2; // 자식 = (자식)부모
		if(aa2 instanceof BB) // bb 가 가리키는 주소값을 따라가면  AA의 클래스 타입이 있는가(aa 가 AA로 형변환(cating))
			System.out.println("1. TRUE");
		else 
			System.out.println("1. FALSE");
		
		//BB bb3 = (BB)aa3; // error 에러는 안나지만 실행하면 에러
		if(aa3 instanceof BB) // bb 가 가리키는 주소값을 따라가면  AA의 클래스 타입이 있는가(aa 가 AA로 형변환(cating))
			System.out.println("1. TRUE");
		else 
			System.out.println("1. FALSE");
		
		      	

	}

}
//aa 가 가리키는 곳에 클래스 AA가 있느냐??
//aa 가 AA 형변환(Casting)
