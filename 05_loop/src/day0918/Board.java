package day0918;

import day0915.Car;

public class Board{
   //����: Car Ŭ������ ���� �� Ŭ���� ��ü�� Ȱ���ϴ� ���α׷��� �ۼ��غ�����.
   //Car  Ŭ������ �ʵ�: ������ȣ, ���� ����, ����, ����, ����
   //�޼ҵ�: ���� ������ ������ ���ڰ� ����ϴ� �޼ҵ�, ������ ���� �Ķ���Ͱ� �ִ� �����ڿ� �Ķ���Ͱ� ���� ������, ĸ��ȭ
   
   
	private int id;

	private String title;
   
	private String writer;
   
	private String content;
   
   
   //�޼ҵ�
   //���� ���� ��¸޼ҵ�
   public void printInfo() {
      System.out.printf("��ȣ: %d", id);
	  System.out.printf("����: %s �ۼ���: %s\n", title, writer);
      System.out.printf("����: %s\n", content);
   }
   
   //�Ķ���Ͱ� ���� ������
   public Board() {
	   id = 0;
	   title = new String();
	   writer = new String();
	   content = new String();
   }
   
   //�Ķ���Ͱ� �ִ� ������
   public Board(String name, String writer, String contents) {
      this.title = title;
      this.writer = writer;
      this.content = content;
   }
   
   // �ʵ忡 ���� ĸ��ȭ
   public void setId(int id) {
	      this.id = id;
	   }
	   
	   public int getId() {
	      return id;
	   }
   
   
   public void setTitle(String name) {
      this.title = title;
   }
   
   public String getTitle() {
      return title;
   }
   
   public void setWriter(String writer) {
      this.writer = writer;
   }
   
   public String getWriter() {
      return writer;
   }
   
   public void setContent(String contents) {
      this.content = contents;
   }
   
   public String getContent() {
      return content;
   }
   
   public boolean equals(Object obj) {
	      //�Ķ���ͷ� �Ѿ�� ��ü�� �� equals�޼ҵ带 �����ϴ� ��ü�� ������ ���ҷ���
	      //1. obj�� �� Car Ŭ������ ��ü���� Ȯ���Ѵ�
	      //2. obj�� Car Ŭ������ ��ü�� �´ٸ�
	      //   �ʵ� �� ��� ������ ���ؼ� ����������
	      //   return true ���ش�.
	      
	      //1. obj �� �ش� Ŭ������ü���� Ȯ���Ҷ�����
	      //   instanceof Ŭ�����̸� �̶� �ڵ�� Ȯ�� �����ϴ�
	      if(obj instanceof Board) {
	         //obj�� Car Ŭ������ ��ü�̹Ƿ� 
	         //obj�� ī�� ����ȯ ������ �� �ִ�.
	         

	    		         Board b = (Board)obj;
	    		         if(id == b.id && title.equals(b.title)) {
	    		            return true;
	    		         }
	    		      }
	    		      
	    		      return false;
	    		   }
	    		

	   
	   public String toString() {
	      return "�ۼ���: "+writer+
	            ", ����: "+title+
	            ", ����: "+content;
	           
	            
	   }

}






















