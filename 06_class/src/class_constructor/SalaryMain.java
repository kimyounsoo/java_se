package class_constructor;

/*
�������� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�
��ü �迭�� �ۼ��Ͻÿ�
���۵帮�� x �ι��� ��� ��� x �߻� x
��ü�迭 ����
Ŭ������ : SalaryDTO
�ʵ�       : name, position, basePay, benefit, taxRate, tax, salary
		�̸�		����		�⺻��		����		����		����	   ����
������    : �����͸� �Է�
calc() - ���
getName
getposition

���� = (�⺻�� + ����) * ����;
���� = �⺻�� + ���� - ����;

������ 200���� ���� : 1%(0.01), 
     400���� ���� : 2%(0.02), 
     400���� �ʰ� : 3%(0.03)���� �����Ѵ�.

[������]
�̸�      ����      �⺻��      		����      	����      ����      ����
ȫ�浿   ����      5000000      200000
���缮   ����      3500000      150000
�ڸ��   ���      1800000      100000
 */

public class SalaryMain {
	public static void main(String[] args) {
	   //Ŭ���� ����
		SalaryDTO[] ar = new SalaryDTO[3];
		ar[0] = new SalaryDTO("ȫ�浿", "����", 5000000, 200000);
		ar[1] = new SalaryDTO("���缮", "����", 3500000, 150000);
		ar[2] = new SalaryDTO("�ڸ��", "���", 1800000, 100000);
	   // �޼ҵ� ȣ�� - ��� �޼ҵ�
		
	   //sout - main() �޼ҵ� ����Ͻÿ�
		System.out.println("�̸�\t����\t�⺻��\t����\t����\t����\t����");
//		for(int i=0; i<ar.length; i++) {
//			ar[i].calc();		
//		System.out.println(ar[i].getName()+"\t"
//							+ar[i].getPosition()+"\t"
//							+ar[i].getBasePay()+"\t"
//							+ar[i].getBenefit()+"\t"
//							+ar[i].getTaxRate()*100+"%"+"\t"
//							+ar[i].getTax()+"\t"
//							+ar[i].getSalary());
//		}
//		for(SalaryDTO dto : ar) {
//			dto.calc();
//				System.out.println(dto.getName()+"\t"
//							+dto.getPosition()+"\t"
//							+dto.getBasePay()+"\t"
//							+dto.getBenefit()+"\t"
//							+dto.getTaxRate()*100+"%"+"\t"
//							+dto.getTax()+"\t"
//							+dto.getSalary());
//			}
//		for(int i=0; i<ar.length; i++) {
//			ar[i].calc();
//			System.out.println(ar[i]);
		for(SalaryDTO dto : ar) {
			dto.calc();
			System.out.println(dto);


   }

}
}
