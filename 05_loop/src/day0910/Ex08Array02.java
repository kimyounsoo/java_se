package day0910;
//�迭�� for���� ���� ���Ѻ��ô�.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex08Array02 {
	// ���
	//����� �ѹ� ���� �������� ���̻� �ٲ� �� ���� ����
	//����� ����ó�� �����ϰ� ���������
	//������ �� ���� �տ� final �̶�� Ű���带 �ٿ���
	//����� ������ �ָ�ȴ�.
	
	//����� �̸��� snake ǥ����� ����Ѵ�.
	//snakeǥ����̶�
	//��� ���ڸ� �� �빮�ڷ� �����ְ�
	//�ܾ��� ���̿��� _ �� �־��ִ� ����� ���Ѵ�.
	
	static final int SIZE = 5;
	public static void main(String[] args) throws IOException {
		//int �迭�� �ϳ� ������
		int[] array = new int[SIZE];
		//�� �迭�� ũ��� �����ŭ�� ũ�⸦ ���� ������
		//ũ�Ⱑ 5���ȴ�.
		
		//�迭�� ũ�⸦ Ȯ���� ������
		//�迭�̸�.length�� ����ϸ� �ȴ�.
		System.out.println("�迭�� ũ�� : "+array.length); //array.length = SIZE �� �ص���
		
		//�迭�� ��ü�� �ѹ��� ����
		//�迭�� �� ��ġ�� �츮�� index�� ���ؼ� �����ϱ⶧����
		//for ���� �̿��� �ټ� �ִ�!
		for(int i = 0; i < array.length; i++) {
			System.out.println(i+"�׹�°�� ��: "+array[i]);
		}
		
		//�⺻�� ������Ÿ�� �迭�� ���
		//��� ���� 0���� �ʱ�ȭ�� �ȴ�.
		
		//for���� ���ؼ� �� ��ġ�� ���� �Է�������
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i = 1; i < array.length; i++) {
			System.out.print(i+"��°�� ��: ");
			array[i] = Integer.parseInt(br.readLine());
		}
	
		for(int i = 1; i < array.length; i++) {
	         System.out.println(i+"��°�� ��: "+array[i]);

		}
	}
}