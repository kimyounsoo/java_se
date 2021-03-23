package day0914;
//������ �迭
//������ �迭�̶� ������ �迭�� �����Ҷ�
//���� ���� ũ�⸸ �������ְ�
//�ű⿡ ���� �迭�� ��Ű�� ����� �� �����ִ� ����̴�.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//����: 1�г� 1���� 30��, 2���� 29��, 3���� 32���϶�
//�迭 ������ ��� �ұ�?
//int[][] scoreArray = int[3][];
//scoreArray[0] = new int[30];
//scoreArray[1] = new int[29];
//scoreArray[2] = new int[32];

public class Ex02MultiArray {
	final static int SIZE = 3;
	public static void main(String[] args) throws NumberFormatException, IOException {
		//1�г� ������ �л����� �Է� �ް�
		//�� �л����� �̸��� �ݸ��� �־��ִ� ���α׷�
		String[][] nameArray = new String[3][];
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("��Ʈ����б� �̸� ���� ���α׷�");
			System.out.println("1. �Է� 2. ��� 3. ����");
			System.out.println("> ");
			int choice = Integer.parseInt(bufferedReader.readLine());
			if(choice == 1) {
				int ban  = selectBan(bufferedReader);
				
				//�̸��� �Է��ϴ� �޼ҵ� ����
				//�� �迭�� ũ�⸦ �����ؾ��ϹǷ�
				//�л� ���ڸ� �Է� �޵��� �Ѵ�.
				int stSize = stSizenumber(bufferedReader);
				
				//�Է¹��� �ݰ� �л����ڷ� �ش� �迭�� �ʱ�ȭ ���ش�.
				nameArray[ban - 1] = new String[stSize];
				
				//�л��� �̸��� �Է¹޴´�.
				for(int i = 0; i < nameArray[ban - 1].length; i++) { //�л� ���ڸ�ŭ �Է�
					System.out.println((i+1)+"�� �л��� �̸�: ");
					nameArray[ban - 1][i] = bufferedReader.readLine();
				}
			}else if(choice == 2) {
				//�� �����ϴ� �޼ҵ� ����
				int ban  = selectBan(bufferedReader);
				//�̸��� ����ϴ� �޼ҵ� ����
				//�� ���⼭ �����ؾ��� ����
				//�ش� �迭�� �ʱ�ȭ�� �Ǿ��ִ��� üũ�� �ؾ��Ѵ�.
				//���� �ش� �迭�� �ʱ�ȭ �Ǿ����� �ʴٸ�
				//�� ������ ���� null�� �����̹Ƿ�
				//�츮�� ������ �� ����.
				//���� �� �迭�� null���� ���� üũ�ϰ�
				//null�� �ƴҶ����� ����ϴ� for���� �����Ѵ�.
				
				//null�̶� ������ ������ Ÿ���� �ʱ�ȭ��
				//���� �� �̷���� �ִ� ���¸�
				//null�̶�� �Ѵ�.
				if(nameArray[ban - 1] == null) {
					System.out.println("���� �ش� ���� �Էµ��� ���� ���� �Դϴ�.");
				}else {
					for(int i = 0; i < nameArray[ban - 1].length; i++) {
					 System.out.println(nameArray[ban-1][i]);
					}
				
				}
			}else if(choice == 3) {
				System.out.println("������ּż� �����մϴ�.");
				break;
			}
		}
		
		//�⺻�� ������Ÿ�԰� ������ ������ Ÿ���� ������
		//�⺻��: ���� ������ ���� ���� ���ִ� ������Ÿ��.
		//     byte short int long float double char boolean 8���� ������ �ְ�
		//	      �⺻������ 0���� �ʱ�ȭ �ȴ�.
		
		//������: ���� �������� �� �������� ���� �ּҰ��� �������ְ� //�ڹ��� �޸𸮿��� 3���� ���� �� �޼ҵ� 3���� ����
		//		���� ������ �� �Ǵ� �޼ҵ�� �� ������ Ȯ���ؾ� � ��, � �޼ҵ尡 �ִ��� Ȯ�� ������ ������Ÿ��
		//		���������� Ŭ������(=��ü��), �迭��, �������̽��� 3������ �ְ�
		//		new�����ؼ� �ʱ�ȭ ���� ������ null�� �ʱ�ȭ�� �ȴ�.
		//		null�̶�, ���� �������� �ּҰ��� �ο��� �Ǿ� ������
		//		�� �������� �ƹ��� ������ ���� ���¸� null�̶�� �Ѵ�.
		//      null�� ���¿����� �ƹ��� �޼ҵ�, �ʵ� ������ �Ұ����ϴ�.
        //      ������ �ҷ��� �ϸ� NullPointerException�� �߻��ϰ� �ȴ�!!!!

	
	}
	
	
	static int selectBan(BufferedReader bufferedReader) throws NumberFormatException, IOException {
	      System.out.println("���� �������ּ���: ");
	      System.out.print("> ");
	      int ban = Integer.parseInt(bufferedReader.readLine());
	      while(ban < 1 || ban > SIZE) {
	         System.out.println("�߸��� �Է��Դϴ�.");
	         System.out.println("���� �������ּ���(1���� "+SIZE+"����)");
	         System.out.println("> ");
	         ban = Integer.parseInt(bufferedReader.readLine());
	
	      }
	      
	      return ban;
	}
	
	//�л��� ���ڸ� �Է¹޴� �޼ҵ�
	static int stSizenumber(BufferedReader bufferedReader) throws NumberFormatException, IOException {
		System.out.println("�л��� ���ڸ� �Է����ּ���: ");
		int stSize = Integer.parseInt(bufferedReader.readLine());
		while(stSize < 0) {
			System.out.println("�߸��Է��ϼ̽��ϴ�. 0���� ū ���� �Է����ּ���");
			System.out.println("�л��� ���ڸ� �Է��� �ּ���: ");
			stSize = Integer.parseInt(bufferedReader.readLine());
			
		}
		return stSize;
	}
}
