package work2;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		/*
		 * 이중for문 쓰고 strike ball 변수 따로 받고 하나씩 증가시키고 카운트는 하나씩 뺀다 총 몇회 가능한지 써주기 count는
		 * 총가능한 횟수 // 이거로 블랙잭 만들기
		 */

		Scanner sc = new Scanner(System.in);

		// 1 2 3 4 5 6 7 8 9 10
		// 1 0 0 0 0 0 0 0 0  0
		// 스위치가 각각 와서 켜는 로직 로또 뽑는 로직.. 난수.. 셔플 뽑는 것.
		int r_num[] = new int[3];
		int u_num[] = new int[3];
		boolean clear = false;
		String nextGame = "";

		while (true) {
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
			
			// 판정 기회는 10번
			w = 0;
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
				System.out.println(strike + "스트라이크 " + ball + "볼 입니다.");
				w++;
			}
			// 메시지 출력
			
			if (clear) {
				System.out.println("Game clear");
			} else {
				System.out.println("Game over");
			}
			System.out.println("play again(y/n) = ");
			nextGame = sc.next();

			if (!nextGame.equals("y")) {
				System.out.println("Good Bye");
				break;
			}
			System.out.println("Next Game Start");
		}
	}

}
