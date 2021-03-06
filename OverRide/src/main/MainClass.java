package main;

import overridecls.ChildOne;
import overridecls.ChildTwo;
import overridecls.SuperClass;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  OverRide : 부모 클래스로 부터 상속받은 메소드를 고쳐 기입 하는 것
		 *  
		 *  
		 */
		
//		ChildClass cc = new ChildClass();
//		cc.method();
		
//		ChildOne one = new ChildOne();
//		ChildTwo two = new  ChildTwo();
//		
//		one.method();
//		two.method();
		//배열 할당
		ChildOne arrOne[] = new ChildOne[5];
		ChildTwo arrtwo[] = new ChildTwo[5];
		arrOne[0] = new ChildOne();
		arrOne[1] = new ChildOne();
		arrtwo[0] =  new  ChildTwo(); //이렇게 되면 인스턴스 관리가 어려우니 superclass로 인스턴스 만들고 생성을 자식으로 하면편하다
		
//		for (int i = 0; i < arrtwo.length; i++) {
//			if (arrOne[i] != null) {
//				arrOne[i].method();
//				arrOne[i].ChildOneMethod();;
//			}
//		}
//		
//		for (int i = 0; i < arrtwo.length; i++) {
//			if (arrtwo[i] != null) {
//				arrtwo[i].method();
//			}
//		}
		
//		//10개씩 생성 배열 채움
//		for (int i = 0; i < arrtwo.length; i++) {
//			arrOne[i] = new ChildOne();
//			arrtwo[i] = new ChildTwo();
//		}
//		
//		arrOne[0].method();
//		arrOne[1].method();
//		arrOne[2].method();
//		arrOne[3].method();
//		arrOne[4].method();
		
//		SuperClass sc = new ChildOne(); // 인스턴스는 super로 잡고 생성은 child로 했는데 생성되는건 자식의 override된게 호출됨
//		sc.method();
		//1. 인스턴스 하나로 두개의 클래스 관리 가능 둘다 상속받았으니까 부모를 인스턴스로 잡고 생성을 자식으로해서 각각 돌려줄수있다.
		//2. 특정 자식의 메소트를 돌리려고 한다면 instanceof로 원하는 인스턴스의 구성을 확인하고
		//3 .형변환으로 바꿔준뒤 해당 클래스의 메소드를 호출한다.
		SuperClass  arrSuper[] = new SuperClass[5];
		//1
		arrSuper[0]	= new ChildOne();
		arrSuper[1]	= new ChildOne();
		arrSuper[2]	= new ChildTwo();
		arrSuper[3]	= new ChildTwo();
		arrSuper[4]	= new ChildTwo();
		
		for (int i = 0; i < arrSuper.length; i++) {
			arrSuper[i].method();
			if (arrSuper[i] instanceof ChildOne) {//2
			ChildOne co = (ChildOne)arrSuper[i];//3
			co.ChildOneMethod();
			}
		}
	}
	

}
