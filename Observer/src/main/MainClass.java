package main;

import cls.MyClass;
import observer.ObserverA;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Observer : 정찰 or 감시(이느낌)
		 * 
		 */

		MyClass cls = new MyClass();
		cls.addObserver(new ObserverA());
		cls.setPassword("abc1111");
		
		cls.notifyObservers(cls.getPassword());
	}

}
