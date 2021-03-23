package inheritance;

/*
class Object {
	public boolean equals(Object ob){} //������ �� (�ּ�)
	public String toString(){} ��Ű����.Ŭ������@16����
	public int hashCode(){}
}

final calss String extends Object {
	public boolean equals(Object ob){} //���ڿ� ��
	public String toString(){} // ���ڿ�
	public int hashCode(){}	//���ڿ��� 10���� ��ȯ
							//���ڿ� ���Ŀ� ���ؼ� ������� ��
						* 	//�ٸ� ���ڿ��̾ ���� �ؽð��� �߻� �� �� �ִ�
						* 	//int 21�ﰳ�̰� ���ڿ��� ���Ѵ�� ǥ�� �Ұ���
}
*/


class Test2 extends Object{ // ��� Ŭ������ ��� object ���� ��� ���� �Ǿ��ִ°�
	@Override
	public String toString() {
		//return super.toString();
		return "���ٺ�";
	}
	
}

public class ObjectMain {

	public static void main(String[] args) {
		Test2 t = new Test2();
		System.out.println("��ü t = "+t);// toString �� �����Ǿ��ִ°� ObjectMain ���� object���� ��� �Ǿ��ֱ⶧����
		System.out.println("��ü t = "+t.toString());
		System.out.println("��ü t = "+t.hashCode());
		System.out.println();
		
		String str = "apple";
		System.out.println("��ü str = " + str);
		System.out.println("��ü str = " + str.toString());
		System.out.println("��ü str = " + str.hashCode()); //������ �ȵȴ�
		
		String aa = new String("apple");
		String bb = new String("apple");
		System.out.println("aa==bb : " + (aa==bb)); // ==�� �ּҸ� ���°��̶� false
		System.out.println("aa.equals(bb) : "+aa.equals(bb)); //���ڿ� ��ü�� �� true
		
		Object cc = new Object();
		Object dd = new Object();
		System.out.println("cc==dd : " + (cc==dd)); //�ּ�, false
		System.out.println("cc.equals(dd) : " + cc.equals(dd)); //�ּ�, false ���������� ������Ʈ�� �����߱⶧���� �ּҺ�
		System.out.println();
		
		Object ee = new String("apple");
		Object ff = new String("apple");
		System.out.println("ee==ff : " + (ee==ff)); //�ּ�, false
		System.out.println("ee.equals(ff) : "+ee.equals(ff)); //���ڿ�, true ��Ʈ���� �����߱⶧���� ���ڿ� ��
		System.out.println();
	}

}

//Object�� toString�� 
//String�� toString�� 
//�����ϴµ� Object�� toString�� 
//�ּҰ���ȯ String�� toString�� 
//���ڿ���ȯ�̶�� �����̽Ű���? ok

