package if_switch;

import java.io.IOException;

/*
 ����(1), ����(2), ��(3) ����

[������]
����(1),����(2),��(3) �� ��ȣ �Է� : 3 (user)
��ǻ�� : ����   �� : ���ڱ�
You Win!!

����(1),����(2),��(3) �� ��ȣ �Է� : 3 (user)
��ǻ�� : ����   �� : ���ڱ�
You Lose!!

����(1),����(2),��(3) �� ��ȣ �Է� : 1 (user)
��ǻ�� : ����   �� : ����
You Draw!!
 */
public class RPSGame  {

	public static void main(String[] args) throws IOException {
		
		  int com, user;
	      
	      com = (int)(Math.random()*3)+1; //1~3 ���� �߻�
	      
	      System.out.print("����(1),����(2),��(3) �� ��ȣ �Է� : ");
	      //user = System.in.read()-48; //1�� ���� �Է�
	      user = System.in.read()-'0';
	      
	      if(com==1) {//���� ������ ���
	         if(user==1) {
	            System.out.println("��ǻ�� : ����\t ����� : ����");
	            System.out.println("Draw!!");
	         }else if(user==2){
	            System.out.println("��ǻ�� : ����\t ����� : ����");
	            System.out.println("Win!!");
	         }else if(user==3){ // ���������̶� else �� �ص� �����
	            System.out.println("��ǻ�� : ����\t ����� : ���ڱ�");
	            System.out.println("Lose!!");
	         }
	         
	      }else if(com==2) {//���� ������ ���
	         if(user==1){
	            System.out.println("��ǻ�� : ����\t ����� : ����");
	            System.out.println("Lose!!");
	         }
	         else if(user==2){
	            System.out.println("��ǻ�� : ����\t ����� : ����");
	            System.out.println("Draw!!");
	         }
	         else if(user==3){ // ���������̶� else �� �ص� �����
	            System.out.println("��ǻ�� : ����\t ����� : ���ڱ�");
	            System.out.println("Win!!");
	         }
	         
	      }else if(com==3) {//���� ���ڱ��� ���, ���������̶� else �� �ص� �����
	         if(user==1){
	            System.out.println("��ǻ�� : ���ڱ�\t ����� : ����");
	            System.out.println("Win!!");
	         }
	         else if(user==2){
	            System.out.println("��ǻ�� : ���ڱ�\t ����� : ����");
	            System.out.println("Lose!!");
	         }
	         else if(user==3){ // ���������̶� else �� �ص� �����
	            System.out.println("��ǻ�� : ���ڱ�\t ����� : ���ڱ�");
	            System.out.println("Draw!!");
	         }
	      }
	}
}
	      
	