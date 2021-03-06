package main;

import cls.MyClass;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 절차 지향 : 변수 선언, 함수 선언 -> 연산
  		 *			순서 지향 1 2 3 4 
		 * 			유지보수에선 좋지 않음, 재사용성 좋지 않음
		 * 			속도에선 우수함, c언어
		 * 
		 * 객체지향 : Class(object 설계도)
		 *			유지보스에 우수하다, 재사용성 우수
		 *			가독성 --> 기능이 조금 길어지면 빼는 연습하자
		 *			기능단위로 쪼개서, java언어, MFㅊ ---> 발전되서  C#
		 *					 
		 * 
		 */
		
		//초기화
		int array[] = { 1, 2, 3 };// 배열은 되나 class는 생성자로만 초기화
		
//		MyClass myCls = {1, "홍길동" , 182}; c에선 되지만 java에선 생성자 이어야 초기화된다.
		
		/*
		 * constructor : 생성자 != initialize 다릅니다. 생성자는 호출 불가. initialize는 계속 호출가능
		 * 			    class 생성시에 자동으로 호출되는 함수.
		 * 				클래스명과 같은 함수
		 * 				return값이 없다.
		 * 				over load가 가능하다
		 * 				같은 이름의 함수로써 매개변수로 구분
		 *				생략이 가능하다 
		 * 
		 * destructor : C++엔 아직 있고 자바에선 없어짐 소멸자 over load불가능
		 * 
		 * 
		 * 메모리 영역
		 * stack  heap  static  sys
		 * cls	  new(인스턴스) 
		 */
		
		
//		MyClass cls  = new MyClass();
		MyClass cls  = new MyClass(1,"홍길동");
		System.out.println(cls.toString());
		System.out.println(cls);
		System.out.println(cls.getThis());
	}

}
