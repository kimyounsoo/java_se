package day0910;
/*�������� ���α׷�
 *�츮�� ����ڷκ��� �Է��� �޵�
 *���� �������� ����ڷ� ���� ������� ������ �Է¹޾Ƽ�
 *���� ����ڰ� ���Ḧ �����ϸ� ���α׷��� ���ᰡ �Ǵ� ������ ������
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex05GradeBook {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//��Ʈ�� �ʱ�ȭ ���ִ¹��
		//1��
		String yn = new String();
//		 System.out.println("1��: "+yn);
//		//2��
//		yn = null;
//		System.out.println("2��: "+yn);
//		//3��
//		yn="";
//		System.out.println("3��: "+yn);
//		//4��
//		yn="��Ʈ��";
//		System.out.println("4��: "+yn);
		do {
			System.out.print("�̸�: ");
			String name = br.readLine();
			
			System.out.print("����: ");
			int kor = Integer.parseInt(br.readLine());
			
			System.out.print("����: ");
			int eng = Integer.parseInt(br.readLine());
			
			System.out.print("����: ");
			int math = Integer.parseInt(br.readLine());
			
			int sum = kor + eng + math;
			System.out.println("���� "+sum);
			
			System.out.print("����Ͻðڽ��ϱ�? (y/n)");
			yn = br.readLine();
			yn = yn.toUpperCase();
			//toUpperCase()�޼ҵ��
			//�ش� ������ ��� �빮�ڷ� �ٲ��ִ� �޼ҵ��̴�.
		}while(yn.equals("Y"));
		System.out.println("���α׷� ����");

	}

}
