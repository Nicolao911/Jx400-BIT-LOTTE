package main;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  final : 예약어. const(상수)화 시켜준다. c에서는 difine
		 *  	   변수(상수로바꿔줌), 메소드(오버라이딩못하게함. 재정의 하지말고 그대로 받아쓰라고 강제할때), 클래스(상속못하게함) 에 적용할 수 있다.
		 * 
		 */
		final int number = 10; //변수 -> 상수(고칠수없다) 로 변한다
		final int NUMBERCOUNT = 100; // 이렇게 대문자로 쓰고 일반 변수에 대입용으로만 사용한다.
		
		int num = NUMBERCOUNT;
		
		
	}

}
//클래스에 final 붙이면 상속 불가
/* final */ class SuperClass {
	
	// override 금지
	public /* final */ void method() {
		
	}
}

class ChildClass extends SuperClass {
	
	@Override
	public void method() {// override
		
	}
}