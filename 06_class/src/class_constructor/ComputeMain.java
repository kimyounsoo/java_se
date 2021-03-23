package class_constructor;

/*
 x와 y의 값을 받아서 합, 차, 곱, 몫을 구하시오
 
 클래스명 : Compute
 필드       : x, y, sum, sub, mul, div
 메소드    : 생성자를 통해서 데이터를 주입
 		calc() - 합, 차, 곱, 몫을 계산
 		getX()
 		getY()
 		getSum()
 		getSub()
 		getMul()
 		getDiv()
 [실행결과]
  X		Y		SUM		SUB		MUL		DIV
  320	258
  */

public class ComputeMain {
	public static void main(String[] args) {
		//객체 배열
//		Compute[] ar = new Compute[3];
			// 여기서 new는 Compute클래스를 생성한것이 아니다
			//	방 3개인 배열을 생성한 것이다. Compute 가 들어갈 방 3개
//		ar[0] = new Compute(320,258);
//		ar[1] = new Compute(256,125);
//		ar[2] = new Compute(452,365);
		
//		Compute[] ar = {new Compute(320,258), new Compute(256,125), new Compute(452,365)};
		
		Compute[] ar = new Compute[]{new Compute(320,258),
						new Compute(256, 125),
						new Compute(452, 365)};

		System.out.println("X\tY\tSUM\tSUB\tMUL\tDIV");
		for(int i=0; i<ar.length; i++) {
			ar[i].calc();
		
		System.out.println(ar[i].getX()+"\t"
					+ar[i].getY()+"\t"
					+ar[i].getSum()+"\t"
					+ar[i].getSub()+"\t"
					+ar[i].getMul()+"\t"
					+String.format("%.2f", ar[i].getDiv()));	
			
		}
		
	}
}
//for(Compute data : ar) { length를 안써도 배열의 크기만큼 for문이 돈다
