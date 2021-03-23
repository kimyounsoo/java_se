package abstractMethod;
/*
�⵵ �Է� : 2002
�� �Է� : 10   

        1   2   3    4    5
6   7   8   9   10   11   12
13  14  15  16  17   18   19
20  21  22  23  24   25   26
27  28  29  30  31

�⺻������ - �⵵, �� �Է�
calculator() - �Ŵ� 1���� ���� ���Ϸ� ����?, �Ŵ� ������ ��?
display() - ���
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class CalendarMain {
	private int year, month, week, lastDay;

							// ������ ����ó�� �׷��� �̰� �ʿ䰡���� �Է°� ����� ����ó�� (�ѹ� ������ �θ�)
	public CalendarMain() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�⵵ �Է� : ");
		year = Integer.parseInt(br.readLine());
		System.out.print("�� �Է� : ");
		month = Integer.parseInt(br.readLine());
	}

	public void calculator() {
		Calendar cal = Calendar.getInstance(); // Ŭ���� ���� �߻�Ŭ���� �̱⶧���� new ����

		// ���� - 2020 9 29(���ó�¥)
		// cal.set(Calendar.YEAR, year); // set �� get �ǹݴ� Calendar.YEAR �� year�� �ٲ۴ٴ� �ǹ�
		// cal.set(cal.MONTH, month-1); // Calendar �� �ص������� calculator �޼ҵ忡�� cal ��ü��
		// �����߱⶧���� �̷��� �ص��ȴ�
		// cal.set(cal.DAY_OF_MONTH, 1);

		cal.set(year, month - 1, 1); // ���� 3���� ��� ���� �̰� -1 �׻� �޸� �Ű澲�� // 2002�� 10�� 1��
		week = cal.get(cal.DAY_OF_WEEK); // 2002�� 10�� 1���� ���� ���Ϸ� ��������
		lastDay = cal.getActualMaximum(cal.DAY_OF_MONTH);// �Ŵ� ������ �� 28 29 30 31 �˾Ƽ� �������ִ� �޼ҵ�
	}

	public void display() {
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		
		for(int i=1; i<week; i++) {
			System.out.print("\t");
		}//for
		
		for (int i=1; i <=lastDay; i++) {
			System.out.print(i + "\t");
			
			if(week%7==0) System.out.println();
			week++;
		}//for
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		CalendarMain cm = new CalendarMain();
		cm.calculator();
		cm.display();

	}

}
