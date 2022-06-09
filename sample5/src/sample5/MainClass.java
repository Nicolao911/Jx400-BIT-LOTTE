package sample5;
//array 2022/06/03
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Array : 	배열, 같은 자료형의 묶음.  <- 변수들  <----> 다른 자료형의 묶음 class, c에선 structure -> DTO, VO
		 * 			목적 : 데이터 관리
		 * 
		 *  		자료형 변수명[] = new 자료형[배열의 총수];
		 * 
		 * 			정적, 		동적
		 * 			static, 	dynamic
		 * 
		 * 			동적할당 후 정적으로 사용한다. (array처음에 배열의 길이를 동적으로 할당하고 정적으로 사용 이미 만들어진 배열의 길이를 변경 불가)
		 * 			memory 영역
		 * 			stack 			heap 			static 				system(os)
		 * 			
		 * 			array			[5]
		 * 
		 * 
		 * 			int array[] = new int[5];
		 * 			-> 유동적이게 사용하자 List
		 * 
		 */
		
//		int Array[] = new int[5];
//		int []Array = new int[5];
		int[] Array = new int[5]; // 0 ~ 4
		
		System.out.println(Array); //I@ 18 2d ec db --> db --> d = 13 --> 8bit -->18 2d ec db 전체 32bit  --> 4byte
		System.out.println(Array[0]); // 번지, index
		System.out.println(Array.length);
		
		int Array1[] = {2, 3, 4, 5};
		
		for (int i = 0; i < Array1.length; i++) {
			System.out.println(Array1[i]);
		}
		
		//배열은 복사가 된다. 주소값을 복사한다.
		int Array2[] = Array1; // alias(별명) 자기 자신을 가리키는 포인터.
		/*
		 * for (int i = 0; i < Array2.length; i++) { System.out.println(Array2[i]); }
		 */		
		Array2[2] = 6;
		System.out.println("Array1[2] = " + Array1[2]); // 얕은 복사 복사된 녀석의 값을 바꾸면 원본의 데이터도 바뀐다.
		
		//swap -> sort할 때 기본
//		int a, b;
//		a = 1;
//		b = 2;
//		
//		int temp;
//		temp = a;
//		a = b;
//		b = temp;
		//두 배열의 값을 교체하세요
		int  number1[] = {1, 2, 3};
		int  number2[] = {7, 8, 9};
		
//		int temp = number1[0];
//		number1[0] = number2[0];
		//아래와 같이 반복문 돌리면 수많은 데이터 처리시 시간 너무 오래걸림 그때 배열 복사로 처리한다.
//		for (int i = 0; i < number2.length; i++) {
//			int tmep = number1[i];
//			number1[i] = number2[i];
//			number2[i] = tmep;
//		}

		//여기 다시
		int num1[] = number1;
		int num2[] = number2;
		
		int temp[];
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		// 100개이상 큰 데이터 몇만건 몇천건 속도차이는 배열 복사로 한다.
		for (int i = 0; i < num2.length; i++) {
			System.out.println(" num2[" + i + "] = " + num2[i]);
		}
		
		int numberArrayPosition[] = {1, 2, 3};// 기존에 있는 코드의 변수가 너무 길어서 내가 새로 담아서 쓰고 싶을때 하단처럼 
											// 배열을 복사한다.
		int numArrPos[] = numberArrayPosition;
		
		// 2차원 배열
//		int Arr2[][] = new int[3][4];
//		int []Arr2[] = new int[3][4];
//		int [][]Arr2 = new int[3][4];
//		int[][] Arr2 = new int[3][4];
		
		int Arr2[][] = {
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12}
		};
		/*
		 * pointer는 주소값을 넘겨음
		 *  int **Array2 = Arr2;
		 *  
		 *  *(*(Array2 + 1) + 2)
		 *  
		 */
		System.out.println(Arr2[1][2]);
		
		int ArrNum[][] = null; // define NULL (0) --> 메모리 주소를 모두 0으로 셋팅하겠다.
		
		ArrNum = new int[3][];
		
		int a1[] = { 1, 2, 3 };
		ArrNum[0] = a1;
		
		int a2[] = { 4, 5, 6, 7 };
		ArrNum[1] = a2;
		
		int a3[] = { 8, 9 } ;
		ArrNum[2] = a3;
		
		
		
		for (int i = 0; i < ArrNum.length; i++) {
			for (int j = 0; j < ArrNum[i].length; j++) {
				System.out.print(ArrNum[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
