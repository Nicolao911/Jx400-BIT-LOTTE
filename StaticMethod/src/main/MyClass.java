package main;

public class MyClass {
	
	public void method() {
		System.out.println("MyClass method()");
	}
	
	public static void staticMethod() {
		System.out.println("MyClass staticMethod()");
	}
	
	public static MyClass getObject() {
		// 처리 많다 객체 생성부터 처리 다할것 여기서 한번에 할수있고 그담에 static이니까 다양한곳에서 불러서 생성가능
		MyClass my = new MyClass();
		//여기서 셋팅할것 다 한다
		
		my.method();
		//셋팅 처리 다한다.
		//처리1
		//처리2
		
		return my;
	}
}
