package sample10;

import java.util.Scanner;

//Function
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * function : 함수					C언어
		 * method : Class에 소속된 함수		Java
		 * 
		 * return값의 자료형 함수명(인수, 인자, parameter, 매개변수) {
		 * 		처리
		 * 
		 * 		return 돌려주는 값
		 * }
		 * 
		 * 
		 * func (123) ;
		 * 
		 * void func(int num) {
		 * }
		 * 
		 *  parameter : num --> 가인수(가상의 인수)
		 * 	argument : 123  --> 실인수(실제 인수)
		 */
		func();
		func(5);
		int n = 1;
		char c = 'A';
		int arr[] = { 1, 2, 3 };
		func(n, c, arr);
		System.out.println("n = " + n);
		System.out.println("arr[1] = " + arr[1]);
		String str = "Double";
		//입력 받음
//		boolaen b = isNumber("123");
		String s = isDouble("123.456");
//		System.out.println("key in");
//		Scanner sc = new  Scanner(System.in);
//		str = sc.next();
		
		// 문자열에 소문자가 포함되어 있는지? isSmall()v--> 포함 여부니까 대문자랑 섞여있어도 상관없음
		boolean b1 = isSmall("ABa12321a");
		
		if(b1) {
			System.out.println("isSmall");
		} else {
			System.out.println("not in");
		}
		// 두수를 나눈 몫과 나머지를 구하는 함수 ==> 1개의 함수만 사용해서 구현하기
		int num1, num2;
		int tag[] = new int[1];
		num1 = 9;
		num2 = 2;
		int result = cal(num1, num2, tag);
		System.out.println("moc = " + result + "nmg = " + tag[0]);
		
	}
	static boolean isSmall(String msg) {
		boolean b = true;
		for (int i = 0; i < msg.length(); i++) {
			int asc = (int)msg.charAt(i);
			
			if (asc >= 97 || asc <= 122) { //소문자 일때
				b = false;
				break;
			}
		}
		
		return b;
	}
	
	static int cal(int num1, int num2, int[] t) { //배열을 넘겼으니 돌아온다 왜냐면 주소값에 대한 할당이니까.. 위에 도 값을 돌려줄수있다. retrun처리 안해도 이미 할당
		int val;
		// 몫
		val = num1 / num2;
		//나머지
		t[0] = num1 % num2;
		return val;
	}
	
	
	static void func() {
		System.out.println("func() is called");
	}
	
	static void func(int i) {
		System.out.println("func(int i)  i = " + i);
	}
	//int i, char c 은 value에 의한 할당 --> 함수내에서 값이 변경되도 전역 변수에 지장없음, 배열이 넘어온  arr은 address에 의한 할당 --> 기존 변수가 영향받음
	static void func(int i, char c, int[] arr) {
		System.out.println("func(int i, char c, int[] arr)");
		System.out.println("i =" + i);
		i = 2;
		
		arr[1] = 22;// 주소가 넘어왔으므로 전역변수도 변경됨
	}
	
	//문자열을 입력 받았을 때 --> 모두 숫자로 되어있는지? (소수) 실수인지?
	// 					--> 정수 인지 소수인지? 함수 두개만들기 따로 따로
	// boolean is Number
	//함수 만들기 isDouble로 만들기 return은 String
	
//	static String isNumber(String isNumber) {
//			//validation
//			boolean isStr = true;
//			for (int i = 0; i < isNumber.length(); i++) {
//				int asc = (int)isNumber.charAt(i);
//				
//				if (asc < 48 || asc > 57) { //숫자가 아닐때
//					isStr = false;
//					break;
//				}
//			}
//			
//			if (!isStr) {
//				System.out.println("숫자만 입력해주세요!");
//				isNumber = "false";
//			} else {
//				isNumber = "true";
//				isDouble(Integer.parseInt(isNumber));
//			}
//		return  isNumber;
//	}
//	
//	static boolean isDouble(int number) {
//		boolean isDouble = true;
//		
//		
//		return isDouble;
//	}
	
	
	static boolean isNumber(String num) {
		//validation
		boolean b = true;
		for (int i = 0; i < num.length(); i++) {
			int asc = (int)num.charAt(i);
			
			if (asc < 48 || asc > 57) { //숫자가 아닐때
				b = false;
				break;
			}
		}
	return  b;
}

static String isDouble(String snum) { // dot가 있냐없냐만 가리면됨 ascii코드에서 78
	// .1234 3223.123.4412 두개 점 있거나 맨앞 맨뒤에 . 있는 경우 validation 해주기

	String msg = "정수";
	for (int i = 0; i < snum.length(); i++) {
		char c = snum.charAt(i);

		if (c == '.') {
			msg = "소수";
			break;
		}

	}
	return msg;
}
}