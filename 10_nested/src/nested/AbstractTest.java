package nested;

public abstract class AbstractTest { //POJO 기본테두리
	//추상 클래스면 추상메소드가 있을수도있고 없을수도 있고
	//추상 메소드가 있으면 반드시 추상 클래스여야 한다
	String name;
	
	public abstract void setName(String name);  // 추상메소드오버라이드

	public String getName() { // 구현
		return name;
	}
}
