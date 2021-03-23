package method;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class IputTest {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("정수 a : ");
		int a = Integer.parseInt(br.readLine()); // Line -> 한줄, 엔터를 칠때까지
		System.out.print("실수 b : ");
		double b = Double.parseDouble(br.readLine());
		
		System.out.println(a + " + " + b + " = " + (a+b));
		

	}

}
