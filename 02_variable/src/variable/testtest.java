package variable;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class testtest {

	   public static void main(String[] args) throws IOException {
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      
	      System.out.print("이름 입력 : ");
	      String name = br.readLine();
	      System.out.print("국어 입력 : ");
	      int kor = Integer.parseInt(br.readLine());
	      System.out.print("영어 입력 : ");
	      int eng = Integer.parseInt(br.readLine());
	      System.out.print("수학 입력 : ");
	      int math = Integer.parseInt(br.readLine());
	      
	      int tot = kor + eng + math;
	      double avg = (double)tot / 3;
	      
	      //testtest testtest = new testtest();
	      //int tot = testtest.calcTot(kor, eng, math);//총점을 구하는 메소드
	     // double avg = testtest.calcAvg(tot);
	      
	      System.out.println("\t *** "+name+" 성적표 ***");
	      System.out.println("국어\t영어\t수학\t총점\t평균");
	      System.out.println(kor+"\t"+eng+"\t"+math+"\t"+tot+"\t"+ String.format("%.3f", avg));
}
	   //public int calcTot(int kor, int eng, int math){ //구현 변수명은 다르게 잡아도 무관
		//   return kor+eng+math;
	   //}
	   
	  // public double calcAvg(int tot){
		  // return tot / 3.0;
	   }
//}