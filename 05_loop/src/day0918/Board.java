package day0918;

import day0915.Car;

public class Board{
   //숙제: Car 클래스를 만들어서 그 클래스 객체를 활용하는 프로그램을 작성해보세요.
   //Car  클래스의 필드: 차량번호, 차량 종류, 연식, 가격, 색깔
   //메소드: 현재 차량의 정보를 예쁘게 출력하는 메소드, 차량에 대한 파라미터가 있는 생성자와 파라미터가 없는 생성자, 캡슐화
   
   
	private int id;

	private String title;
   
	private String writer;
   
	private String content;
   
   
   //메소드
   //차량 정보 출력메소드
   public void printInfo() {
      System.out.printf("번호: %d", id);
	  System.out.printf("제목: %s 작성자: %s\n", title, writer);
      System.out.printf("색상: %s\n", content);
   }
   
   //파라미터가 없는 생성자
   public Board() {
	   id = 0;
	   title = new String();
	   writer = new String();
	   content = new String();
   }
   
   //파라미터가 있는 생성자
   public Board(String name, String writer, String contents) {
      this.title = title;
      this.writer = writer;
      this.content = content;
   }
   
   // 필드에 대한 캡슐화
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
	      //파라미터로 넘어온 객체가 이 equals메소드를 실행하는 객체와 같은지 비교할려면
	      //1. obj가 이 Car 클래스의 객체인지 확인한다
	      //2. obj가 Car 클래스의 객체가 맞다면
	      //   필드 중 몇몇 정보를 비교해서 같을때에만
	      //   return true 해준다.
	      
	      //1. obj 가 해당 클래스객체인지 확인할때에는
	      //   instanceof 클래스이름 이란 코드로 확인 가능하다
	      if(obj instanceof Board) {
	         //obj가 Car 클래스의 객체이므로 
	         //obj를 카로 형변환 시켜줄 수 있다.
	         

	    		         Board b = (Board)obj;
	    		         if(id == b.id && title.equals(b.title)) {
	    		            return true;
	    		         }
	    		      }
	    		      
	    		      return false;
	    		   }
	    		

	   
	   public String toString() {
	      return "작성자: "+writer+
	            ", 제목: "+title+
	            ", 내용: "+content;
	           
	            
	   }

}






















