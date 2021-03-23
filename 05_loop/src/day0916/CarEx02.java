package day0916;
//����ڷκ��� ���� ������ �Է¹ް� ����ϴ� ���α׷��� �ۼ��ϼ���
//���� 1. ���� �ƹ��� ������ ���ٸ� ����� ���� �ʰ� �Ͻÿ�
//���� 2. ���ѷ����� ���ؼ� �Է°� ����� ����ڰ� �����ϴ� ��ŭ �ݺ��ϰ� ���弼��

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import day0915.Car;

//����:
//1. �Է� 2. ��� 3. ���� : 1
//���� ��ȣ��? (00�� 0000)
//���� ������ .....
//���� ������? (������)
//�Է¿Ϸ�
//1. �Է� 2. ��� 3. ���� : 2 
//(������ ������ ��µ�)

//20�б���
public class CarEx02 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		Car c = new Car();
		while(true) {
	         System.out.println("��Ʈ ���� ���� ���α׷�");
	         System.out.println("1. �Է� 2. ��� 3. ����");
	         int choice = Integer.parseInt(bufferedReader.readLine());
	         if(choice == 1) {
	            // ���� ���� �Է�
	            // ���� ��ȣ �Է� �غ���
		        System.out.print("�̸�: ");
		        c.setType(bufferedReader.readLine());
	        	System.out.print("��ȣ: ");
	            c.setNumber(bufferedReader.readLine());
	            System.out.print("����: ");
	            c.setYear(Integer.parseInt(bufferedReader.readLine()));
	            System.out.print("����: ");
	            c.setPrice(Integer.parseInt(bufferedReader.readLine()));
	            System.out.print("����: ");
	            c.setColor(bufferedReader.readLine());
	         }else if(choice == 2) {
	            // ���� ���� ���
	            // ���� c�� �ʵ尪�� 0�̰ų� ""�̸� �ƹ��� ������ �Էµ��� �ʾҴٴ� ���̹Ƿ�
	            // ���޽����� ����Ѵ�.
	            if(c.getNumber().equals(0)) {
	               System.out.println("���� �Էµ� ������ �����ϴ�.");
	            }else {
	               c.printInfo();
	            }
	            	
	         }else if(choice == 3) {
	            System.out.println("������ּż� �����մϴ�.");
	            break;
	         }else {
	            System.out.println("�߸��Է��ϼ̽��ϴ�.");
	         }
	      }
	   }
	}
