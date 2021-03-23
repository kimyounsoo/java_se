package method;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Salary {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		
		System.out.print("이름 입력 : ");
		String name = br.readLine();
		System.out.print("직급 입력 : ");
		String rank = br.readLine();
		System.out.print("기본급 입력 : ");
		int basePay = Integer.parseInt(br.readLine());
		System.out.print("수당 입력 : ");
		int pay = Integer.parseInt(br.readLine());
		
		int wage = basePay + pay;
		double taxRate = wage >=4000000 ? 0.03 : 0.02;
		
		
		Salary sly = new Salary();
		int tax = sly.calcTax(wage, taxRate);
		int salary = sly.calcSalary(wage, tax);
		
		
		//int tax = (int)(wage * taxRate);
		//int salary = wage - tax;
		String result = salary>=4000000 ? "3%" : "2%";
		
		
		
		System.out.println("\t *** "+name+" 월급 명세서 ***");
		System.out.println("기본급\t수당\t급여\t세율\t세금\t월급");
		System.out.println(basePay+"\t"+pay+"\t"+wage+"\t"+result+"\t"+tax+"\t"+salary+"\t");}
		
		public int calcTax(int wage, double taxRate) {
		     return (int)(wage*taxRate);
		}
		
		public int calcSalary(int wage, int tax) {
			return wage - tax;
		}
	}
		
		
		

	

   
