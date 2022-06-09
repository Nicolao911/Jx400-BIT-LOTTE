package main;

import cls.ChildClass;

/*
 * 상속
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 은닉성(캡슐화), 상속성, 다형성
		 * 
		 * inheritance : 상속
		 * 
		 * (기본)Class ---> 상속 -->  class 
		 * 부모					   자식
		 * class의 구성요소 
		 * variable
		 * function 			
		 */
//		ChildClass cc = new ChildClass();
//		cc.PaentMethod();
//		cc.func();
//		cc.age = 26; protected 라서 외부 접근 불가
		
//		ChildClass cc = new ChildClass();
		ChildClass cc = new ChildClass("홍길동", 183.2, 22);
		
		cc.print();

	}

}
