package method;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class IputTest {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("���� a : ");
		int a = Integer.parseInt(br.readLine()); // Line -> ����, ���͸� ĥ������
		System.out.print("�Ǽ� b : ");
		double b = Double.parseDouble(br.readLine());
		
		System.out.println(a + " + " + b + " = " + (a+b));
		

	}

}
