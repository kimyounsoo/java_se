package inheritance;

class AA{}

class BB extends AA{}

public class InsteanceOf {

	public static void main(String[] args) {
		AA aa = new AA();
		BB bb = new BB();
		AA aa2 = new BB();		
		
		AA aa3 = aa; 
		
		if(aa instanceof AA) // aa �� ����Ű�� �ּҰ��� Ŭ���� AA�� �ִ°�(aa �� AA�� ����ȯ(cating))
			System.out.println("1. TRUE");
		else 
			System.out.println("1. FALSE");
		
		AA aa44 = bb; //�θ� = �ڽ�
		if(bb instanceof AA) // bb �� ����Ű�� �ּҰ��� ���󰡸�  AA�� Ŭ���� Ÿ���� �ִ°�(aa �� AA�� ����ȯ(cating))
			System.out.println("1. TRUE");
		else 
			System.out.println("1. FALSE");
		
		BB bb2 = (BB)aa2; // �ڽ� = (�ڽ�)�θ�
		if(aa2 instanceof BB) // bb �� ����Ű�� �ּҰ��� ���󰡸�  AA�� Ŭ���� Ÿ���� �ִ°�(aa �� AA�� ����ȯ(cating))
			System.out.println("1. TRUE");
		else 
			System.out.println("1. FALSE");
		
		//BB bb3 = (BB)aa3; // error ������ �ȳ����� �����ϸ� ����
		if(aa3 instanceof BB) // bb �� ����Ű�� �ּҰ��� ���󰡸�  AA�� Ŭ���� Ÿ���� �ִ°�(aa �� AA�� ����ȯ(cating))
			System.out.println("1. TRUE");
		else 
			System.out.println("1. FALSE");
		
		      	

	}

}
//aa �� ����Ű�� ���� Ŭ���� AA�� �ִ���??
//aa �� AA ����ȯ(Casting)
