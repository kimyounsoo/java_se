package day0915;

public class Student {
	//�л��� �ʵ带 ������
	//�ʵ�� ����ó��
	//�츮�� ������Ÿ�� �ʵ��̸��� �������ָ� �ȴ�.
	
	//�л��� �̸�
	private String name; // ����� �۾��� ������ �ش��̸����δ� ������ ����� ����
	//name�� ���� ���� // ���� ���ʹ� ��𼭵� �����Ҽ� �ְ� ������ �ϱ⶧���� �ۺ����� ����°� ��Ģ�̴�
	public void setName(String name) {
		this.name = name;
	}
	//name�� ���� ����
	public String getName() {//���ʹ� ��ü�� �Ķ���͸� ���⶧���� �Ķ���Ͱ� �ʿ����
		return name;		//�׷� ����� Student�� �����赵�� Ŭ�����̰� s1, s2�� ��ü?�ڵ����ΰ���? ��
	}
	//�л��� ��������
	private int korean;
	public void setKor(int korean) {
		this.korean = korean;
	}
	public int getKor() {
		return korean;
	}
	//�л��� ��������
	private int english;
	public void setEng(int english) {
		this.english = english;
	}
	public int getEng() {
		return english;
	}
	//�л��� ��������
	private int math;
	public void setMath(int math) {
		this.math = math;
	}
	public int getMath() {
		return math;
	}
	//�л��� ������ȣ
	private int id;
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
	//�޼ҵ带 ������
	//1. ������ ���ϴ� �޼ҵ�
	public int calculateSum() { // ��Ű�� Ȥ�� ����Ʈ �����ڶ� �ۺ��� �ٿ���� Ex01Student02 ��������Ҽ��ִ�
		return korean + english + math;
	}
		
	
	
	//2. ����� ���ϴ� �޼ҵ�
	public double calculateAverage() {
		return calculateSum()/3.0;
	}
	//�Ķ���Ͱ� �ִ� ������
	public Student(String name, int id, int korean, int english, int math) {
		//���� �̸��� ������
		//�޼ҵ� ���� ������ �Ķ���ʹ� �ʵ庸�� ȣ�� �켱������ ����.
		//���� ���� �̸����� ������ �� �ʵ带 ȣ���� ������
		//��Ȯ�ϰ� "�ش� ��ü�� �ʵ�" ��� �������־�� �Ѵ�.
		//�̷� ������ this.�ʵ� �� ������ �� �ִ�.
		//�� this�� �� �޼ҵ带 �����ϴ� Ŭ���� ��ü �ڽ��� ����Ű�� �ȴ�.
		//�ش�Ŭ���� = this ��� �����ϸ�ȴ�
		//Ŭ������ ���赵 this �ڵ���
		this.name = name; //Student �޼ҵ��� �Ķ���� ���� �ʵ� name�� �ִ´�
		this.id = id;
		this.korean = korean;
		this.english = english;
		this.math = math;
	}
	
	//�Ķ���Ͱ� ���� ������
	public Student() {
		id = -1;
		korean = -1;
		english = -1;
		math = -1;
		
		name = new String();
		
		//System.out.println(calculateSum());
	}
	

	//static Ű����� �ش� �ʵ� Ȥ�� �޼ҵ带
	//��ü �������� ���� ȣ���� �� �ְ� ������ش�.
	//�ٸ� �� ����ƽ�̶� Ű����� �ش� �޼ҵ��� �ڵ带
	//���α׷� ���࿵���� ������ ���Խ�Ű�� ���̱� ������
	//���� �ش� �޼ҵ尡 ���ο��� �ٸ� �޼ҵ峪 �ʵ带 ����ϰ� �ȴٸ�
	//�� �ٸ� �޼ҵ峪 �ʵ嵵 ���������� ����ƽ�� �ٿ���
	//���࿵���� ���Խ����־�� �Ѵ�.
	//��ǥ���� �� : Integer.parseInt(br.readLine());
	//          �̰͵� ����ƽ�� �ٴ� �޼ҵ� �̴�
	
	//equals() �޼ҵ� ����
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student s = (Student)obj;
			if(id == s.id && name.equals(s.name)) {
				return true;
			}
		}
		
		return false;
	}
	
	//toString() �޼ҵ� ����
	public String toString() {
		return "�̸�: "+name+
				",�й�: "+id+
				", ��������: "+korean+" ��,"+
				"��������: "+english+" ��,"+
				"��������: "+math+" ��,";
}
}