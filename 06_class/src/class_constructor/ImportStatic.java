package class_constructor;

//import static java.lang.Math.random; // static ���� �ش������ �־ static �� �� �ٿ��־�߸��Ѵ�
//import static java.lang.Math.pow;

import static java.lang.Math.*; //���ϵ� ī��, all �̷��� �ϸ� ������ �ΰ��� ����ؼ� �� �� �̴�.
import static java.lang.String.format;
import static java.lang.System.out; // �̰��ϸ� System ���� �� ������ �ȴ�

public class ImportStatic {

	public static void main(String[] args) {
		out.println("���� = " + random()); // random �տ� .Math ����
		out.println("������ = " + pow(2, 10));//pow �տ� .Math ����
		out.println("�Ҽ� ���� ��°�ڸ� = " + format("%.2f", 123.456)); // format �տ� String. ����

	}

} // ���ϱ������� �ر򸱼� �־ ����Բ��� ����õ ���� �ر򸱵�....
