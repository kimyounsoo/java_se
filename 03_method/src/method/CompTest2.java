package method;
/*
 * ch�� �ִ� �����Ͱ� �빮���̸� �ҹ��ڷ� ����ϰ� �ƴϸ�(�ҹ���) �빮�ڷ� ����Ͻÿ�

[������]
T �� t

�Ǵ�

e �� E
 * 
 */
public class CompTest2 {

	public static void main(String[] args) {
		char ch = 'A';
		int result = ch >='A' && ch <='Z' ? ch+32 : ch-32;
		System.out.println(ch + " -> " + (char)result);
		
		//char result = ch >='A' && ch <='Z' ? (char)(ch+32) : (char)(ch-32);

	}

}


