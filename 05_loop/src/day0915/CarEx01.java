package day0915;

public class CarEx01 {
	public static void main(String[] args) {
		// Car ��ü�� ������ ������
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		
		
		//c1, c2, c3 �� ���͸� �̿��ؼ� ������ �Է��غ���
		
		c1.setType("������");
		c1.setColor("����");
		c1.setNumber("8277");
		c1.setYear(2020);
		c1.setPrice(10);
		
		c2.setType("���������");
		c2.setColor("���");
		c2.setNumber("7777");
		c2.setYear(2020);
		c2.setPrice(19);
		
		c3.setType("���ƹ�");
		c3.setColor("����");
		c3.setNumber("8277");
		c3.setYear(2020);
		c3.setPrice(11);
	
		
		c1.printInfo();
		c2.printInfo();
		c3.printInfo();
		
		c3.setType("��Ʋ��");
		c3.setColor("���");
		c3.setNumber("7777");
		c3.setYear(2020);
		c3.setPrice(19);
		
		c2.printInfo();
		c3.printInfo();
		
		//c2�� c3���� �Ȱ��� ������ �� �ִ�
		//�׷��ٸ� c2.equals(c3)�� ��Եɱ�?
		System.out.println("c2.equals(c3): " + c2.equals(c3));
		// ������ ������ �ּҰ��� ���� �� �̱⋚���� false�� ��µȴ�
		System.out.println("c2.equals(abc): " + c2.equals("abc"));
		
		System.out.println(c1); // == System.out.println(c1.toString());
	}
	

}
