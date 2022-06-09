package main;

import java.util.Arrays;
import java.util.Scanner;

public class Baseball {
	
	int r_num[] = null;
	boolean clear;
	
	Scanner sc = new Scanner(System.in);
	
	// init
	// 입력 random ->3개 뽑기
	public void init() {
		r_num = new int[3];
		clear = false;
		
		bRandom();
	}
	
	public void bRandom() {
		boolean swit[] = new boolean[10]; // 스위치 키고 끄고 키고 켜지면 거긴 값 안들어가게
		for (int i = 0; i < swit.length; i++) {
			swit[i] = false; // 00000 00000
		}

		int w = 0; // 몇개 뽑을건가
		while (w < 3) {
			int r = (int)(Math.random() * 10); // 0 ~ 9  
			if (swit[r] == false) {
				swit[r] = true; // 00010 00000
				r_num[w] = r + 1; // 1 ~ 10
				w++;
			}
		}

		System.out.println(Arrays.toString(r_num));
	}
	// loop -> 10회 반복
	public void loop() {
		// user input
		// finding
		int u_num[] = new int[3];
		int w = 0;
		// 판정
		while (w < 10) {
			// user input
			for (int i = 0; i < u_num.length; i++) {
				System.out.print((i + 1) + "번째 수 = ");
				u_num[i] = sc.nextInt();
			}
			System.out.println(Arrays.toString(u_num));
			int strike = 0;
			int ball = 0;
			
			//strike
			for (int i = 0; i < r_num.length; i++) {
				for (int j = 0; j < u_num.length; j++) { // u_num길이나 r_num 길이나 같음
					if (i == j && r_num[i] == u_num[j]) { // strike일때
						strike++;
					} else { // ball일때
						ball++;
					}
				}
			}

			if (strike == 3) { // 제어문에선 의도한 동작만큼만 명시적으로 
				clear = true;
				break;
			}
			
			// message
			System.out.println(strike + "스트라이크 " + ball + "볼 입니다.");
			w++;
		}
	}
	

	
	// release
	// result
	public void result() {
		if (clear) {
			System.out.println("Game clear");
		} else {
			System.out.println("Game over");
		}
	}
	
	public void game() {
		while (true) {
			init();
			loop();
			result();
			System.out.println("play again(y/n) = ");
			String nextGame = sc.next();

			if (!nextGame.equals("y")) {
				System.out.println("Good Bye");
				break;
			}
			System.out.println("Next Game Start");
		}

	}
}
