package com.apple;

import com.zoo.Zoo;

public class Apple  {
	public static void main(String[] args) {
		System.out.println("빨간 사과");
		
		//Zoo 클래스의 tiger() 메소드 호츨
		Zoo zoo = new Zoo();
		zoo.tiger();
		//zoo.giraffe(); error 이유는 안써도 아니까
		//zoo.elephant(); error
		//zoo.lion(); error
		
		
	}

}
