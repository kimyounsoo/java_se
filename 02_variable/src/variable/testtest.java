package variable;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class testtest {

	   public static void main(String[] args) throws IOException {
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      
	      System.out.print("�̸� �Է� : ");
	      String name = br.readLine();
	      System.out.print("���� �Է� : ");
	      int kor = Integer.parseInt(br.readLine());
	      System.out.print("���� �Է� : ");
	      int eng = Integer.parseInt(br.readLine());
	      System.out.print("���� �Է� : ");
	      int math = Integer.parseInt(br.readLine());
	      
	      int tot = kor + eng + math;
	      double avg = (double)tot / 3;
	      
	      //testtest testtest = new testtest();
	      //int tot = testtest.calcTot(kor, eng, math);//������ ���ϴ� �޼ҵ�
	     // double avg = testtest.calcAvg(tot);
	      
	      System.out.println("\t *** "+name+" ����ǥ ***");
	      System.out.println("����\t����\t����\t����\t���");
	      System.out.println(kor+"\t"+eng+"\t"+math+"\t"+tot+"\t"+ String.format("%.3f", avg));
}
	   //public int calcTot(int kor, int eng, int math){ //���� �������� �ٸ��� ��Ƶ� ����
		//   return kor+eng+math;
	   //}
	   
	  // public double calcAvg(int tot){
		  // return tot / 3.0;
	   }
//}