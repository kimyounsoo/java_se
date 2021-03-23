package com.zoo.safari;

import com.zoo.Zoo;

public class Safari extends Zoo{

	public static void main(String[] args) {
		Zoo zoo = new Zoo(); //부모클래스로 생성(초기화)했기때문에 부모는 자식이 누가있는지 모르기때문에 에러가난다
		zoo.tiger();
		//zoo.giraffe(); 
		//zoo.elephant(); 
		//zoo.lion(); 
		System.out.println();
		
		Safari safari = new Safari(); // 이렇게 자식클래스로 생성(초기화)해야  protected까지는 가능하다
		safari.tiger();
		safari.giraffe();
		//safari.elephant();	// 다른패키지라 에러
		//safari.lion();		// 프라이빗은 그냥 안됨
		
		//Zoo zoo = new Safari(); 이것도 tiger 제외 아무것도 안됨
	}

}
