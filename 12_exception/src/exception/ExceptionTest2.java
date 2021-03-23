package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionTest2 {
	private int dan;
	
	public void input() throws NumberFormatException, IOException { //구현부에 익셉션을 걸면
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		
		System.out.print("원하는 단을 입력하세요 : ");
		dan = Integer.parseInt(br.readLine());
	}
	
	public void output() {
		if(dan>=2 && dan<=9) {
			for(int i = 1; i<=9; i++) {
			System.out.println(dan+"*"+i+"="+dan*i);
		}//for
	}else {
		//System.out.println("범위 초과");
		try {
			//throw new Exception("범위초과ㅏㅏ");//강제로 Exception 발생 throw 는 바이러스 throws 는 백신
			throw new MakeException("범위초과ㅏㅏ"); // 한글자차이로 사용처가 다름
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
		
	
	public static void main(String[] args) throws IOException  { // 호출부도 익셉션을 걸어줘야한다
		ExceptionTest2 et = new ExceptionTest2();
		et.input();
		et.output();
		

		
	}

}
