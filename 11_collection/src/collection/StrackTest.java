package collection;

import java.util.Stack;
import static java.lang.System.out; // import �� �˷��� �ִ°� System ����

public class StrackTest { //������ ���� ������ �ʴ´�. 

	public static void main(String[] args) {
		String[] groupA = {"������Ű��ź", "�����Ʈ", "����", "���ѹα�"};
		Stack<String> stack = new Stack<String>();
		
		for(int i=0; i<groupA.length; i++) //���� �ϳ��� �߰�ȣ ������
			stack.push(groupA[i]); //������ �����͸� push�� �ְ� pop ���� ����
		
		while( ! stack.isEmpty()) // ! ���������� ������ ����ִ��� �� ���� 
			out.println( stack.pop() ); // ���Ϲ��� ��������
	}

}
