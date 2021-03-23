package class_constructor;

public class SungJuk {
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	private String grade;

	public SungJuk(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;

	}

	public void calc() {
		tot = kor + eng + math;
		avg = (double) tot / 3;
		switch((int)avg/10) {
		case 10 : grade="+A"; break;
		case 9 : grade="A"; break;
		case 8 : grade="B"; break;
		case 7 : grade="C"; break;
		case 6 : grade="D"; break;
		default : grade="F";
		
		}
		
	}

	public String getName() {
		return name;
	}

	public int getEng() {
		return eng;
	}

	public int getKor() {
		return kor;
	}

	public int getMath() {
		return math;
	}

	public int getTot() {
		return tot;
	}

	public double getAvg() {
		return avg;
	}

	public String getGrade() {
		return grade;
	}

}

//Ä¸½¶È­
//1ÀÎºÐÈ­