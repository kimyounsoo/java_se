package day0915;

public class Car {
   //����: Car Ŭ������ ���� �� Ŭ���� ��ü�� Ȱ���ϴ� ���α׷��� �ۼ��غ�����.
   //Car  Ŭ������ �ʵ�: ������ȣ, ���� ����, ����, ����, ����
   //�޼ҵ�: ���� ������ ������ ���ڰ� ����ϴ� �޼ҵ�, ������ ���� �Ķ���Ͱ� �ִ� �����ڿ� �Ķ���Ͱ� ���� ������, ĸ��ȭ
   
   //�ʵ�
   //������ȣ
   private String number;
   //��������
   private String type;
   //����
   private int year;
   //����
   private int price;
   //����
   private String color;
   
   
   //�޼ҵ�
   //���� ���� ��¸޼ҵ�
   public void printInfo() {
      System.out.printf("���� ��ȣ: %s ���� ����: %s\n", number, type);
      System.out.printf("����: %d�� ����: %d��\n", year, price);
      System.out.printf("����: %s\n", color);
   }
   
   //�Ķ���Ͱ� ���� ������
   public Car() {
      number = new String();
      type = new String();
      year = 0;
      price = 0;
      color = new String();
   }
   
   //�Ķ���Ͱ� �ִ� ������
   public Car(String number, String type, int year, int price, String color) {
      this.number = number;
      this.type = type;
      this.year = year;
      this.price = price;
      this.color = color;
   }
   
   // �ʵ忡 ���� ĸ��ȭ
   public void setNumber(String number) {
      this.number = number;
   }
   
   public String getNumber() {
      return number;
   }
   
   public void setType(String type) {
      this.type = type;
   }
   
   public String getType() {
      return type;
   }
   
   public void setYear(int year) {
      this.year = year;
   }
   
   public int getYear() {
      return year;
   }
   
   public void setPrice(int price) {
      this.price = price;
   }
   
   public int getPrice() {
      return price;
   }
   
   public void setColor(String color) {
      this.color = color;
   }
   
   public String getColor() {
      return color;
   }
   public boolean equals(Object obj) {
	      //�Ķ���ͷ� �Ѿ�� ��ü�� �� equals�޼ҵ带 �����ϴ� ��ü�� ������ ���ҷ���
	      //1. obj�� �� Car Ŭ������ ��ü���� Ȯ���Ѵ�
	      //2. obj�� Car Ŭ������ ��ü�� �´ٸ�
	      //   �ʵ� �� ��� ������ ���ؼ� ����������
	      //   return true ���ش�.
	      
	      //1. obj �� �ش� Ŭ������ü���� Ȯ���Ҷ�����
	      //   instanceof Ŭ�����̸� �̶� �ڵ�� Ȯ�� �����ϴ�
	      if(obj instanceof Car) {
	         //obj�� Car Ŭ������ ��ü�̹Ƿ� 
	         //obj�� ī�� ����ȯ ������ �� �ִ�.
	         
	         Car c= (Car)obj;
	         if(number.equals(c.number)) {
	            return true;
	         }
	      }
	      
	      return false;
	   }
	   
	   public String toString() {
	      return "���� ��ȣ: "+number+
	            ", ���� ����: "+type+
	            ", ���� ����: "+price+"�� ,"+
	            " ���� ����: "+year+"��, "+
	            " ���� ����: "+color;
	            
	   }
  
}





















