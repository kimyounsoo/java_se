package nested;

public class AbstractMain {

	public static void main(String[] args) {
		//AbstractTest at = new AbstractTest(); �߻� Ŭ������ new �Ҽ� ����. �ذ�å�� �ڽ�Ŭ����(�ݵ�� Override) or �޼ҵ�
		//at.setName("ȫ�浿");
		//System.out.println("�̸� = "+ at.getName());
		
		AbstractTest at = new AbstractTest() {//�͸� Inner,�������̽��� new �Ѱ� �ƴ϶� �߰�ȣ,�͸�(����)�� new �Ѱ��̴�
			public void setName(String name) {//����
				this.name = name;
			}
		};
		
		InterA in = new InterA() { //�������̽��� new �Ѱ� �ƴ϶� �߰�ȣ,�͸�(����)�� new �Ѱ��̴�
			public void aa() {}
			public void bb() {}
		};
		
		AbstractExam ae = new AbstractExam() {
			//public void cc() {} // �������̵带 �ص��ǰ� ���ص��ǰ�
			  public void dd() {} // ���� ���ϴ� �޼ҵ常 �������̵�
		};
	}

}
