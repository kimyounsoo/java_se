package class_constructor;

/*
 x�� y�� ���� �޾Ƽ� ��, ��, ��, ���� ���Ͻÿ�
 
 Ŭ������ : Compute
 �ʵ�       : x, y, sum, sub, mul, div
 �޼ҵ�    : �����ڸ� ���ؼ� �����͸� ����
 		calc() - ��, ��, ��, ���� ���
 		getX()
 		getY()
 		getSum()
 		getSub()
 		getMul()
 		getDiv()
 [������]
  X		Y		SUM		SUB		MUL		DIV
  320	258
  */

public class ComputeMain {
	public static void main(String[] args) {
		//��ü �迭
//		Compute[] ar = new Compute[3];
			// ���⼭ new�� ComputeŬ������ �����Ѱ��� �ƴϴ�
			//	�� 3���� �迭�� ������ ���̴�. Compute �� �� �� 3��
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
//for(Compute data : ar) { length�� �Ƚᵵ �迭�� ũ�⸸ŭ for���� ����
