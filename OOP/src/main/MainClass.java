package main;

import cls.Human;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 절차지향 순서중시
		 * 1 -> 2 -> 3 -> 
		 * 
		 * 코드가 5만라인을 초과하는 순간 작성자가 힘들어진다
		 * oop --> C++이 더 먼저다
		 * speed가 최고의 장점
		 * 
		 * String human[][] = {
		 * 	{name, age, address }, -> item -> pointer
		 * 	{name, age, address },
		 * 	{name, age, address }
		 * };
 		 * 
		 */
		Human h = new Human();
		//h : instance, object, 객체 (class변수)
		h.name = "홍길동";
		h.age = 22;
		h.address = "서울시";
		
		h.method();
		
		System.out.println(h.name);
		
	}

}
