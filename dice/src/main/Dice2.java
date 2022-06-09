package main;

import java.util.Scanner;

public class Dice2 {
	//주사위 인스턴스 생성
	//랜덤하게 1 ~ 6까지 돌려주는 함수
	int r_num = 0;
	Scanner sc = new Scanner(System.in);
	int coin = 20;
	int batting = 0;
    int total = 0;
    int sum = 0;
	public void init() {
		r_num = randomNumber();
	}
	
	public int randomNumber() {
		boolean swit[] = new boolean[6]; // 스위치 키고 끄고 키고 켜지면 거긴 값 안들어가게
		for (int i = 0; i < swit.length; i++) {
			swit[i] = false; // 00000 00000
		}

			int r = (int)(Math.random() * 6); //
			if (swit[r] == false) {
				swit[r] = true; //
				r_num = r + 1; // 1 ~6
			}
		
		return r_num;
	}
	
	//배팅할 코인 입력
	public void insertCoin() {
		System.out.println("배팅할 코인을 입력해 주세요");
		batting = sc.nextInt();
		total = coin - batting;
	}
	//두 주사위의 합을 입력
	public void sum() {
		System.out.println("두 주사위의 합을 입력해주세요");
		sum = sc.nextInt();
	}
	
	public void print() {
		System.out.println();
	}
	//결과 출력 맞았다 아니다
}
