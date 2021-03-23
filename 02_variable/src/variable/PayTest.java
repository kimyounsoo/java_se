package variable;

public class PayTest {

	public static void main(String[] args) {
		char name = 'L'; // String name = "L"
		int basePay = 2500000;
		double b = 0.033;
		int tax =  (int)(basePay * b);
		int salary = basePay - tax;
		
		System.out.println("***" + name + "의 월급 ***");
		System.out.println("기본급"+":"+basePay + "원");
		System.out.println("세금"+":"+tax+ "원");
		System.out.println("월급"+":"+salary+ "원");
	
		
	}

}
