package class_constructor;

public class VarArgs { // 메소드 오버로드
//	public int sum(int a, int b) {
//		return a+b;
//	}
//	public int sum(int a, int b, int c) {
//		return a+b+c;
//	}
//	public int sum(int a, int b, int c, int d) {
//		return a+b+c+d;
//	}
//	
	public int sum(int...ar) {		// 위의 메소드 오버로드는 여러번써야해서 번거롭다
		int hap = 0;				// object 로 할수도 있다 다음에 배우도록한다
		for(int i=0; i<ar.length; i++) {
			hap += ar[i]; // hap = hap +ar[i];
		}
		
		return hap;
	}

	public static void main(String[] args) {
		VarArgs va = new VarArgs();
		System.out.println("합 = " + va.sum(10,20)); //호출
		System.out.println("합 = " + va.sum(10,20,30));//호출
		System.out.println("합 = " + va.sum(10,20,30,40));//호출

	}

	

}

//호출부에서
// a = va.sub(25);
// sub 에 들어와서 a로 넘겨줘야할때 return 필요   System.out.println(va.sub(25));
//											이런형태면 무조건 리턴값이 있다고 한다 ??
