package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dto.BatterDto;
import dto.HumanDto;
import dto.PitcherDto;
import file.DataProc;

/*
 * 선수 명단 dao 구현체
 */
public class BaseballDaoImpl implements BaseballDao {
	
	Scanner sc = new Scanner(System.in);

	List<HumanDto> teamList = new ArrayList<HumanDto>();

	// number는 자동 셋팅되도록 여러 곳에서 사용해야하므로 member변수로
	int memberNum;
	DataProc dp;
	// 생성자 만들어서 파일 객체구현

	public BaseballDaoImpl() {
		// 파일 생셩
		dp = new DataProc("Lions");
		dp.createFile();

		// 파일 읽기
		dataLoad();

		// memeberNum sequence 연산 알고리즘(겹치치 않게)
		// list의 마지막 인덱스num을 구한다음에
		// number 속성을 뽑아낸다 -> 그담에 첫번째 요소를 뽑고 '-'토큰 기준으로 잘라준다
		// 제일 첫번째가 memberNum이니까 해당 수를 interval을 두고 설정한다(투수와 포수 사이에 1000정도 사이를 벌린다)
		// list.size() -1
		if (teamList.size() > 0) {
			int lastIndexNum = teamList.get((teamList.size() - 1)).getNumber();
			memberNum = 1001 + (lastIndexNum % 1000);
		} else {
			memberNum = 1001;
		}
	}

	@Override
	public void insert() {
		// TODO insert()
		// 투수인지 타자인지 고르게 하기
		System.out.println("입력하실 선수 포지션을 선택하세요 : 1.투수 / 2. 타자");
		int pos = sc.nextInt();
		// 부모 클래스 입력정보(공통)

		// 이름
		System.out.println("선수명을 입력해주세요 : ");
		String name = sc.nextLine();

		// 나이
		System.out.println("선수의 나이를 입력해주세요 : ");
		int age = sc.nextInt();

		// 키
		System.out.println("선수의 키를 입력해주세요 : ");
		Double height = sc.nextDouble();

		// 조건문
		if (pos == 1) {// 투수일때 입력정보
			// 승리 횟수
			System.out.println("승리 횟수를 입력해주세요 : ");
			int win = sc.nextInt();

			// 패배 횟수
			System.out.println("패배 횟수를 입력해주세요 : ");
			int lose = sc.nextInt();

			// 방어율
			System.out.println("방어율을 입력해주세요 : ");
			Double ERA = sc.nextDouble();
		} else {// 타자일떄 입력정보
			// 타수
			System.out.println("타율을 입력해주세요 : ");
			int AB = sc.nextInt();

			// 안타수
			int safety = sc.nextInt();
			System.out.println("안타수를 입력해주세요 : ");

			// 타율
			Double BA = sc.nextDouble();
			System.out.println("타율을 입력해주세요 : ");
		}

		// 입력종료 안내
		System.out.println("입력이 완료 되었습니다!");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		//삭제할 데이터를 검색
		search(null);
		//삭제수행

	}

	@Override
	public int search(String name) {
		// TODO Auto-generated method stub

//		return index;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

	@Override
	public void list() {
		// TODO Auto-generated method stub
		//전체 목록출력

	}

	@Override
	public void select() {
		// TODO Auto-generated method stub
		//검색해서 목룍 출력

	}

	@Override
	public void dataLoad() {
		String data[] = dp.readFile();
		String split[];
		int pos;
		// 1차원 배열 출력
		for (int i = 0; i < data.length; i++) {
			// 김영한-22-33-44-55 ect..
			// 데이터 정제 -> 값을 불러와서 투수와 포수로 나눔(각각 1000번대 2000번대 memberNum을 가짐)
			// -> list에 담아줌
			split = data[i].split("-");

			pos = Integer.parseInt(split[0]);// 첫번째값이 memberNum임

			// 분류
			HumanDto human = null;
			if (pos < 2000) {// 투수
				human = new PitcherDto(Integer.parseInt(split[0]), 
											split[1], 
											Integer.parseInt(split[2]),
											Double.parseDouble(split[3]), 
											Integer.parseInt(split[4]), 
											Integer.parseInt(split[5]),
											Double.parseDouble(split[6]));
			} else { //포수
				human = new BatterDto(Integer.parseInt(split[0]), 
										   split[1], 
										   Integer.parseInt(split[2]),
										   Double.parseDouble(split[3]), 
										   Integer.parseInt(split[4]), 
										   Integer.parseInt(split[5]),
										   Double.parseDouble(split[6]));
			}
			
			teamList.add(human);
		}
	}

	@Override
	public void dataSave() {
		// TODO Auto-generated method stub
		//writeFile
	}

	@Override
	public void hitRanking() {
		// TODO Auto-generated method stub

	}
}
