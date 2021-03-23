package class_constructor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str, tr, re;
		int index, count;
		
		System.out.print("문자열 입력 : ");
		str = br.readLine();
		
		System.out.print("현재 문자열 입력 : ");
		tr = br.readLine();
		
		System.out.print("바꿀 문자열 입력 : ");
		re = br.readLine();
		
		if(str.length()<tr.length()) {
			System.out.println("입력한 문자열의 크기가 작습니다.");
		}else {
			str = str.toLowerCase();
			tr = tr.toLowerCase();
			count = index = 0;
			while((index = str.indexOf(tr,index)) != -1) {
				index +=tr.length();
				count++;

			}
			
			System.out.println(str.replace(tr, re));
			System.out.println(count+"개 변환");
			
		

			}
		

		}
		
		
		
		
		

	

}

