package nested;

public abstract class AbstractExam {
	public void cc() {}//�߻�޼ҵ� x
	public void dd() {}
	
}
//�߻�޼ҵ尡 ���� �߻� Ŭ����
//�߻�Ŭ������ new AbstractExam(); �� �� ����.
// �߻�Ŭ�������� �޼ҵ�� ��body�� �Ѵ�.
// �߻� Ŭ���� �̱� ������ ������(�ڽ�, �͸�Inner) override �ؼ� ����ϱ⶧����
// ������ ���������ʿ䰡 ����
// �����ڰ� �޼ҵ带 �����ؼ� ���ϴ� �޼ҵ常 Override
// �߻�޼ҵ��� Ư¡ public abstract void dd(); - {} �̰��� ���°�