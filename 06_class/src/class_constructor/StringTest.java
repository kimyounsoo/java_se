package class_constructor;

public class StringTest {

	public static void main(String[] args) {
		String a = "apple"; //���ڿ� literal���� �̰��� ���ڿ� �� String �ۿ� �ȵȴ�
		String b = "apple";
		if(a==b) System.out.println("a�� b�� �������� ����");
		else System.out.println("a�� b�� �������� �ٸ���");
		if(a.equals(b))System.out.println("a��b�� ���ڿ��� ����");
		else System.out.println("a�� b�� ���ڿ��� �ٸ���");
		System.out.println();
		
		String c = new String("apple");
		String d = new String("apple");
		if(c==d) System.out.println("c�� d�� �������� ����");
		else System.out.println("c�� d�� �������� �ٸ���");
		if(c.equals(d))System.out.println("c��d�� ���ڿ��� ����");
		else System.out.println("c�� d�� ���ڿ��� �ٸ���");
		System.out.println();
		
		String e = "Have a nice day!!";
		System.out.println("e = " + e);
		//���ڿ��� ������ �ȵǹǷ� �޸� 4�� �����ȴ�
//		JVM�� ���ؼ� ���� �� Garbage Collecteor�� ������, �Ʒ� e ----> �����ϰ� ������
//		Garbage Collector�� ����Ǹ� ��ǻ�ʹ� �����. ���� ������ ���
//		"���� ��¥��"
//		"���� ��¥�� 2020"
//		"���� ��¥�� 20209"
//		e----->"���� ��¥�� 2020925" 
		
		System.out.println("���ڿ��� ũ�� = "+e.length());
		for(int i=0; i<e.length(); i++) {
			System.out.println(i+":"+e.charAt(i));
		}
		System.out.println();
		
		System.out.println("�κ� ���ڿ� ����="+e.substring(7));
		System.out.println("�κ� ���ڿ� ����="+e.substring(7,8)); //7������ 11�� '����' ���� 11�� ���Ծȵ�
		
		System.out.println("�빮�� ���� = " + " Hello".toUpperCase());
		System.out.println("�ҹ��� ���� = " + " Hello".toLowerCase());
		
		System.out.println("���ڿ� �˻�="+e.indexOf("¥"));
		System.out.println("���ڿ� �˻�="+e.indexOf("��¥")); // �� ���� �� ��ȣ 3
 		System.out.println("���ڿ� �˻�="+e.indexOf("���ٺ�")); // ������ -1
		
 							
		

	}

}
