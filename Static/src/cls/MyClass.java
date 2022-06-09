package cls;

public class MyClass {
	// 변수의 종류
	private int number; 		// 맴버 변수  새로운 인스턴스 만들면 초기화된다.
	
	public static int glNumber; //static 변수, 전역변수(global) 메모리 영역을 같은것을 써서 인스턴스가 여려개되도 같이 값이 유지된다.
	//static 변수는 사용빈도가 적으나 static method는 많이쓴다.
	
	public void method(int num, int arr[]) { // 매개 변수 : 외부와 연결하는 변수. 외부에서 값을 받는 변수 // 참조변수(arr)는 값을 내보내줄수있다.
		
		int localNum = 0; // 지역변수 함수가 종료되면 메모리에서 삭제한다. 지역변수 쓰면 계속 비워줌
		localNum++;
		glNumber++;
//		MyClass.glNumber++;
		number++;
		
		System.out.println("local : " + localNum);
		System.out.println("glNumber : " + glNumber);
		System.out.println("member : " + number);
		
		
	}
}
