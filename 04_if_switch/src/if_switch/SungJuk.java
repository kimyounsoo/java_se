package if_switch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 �̸�(name),����(kor),����(eng),����(math)������ �Է¹޾Ƽ� 
����(tot),���(avg), ����(grade)�� ���Ͻÿ�

����� 90�̻��̸� 'A'����
����� 80�̻��̸� 'B'����
����� 70�̻��̸� 'C'����
����� 60�̻��̸� 'D'����
�׿ܴ� 'F'����


[������]
�̸� �Է� : ȫ�浿 
���� �Է� : 78  
���� �Է� : 89  
���� �Է� : 100

   *** ȫ�浿 ���� ***
����      ����      ����      ����      ���        ����
78    89   100   xxx  xx.xxx  x
 */
public class SungJuk {

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
		double avg = (double)(tot/3.0);
		//char grade = 0;
		String grade;
		
//		if(avg>=90) grade='A';
//		else if(avg>=80) grade='B';
//		else if(avg>=70) grade='C';
//		else if(avg>=60) grade='D';
//		else grade = 'F';
	
	//else if �� ��� ���
		
//		if(avg>=90) grade='A';
//		if(avg<90 && avg>=80) grade = 'B';
//		if(avg<80 && avg>=70) grade = 'C';
//		if(avg<70 && avg>=60) grade = 'D';
//		if(avg<60) grade = 'F';
	
		
		switch((int)avg/10) {
		case 10 : grade="+A"; break;
		case 9 : grade="A"; break;
		case 8 : grade="B"; break;
		case 7 : grade="C"; break;
		case 6 : grade="D"; break;
		default : grade="F";
		
		}
		
		
		System.out.println(" *** "+ name + "����" + " ***");
		System.out.println("����\t����\t����\t����\t���\t����");
		System.out.println(kor+"\t"+eng+"\t"+math+"\t"+tot+"\t"+String.format("%.2f",avg)+"\t"+grade);
		
		
		
			
		
		
		
		
	}

}
