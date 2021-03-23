package class_constructor;

import java.text.DecimalFormat;

public class SalaryDTO {
	private String name, position;
	private int basePay, benefit, tax, salary;
	private double taxRate;

	public SalaryDTO(String name, String position, int basePay, int benefit) {
		this.name = name;
		this.position = position;
		this.basePay = basePay;
		this.benefit = benefit;
	}

	public void calc() {

//	      int total = this.basePay + this.benefit; 지역변수 this 생략해도됨
//
//	      if(total <= 2000000) taxRate = 0.01;
//	      else if(total <= 4000000) taxRate = 0.02;
//	      else taxRate = 0.03;
//
//	      tax = (int)(total*taxRate);
//	      salary = total - tax;

		if ((basePay + benefit) <= 2000000) {
			taxRate = 0.01;

		} else if ((basePay + benefit) <= 4000000) {
			taxRate = 0.02;

		} else if ((basePay + benefit) >= 4000000) {
			taxRate = 0.03;
		}

		tax = (int) ((basePay + benefit) * taxRate);
		salary = basePay + benefit - tax;

	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getPosition() {
		return position;
	}

	public void setBasePay(int basePay) {
		this.basePay = basePay;
	}

	public int getBasePay() {
		return basePay;
	}

	public void setBenefit(int benefit) {
		this.benefit = benefit;
	}

	public int getBenefit() {
		return benefit;
	}

	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}

	public double getTaxRate() {
		return taxRate;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}

	public int getTax() {
		return tax;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}
	
	@Override
	public String toString() {
	      DecimalFormat df = new DecimalFormat();
		return name+"\t"
				+ position + "\t"
				+ df.format(basePay) + "\t"
				+ benefit + "\t"
				+ taxRate*100+"%" + "\t"
				+ tax + "\t"
				+ salary;
	}

}
