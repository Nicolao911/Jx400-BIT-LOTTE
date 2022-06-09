package work;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 편의점 프로그램
		 * 지불금액 : 3,210원
		 * 본인금액 : 10,000원
		 * 
		 * 거스름 돈 -> ?
		 * 
		 * 5000원 -> ?
		 * 1000원 -> ?
		 * 500원 -> ?
		 * 100원 -> ?
		 * 50원 -> ?
		 * 10원 -> ?
		 */
		
		
		
		int myMoney = 10000;
		int price = 3210;
		int changeMoney;
		changeMoney = myMoney - price;
		
		int m5000 = changeMoney / 5000; 
		//1000
		int m1000 = (changeMoney % 5000) / 1000;
		int m500 = (changeMoney % 1000) / 500;
		int m100 = (changeMoney % 500) / 100;
		int m50 = (changeMoney % 100) / 50;
		int m10 = (changeMoney % 50) / 10;
		// 나머지는 출력
		
		

		
		// Random : 무작위, 난수
		// Random  <--> Pattern
		
		// 0 ~ 9
		int r = (int)(Math.random() * 10);
		System.out.println("r = " + r);
		
		//10 20 30 40 50
		r = ((int)(Math.random() * 5) + 1) * 10; // 0 ~ 4까지 나오니까 + 1 가작 안쪽 숫자는 뽑을개수 (5개니까 5) 그다음 연산
		System.out.println("r = " + r);
		
		// -1 0 1
		int x = (int)(Math.random() * 3) -1; // -1 0 1 Math.random() * 3 --> 0 ~ 2
		int y = (int)(Math.random() * 3) -1; // -1 0 1
		
		// 3, 7, 4, 5, 6 
		int arr[] = {3, 7, 4, 5, 6}; // i를 랜덤하게 해서 빼주면 됨
		int i = (int) (Math.random() * 5);
		System.out.println(arr[i]);
		
		
		
		
		
		
		
		
		
	}

}
