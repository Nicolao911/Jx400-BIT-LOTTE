package main;

import dao.BaseBallDAO;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 	Baseball team
			Human : 번호(할당), 이름, 나이, 키(height) --부모
			pitcher : 승, 패, 방어율 -- 상속
			batter : 타수, 안타수, 타율 -- 상속
			
			ArrayList로 만들기
			
			
			선수 관리(DAO)
			추가, 삭제, 검색(동명이인), 수정, 파일저장, 파일읽기 -> 파일 읽고 나서 다음 번호부터 다시 시작
			//추가 - 투수 추가, 타자 추가
			//삭제 - 전체목록에서 삭제
			//수정 - 전체목록에서 검색(동명이인) --> ArrayList에 담아서 뿌려주기
			//검색 - 전체목록에서 검색해서 해당 건 수정 --> 동명이인 수정?
			//파일저장 - 목록을 text파일로 저장
			//파일읽기 - 저장된 목록을 읽어오기
			File class
			
			-> read, write
		 */
		
		BaseBallDAO dao = new BaseBallDAO();
		dao.init();

	}

}
