package day0915;

import java.io.IOException;

public class StudentEx01 {
	public static void main(String[] args) throws IOException {
		// ��ü�� ������
		Student s1 = new Student(); // <= ��ȣ�� ������ �޼ҵ�, �����ڸ޼ҵ�// new Student() Ȥ�� new Student(�Ķ����) �� ������
		s1 = new Student();
		System.out.printf("�̸�: %s, ����: %d�� ����: %d�� ����: %d��\n", s1.getName(), s1.getKor(),s1.getEng(),s1.getMath());
		//��ü�� �ʵ� Ȥ�� �޼ҵ带 ���� �� ������
		//���ٿ����� . �� �̿��ϸ� �ȴ�.
		
		s1.setName("�迬��");
		s1.setKor(100);
		s1.setEng(90); //s1.setEng() = 90 x
		s1.setMath(91);
		s1.setId(1);
		
		System.out.printf("�̸�: %s, ����: %d�� ����: %d�� ����: %d��\n", s1.getName(), s1.getKor(),s1.getEng(),s1.getMath());
		System.out.printf("%s �л��� ����: %d�� ���: %.2f��\n",s1.getName(), s1.calculateSum(), s1.calculateAverage());
		
		Student s2 = new Student();
		s2.setName("�����");
		s2.setKor(98);
		s2.setEng(97);
		s2.setMath(98);
		s2.setId(2);
		System.out.printf("�̸�: %s, ����: %d�� ����: %d�� ����: %d��\n", s2.getName(), s2.getKor(),s2.getEng(),s2.getMath());
		System.out.printf("%s �л��� ����: %d�� ���: %.2f��\n",s2.getName(), s2.calculateSum(), s2.calculateAverage());
		
		String str1 = new String(); // �� �ڵ�� String str1 =""; �� ���������� �ƹ��� ���� ���� ��Ʈ�� ������ �ʱ�ȭ�� ���̴�.
		// ������ String str1 = "";���� ���� �������� ǥ�� ����̴�
		System.out.println(str1.length());
		
		
		
		s1.setName("�迬��"); // �� s1�� Student.java �� name��this.�̵ȴ�
		s2.setName("�����"); // �� s2�� Student.java �� name��this.�̵ȴ�
		
		

		Student s3 = new Student("abc", 4, 5, 6, 7);
		Student s4 = new Student("abc", 4, 5, 6, 7);
		
		System.out.println("s3: "+s3);
		System.out.println("s4: "+s4);
		System.out.println("s3.equals(s4): "+s3.equals(s4));
		
		
	}
	

}
