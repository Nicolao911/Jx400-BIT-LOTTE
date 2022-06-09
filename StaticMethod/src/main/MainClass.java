package main;

import java.util.Calendar;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass cls = new  MyClass();
//		cls.method(); // 인스턴스 메소드
//		cls.staticMethod();// static method
		
//		MyClass.staticMethod(); // 요렇게 클래스명으로 바로 호출가능 이렇게한다. 어디서나 다 호출되게 만들수있다.
		MyClass myCls = MyClass.getObject();
		//Calendar cal = new Gre~ 이렇게 생성해서 각가해야되는데 staic method를 통해서 한번에 처리된거 받아 올 수 있다.
		Calendar cal = Calendar.getInstance();
	}

}
