package sample7;
//순환문
public class MainClass {
	public static void main(String[] args) {
		//for loop 반복문, 순환문
		//for
		//foreach
		
		int n;
		for (n = 0; n < 10; n++) {
			System.out.println(" n = " + n);
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println("i = " + i);
		}
		
		
		for (int i = 1; i <= 100; i++) {
			
		}
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(i + " : " + j + "  ");
			}
			System.out.println();
		}
		
		int Array[][] = {
				{ 1, 2, 3, 4 },
				{ 5, 6, 7, 8 },
				{ 9, 01, 11, 12 }
		};
		
		for (int i = 0; i < Array.length; i++) {
			for (int j = 0; j < Array[i].length; j++) {
				System.out.print("Array[" + i + "][" + j + "] = " + Array[i][j] + " ");
			}
			System.out.println("\n");
		}
		
		int Arr[] = { 1, 2, 3 };
		for (int num : Arr) {
			System.out.println(num);
		}
		
		//while
		/*
		 * for(초기화 ; 조건식 ; 연산식) {
		 * 
		 * }
		 * 
		 * 초기화
		 * while(조건식) {
		 * 처리식
		 * 연산식
		 * }
		 * 
		 * do {  //한번 처리는 무조건하고 조건식 태움 원하지 않을때도 돌아서 별로 안씀
		 * 처리 
		 * 연산
		 * } while(조건식)
		 * 
		 */
		
		
		int w;
		w = 0;
		while(w < 10) {
			System.out.println("while loop " + w);
			w++;
		}
		
		
		// initialize = 초기화
		
		// loop = 실제 처리
		while(true) {
			
			break;
		}
		// release = 해방
		int w1, w2;
		w1 = w2 = 0;
		
		
		while (w1 < 5) {
			System.out.println("w1 : " + w1);
			w2 = 0; // 초기화 안에서 해줘야된다.
			while (w2 < 3) {
				System.out.println("\tw2 : " + w2);
				w2++;
			}
			w1++;
		}
		
		int w3 = 5;
		
		do {// 무조건 한번은 실행
			System.out.println("w3 : "+ w3);
			w3++;
		} while (w3 < 5);
	}
}
