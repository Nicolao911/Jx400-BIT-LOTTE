package main;

import cls.HeClass;
import cls.MyClass;
import cls.YouClass;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//singleton 사용 안할때 일반적으로 g/setter로 class간 데이터 전송
		MyClass myCls = new MyClass(123);
		
		YouClass youCls = new  YouClass();
		
		HeClass hc = new HeClass();
		
		/*
		 * int n = myCls.getNumber(); youCls.setTag(n); 
		 */
		myCls.method();
		youCls.func();
		System.out.println(youCls);
		
		hc.proc();
		System.out.println(hc);
	}
	

}
