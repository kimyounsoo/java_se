package variable;

public class paytest1 {
   
	public static void main(String[] args) {
		char name = 'L'; // String name = "L"
		int basePay = 2500000;
		int tax = (int)(basePay * 0.033);
		int salary = basePay - tax;
		
		System.out.println("***" + name + "의 월급 ***");
		System.out.println("기본급"+":"+basePay + "원");
		System.out.println("세금"+":"+tax+ "원");
		System.out.println("월급"+":"+salary+ "원");
		//System.out.println("월급 : " + String.format("%.0f", salary) + "원");

	}

}
