package day0916;

import day0915.Car;

//Ŭ���� �迭
public class CarEx03Array {
	final static int SIZE = 3;
	public static void main(String[] args) {
		Car[] carArray = new Car[SIZE];
		for(int i =0; i < carArray.length; i++) {
			//Ŭ������ �迭�� �迭 ������ �ʱ�ȭ ���Ŀ�
			//�� ��ġ���� �츮�� �����ڸ� ȣ���ؼ�
			//�ش� �ε����� �ʱ�ȭ�� ���־�� �Ѵ�.
			//���� ������ NullPointException�� �߻��Ѵ�.
			//�Ȱ��� �ڷ����� ������ ������ ���ִ°��� �迭
			carArray[i] = new Car(); // carArray[1] = new Car(); 1~i �ʱ�ȭ
			carArray[i].setType("������ī");
			carArray[i].setColor("�����");
			carArray[i].setNumber("7777");
			carArray[i].setPrice(17);
		}
		
		for(int i = 0; i < carArray.length; i++) {
			System.out.println(carArray[i]);
		}

	}
}
