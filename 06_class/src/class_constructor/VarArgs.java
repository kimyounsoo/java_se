package class_constructor;

public class VarArgs { // �޼ҵ� �����ε�
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
	public int sum(int...ar) {		// ���� �޼ҵ� �����ε�� ����������ؼ� ���ŷӴ�
		int hap = 0;				// object �� �Ҽ��� �ִ� ������ ��쵵���Ѵ�
		for(int i=0; i<ar.length; i++) {
			hap += ar[i]; // hap = hap +ar[i];
		}
		
		return hap;
	}

	public static void main(String[] args) {
		VarArgs va = new VarArgs();
		System.out.println("�� = " + va.sum(10,20)); //ȣ��
		System.out.println("�� = " + va.sum(10,20,30));//ȣ��
		System.out.println("�� = " + va.sum(10,20,30,40));//ȣ��

	}

	

}

//ȣ��ο���
// a = va.sub(25);
// sub �� ���ͼ� a�� �Ѱ�����Ҷ� return �ʿ�   System.out.println(va.sub(25));
//											�̷����¸� ������ ���ϰ��� �ִٰ� �Ѵ� ??
