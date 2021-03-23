package day0911;
//20�е��� �����е��� ����ϴ� �κ��� 
//���ѷ����� ����ð�
//���� ����ڰ� ���� ���� �л��� ��ȣ�� �Է��� �� - 1�� �Է��ϸ� ���α׷��� ����
//Ȥ�� ����ڰ� �߸��� ��ȣ�� �Է��ϸ� �߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���~��� �Է��ϰ� ���α׷��� �����غ�����.
//����
//������� �л�: 3
//3�� �л��� ����: 218��
//������� �л�: 4
//4�� �л��� ����: 299��
//������� �л�: 99
//�߸��Է��ϼ̽��ϴ�.
//������� �л�: -1
//������ּż� �����մϴ�.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PracTice {
	final static int SIZE=5;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] nameArray = new String[SIZE];
		int[] sumArray = new int[SIZE];
		
		for(int i = 0; i < SIZE; i++) {
			
			System.out.print((1+i)+" �� �л��� �̸�: ");
			nameArray[i] = br.readLine();
			System.out.print((nameArray[i])+" �л��� ��������: ");
			int kor = Integer.parseInt(br.readLine());
			while(kor < 0 || kor > 100) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				System.out.print((nameArray[i])+" �л��� ��������: ");
				kor = Integer.parseInt(br.readLine());
			}
			
			System.out.print((nameArray[i])+" �л��� ��������: ");
			int eng = Integer.parseInt(br.readLine());
			while(eng < 0 || eng > 100 ) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�");
				System.out.print((nameArray[i])+" �л��� ��������: ");
				eng = Integer.parseInt(br.readLine());
			}
			
			System.out.print(nameArray[i]+" �л��� ��������: ");
			int math = Integer.parseInt(br.readLine());
			while(math < 0 || math > 100) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�");
				System.out.print(nameArray[i]+" �л��� ��������: ");
				math = Integer.parseInt(br.readLine());
				
			}
			
			sumArray[i] = kor+math+eng;
	
			
		}
		
		while(true) {
			System.out.println("���� ���� �л��� ��ȣ�� �Է��ϼ���(1~5, -1�� ����)");
			System.out.println("> ");
			
			int userChoice = Integer.parseInt(br.readLine());
			if(userChoice == -1) {
				System.out.println("����Ǿ����ϴ�.");
				break;
				
				
			}else if(userChoice >= 1 && userChoice <= 5) {
				int index = userChoice - 1;
				System.out.println(nameArray[index]+" �л��� ����: "+ sumArray[index]+" ��");
				
				
				
			}else {
				System.out.println("wrong number");
				
				
		}
				
			
		}
		
		
			
		}

	}


