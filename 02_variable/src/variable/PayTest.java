package variable;

public class PayTest {

	public static void main(String[] args) {
		char name = 'L'; // String name = "L"
		int basePay = 2500000;
		double b = 0.033;
		int tax =  (int)(basePay * b);
		int salary = basePay - tax;
		
		System.out.println("***" + name + "�� ���� ***");
		System.out.println("�⺻��"+":"+basePay + "��");
		System.out.println("����"+":"+tax+ "��");
		System.out.println("����"+":"+salary+ "��");
	
		
	}

}
