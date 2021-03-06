package main;

import cls.AbstractClass;
import cls.MyClass;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Abstract class : 추상 클래스
		 * 				   추상 메소드를 하나이상 포함하고 있는 클래스
		 * 					abstract method  : 처리 내용은 없고 선언만 되어있는 것 
		 * 									 prototype 만 선언
		 * 									int method(char c) 이렇게 선언만 되있는것 매겨변수(char c)랑 리턴값(int)은 이게 무엇인가만 설정된 것 
		 * 
		 */

		
//		AbstractClass ac = new AbstractClass(); 안됨.. 상속받고해야됨
		MyClass myCls = new MyClass();
		myCls.abstractMethod();
		myCls.func();
		
		AbstractClass ac = new MyClass();
		ac.abstractMethod();
		((MyClass)ac).func();// 강제 형변환하면 사용가능 casting은 heap영역의 pointer를 옮기는 것
		
		AbstractClass ac1 = new AbstractClass() {

			@Override
			public void abstractMethod() {
				// TODO Auto-generated method stub
				System.out.println("ac1 abstractMethod()");
			}
			
		};
		
		
		ac1.abstractMethod();
	}

}
