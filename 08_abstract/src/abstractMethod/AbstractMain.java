package abstractMethod;

public class AbstractMain extends AbstractTest {
	
	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		//AbstractTest at = new AbstractTest();//����, �߻�Ŭ������ new�� �ȵȴ�
		
		AbstractTest at = new AbstractMain();
		at.setName("ȫ�浿");
		System.out.println(at.getName());
	}

	
	

}

//1.���
//2.�ݵ�� �ڽ�Ŭ���� �߻�޼ҵ带 Override
//3.Override �����ָ� class �տ� abstract �ٿ��� �����ڽ�Ŭ�������� �Ѱܹ����� �ȴ�