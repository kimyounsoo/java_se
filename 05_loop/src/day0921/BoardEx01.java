package day0921;

//�����Ҵ��� �̿��� �Խ��� ���α׷�

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import day0918.Board;
import util.ArrayUtil;

public class BoardEx01 {
   private static Board[] boardArray;
   private static BufferedReader bufferedReader;
   public static void main(String[] args) throws NumberFormatException, IOException {
      boardArray = new Board[0];
      bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      showMenu();
   }
   
   private static void showMenu() throws NumberFormatException, IOException {
      while(true) {
         System.out.println("�Խ��� ���α׷�");
         System.out.println("1. �Է� 2. ��Ϻ��� 3. ����");
         System.out.print("> ");
         int choice = Integer.parseInt(bufferedReader.readLine());
         if(choice == 1) {
            //�Է� �޼ҵ� ȣ��
            insertBoard();
         }else if(choice == 2) {
            //��Ϻ��� �޼ҵ� ȣ��
            selectAll();
         }else if(choice == 3) {
            System.out.println("������ּż� �����մϴ�.");
            break;
         }
      }
   }
   
   private static void insertBoard() throws NumberFormatException, IOException{
      boardArray = ArrayUtil.add(boardArray, setBoardInfo());
   }
   
   private static Board setBoardInfo() throws NumberFormatException, IOException{
      Board b = new Board();
      
      System.out.print("�Խñ� ��ȣ: ");
      b.setId(Integer.parseInt(bufferedReader.readLine()));
      System.out.print("�Խñ� ����: ");
      b.setTitle(bufferedReader.readLine());
      System.out.print("�Խñ� ����: ");
      b.setContent(bufferedReader.readLine());
      System.out.print("�ۼ���: ");
      b.setWriter(bufferedReader.readLine());
      
      return b;
   }
   
   private static void selectAll() throws NumberFormatException, IOException{
      System.out.println("=========");
      System.out.println("��ȣ | ����");
      for(int i = 0; i < boardArray.length; i++) {
         System.out.printf("%d. %s\n", (i+1), boardArray[i].getTitle());
      }
      System.out.println("�󼼺����� ��ȣ (0�� �޴���): ");
      int choice = validateNumber(0, boardArray.length) - 1;
      if(choice == -1) {
         System.out.println("�޴��� ���ư��ϴ�.");
      }else {
         selectOne(choice);
      }
   }
   
   private static void selectOne(int index) throws NumberFormatException, IOException{
      Board b = boardArray[index];
      System.out.println("�۹�ȣ: "+b.getId());
      System.out.println("����: "+b.getTitle());
      System.out.println("�ۼ���: "+b.getWriter());
      System.out.println("����: "+b.getContent());
      System.out.println("1. ���� 2. ���� 3. �޴���");
      int choice = validateNumber(1, 3);
      if(choice == 1) {
         update(index);
      }else if(choice == 2) {
         delete(index);
      }else if(choice == 3) {
         selectAll();
      }
   }
   
   private static void update(int index) throws IOException{
      System.out.println("����: ");
      boardArray[index].setTitle(bufferedReader.readLine());
      System.out.println("����: ");
      boardArray[index].setContent(bufferedReader.readLine());
      System.out.println("�ۼ���: ");
      boardArray[index].setWriter(bufferedReader.readLine());
      selectOne(index);
   }
   
   private static void delete(int index) throws IOException{
      System.out.println("������ �ش� ���� ����ðڽ��ϱ�? (y/n)");
      String yn = bufferedReader.readLine();
      if(yn.equals("y")) {
         boardArray = ArrayUtil.removeByIndex(boardArray, index);
      }else if(yn.equals("n")) {
         selectOne(index);
      }
   }
   
   private static int validateNumber(int minimum, int maximum) throws NumberFormatException, IOException{
      System.out.print("> ");
      int value = Integer.parseInt(bufferedReader.readLine());
      while(value < minimum || value > maximum) {
         System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
         System.out.print("> ");
         value = Integer.parseInt(bufferedReader.readLine());
      }
      
      return value;
   }
}
















