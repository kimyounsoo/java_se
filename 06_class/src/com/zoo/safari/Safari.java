package com.zoo.safari;

import com.zoo.Zoo;

public class Safari extends Zoo{

	public static void main(String[] args) {
		Zoo zoo = new Zoo(); //�θ�Ŭ������ ����(�ʱ�ȭ)�߱⶧���� �θ�� �ڽ��� �����ִ��� �𸣱⶧���� ����������
		zoo.tiger();
		//zoo.giraffe(); 
		//zoo.elephant(); 
		//zoo.lion(); 
		System.out.println();
		
		Safari safari = new Safari(); // �̷��� �ڽ�Ŭ������ ����(�ʱ�ȭ)�ؾ�  protected������ �����ϴ�
		safari.tiger();
		safari.giraffe();
		//safari.elephant();	// �ٸ���Ű���� ����
		//safari.lion();		// �����̺��� �׳� �ȵ�
		
		//Zoo zoo = new Safari(); �̰͵� tiger ���� �ƹ��͵� �ȵ�
	}

}
