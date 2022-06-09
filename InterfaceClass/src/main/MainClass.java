package main;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * abstract class : 일반 메소드 + 추상메소드 + 멤버변수 
		 * 
		 * interface : 추상메소드
		 * 			   포함하는 메소드가 선언만 되어있다.
		 * 			   다중 상속이 가능하다.
		 * 			   선언을 통해서 클래스의 내용파악이 빠르다.
		 * 		       부모 클래스의 instance형으로는 많이 사용
		 * 
		 * 
		 */
		
//		myInterface my = new myInterface();
		MyClass myCls = new MyClass();
		myCls.method(0);
		
		YouClass youCls = new YouClass();
		youCls.func("ㅎㅇ");
		youCls.method(0);
		
		myInterface my = new MyClass();
		my.method(0);
		
		myInterface my1 = new YouClass();
		my1.method(0);
		((youInterface)my1).func(null);//다중상속하면 그인스턴스에 맞는 형으로변환 해줘야함
		
//		youInterface you = new YouClass();
//		you.func(null);
//		you.m
		
	}

}
