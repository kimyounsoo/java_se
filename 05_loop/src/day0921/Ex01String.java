package day0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// String Ŭ������ ���� �˾ƺ���
// String �̶�?
// �������� ���ڰ� ���ִ� char[]��
// �츮�� �ٷ�� ���� Ŭ������ ���·� �ٲ������.

// String Ŭ���� �ȿ��� ��Ʈ���� �ٷ�µ� ������ �Ǵ� �پ��� �޼ҵ尡 �غ�Ǿ� �ִ�.

public class Ex01String {
	public static void main(String[] args) throws IOException {
		String string1 = new String("abc");//1��
		String string2 = "abc";				//2��	�� ���� ���̰� ����.
		
		//1�� : �ش� ��Ʈ���� ���° ĭ�� ���� ���ڰ� �ִ��� Ȯ���� ������
		//charAt(index)�� �����ϸ� �ȴ�.
		System.out.println("string1.charAt(0): "+string1.charAt(0));
		//2��: 2���� ���ڿ��� �����ų������ concat�� ����Ѵ�.
		System.out.println("string1.concat(string2): "+string1.concat(string2));
		//3��: �ش� ���ڿ��� �̷��� ���� ���ڿ��� �ִ��� üũ�� ������ contains()�� ����Ѵ�.
		System.out.println("string1.contains(\"ab\"): "+string1.contains("ab"));
		//4��: �ش� ���ڿ��� �ʱ�ȭ�� �Ǿ������� ����ִ� ���ڿ����� üũ�� ������ isEmpty()�� ����Ѵ�.
		// null != ""; true
		// null �� ���¿��� �ƹ��͵� �� �� ����. ���ο� �ʱ�ȭ�� �Ҷ�����
		// "" Ȥ��  new String() ���� �ʱ�ȭ�ϸ� ��� �޼ҵ���� ȣ�� �� �� ������
		// �ٸ� �ƹ��� ���ڵ� ���ڿ��� ���� ������ ���̴�.
		
		// ���̶� ���� ������ �ּҰ��� �ο��� �Ǿ�������
		// �� ������ �ش� �ּҰ� �ƹ��� �ʱ�ȭ�� �ȵǾ��ִ� ���¸� ���̶�� �Ѵ�.
		// " "�� �������� �Ҵ�ȴ�.
		
		// �츮�� �� Ŭ������ �ʵ� Ȥ�� �޼ҵ带 ���� �Ϸ���
		// �� �������� �� ������ ã�ƾ� �ϴµ�
		// ���� ���¿����� �� ������� �����Ƿ�
		// ������ �� ���� �Ǵ� ���̴�.
		// �̻簡���� �ּ��� ����� �ߴµ� �ǹ��� �ȿö� ����
		
		//�� isEmpty() �޼ҵ��
		// �ش� ��Ʈ���� ���� �ƴ� ���� ���� �����ϴ�.
		
		
		System.out.println("string1.isEmpty(): "+string1.isEmpty());
		System.out.println("\"\".isEmpty(): "+"".isEmpty());
		
		//5��: �ش� ��Ʈ���� ���̸� �˰� ���������� length()
		System.out.println("string1.length(): "+string1.length()); //abc �����ڶ� 3
		
		//6��: �ش� ���ڿ��� �������ϰ� ��ġ�ϴ��� Ȯ���� ������ matches()�� ����Ѵ�.
		//		���� ������ ������������ ����Ѵ�.
		//		�پ��� ����ǥ������ ����ؼ� �츮�� ���ڿ��� �������� ���¸� �����ϴ���
		//		�׽�Ʈ �����ϴ�.
		//		ex)�ڵ��� ��ȣ
		//		������ ����� �����̹Ƿ� �츮�� �ش� ���ڿ��� ���ڷθ� �̷�����°� �ƴѰ��� ��������� ����
		// 		�ش� ��Ʈ���� ��δ� ��Ʈ������ �̷�������� üũ�� ������ \d* ���� �׽�Ʈ �Ѵ�.
		System.out.println("string1.matches(\\d*): "+string1.matches("\\d*")); // *�� �ϳ� �̻����� üũ
		System.out.println("\"12345\".matches(\\d*): "+"12345".matches("\\d*"));
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("���ڸ� �Է����ּ���: ");
		String userInput = bufferedReader.readLine();
		while(!userInput.matches("\\d*")) {
			System.out.println("���ڸ� �Է����ּ���");
			System.out.println("> ");
			userInput = bufferedReader.readLine();
		}
		int userNumber = Integer.parseInt(userInput);
		System.out.println("����ڰ� �Է��� ����: "+userNumber);
	}

}
