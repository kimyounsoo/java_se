package method;

public class Operator2 {

	public static void main(String[] args) {
		boolean a = 25 > 36;
		System.out.println("a = " + a); //a = false
		System.out.println("!a = " + !a);//a = true
		
		String b = "apple"; //literal ���� String �� ����
		String c = new String("apple"); //����
		
		String result = b == c ? "����" : "�ٸ���"; // apple�̶� ���ڸ� ����°� �ƴ϶� �ּҸ� ����°�
		System.out.println("b == c : " + result);
		result = b != c ? "��" : "�ٸ���";
		System.out.println("b != c : " + result);
		
		result = b.equals(c) ? "����" : "�ٸ���";// �� �ּҾȿ� ����ִ� ���ڿ� �۾��� �������� ����°� equals
		System.out.println("b.equals(c) == c : " + result);
		result = !b.equals(c) ? "��" : "����";// �� �ּҾȿ� ����ִ� ���ڿ� �۾��� �������� ����°� equals
		System.out.println("!b.equals(c) == c : " + result);
		
		
		
		
		

	}

}
