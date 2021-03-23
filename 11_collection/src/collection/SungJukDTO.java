package collection;

import java.text.DecimalFormat;

public class SungJukDTO implements Comparable<SungJukDTO> {
	private int number, kor, eng, math, tot;
	private String name;	
	private double avg;

//	public SungJukDTO(int number, String name, int kor, int eng, int math) {
//		this.number = number;
//		this.name = name;
//		this.kor = kor;
//		this.eng = eng;
//		this.math = math;
//	}
	
	public void calc() {
		tot = kor + eng + math;
		avg = (double)tot/3;
		//avg = tot / 3.;
	}
	


	public void setNumber(int number) {
		this.number = number;
	}
	public int getNumber() {
		return number;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getKor() {
		return kor;
	}	
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getEng() {
		return eng;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getMath() {
		return math;
	}	
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public double getAvg() {
		return avg;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public int getTot() {
		return tot;
	}
	

	
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#.##");
		return number+"\t"
				+ name + "\t"
				+ kor + "\t"
				+ eng + "\t"
				+ math + "\t"
				+ tot + "\t"
				+ df.format(avg);
	}



	@Override
	public int compareTo(SungJukDTO o) {
		if(this.tot < o.tot) return 1;
		else if(this.tot > o.tot) return -1;
		else return 0;
		
	}
	
	




	


}
