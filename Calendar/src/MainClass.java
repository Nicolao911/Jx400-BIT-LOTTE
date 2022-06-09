import java.util.Calendar;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Calandar : 일정관리, 인사관리, 입사정보
		 * 
		 * Date -> JavaScript에도 있다.
		 * Calandar -> java == Spring framework
		 * 
		 * RESTful -> Spring Boot
		 * JavaScript -> Date
		 *
		 */
		
//		Calendar cal = new GregorianCalendar();
		Calendar cal = Calendar.getInstance();
		
		//오늘 날짜 취득
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1; // 0~11로 되있기때문에 +1 해준다
		int day = cal.get(Calendar.DATE);
		
		
		System.out.println(year + "/" + month + "/" + day);
		
		// 날짜 설정
		cal.set(Calendar.YEAR, 2022);
		cal.set(Calendar.MONTH, 8 - 1);
		cal.set(Calendar.DATE, 15);

		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH) + 1; // 0~11로 되있기때문에 +1 해준다
		day = cal.get(Calendar.DATE);
		System.out.println(year + "/" + month + "/" + day);
		
		String ampm = cal.get(Calendar.AM_PM) == 0 ? "오전" : "오후";
		System.out.println(ampm);
		
		//요일
		int weekday = cal.get(Calendar.DAY_OF_WEEK); //1(일) ~ 7(토)
		
			switch (weekday) {
			case 1: {
				System.out.println("일");
				break;
			}
			case 2: {
				System.out.println("월");
				break;
			}
			case 3: {
				System.out.println("화");
				break;
			}
			case 4: {
				System.out.println("수");
				break;
			}
			case 5: {
				System.out.println("목");
				break;
			}
			case 6: {
				System.out.println("금");
				break;
			}
			case 7: {
				System.out.println("토");
				break;
			}
		}
			
			//오늘 날짜 취득
			cal.set(Calendar.YEAR, 2022);
			cal.set(Calendar.MONTH, 6 - 1);
			cal.set(Calendar.DATE, 8);

			year = cal.get(Calendar.YEAR);
			month = cal.get(Calendar.MONTH) + 1; // 0~11로 되있기때문에 +1 해준다
			day = cal.get(Calendar.DATE);
			
			System.out.println(year + "/" + month + "/" + day);
			
			int lastday = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
			System.out.println(lastday);
			
			// 달력 출력
			/*	일	월	화	수	목	금   토
			 *  *   *   *   1   2   3   4 
			 *  5   6   7   8   9   10  11
			 *  12  13  14  15  16  17  18
 			 */
			
			// 첫줄에 일~ 토까지 찍기
			// 배열입니다
			String header[] = { "일", "월", "화", "수", "목", "금", "토" };
			
			//달력 배열
			String test[][] = new String[6][7];
 			
			// 일자 받아오는것
			//오늘이 몇월 몇일인지 가져오기 그 기준으로 그린다
			//오늘 날짜 취득
			year = cal.get(Calendar.YEAR);
			month = cal.get(Calendar.MONTH) + 1; // 0~11로 되있기때문에 +1 해준다
			day = cal.get(Calendar.DATE);
			
	}
}
