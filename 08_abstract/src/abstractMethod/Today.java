package abstractMethod;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Today {

	public static void main(String[] args) throws ParseException {
		Date date = new Date();
		System.out.println("���ó�¥ : " + date);

		SimpleDateFormat sdf = new SimpleDateFormat("y��  MM�� dd�� E���� HH:mm:ss");// �ð��� �ҹ��� h���ϸ� 04�÷� ���´�
		System.out.println("���ó�¥ : " + sdf.format(date));
		System.out.println();

		//�Է� - �� ���� yyyyMMddHHmmss
		//��) 19980904222222
		SimpleDateFormat input = new SimpleDateFormat("yyyyMMddHHmmss");
		Date birth = input.parse("19980904222222"); //String -> Date ������ ��ȯ
		
		System.out.println("�������� = "+birth);
		System.out.println("�������� = "+sdf.format(birth));
		System.out.println();
		
		//Calendar cal = new Calendar(); - error // �߻�Ŭ���� abstract �� new �Ҽ� ����
		//Calendar�� �����ϸ� �ý����� ���� �ð��� ���´�
		//Calendar cal = new GregorianCalendar(); // Sub class���̿��Ͽ� ����
		Calendar cal = Calendar.getInstance(); // �޼ҵ� �̿��Ͽ� ����, �̺�Ʈ�� ���ȳ��� new ���ϰ� ��¥�� ���
					 //�̰� �ٷ� new ��� Ŭ������ �����ϴ� �۾��̴�
		
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;// 1�� => 0, 2��=> 1 �޸� �̷���
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int week = cal.get(Calendar.DAY_OF_WEEK); // �Ͽ��� => 1
		
		String dayOfWeek = null;
		switch(week) {
		case 1 : dayOfWeek = "�Ͽ���"; break;
		case 2 : dayOfWeek = "������"; break;
		case 3 : dayOfWeek = "ȭ����"; break;
		case 4 : dayOfWeek = "������"; break;
		case 5 : dayOfWeek = "�����"; break;
		case 6 : dayOfWeek = "�ݿ���"; break;
		case 7 : dayOfWeek = "�����"; break;
		
		}
		System.out.println("���ó�¥ : "+year+"�� "+month+"�� "+day+"�� "+dayOfWeek);
		
	}

}
