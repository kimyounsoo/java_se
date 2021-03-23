package day0915;

import java.io.IOException;

public class StudentEx01 {
	public static void main(String[] args) throws IOException {
		// 객체를 만들어보자
		Student s1 = new Student(); // <= 괄호가 있으면 메소드, 생성자메소드// new Student() 혹은 new Student(파라미터) 가 생성자
		s1 = new Student();
		System.out.printf("이름: %s, 국어: %d점 영어: %d점 수학: %d점\n", s1.getName(), s1.getKor(),s1.getEng(),s1.getMath());
		//객체의 필드 혹은 메소드를 접근 할 때에는
		//접근연산자 . 을 이용하면 된다.
		
		s1.setName("김연수");
		s1.setKor(100);
		s1.setEng(90); //s1.setEng() = 90 x
		s1.setMath(91);
		s1.setId(1);
		
		System.out.printf("이름: %s, 국어: %d점 영어: %d점 수학: %d점\n", s1.getName(), s1.getKor(),s1.getEng(),s1.getMath());
		System.out.printf("%s 학생의 총점: %d점 평균: %.2f점\n",s1.getName(), s1.calculateSum(), s1.calculateAverage());
		
		Student s2 = new Student();
		s2.setName("김수진");
		s2.setKor(98);
		s2.setEng(97);
		s2.setMath(98);
		s2.setId(2);
		System.out.printf("이름: %s, 국어: %d점 영어: %d점 수학: %d점\n", s2.getName(), s2.getKor(),s2.getEng(),s2.getMath());
		System.out.printf("%s 학생의 총점: %d점 평균: %.2f점\n",s2.getName(), s2.calculateSum(), s2.calculateAverage());
		
		String str1 = new String(); // 이 코드는 String str1 =""; 와 마찬가지로 아무런 값이 없는 스트링 변수로 초기화한 것이다.
		// 하지만 String str1 = "";보다 좀더 정석적인 표현 방법이다
		System.out.println(str1.length());
		
		
		
		s1.setName("김연수"); // 이 s1이 Student.java 의 name의this.이된다
		s2.setName("김수진"); // 이 s2가 Student.java 의 name의this.이된다
		
		

		Student s3 = new Student("abc", 4, 5, 6, 7);
		Student s4 = new Student("abc", 4, 5, 6, 7);
		
		System.out.println("s3: "+s3);
		System.out.println("s4: "+s4);
		System.out.println("s3.equals(s4): "+s3.equals(s4));
		
		
	}
	

}
