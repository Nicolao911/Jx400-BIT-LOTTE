package main;
/*
 * 메뉴 선택 class
 */

import java.util.Scanner;

import dao.BaseBallDAO;
import team.Batter;
import team.Pitcher;

public class Menu {
	
	/*
	 * 사용자가 선택할 수 있는 메뉴를 출력한다.
	 */
	static Scanner sc = new Scanner(System.in);
	static BaseBallDAO dao = new BaseBallDAO();
	static int count = 0;
	public static void showMenu() {
		while (true) {
			//추가, 삭제, 검색(동명이인), 수정, 파일저장, 파일읽기 -> 파일 읽고 나서 다음 번호부터 다시 시작
			System.out.println("메뉴를 선택하세요");
			System.out.println("------------------------");
			System.out.println("1. 선수 정보 입력");
			System.out.println("2. 선수 정보 삭제");
			System.out.println("3. 선수 정보 검색");
			System.out.println("4. 선수 정보 수정");
			System.out.println("5. 선수 목록 저장");
			System.out.println("6. 선수 목록 출력");
			System.out.println("7. 종료");
			
			int selNum = sc.nextInt();
			switch (selNum) {
			case 1: {
				dao.insert();
				break;
			}
			case 2: {
				dao.delete();
				break;
			}
			case 3: {
				dao.select();
				break;
			}
			case 4: {
				dao.update();
				break;
			}
			case 5: {
				
				break;
			}
			case 6: {
				dao.allList();
				break;
			}
			case 7: {
				System.exit(0);
				break;
			}
			}
		}

	}
	
	/*
	 * 선수 입력시 포시션 선택 옵션을 출력한다.
	 */
	public static void selectOption() {
		System.out.println("입력하실 선수 포지션을 선택하세요");
		System.out.println("------------------------");
		System.out.println("1. 투수 정보 입력");
		System.out.println("2. 타자 정보 입력");
		int selNum = sc.nextInt();
		
		if (selNum == 1) {
			dao.insertPitcher();
		} else if (selNum == 2) {
			dao.insertBatter();
		}
	}
	
	/*
	 * 투수 정보를 입력한다.
	 */
	public static Pitcher insertPitcherInfo() {
		
		Pitcher pitcher = new Pitcher();
		
		//선수 번호 자동 증가
		count++;
		pitcher.setNumber(count);
		
		System.out.println("추가하실 투수의 이름을 입력해주세요.");
		sc.nextLine();
		String name = sc.nextLine();
		pitcher.setName(name);
		
		System.out.println("추가하실 투수의 나이를 입력해주세요.");
		int age = sc.nextInt();
		pitcher.setAge(age);
		
		System.out.println("추가하실 투수의 키를 입력해주세요.");
		Double height = sc.nextDouble();
		pitcher.setHeight(height);
		
		System.out.println("추가하실 투수의 승리 횟수를 입력해주세요.");
		int win = sc.nextInt();
		pitcher.setWin(win);
		
		System.out.println("추가하실 투수의 패배 횟수를 입력해주세요.");
		int lose = sc.nextInt();
		pitcher.setWin(lose);
		
		System.out.println("추가하실 투수의 방어율을 입력해주세요.");
		Double ERA = sc.nextDouble();
		pitcher.setERA(ERA);
		
		
		System.out.println("투수 추가가 완료되었습니다.");
		return pitcher;
	}
	
	/*
	 * 타자 정보를 입력한다.
	 */
	public static Batter insertBatterInfo() {
		
		Batter batter = new Batter();
		
		//선수 번호 자동 증가
		count++;
		batter.setNumber(count);
		
		System.out.println("추가하실 타자의 이름을 입력해주세요.");
		sc.nextLine();
		String name = sc.nextLine();
		batter.setName(name);
		
		System.out.println("추가하실 타자의 나이를 입력해주세요.");
		int age = sc.nextInt();
		batter.setAge(age);
		
		System.out.println("추가하실 타자의 키를 입력해주세요.");
		Double height = sc.nextDouble();
		batter.setHeight(height);
		
		System.out.println("추가하실 타자의 타수를 입력해주세요.");
		int AB = sc.nextInt();
		batter.setAB(AB);;
		
		System.out.println("추가하실 타자의 안타수를 입력해주세요.");
		int safety = sc.nextInt();
		batter.setSafety(safety);
		
		System.out.println("추가하실 타자의 타율을 입력해주세요.");
		Double BA = sc.nextDouble();
		batter.setBA(BA);
		
		
		System.out.println("타자 추가가 완료되었습니다.");
		return batter;
	}
	
	/*
	 * 검색할 선수 이름을 입력받는다.
	 */
	public static String searchByName() {
		System.out.println("선수 이름을 입력해주세요.");
		sc.nextLine();
		String name = sc.nextLine();
		return name;
	}
	
	/*
	 * 수정할 선수 이름을 입력받는다.
	 */
	public static String updateByName() {
		System.out.println("수정할 선수 이름을 입력해주세요.");
		String name = sc.nextLine();
		return name;
	}
}
