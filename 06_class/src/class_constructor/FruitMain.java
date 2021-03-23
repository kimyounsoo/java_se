package class_constructor;
/* static ����
 * ��ü�迭
 * ���۵帮�� ��� x
���� �Ǹŷ� ���ϱ�
���� �����հ赵 ���Ͻÿ�

[������]
-------------------------------------
PUM   JAN     FEB     MAR       TOT
-------------------------------------
���       100     80      75        255
����       30      25      10        xxx
����       25      30      90        xxx
------------------------------------
      xxx     xxx     xxx         
        
 */


class Fruit{
	
	
	
	private String name;
	private int jan, feb, mar, tot;
	private static int jtot, ftot, mtot; // static
	
	
	//�����ʹ� �����ڸ� ���ؼ� �ް�
	public Fruit(String name, int jan, int feb, int mar) {
		this.name = name;
		this.jan = jan;
		this.feb = feb;
		this.mar = mar;
	}
	
	//calcTot() - ��� �հ� ���ϴ� �޼ҵ�
	public void calcTot() {
		  tot = jan + feb + mar;
		 jtot += jan; // jtot = jtot + jan static ���� ��ұ� ������ ����
		 ftot += feb;
		 mtot += mar;
		  }

	//display() - ���ϸ� , 1��, 2��, 3��, �հ踦 ����ϴ� �޼ҵ�
	public void display() {
			System.out.println(name+"\t"+jan+"\t"+feb+"\t"+mar+"\t"+tot);

		}
	
		

	
	//output() - 1���� �հ�, 2���� �հ�, 3���� �հ踦 ����ϴ� �޼ҵ�
	public static void output() { // static���� ���������� �ٷ� Ŭ���������� �����ϱ� ���� 82��° ��
								//static �� ��� ar[0~2].output() ���� �����ص� �ȴ�

		System.out.println("\t"+jtot+"\t"+ftot+"\t"+mtot);
	}
	
	
}
public class FruitMain {

	public static void main(String[] args) {
		Fruit[] ar = new Fruit[3];
		// Ŭ���� ����
		ar[0] = new Fruit("���", 100, 80, 75);
		ar[1] = new Fruit("����", 30, 25, 10);
		ar[2] = new Fruit("����", 25, 30, 90);
		System.out.println("--------------------------------------");
		System.out.println("PUM\tJAN\tFEB\tMAR\tTOT");
		System.out.println("--------------------------------------");

		for(Fruit f : ar) {
			// �޼ҵ� ȣ��
			f.calcTot();
			f.display();
		}//for
		System.out.println("--------------------------------------");
		Fruit.output();
		


		
		

	}

}
