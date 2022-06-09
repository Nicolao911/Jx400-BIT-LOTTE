package sample2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
//input
public class MainClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// input (console)

		Scanner sc = new Scanner(System.in);

		// boolean
		/*
		 * boolean b; System.out.println("b = "); b = sc.nextBoolean();
		 * System.out.println("input b = " + b);
		 */

		// integer
		/*
		 * int num; System.out.println("num = "); num = sc.nextInt();
		 * System.out.println("input num = " + num);
		 */

		// double
		/*
		 * double d; System.out.println("d = "); d = sc.nextDouble();
		 * System.out.println("input d = " + d);
		 */

		// String

		/*
		 * String str; System.out.println("str = "); str = sc.next();
		 * System.out.println("input str = " + str);
		 */

		// file , network에서 씀 소켓통신에서씀 스페이스바 먹이기 가능

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("str = "); 
		 String str = br.readLine(); 
		System.out.println("input str = " + str);

	}

}
