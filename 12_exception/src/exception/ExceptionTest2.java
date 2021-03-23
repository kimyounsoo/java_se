package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionTest2 {
	private int dan;
	
	public void input() throws NumberFormatException, IOException { //�����ο� �ͼ����� �ɸ�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		
		System.out.print("���ϴ� ���� �Է��ϼ��� : ");
		dan = Integer.parseInt(br.readLine());
	}
	
	public void output() {
		if(dan>=2 && dan<=9) {
			for(int i = 1; i<=9; i++) {
			System.out.println(dan+"*"+i+"="+dan*i);
		}//for
	}else {
		//System.out.println("���� �ʰ�");
		try {
			//throw new Exception("�����ʰ�����");//������ Exception �߻� throw �� ���̷��� throws �� ���
			throw new MakeException("�����ʰ�����"); // �ѱ������̷� ���ó�� �ٸ�
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
		
	
	public static void main(String[] args) throws IOException  { // ȣ��ε� �ͼ����� �ɾ�����Ѵ�
		ExceptionTest2 et = new ExceptionTest2();
		et.input();
		et.output();
		

		
	}

}
