package day0922;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import day0915.Student;

//ArrayList�� string.match�� ����� �л����� ���α׷�
public class StudentEx01answer {
   private static ArrayList<Student> list;
   private static BufferedReader bufferedReader;
   private static int id;
   public static void main(String[] args) throws NumberFormatException, IOException {
      list = new ArrayList<>();
      bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      id = 1;
      
      showMenu();
   }

   private static void showMenu() throws IOException {
      while(true) {
         System.out.println("1. �Է� 2. ��� 3. ����");
         System.out.print("> ");
         int choice = validateInt(1, 3);
         if(choice == 1) {
            insert();
         }else if(choice == 2) {
            selectAll();
         }else if(choice == 3) {
            System.out.println("������ּż� �����մϴ�.");
            break;
         }
      }
   }
   
   private static void insert() throws IOException {
      //list�� �߰��� Student ��ü�� �ϳ� �����.
      Student s = new Student();
      s.setId(id);
      id++;
      System.out.println("�̸�");
      System.out.print("> ");
      s.setName(bufferedReader.readLine());
      
      System.out.println("���� ����");
      s.setKor(validateInt(0, 100));
      
      System.out.println("���� ����");
      s.setEng(validateInt(0, 100));
      
      System.out.println("���� ����");
      s.setMath(validateInt(0, 100));
      
      list.add(s);
   }
   
   private static void selectAll() throws IOException {
      for(int i = 0; i < list.size(); i++) {
         System.out.printf("%d. %s\n", i+1, list.get(i).getName());
      }
      System.out.println("�󼼺����� ��ȣ�� �Է��� �ּ��� (0�� ����)");
      int userChoice = validateInt(0, list.size()) - 1;
      if(userChoice == -1) {
         System.out.println("�������� ���ư��ϴ�.");
      }else {
         selectOne(userChoice);
      }
   }
   
   private static void selectOne(int index) throws IOException {
      Student s = list.get(index);
      System.out.printf("�̸�: %s �й�:%d\n", s.getName(), s.getId());
      System.out.printf("����: %d ����: %d ����: %d\n", s.getKor(), s.getEng(), s.getMath());
      System.out.printf("����: %d ���: %.2f\n", s.calculateSum(), s.calculateAverage());
      System.out.println("1. ���� 2. ���� 3. �������");
      int userChoice = validateInt(1, 3);
      if(userChoice == 1) {
         update(index);
      }else if(userChoice == 2) {
         delete(index);
      }else if(userChoice == 3) {
         selectAll();
      }
   }
   
   private static void update(int index) throws IOException{
      System.out.println("�̸�");
      System.out.print("> ");
      list.get(index).setName(bufferedReader.readLine());
      System.out.println("����");
      list.get(index).setKor(validateInt(0, 100));
      System.out.println("����");
      list.get(index).setEng(validateInt(0, 100));
      System.out.println("����");
      list.get(index).setMath(validateInt(0, 100));
      selectOne(index);
   }
   
   private static void delete(int index) throws IOException {
      System.out.println("������ �����Ͻðڽ��ϱ�? (y/n)");
      System.out.print("> ");
      String yn = bufferedReader.readLine().toUpperCase();
      if(yn.equals("Y")) {
         list.remove(index);
         selectAll();
      }else if(yn.equals("N")) {
         selectOne(index);
      }
   }
   
   private static int stringToInteger() throws IOException {
      //System.out.println("> ");
      String userInput = bufferedReader.readLine();
      while(!userInput.matches("\\d*")) {
         System.out.println("���ڸ� �Է����ּ���.");
         System.out.print("> ");
         userInput = bufferedReader.readLine();
      }
      return Integer.parseInt(userInput);
   }
   
   private static int validateInt(int minimum, int maximum) throws IOException {
      int value = stringToInteger();
      while(value < minimum || value > maximum) {
         System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
         value = stringToInteger();
      }
      return value;
   }
}





