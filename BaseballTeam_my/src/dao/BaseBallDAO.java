package dao;

import java.util.ArrayList;
import java.util.List;

import main.Menu;
import team.BatterDto;
import team.PitcherDto;

/*
 * 선수 명단 관리 DAO class
 */
public class BaseBallDAO {
	//추가, 삭제, 검색(동명이인), 수정, 파일저장, 파일읽기 -> 파일 읽고 나서 다음 번호부터 다시 시작
	
	//선수 목록
//	List<Object> playerList = new ArrayList<Object>();
	//투수 목록
	List<PitcherDto> pitcherList = new ArrayList<PitcherDto>();
	
	//타자 목록
	List<BatterDto> batterList = new ArrayList<BatterDto>();
	
	// 시작
	public void init() {
		Menu.showMenu();
	}
	//추가 - 투수 추가, 타자 추가
	public void insert() {
		//투수, 타자 추가 분기
		Menu.selectOption();
	}
	//투수 추가
	public void insertPitcher() {
		PitcherDto pitcher = Menu.insertPitcherInfo();
		pitcherList.add(pitcher);
	}
	//타자 추가
	public void insertBatter() {
		BatterDto batter = Menu.insertBatterInfo();
		batterList.add(batter);
	}
	//삭제 - 전체목록에서 삭제
	public void delete() {
		//검색할 이름 골라서 거기서 삭제 근데 이게 타자인지 투수인지 모르니까...
		String name = Menu.searchByName();
		if (name.equals("")) {
			return;
		}
		
		//투수 삭제
		for (int i = 0; i < pitcherList.size(); i++) {
			PitcherDto picther = pitcherList.get(i);
			if (name.equals(picther.getName())) {
				pitcherList.remove(i);
			}
		}
		//타자 삭제
		for (int i = 0; i < batterList.size(); i++) {
			BatterDto batter = batterList.get(i);
			if (name.equals(batter.getName())) {
				batterList.remove(i);
			}
		}
		
		System.out.println("해당 선수를 삭제 하였습니다.");
	}
	
	//검색 - 전체목록에서 검색(동명이인) --> ArrayList에 담아서 뿌려주기
	public void select() {
		String name = Menu.searchByName();
		boolean isExist = true;
		if (name.equals("")) {
			return;
		} 
		
		//투수 목록
		for (int i = 0; i < pitcherList.size(); i++) {
			PitcherDto picther = pitcherList.get(i);
			if (name.equals(picther.getName())) {
				System.out.println(picther);
			} else {
				isExist = false;
			}
		}
		//타자 목록
		for (int i = 0; i < batterList.size(); i++) {
			BatterDto batter = batterList.get(i);
			if (name.equals(batter.getName())) {
				System.out.println(batter);
			} else {
				isExist = false;
			}
		}
		System.out.println(isExist == true ? "검색 결과 출력 완료" : "해당하는 선수가 없습니다.\n");
	}
	
	//수정 - 전체목록에서 검색해서 해당 건 수정 --> 동명이인 수정?
	public void update() {
		String name = Menu.searchByName();
		if (name.equals("")) {
			return;
		}
		String rename = Menu.updateByName();
		
		boolean isExist = true;
		//투수 목록
		for (int i = 0; i < pitcherList.size(); i++) {
			PitcherDto picther = pitcherList.get(i);
			if (name.equals(picther.getName())) {
				picther.setName(rename);
				pitcherList.set(i, picther);
			} else {
				isExist = false;
			}
		}
		
		//타자 목록
		for (int i = 0; i < batterList.size(); i++) {
			BatterDto batter = batterList.get(i);
			if (name.equals(batter.getName())) {
				batter.setName(rename);
				batterList.set(i, batter);
			} else {
				isExist = false;
			}
		}
		System.out.println(isExist == true ? "수정 완료" : "해당하는 선수가 없습니다.\n");
	}
	
	//전체 목록 출력
	public void allList() {
		//여기 어떻게 처리하셨나 보기
		for (PitcherDto pitcher : pitcherList) {
			System.out.println(pitcher);
		}

		for (BatterDto batter : batterList) {
			System.out.println(batter);
		}
	}
	
	//파일저장 - 목록을 text파일로 저장
	public void saveListFile() {
		
	}
	
	//파일읽기 - 저장된 목록을 읽어오기
	public void loadListFile() {
		
	}
}
