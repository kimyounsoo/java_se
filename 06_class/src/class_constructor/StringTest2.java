package class_constructor;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/*
치환하는 프로그램을 작성하시오
String 클래스의 메소드를 이용하시오
대소문자 상관없이 개수를 계산하시오
br.readLine 3번 입력
[실행결과]
문자열 입력 : aabba 3줄 내가 입력
현재 문자열 입력 : aa
바꿀 문자열 입력 : cc
ccbba			2줄 만 결과 출력
1번 치환

문자열 입력 : aAbbA
현재 문자열 입력 : aa
바꿀 문자열 입력 : cc
ccbba
1번 치환

문자열 입력 : aabbaa
현재 문자열 입력 : aa
바꿀 문자열 입력 : cc
ccbbcc
2번 치환

문자열 입력 : AAccaabbaaaaatt
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddccddbbddddatt
4개 치환

문자열 입력 : aabb
현재 문자열 입력 : aaaaa
바꿀 문자열 입력 : ddddd
입력한 문자열의 크기가 작습니다

indexOf()
replace(??, ??)
 */

public class StringTest2 {
	
	
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int index;
		
		int count = 0;
		for(int i=0; i<=4; i++) {
		
			System.out.print("문자열 입력 : ");
			String str = br.readLine();
			System.out.print("현재 문자열 입력 : ");
			String rp = br.readLine();
			System.out.print("바꿀 문자열 입력 : ");
			String rc = br.readLine();
			
			if(str.length()<rp.length()) {
				System.out.println("입력한 문자열의 크기가 작습니다");
			}else {
				str = str.toLowerCase();
				rp = rp.toLowerCase();
				index = count = 0;
				while((index = str.indexOf(rp, index)) != -1){
					index += rp.length();
					count++;
				}
			}
			
			System.out.println(str.replace(rp, rc));
			System.out.println(count+"개 치환했습니다");
			
		

	}
	}
}









