package dao;
/*
 * 선수 명단 dao interface
 */
public interface BaseballDao {
	//추가
	public void insert();
	
	//삭제
	public void delete();
	
	//검색(동명이인) -> 이름 검색 검색된 목록 출력
	public int search(String name);
	
	//수정
	public void update();
	
	//조회(목록) -> 전체 목록 조회/ 단순 전체 목록
	public void list();
	
	//검색해서 목록 출력
	public void select();
	
	//선수 명단 파일 읽어오기
	public void dataLoad();
	
	//선수 명단 파일 저장
	public void dataSave();
	
	//타율 랭킹
	public void hitRanking();
}
