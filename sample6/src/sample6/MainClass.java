package sample6;
//제어문
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 제어문
		 *  
		 * if ( 조건 ) {  == true / false
		 * 	처리
		 * }
		 * 
		 * 
		 * > <= == >= <= !=
		 * && || !
		 */
		
		int number = 5;
		
		if (number > 0) {
			System.out.println("number > 0");
		}
		//단독처리는 괄호 안해도 ;찾아서 멈춤
		if (number > 0) 
			System.out.println("number > 0");
		
		if (number > 0 && number < 10) {
			System.out.println("number > 0 && number < 10");
		}
		
		if (number < 0 || number > 10) {
			System.out.println("number < 0 || number > 10");
		}
		
		//else
		
		if (number < 0) {
			System.out.println("number < 0");
		} else {
			System.out.println("number > 0");
		}

		String str = (number < 0) ? "number < 0" :"number > 0";
		System.out.println("str = " + str);
		
		number = 90;
		
		if (number > 90) {
			System.out.println("number > 90");
		} else if (number > 80) {
			System.out.println("number > 80");
		} else if(number > 70) {
			System.out.println("number > 70");
		} else {
			System.out.println("number <= 70");
		}
		
		number = 95; 	// 95 < => A+
						// 95 > => A
		if (number >= 90 && number <= 100) {
			if (number >= 95) {
				System.out.println(" A+ 입니다");
			} else {
				System.out.println(" A 입니다");
			}
		}
		
		boolean b = false;
		if (b == false) {
			System.out.println(" b == false");
		}
		if (!b) {
			System.out.println(" b == false");
		}
		
		if (b) {
			System.out.println(" b == true");
		}
		
		String _str = "hello";
		
		if (!_str.equals("world")) {
			System.out.println("_str은 hello가 아닙니다.");
		}
		
		if(_str.contains("he")) {
			System.out.println("_str은 he에 문자를 포함 하고 있습니다.");
		}
		
		
		//switch --> 대신 처리속도가 조건문보다 빠르지
		/*
		 * 조건문과 비슷하다.
		 * 다만 값이 명확해야한다.
		 * 범위를 지정할 수 없다.
		 * 실수를 사용할 수 없다.
		 */
		
		int n = 2;
		switch (n) {
		case 1:   // if (n == 1)
			//처리
			System.out.println("n은 1입니다.");
			break;
		case 2: 
			System.out.println("n은 2입니다.");
			break;
		default:
			throw new IllegalArgumentException("n은 1도 2도 아닙니다");
		}
		
		
		String str1 = "hello";
		switch(str1) {
		case "hello" : 
			System.out.println("str1은 hello입니다.");
			break;
		}
		
		/* 실수 사용안됨
		 * double d = 1.2; switch(d) { case 1.2 : break; }
		 */
		
		
//		switch (n) { 범위 지정 안됨
//		case n > 1:   // if (n == 1)
//			//처리
//			break;
//		}
		
	}
}
