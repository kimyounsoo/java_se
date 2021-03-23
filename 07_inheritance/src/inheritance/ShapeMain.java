package inheritance;

class ShapeTest{
   protected double area;
   
   public ShapeTest() {
      System.out.println("ShapeTest 기본 생성자");
   }
   
   public void calcArea() {
      System.out.println("도형을 계산합니다");
   }
   
   public void dispArea() {
      System.out.println("도형을 출력합니다");
   }
}

class SamTest extends ShapeTest {
   protected int base, height;
   
   public SamTest(int base, int height) {
      System.out.println("SamTest 생성자");
      this.base = base;
      this.height = height;
   }
   
   @Override
   public void calcArea() {
      area = base * height / 2.0;
   }
   
   @Override
   public void dispArea() {
      System.out.println("삼각형 넓이 = "+area);
   }
}

class SaTest extends ShapeTest  {
   protected int width, height;
   
   public SaTest(int width, int height) {
      System.out.println("SaTest 생성자");
      this.width = width;
      this.height = height;
   }
   
   @Override
   public void calcArea() {
      area = width * height;
   }
   
   @Override
   public void dispArea() {
      System.out.println("사각형 넓이 = "+area);
   }
}

class SadariTest extends ShapeTest {
   protected int top, bottom, height;
   
   public SadariTest(int top, int bottom, int height) {
      System.out.println("SadariTest 생성자");
      this.top = top;
      this.bottom = bottom;
      this.height = height;
   }
   
   @Override
   public void calcArea() {
      area = (top + bottom) * height / 2.0;
   }
   
   @Override
   public void dispArea() {
      System.out.println("사다리꼴 넓이 = "+area);
   }
}

public class ShapeMain {

  public static void main(String[] args) {
//      SamTest sam = new SamTest(5,7); // 1:1 관계, 결합도 100%
//      sam.calcArea();
//      sam.dispArea();
//      System.out.println();
//      
//      SaTest sa = new SaTest(7,9);
//      sa.calcArea();
//      sa.dispArea();
//      System.out.println();
//      
//      SadariTest sadari = new SadariTest(2,3,5);
//      sadari.calcArea();
//      sadari.dispArea();
//      System.out.println();
		
		//다형성 - 부모 = 자식, 결합도 느슨해진다
		ShapeTest shape; // 만능 리모컨 오버라이드 된 메소드만만능리모컨 가능
		shape = new SamTest(5, 7);
		shape.calcArea();
		shape.dispArea();
		System.out.println();
		
		shape = new SaTest(7, 9);
		shape.calcArea();
		shape.dispArea();
		System.out.println();
		
		shape = new SadariTest(2, 3, 5);
		shape.calcArea();
		shape.dispArea();
		System.out.println();
      
   }


}

//String aa = "apple";
//
//String bb = aa; // 1:1 관계
//
//Object ob = aa; // 부모 = 자식
//
//Integer in = new Integer(25);
//Integer in2 = in;
//Object ob = in;

