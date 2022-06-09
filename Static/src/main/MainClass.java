package main;

import cls.MyClass;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  static == 정적
		 * 
		 */

		MyClass cls = new MyClass();
		cls.method(0, null);
		cls.method(0, null);
		cls.method(0, null);
		
		MyClass myCls = new MyClass();
		myCls.method(0, null);
		MyClass.glNumber++;// class 변수 static변수 언어에 따라서 부르는게 조금 다름 같은ㄴ말
		// member 변수 -> instance 변수라고도 함
		
	}

}
