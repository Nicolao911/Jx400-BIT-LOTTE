package sample4;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * wrapper class
		 * 
		 * 일반 자료형을 class화 한 것
		 * 
		 * 일반 자료형				wrapper class ---> 표시한 것 잘 기억
		 * boolean				Boolean
		 * byte					Byte
		 * short				Short
		 * int					Integer --->
		 * long					Long
		 * float				Float
		 * double				Double  --->
		 * char					Character
		 * char[]				String --->
		 * 
		 * 
		 */
		int i = 123;
		Integer in = 234;
		Integer cin = new Integer(345);
		
		System.out.println(cin);
		
		double d = 123.456;
		Double do1 = 1234.5678;
		System.out.println(do1);

		
		//Integer, Double
		//String

		// 문자열 -> 숫자
		String str = "1234";
		int num = Integer.parseInt(str);
		System.out.println("num = " + num);
		
		str = "234.567"; //문자가 섞이면 에러나니까 여기서 데이터 정제해서 pase를 사용해야된다.
		double dnum = Double.parseDouble(str);
		System.out.println("dnum = " + dnum);
		
		// 숫자 -> 문자열
//		int num1 = 234;
//		String srt1 = num1 + "";

		Integer num1 = 234;
		String str2 = num1.toString();
		System.out.println("str2 = " + str2);
		
		double do2 = 234.567;
		String str3 = do2 + ""; // wrapper class로 안싸도 된다.
		System.out.println("str3 = " + str3);
		
		
		
		// String
		// 문자열의 저장, 편집, 정보취득
		
//		String str5 = null;
		String str5 = ""; //두가지 초기화 빈공백,null
		
//		System.out.println("str5 = " + str5);
		
		str5 = "안녕하세요";
		
		String str6  = new String("반갑습니다.");
		
		String str7 = str5 + " " + str6;
		System.out.println(str7);
		
		str3 =	str5.concat(str6); //문자열 합치기
		System.out.println(str3);
		
		
		//equals(비교함수)
		String str8 = "world";
		String str9 = "worl";
		str9 = str9 + "d";
		System.out.println(str8 == str9);
		System.out.println(str8.equals(str9));
		
		// 문자 위치
		// indexOf, lastIndexOf
		str8 = "abcabcabc";
		int index = str8.indexOf("c");
		
		System.out.println("index = "+ index);
		
		index = str8.lastIndexOf("c");
		
		System.out.println("index = "+ index);
		
		// 문자열의 길이 구하기
		// String에선 함수 length()  --> array 에선 length 요소임.
		System.out.println(str8.length());
		
		//수정 replace
		str9 = "A*B*C*D";
		String replaceStr = str9.replace("*", "-");
		System.out.println(replaceStr);
		
		// 문자열 자르기
		// split => tokenNizer
		
		/*
		 *홍길동-24-2001/03/16-서울시  '-' token
		 *성춘향-16-2011/07/28-남원시
		 * 
		 * 
		 * 홍길동    --->이게 xml  ----> JSON
		 * 24
		 * 2001/03/16
		 * 서울시
		 * 
		 */
		
		String str10 = "홍길동-24-2001/03/16-서울시";
		
		String split[] = str10.split("-");
		
		System.out.println(split[0]);
		System.out.println(split[1]);
		System.out.println(split[2]);
		System.out.println(split[3]);
		
		//문자열을 자른다
		//범위를 기준으로 자른다 substring()
		
		String subStr = str10.substring(4);
		System.out.println(subStr);
		subStr = str10.substring(4, 6);
		System.out.println(subStr);
		
		//앞 뒤의 공백 문자 삭제
		//trim()
		String str11 = "     java      java    java              ";//중간 공백 없애고 싶으면 replace
		System.out.println(str11.trim());
		
		// index 숫자를 입력하면 문자를 리턴
		// charAt
		String str12 = "가나다라마바";
		char c = str12.charAt(2);
		System.out.println(c);
		
		// 문자열 탐색
		// contains
		String str13 = "서울시 마포구 서교동"; // 공백 들어가서 서 교동 하면 false나오므로 공백도 예외처리 해줘야됨
		boolean b = str13.contains("서교");
		System.out.println(b);
		
	}

}
