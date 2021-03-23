package class_constructor;

import java.util.Scanner;

/*
 * 5문제의 시험지 채점하는 프로그램
1번부터 5번까지 모든 답은 전부 1이다
1문제당 20점씩 계산한다

이름 입력 : 홍길동
답   입력 : 12311

이름      1 2 3 4 5   점수
홍길동   O X X O O   60
----------------
객체 배열
인원수 입력 : 3

이름 입력 : 홍길동
답 입력    : 13211

이름 입력 : 코난
답 입력    : 11111

이름 입력 : 또치
답 입력    : 13242

이름      1 2 3 4 5   점수
홍길동   O X X O O   60
코난      O O O O O   100
또치      O X X X X   20
 */
public class ExaminationMain {

	public static void main(String[] args) {
//		Examination aa = new Examination();
//				//			메모리 생성자 + 생성자
//		aa.compare();
//		
//		System.out.println("이름\t1 2 3 4 5 \t점수");
//		System.out.print(aa.getName()+"\t");//+aa.getOx()+"\t"+aa.getScore());
//										//	배열명은 주소값으로 나온다 스크린샷 70번 참조
//		for(int i=0; i<aa.getOx().length; i++) {
//			System.out.print(aa.getOx()[i]+" ");
//		}
//		System.out.println("\t"+aa.getScore());
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("인원수 입력 : ");
		int count = scan.nextInt();
		
		Examination[] ar = new Examination[count];
		
			for(int i=0; i<ar.length; i++) {
	         ar[i] = new Examination();
	         ar[i].compare();
	      }
	      
	      System.out.println();
	      System.out.println("이름\t1 2 3 4 5 \t점수");
	      
	      for(int k=0; k<count; k++) {
	         System.out.print(ar[k].getName()+"\t");
	         for(int i=0; i<ar[k].getOx().length; i++) {
	            System.out.print(ar[k].getOx()[i]+" ");
	         }
	         System.out.println("\t" + ar[k].getScore());
	      }//for k

			
		
		
		



	}

}
