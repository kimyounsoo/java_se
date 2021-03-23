package day0915;

public class Student {
	//학생의 필드를 만들어보자
	//필드는 변수처럼
	//우리가 데이터타입 필드이름을 선언해주면 된다.
	
	//학생의 이름
	private String name; // 보라색 글씨는 예약어로 해당이름으로는 변수를 만들수 없음
	//name에 대한 셋터 // 겟터 셋터는 어디서든 적용할수 있게 만들어야 하기때문에 퍼블릭으로 만드는게 원칙이다
	public void setName(String name) {
		this.name = name;
	}
	//name에 대한 겟터
	public String getName() {//게터는 객체의 파라미터를 쓰기때문에 파라미터가 필요없다
		return name;		//그럼 강사님 Student가 폰설계도인 클래스이고 s1, s2가 객체?핸드폰인거죠? 네
	}
	//학생의 국어점수
	private int korean;
	public void setKor(int korean) {
		this.korean = korean;
	}
	public int getKor() {
		return korean;
	}
	//학생의 영어점수
	private int english;
	public void setEng(int english) {
		this.english = english;
	}
	public int getEng() {
		return english;
	}
	//학생의 수학점수
	private int math;
	public void setMath(int math) {
		this.math = math;
	}
	public int getMath() {
		return math;
	}
	//학생의 관리번호
	private int id;
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
	//메소드를 만들어보자
	//1. 총점을 구하는 메소드
	public int calculateSum() { // 패키지 혹은 디폴트 제한자라서 퍼블릭을 붙여줘야 Ex01Student02 에서사용할수있다
		return korean + english + math;
	}
		
	
	
	//2. 평균을 구하는 메소드
	public double calculateAverage() {
		return calculateSum()/3.0;
	}
	//파라미터가 있는 생성자
	public Student(String name, int id, int korean, int english, int math) {
		//같은 이름이 있을때
		//메소드 내부 변수나 파라미터는 필드보다 호출 우선순위가 높다.
		//따라서 같은 이름으로 존재할 때 필드를 호출할 때에는
		//명확하게 "해당 객체의 필드" 라고 지정해주어야 한다.
		//이럴 때에는 this.필드 로 지정할 수 있다.
		//즉 this란 이 메소드를 실행하는 클래스 객체 자신을 가리키게 된다.
		//해당클래스 = this 라고 이해하면된다
		//클래스는 설계도 this 핸드폰
		this.name = name; //Student 메소드의 파라미터 값을 필드 name에 넣는다
		this.id = id;
		this.korean = korean;
		this.english = english;
		this.math = math;
	}
	
	//파라미터가 없는 생성자
	public Student() {
		id = -1;
		korean = -1;
		english = -1;
		math = -1;
		
		name = new String();
		
		//System.out.println(calculateSum());
	}
	

	//static 키워드는 해당 필드 혹은 메소드를
	//객체 생성없이 곧장 호출할 수 있게 만들어준다.
	//다만 이 스태틱이란 키워드는 해당 메소드의 코드를
	//프로그램 실행영역에 강제로 포함시키는 것이기 때문에
	//만약 해당 메소드가 내부에서 다른 메소드나 필드를 사용하게 된다면
	//그 다른 메소드나 필드도 마찬가지로 스태틱을 붙여서
	//실행영역에 포함시켜주어야 한다.
	//대표적인 예 : Integer.parseInt(br.readLine());
	//          이것도 스태틱이 붙는 메소드 이다
	
	//equals() 메소드 구현
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student s = (Student)obj;
			if(id == s.id && name.equals(s.name)) {
				return true;
			}
		}
		
		return false;
	}
	
	//toString() 메소드 구현
	public String toString() {
		return "이름: "+name+
				",학번: "+id+
				", 국어점수: "+korean+" 점,"+
				"영어점수: "+english+" 점,"+
				"수학점수: "+math+" 점,";
}
}