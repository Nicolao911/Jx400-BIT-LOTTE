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
			
			
			1. java beans를 먼저
			2. dto를 만든다 이때 interface로 한뒤 상속받아 구연하여 사용
			3. 상속관계에 있는 java beans에선 생성자로 부모 클래스에 값을 채워줄수 있다. super(~~~~)
			4. 부모 클래스 형태로 선언한 뒤 자식 클래스의 인스턴스를 만들어 좌변에 담아쓸수있다.
			5. 부모형태로 리스트에 담아 자식 인스턴스로 인스턴스 생성이 가능하다.
			6. 파일 생성 후 로드를 생성자에서 처리리해준다.
			7. 검색에선 index를 -1 로 두고 반환된 값으로 처리한다.
			
			
		 */
		BaseBallDAO dao = new BaseBallDAO();
		dao.init();

	}

}
