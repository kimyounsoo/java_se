package day0911;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class WeekendHomwork {
	
	static void showMenu() {
		System.out.println("----------------------");
	      System.out.println("��Ʈ����б� �������� ���α׷�");
	      System.out.println("\t1. �Է�");
	      System.out.println("\t2. ���");
	      System.out.println("\t3. ����");
	}
   public static void main(String[] args) throws NumberFormatException, IOException {
	   BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	   
	   int[][] koreanArray = new int[3][4];
       int[][] engArray = new int[3][4];
       int[][] mathArray = new int[3][4];
	   
     
     
      
      while(true) {
    	  showMenu();

    	int userChoice = Integer.parseInt(bufferedReader.readLine());
          if(userChoice == 1) {
        	  System.out.print("�г�: ");
        	  int year = Integer.parseInt(bufferedReader.readLine());
              while(year < 1 || year > 3){
                 System.out.println("�߸��� �г��Դϴ�.");
                 System.out.print("�г�: ");
                 year = Integer.parseInt(bufferedReader.readLine());
              }
              
              System.out.print("���°? (1�б� �߰�=1~2�б�⸻=4): ");
              int number = Integer.parseInt(bufferedReader.readLine());
              while(number < 1 || number > 4) {
                 System.out.println("�߸��� �Է��Դϴ�.");
                 System.out.print("���°? (1�б� �߰� = 1, 1�б� �⸻ = 2, 2�б� �߰� = 3, 2�б� �⸻ = 4): ");
                 number = Integer.parseInt(bufferedReader.readLine());
              }
              
              System.out.print("��������: ");
              int korean = Integer.parseInt(bufferedReader.readLine());
              while(korean < 0 || korean > 100) {
                 System.out.println("�߸��� �����Դϴ�.");
                 System.out.print("��������: ");
                 korean = Integer.parseInt(bufferedReader.readLine());
              }
             
              System.out.print("��������: ");
              int eng = Integer.parseInt(bufferedReader.readLine());
              while(eng < 0 || eng > 100) {
                 System.out.println("�߸��� �����Դϴ�.");
                 System.out.print("��������: ");
                 eng = Integer.parseInt(bufferedReader.readLine());
              }
              
              System.out.print("��������: ");
              int math = Integer.parseInt(bufferedReader.readLine());
              while(math < 0 || math > 100) {
                 System.out.println("�߸��� �����Դϴ�.");
                 System.out.print("��������: ");
                 eng = Integer.parseInt(bufferedReader.readLine());
              }
              
              
           System.out.print(year+"�г� ");
              switch(number) {
              case 1:
                 System.out.print("1�б� �߰�");
                 break;
              case 2:
                 System.out.print("1�б� �⸻");
                 break;
              case 3:
                 System.out.print("2�б� �߰�");
                 break;
              case 4:
                 System.out.print("2�б� �⸻");
                 break;
                 
              
              
              }
              System.out.println(" ��� "+korean+" ��," + " ��� " +eng+" ��,"+ " ���п� "+math+" ��,�� �ԷµǾ����ϴ�.");
              
          }else if(userChoice == 2) {
        	  
              
              
        	  
        	  
      }else if (userChoice == 3) {
    	  System.out.println("������ּż� �����մϴ�.");
    	  break;
      }else {
    	  System.out.println("�߸��Է��ϼ̽��ϴ�.");
      }
          
      }
   }
   static int vs(BufferedReader br) throws NumberFormatException, IOException {
	      System.out.print("������ �Է��ϼ���: ");
	      int score = Integer.parseInt(br.readLine());
	      
	      while(score < 0 || score > 100) {
	         System.out.println("�߸� �Է��ϼ̽��ϴ�.");
	         System.out.print("������ �Է��ϼ���: ");
	         score = Integer.parseInt(br.readLine());
	      }
		return score;
}
}
   
  
      

   







//�ָ� ����
      //�� ������ 
      //1��: ����, ����, ���� ������ ���� �� �� �ְ� �����ϰ�
      //2��: ���ѷ����� �̿��Ͽ� �޴��� ���ؼ� �Է°� ����� �� �� �ְ� �ٲٰ�
      //3��: �޼ҵ带 �и��غ�����.
      
      //��� ����: 













