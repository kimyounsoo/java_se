package nested;

public abstract class AbstractExam {
	public void cc() {}//추상메소드 x
	public void dd() {}
	
}
//추상메소드가 없는 추상 클래스
//추상클래스는 new AbstractExam(); 할 수 없다.
// 추상클래스안의 메소드는 빈body로 한다.
// 추상 클래스 이기 때문에 누군가(자식, 익명Inner) override 해서 써야하기때문에
// 내용을 갖고있을필요가 없다
// 개발자가 메소드를 선택해서 원하는 메소드만 Override
// 추상메소드의 특징 public abstract void dd(); - {} 이것이 없는것