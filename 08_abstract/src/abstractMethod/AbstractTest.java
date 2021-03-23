package abstractMethod;

public abstract class AbstractTest { //POJO(Plain Old Java Object)
	protected String name;
	
	public abstract void setName(String name);	// 추상메소드를 가지고 있는 클래스는 반드시 추상클래스여야한다
	
	public String getName() {	// 구현
		return name;
	}

	


}
