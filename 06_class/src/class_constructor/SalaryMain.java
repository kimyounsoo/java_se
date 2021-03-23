package class_constructor;

/*
직원들의 월급을 계산하는 프로그램을 작성하시오
객체 배열로 작성하시오
버퍼드리더 x 두문제 모두 상속 x 추상 x
객체배열 포문
클래스명 : SalaryDTO
필드       : name, position, basePay, benefit, taxRate, tax, salary
		이름		직급		기본급		수당		세율		세금	   월급
생성자    : 데이터를 입력
calc() - 계산
getName
getposition

세금 = (기본급 + 수당) * 세율;
월급 = 기본급 + 수당 - 세금;

세율은 200만원 이하 : 1%(0.01), 
     400만원 이하 : 2%(0.02), 
     400만원 초과 : 3%(0.03)으로 설정한다.

[실행결과]
이름      직급      기본급      		수당      	세율      세금      월급
홍길동   부장      5000000      200000
유재석   과장      3500000      150000
박명수   사원      1800000      100000
 */

public class SalaryMain {
	public static void main(String[] args) {
	   //클래스 생성
		SalaryDTO[] ar = new SalaryDTO[3];
		ar[0] = new SalaryDTO("홍길동", "부장", 5000000, 200000);
		ar[1] = new SalaryDTO("유재석", "과장", 3500000, 150000);
		ar[2] = new SalaryDTO("박명수", "사원", 1800000, 100000);
	   // 메소드 호출 - 계산 메소드
		
	   //sout - main() 메소드 출력하시오
		System.out.println("이름\t직급\t기본급\t수당\t세율\t세금\t월급");
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
