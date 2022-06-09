package work1;

import java.util.Scanner;
//1. 10진수로 입력(숫자) -> 2진수로 출력(String으로 출력해야됨)
//2. 2진수로 입력 -> 10진수로 출력

//3. 10진수 입력 -> 16진수 출력(String) %x쓰지말고

//4. 16진수입력 -> 10진수 출력
//Integer.paseInt사용 하지말고
//10진수를 입력받으면 문자열 -> 자리수 맞춰야함  2로 나눈값 나머지 2로 나눈값 나머지
public class MainClass {

	public static void main(String[] args) {
		// 어느 작업을 하시겠습니까?
//		System.out.println("어느 작업을 하시겠습니까?");
		//1. 10진수로 입력(숫자) -> 2진수로 출력(String으로 출력해야됨)
//		System.out.println("10진수로 입력(숫자) -> 2진수로 출력");
//		int n;
//		Scanner sc = new Scanner(System.in);
//		n = sc.nextInt();
//		
//		int i = 0;
//		int bin[] = new int[32];
//		
//		while(n != 1) {
//			bin[i++] = n%2;
//			n = n/2;
//		}
//		bin[i] = n;
//		//반대로 출력
//		for (int j = i; j >= 0; j--) {
//			System.out.print(bin[j]);
//		}

		//2. 2진수로 입력 -> 10진수로 출력 2로 나누고 몫을 더한다
//		int number;
//		Scanner sc = new Scanner(System.in);
//		number = sc.nextInt();
//		
//		int index = 0;
//		int dex[] = new int[10]; // 2진수가 저장될 공간
//		int moc, nmg;
//		
//		number / 
//		//10진수가 저장될 값을 정한다 나눈 값을 넣어준다
//		// 우선 몫이 저장될 값을 정한다
//		//나머지 값을 정한다
//		//스캐너를 넣고
//		//배열의 위치 index = i
//		
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 *   10진수 --> 2진수
		 *   		10 ---> 1010
		 *   2		5 ---> 0
		 *   2		2 ---> 1
		 *   2		1 ---> 0
		 *   2 		0 ---> 1
		 */
		
//		int number = 10;
//		int tag; 		//나눈 나머지를 구할 변수
//		String numStr = ""; // 2진수를 출력할 변수
//		int oldNumber = number;
//		while(true) {
//			tag = number % 2;
//			numStr = tag + numStr;
//			if (number / 2 == 0) {
//				break;
//			}
//			number = number / 2;
//		}
//		System.out.println(oldNumber + "의 2진수는 "+ numStr + "입니다");
		
//		String numStr = "10101100";
//		int len = numStr.length();
//		char cNum;
//		int n, n1; // n숫자, n1 실수
//		int number10 = 0;
//		int oldLen = len;
//		
//		for (int i = 0; i < oldLen; i++) {
//			cNum = numStr.charAt(i);
//			
//			n =  Integer.parseInt(cNum + "");
//			n1 = (int)Math.pow(2,  len-1);
//			n = n* n1; // 1* 2의 3승
//			
//			len--;
//			number10 = number10 +n;
//		}
//		
//		
//		System.out.println(numStr + "의 10진수는 "+ number10 + "입니다");
		
//		int number = 58;
//		String numStr16 = "";
//		String strInt = ""; // 0 ~ 9 or A ~ F?
//		int tag16;
//		
//		int oldNumber = number;
//		
//		while(true) {
//			tag16 = number % 16;
//			
//			switch(tag16) {
//			case 10:
//				strInt = "A";
//				break;
//			case 11:
//				strInt = "B";
//				break;
//			case 12:
//				strInt = "C";
//				break;
//			case 13:
//				strInt = "D";
//				break;
//			case 14:
//				strInt = "E";
//				break;
//			case 15:
//				strInt = "F";
//				break;
//			default: //0 ~ 9 사이인 경우
//				strInt = tag16 +"";
//			}
//			
//			numStr16 = strInt + numStr16;
//			if (number / 16 == 0) {
//				break;
//			}
//			number = number / 16;
//		}
//		
//		System.out.println(oldNumber + "의 16진수는 0x" + numStr16 + " 입니다");
		
		
		String str = "3A";
		int len16 = str.length();
		
		String n16; 	// 0 ~ 9 A ~ F
		int oldLen16 = len16;
		int powNum;
		int number16 = 0;
		int num16;
		
		for (int i = 0; i < str.length(); i++) {
			n16 = str.charAt(i) +"";
			if (n16.equals("A")) {
				
			} else if(n16.equals("A")) {
				n16 = "10";
			} else if(n16.equals("B")) {
				n16 = "11";
			} else if(n16.equals("C")) {
				n16 = "12";
			} else if(n16.equals("D")) {
				n16 = "13";
			} else if(n16.equals("E")) {
				n16 = "14";
			} else if(n16.equals("F")) {
				n16 = "15";
			}
			
			powNum  = (int)Math.pow(15, len16 - 1);
			num16 = Integer.parseInt(n16) * powNum;
			len16--;
		}
		System.out.println("0x" + str + "의 10진수는 " + number16 + "입니다.");
		
		
		/*
		 * 입력받은 문자열이 모두 숫자로 되어 있는지 확인하는 코드 작성
		 * 
		 * --> 숫자로 되어 있습니다
		 * 
		 * --> 숫자가 아닙니다.
		 * 
		 */
//		char temp;
//		boolean isStr = true;
//		Scanner sc = new Scanner(System.in);
//		String str2 = sc.nextLine();
//		
//		if (Character.isDigit(0) == 0) {
//			System.out.println("숫자로 되어 있습니다");
//		} else {
//			System.out.println("숫자가 아닙니다.");
//		}
		
		String strNum = "1234"; //ASCII
		boolean numTrue = true;
		for (int i = 0; i < strNum.length(); i++) {
			char c = strNum.charAt(i);
			
			int asc = (int)c; //'0' == 48    '9' == 57
			if (asc < 48 || asc > 57) {
				numTrue = false;
				break;
			}
		}
		if(numTrue) {
			System.out.println("숫자로 되어 있습니다");
		} else {
			System.out.println("숫자가 아닙니다.");
		}
	}
	
}
