package variable;

public class paytest1 {
   
	public static void main(String[] args) {
		char name = 'L'; // String name = "L"
		int basePay = 2500000;
		int tax = (int)(basePay * 0.033);
		int salary = basePay - tax;
		
		System.out.println("***" + name + "�� ���� ***");
		System.out.println("�⺻��"+":"+basePay + "��");
		System.out.println("����"+":"+tax+ "��");
		System.out.println("����"+":"+salary+ "��");
		//System.out.println("���� : " + String.format("%.0f", salary) + "��");

	}

}
