package class_constructor;

import java.util.StringTokenizer;

public class Token {

	public static void main(String[] args) {
		String str = "�п�,��,,���ӹ�";
		
		StringTokenizer st = new StringTokenizer(str,","); //, �� ������ ���ڸ� �и� �ϰڴٴ� �ǹ�
		System.out.println("��ū ���� = "+st.countTokens()); // 3��
		
		while(st.hasMoreTokens()) { // true /false
			System.out.println(st.nextToken());
		}//while
		System.out.println("---------------");
		
		String[] ar = str.split(","); // �迭�� ���� �Ѱ��ִ°Ŷ� new �� �Ⱥ��δ�??
		for(String data : ar) {		  // split �� �׻� �迭�� �Բ� ����
			System.out.println(data);
		}//for ����� ���� StringTokenizer �� ������ ����, �� ǥ������ �ʰ� split�� ������ ǥ���Ѵ�

	}

}
