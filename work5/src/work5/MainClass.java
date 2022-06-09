package work5;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		String oper;
		num1 = input(sc);
//		System.out.println("num1::::" + num1);
		num2 = input(sc);
//		System.out.println("num2::::" + num2);
		oper = oper(sc);
		// 함수로 만드세요
		// 입력받는 수는 함수 하나로
		
		
		// 함수 -> 숫자가 입력이 안됬을 땐 다시 입력하라고 return 입력값 다 조사하기
		// 첫번째 수 입력
		
		// 연산자 입력 --> 연산자가 제대로 입력되야함 --> 연산자 아닌경우 validation
		
		// 두번째 수 입력 -> 숫자가 입력이 안됬을 땐 다시 입력하라고 return 입력값 다 조사하기
		
		// 연산 처리 
//		int result = cal(num1, num2, oper);
		// 결과 출력
//		System.out.println("result:::::" + result); resultPrint(int n1, int n2, int result , String oper)
		
		
	}
	
	static int input(Scanner sc) {
		System.out.println("insert number!!! 숫자 넣어주세요");
		String str = "";
		int val = 0;
		// 숫자 입력받기
		int w = 0;
		while (w < 1) {
			str = sc.next();
			if (str.trim().equals("") == true) {
				System.out.println("please insert number");
				continue;
			}
			boolean check = true; // 강사님 만든 기능으로 해도
			for (int j = 0; j < str.length(); j++) {
				int asc = (int)str.charAt(j);
				if (asc > 48 || asc > 57) { //문자일때 // 빈문자도 체크해
					System.out.println("please insert number");
					break;
				} else {
					val = Integer.parseInt(str);
					w++;
				}
			}
		}
		return val;
	}
	
	static String oper(Scanner sc) {
		System.out.println("insert oper!!!");
		String str = "";
		str = sc.next();
		for (int j = 0; j < str.length(); j++) {
			int asc = (int)str.charAt(j);
			if (asc == 37 || asc >= 42 && asc <= 43) { // 연산자 일때 37 % 42 * 43 + 45 - 47 / oper.equal("*") || 이런식으로 4개 다 걸기
				System.out.println("please insert number");
				break;
			} else {
			}
		}
		return str;
	}
	
	static boolean isNum(String str) {
		
		boolean check = true;
		for (int j = 0; j < str.length(); j++) {
			int asc = (int) str.charAt(j);
			if (asc > 48 || asc > 57) { // 문자일때 // 빈문자도 체크해
				System.out.println("please insert number");
				check = false;
				break;
			}
		}
		return check;
	}
	
	
	static int cal(int num1, int num2, String oper) {
		int result = 0;
		switch(oper) {
		case  "+" : 
			result = num1 + num2;
			break;
		case  "-" : 
			result = num1 - num2;
			break;
		case  "*" : 
			result = num1 * num2;
			break;
		case  "/" : 
			result = num1 / num2;
			break;
		}
		return result;
	}
}
