package nested;

public class AbstractMain {

	public static void main(String[] args) {
		//AbstractTest at = new AbstractTest(); 추상 클래스는 new 할수 없다. 해결책은 자식클래스(반드시 Override) or 메소드
		//at.setName("홍길동");
		//System.out.println("이름 = "+ at.getName());
		
		AbstractTest at = new AbstractTest() {//익명 Inner,인터페이스를 new 한게 아니라 중괄호,익명(흑기사)를 new 한것이다
			public void setName(String name) {//구현
				this.name = name;
			}
		};
		
		InterA in = new InterA() { //인터페이스를 new 한게 아니라 중괄호,익명(흑기사)를 new 한것이다
			public void aa() {}
			public void bb() {}
		};
		
		AbstractExam ae = new AbstractExam() {
			//public void cc() {} // 오버라이드를 해도되고 안해도되고
			  public void dd() {} // 내가 원하는 메소드만 오버라이드
		};
	}

}
