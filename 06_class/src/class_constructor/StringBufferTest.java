package class_constructor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringBufferTest {
	private int dan;
	
	public StringBufferTest() throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("원하는 단을 입력 : ");
		dan = Integer.parseInt(br.readLine());
	}
	
	public void dsip() {
		StringBuffer sb = new StringBuffer();
		for(int i=1; i<=9; i++) {
			//System.out.println(dan+"*"+i+"="+dan*i);
			sb.append(dan);
			sb.append("*");
			sb.append(i);
			sb.append("=");
			sb.append(dan*i);
			System.out.println(sb);
			sb.delete(0, sb.length());
		}
	}
	
	public static void main(String[] args)throws IOException{
		StringBufferTest cc = new StringBufferTest();
		cc.dsip();


	}

}
