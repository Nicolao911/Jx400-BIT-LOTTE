package sample9;

import java.util.Arrays;
import java.util.Scanner;

//정렬 sort
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Sorting : 정렬
		 * 			선택, 버블, 합병, 퀵
		 * 
		 *  1. 몇개를 정렬하시겠습니까?
		 *  -> 몇개 입력받음
		 *  >> 5
		 *  
		 *  2. 갯수에 맞도록 배열을 할당
		 *  >> new int[5]
		 *  
		 *  3. 숫자들을 입력받는디.
		 *  >> 입력받은 개수만큼 반복돌아서 받기
		 *  
		 *  4. 오름 / 내림 입력
		 *  >> 오름 / 내림
		 *  5. 정렬처리
		 *  6. 결과 출력
		 * 
		 */
		
//		int number[] = { 4, 5, 6, 8, 2, 1, 7 };
//		
//		for (int i = 0; i < number.length -1; i++) {
//			for (int j = i + 1; j < number.length; j++) {
//				if (number[i] > number[j]) { // swap
//					int temp = number[i];
//					number[i] = number[j];
//					number[j] = temp;
//				}
//			}
//		}
//		
//		System.out.println(Arrays.toString(number)); // 배열출력

		
		//입력 받음
		Scanner sc = new  Scanner(System.in);
		
		System.out.println("몇개를 정렬 하시겠습니까?");
		int usrLength = sc.nextInt();
		String strNum[] = null; //검증용 입력받은게 숫자 잘들어왔나 확인하기위해
		
		//개수 할당
		int arr[] = new int[usrLength];
		
		//배열에 값 입력 개수만큼 반복
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println("숫자를 입력해 주세요."); //숫자 아니고 들어왔을때 validation을 해줘야됨
//			int input = sc.nextInt();
//			arr[i] = input;
//		}
		int w = 0; //특정조건만큼 반복 연산 다되면 w++로 증가해줘야됨
		while(w < usrLength) {
			System.out.println( (w + 1) +"번째 수 = ");
			String numStr = sc.next();
			//validation
			boolean isStr = true;
			for (int i = 0; i < numStr.length(); i++) {
				int asc = (int)numStr.charAt(i);
				
				if (asc < 48 || asc > 57) { //숫자가 아닐때
					isStr = false;
					break;
				}
			}
			
			if (!isStr) {
				System.out.println("숫자만 입력해주세요!");
				continue; //뒤에 스킵 다시 간다
			} 
			arr[w] = Integer.parseInt(numStr);
			w++;
		}
		
		
		// 오름 내림 입력
		System.out.println("1. 오름차순/ 2. 내림차순 선택하여 입력해주세요." );
		int type = sc.nextInt();
		
		//정렬
		for (int i = 0; i < arr.length -1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (type == 1) {
					if (arr[i] > arr[j]) { // swap
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				} else {
					if (arr[i] < arr[j]) { // swap
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
		
			}
		}
		
		//출력
		System.out.println(Arrays.toString(arr)); // 배열출력
	}

}
