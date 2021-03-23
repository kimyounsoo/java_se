package class_constructor;
/* static 문제
 * 객체배열
 * 버퍼드리더 사용 x
과일 판매량 구하기
월별 매출합계도 구하시오

[실행결과]
-------------------------------------
PUM   JAN     FEB     MAR       TOT
-------------------------------------
사과       100     80      75        255
포도       30      25      10        xxx
딸기       25      30      90        xxx
------------------------------------
      xxx     xxx     xxx         
        
 */


class Fruit{
	
	
	
	private String name;
	private int jan, feb, mar, tot;
	private static int jtot, ftot, mtot; // static
	
	
	//데이터는 생성자를 통해서 받고
	public Fruit(String name, int jan, int feb, int mar) {
		this.name = name;
		this.jan = jan;
		this.feb = feb;
		this.mar = mar;
	}
	
	//calcTot() - 모든 합계 구하는 메소드
	public void calcTot() {
		  tot = jan + feb + mar;
		 jtot += jan; // jtot = jtot + jan static 으로 잡았기 때문에 누적
		 ftot += feb;
		 mtot += mar;
		  }

	//display() - 과일명 , 1월, 2월, 3월, 합계를 출력하는 메소드
	public void display() {
			System.out.println(name+"\t"+jan+"\t"+feb+"\t"+mar+"\t"+tot);

		}
	
		

	
	//output() - 1월의 합계, 2월의 합계, 3월의 합계를 출력하는 메소드
	public static void output() { // static으로 잡은이유는 바로 클래스명으로 접근하기 위해 82번째 줄
								//static 이 없어도 ar[0~2].output() 으로 접근해도 된다

		System.out.println("\t"+jtot+"\t"+ftot+"\t"+mtot);
	}
	
	
}
public class FruitMain {

	public static void main(String[] args) {
		Fruit[] ar = new Fruit[3];
		// 클래스 생성
		ar[0] = new Fruit("사과", 100, 80, 75);
		ar[1] = new Fruit("포도", 30, 25, 10);
		ar[2] = new Fruit("딸기", 25, 30, 90);
		System.out.println("--------------------------------------");
		System.out.println("PUM\tJAN\tFEB\tMAR\tTOT");
		System.out.println("--------------------------------------");

		for(Fruit f : ar) {
			// 메소드 호출
			f.calcTot();
			f.display();
		}//for
		System.out.println("--------------------------------------");
		Fruit.output();
		


		
		

	}

}
