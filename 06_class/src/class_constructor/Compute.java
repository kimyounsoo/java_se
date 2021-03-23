package class_constructor;

public class Compute {
	private int x;
	private int y;
	private int sum;
	private int sub;
	private int mul;
	private double div;
	
	
	public Compute(int x, int y) { // void x 클래스 이름과 똑같이
		this.x = x; // 클래스꺼 = 생성자꺼
		this.y = y;
	}
	public int getX() { //구현 부는 순서가 상관없다
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public int getSub() {
		return sub;
	}
	public void setSub(int sub) {
		this.sub = sub;
	}
	public int getMul() {
		return mul;
	}
	public void setMul(int mul) {
		this.mul = mul;
	}
	public double getDiv() {
		return div;
	}
	public void setDiv(double div) {
		this.div = div;
	}
	
	public void calc() {
		sum = x + y;
		sub = x - y;
		mul = x * y;
		div = (double)x/y;
		
	}

}
