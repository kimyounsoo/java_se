package nested;

public abstract class AbstractTest { //POJO �⺻�׵θ�
	//�߻� Ŭ������ �߻�޼ҵ尡 ���������ְ� �������� �ְ�
	//�߻� �޼ҵ尡 ������ �ݵ�� �߻� Ŭ�������� �Ѵ�
	String name;
	
	public abstract void setName(String name);  // �߻�޼ҵ�������̵�

	public String getName() { // ����
		return name;
	}
}
