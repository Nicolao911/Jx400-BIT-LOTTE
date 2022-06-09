package sample3;

public class MainClass {
	// operator
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		 + - */ %

		int num1, num2;
		num1 = 7;
		num2 = 2; // 나눈는 몫이 0이면 에러나니까 계산기 만들때 예외 처리 0 안되게 넣기

		int result = num1 % num2;

		System.out.println(num1 + " / " + num2 + " = " + result);

		// increment(++), decrement(--)

		num1 = 0;

		num1++;
		System.out.println("num1 = " + num1);
		++num1;
		System.out.println("num1 = " + num1);

		int a, b;
		a = 0;
		b = 0;

		b = (a++);//우선순위 주려고 ()해도 소용없다
		
		System.out.println("a = " + a); //1
		System.out.println("b = " + b); //0
		
		//논리연산자
		// && AND 
		// || OR
		// ! NOT
		
		int num = 5;
		
		System.out.println(num <= 5);
		
		System.out.println(num > 0 && num <= 5);
		
		System.out.println(num > 10 || num > 0);
		
		System.out.println(!(num > 0 && num < 10));
		
		System.out.println(!(num <= 0 || num >= 10));

		System.out.println( num != 9);
		
		// 삼항 연산자 ---> 발전되서 나온게 람다식
		// 값 = (조건) ? 값1 : 값2
		
		
		int n;
		n = (num > 0) ? 100 : 200;
		
		System.out.println("n = " + n);
		
		char c;
		c = (num < 0) ? 'Y' : 'N';
		System.out.println("c = " + c);
		
		
		
		//bit 연산 : 0, 1
		
		/*
		 *  &	AND
		 *  |	OR	
		 *  ^	XOR
		 *  <<	left shift
		 *  >>	right shift
		 *  ~	NOT
		 */
		
		
		
		
		
		
		
		//AND
		int number = 0x71 & 0x85; // 16진수를 우선 2진수로 바꾼다
		/*
		 *  7   	1
		 *  8421	8421
		 *  0111	0001
		 *  
		 *  
		 *  
		 *  8		5
		 *  8421	8421
		 *  1000	0101
		 *  
		 *  
		 *  
		 *  
		 *   0111	0001  	0 0 -> 0
		 *   1000	0101	0 1 -> 0
		 *   0000	0001	1 0 -> 0
		 *   				1 1 -> 1
		 */
		
		System.out.println("number = " +  number);
		System.out.printf("0x%x\n", number);
		
		
		
		//OR
		number = 0x71 | 0x85; // 16진수를 우선 2진수로 바꾼다
		/*
		 *  7   	1
		 *  8421	8421
		 *  0111	0001
		 *  
		 *  
		 *  
		 *  8		5
		 *  8421	8421
		 *  1000	0101
		 *  
		 *  
		 *  
		 *  
		 *   0111	0001  	0 0 -> 0
		 *   1000	0101	0 1 -> 1
		 *   1111	0001	1 0 -> 1
		 *   				1 1 -> 1
		 *   f		5
		 */
		System.out.println("number = " +  number);
		System.out.printf("0x%x\n", number);
		
		//OXR 실무에서 많이씀 두비트가 달라야 참 같으먼 거짓 보안에서 많이씀
		number = 0x71 ^ 0x85; 
		/*
		 *  7   	1
		 *  8421	8421
		 *  0111	0001
		 *  
		 *  
		 *  
		 *  8		5
		 *  8421	8421
		 *  1000	0101
		 *  
		 *  
		 *  
		 *  
		 *data  	0111	0001  	0 0 -> 0
		 *key   	1000	0101	0 1 -> 1
		 *   		1111	0100	1 0 -> 1
		 *   						1 1 -> 0
		 *암호화   	1111	0100
		 *   		1000	0101  key값으로 다시 xor연산하면 원본 data값이 나온다.
		 *복호화   	0111	0001
		 */
	
		System.out.println("number = " +  number);
		System.out.printf("0x%x\n", number);
		
		number = 0xf4 ^ 0x85; 
		System.out.println("number = " +  number);
		System.out.printf("0x%x\n", number);
		
		
		
		//left shift == *2 사용이유는 속도가 빠르다. 대용량 처리시 비트연산은 연산 속도가 빠르다
		byte by;
		by = 0x1 << 2; // 두칸 밀었으니까.. 00000001 에서  00000100
		System.out.println("by = " + by);
		
		//right shift == /2
		by = 0x4 >> 1;
		System.out.println("by = " + by);
		
		// ~ 반정 0 -> 1   1 -> 0
		by = ~0x55;
		/*  0101 0101
		 *  8421 8421
		 *  
		 *  1010 1010
		 *  A    A
		 */
		
		System.out.println("by = " + by);
		System.out.printf("0x%x\n", by);
		
		
	}

}
