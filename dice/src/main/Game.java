package main;

import java.util.Scanner;

public class Game {
	Scanner sc = new Scanner(System.in);
	
	int coin = 20; // 초기금액
	int bet; //베팅
	int userNumber;// 사용자 입력값
	
	Dice diceOne = new Dice(); // composition(합성) 클래스 안에서 클레스 호출 하는 것
	Dice diceTwo = new Dice();
	//메소드는 단건 단건 할거만 딱딱 하게 하나에서 여러처리 하면 안좋다
	public void init() {
		diceOne.setNumber();
		diceTwo.setNumber();
		
		System.out.println("주사위1 : " + diceOne.getNumber());
		System.out.println("주사위2 : " + diceTwo.getNumber());
	}
	
	public void userInput() {
		//betting
		System.out.println("배팅금액 = ");
		bet = sc.nextInt();
		
		coin = coin - bet;
		
		// 주사위의 합
		System.out.println("두 주사위의 합 = ");
		userNumber = sc.nextInt();
		
	}
	
	public void finding() {
		int diceNum1 = diceOne.getNumber();
		int diceNum2 = diceTwo.getNumber();
		
		int diceSum = diceNum1 + diceNum2;
		
		if (userNumber == diceSum) {
			if (diceSum == 3 || diceSum == 11) {
				bet = bet * 18;
			} else if (diceSum == 4 || diceSum == 10) {
				bet = bet * 12;
			} else if (diceSum == 5 || diceSum == 9) {
				bet = bet * 9;
			} else if (diceSum == 6 || diceSum == 8) {
				bet = bet * 7;
			} else if (diceSum == 7) {
				bet = bet * 6;
			}
			System.out.println("빙고! 축하합니다.");
			coin = coin + bet;
		} else {
			System.out.println("아쉽습니다. 다시 도전하세요!");
		}
	}
	
	public void result() {
		System.out.println("주사위의 값 : " + diceOne.getNumber() + " , " + diceTwo.getNumber());
		System.out.println("합계 : " + (diceOne.getNumber() + diceTwo.getNumber()));
		System.out.println("현재 금액 : " + coin);
	}
	
	public void play() {
		while(true) {
			init();
			userInput();
			finding();
			result();
			
			System.out.println("play again(y /n)?");
			String again = sc.next();
			
			if (again.equalsIgnoreCase("n")) {
				System.out.println("안녕히 가십시오.");
				break;
			}
			System.out.println("다시 시작!");
		}
	}
}
