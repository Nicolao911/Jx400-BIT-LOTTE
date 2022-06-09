package work4;

public class MainClass {

	public static void main(String[] args) {
		// 다음 암호표로 문자열을 암호화하고 다시 복호화한 결과를 출력하라.
		
		// 암호표
		// 알파벳
		char[] abcCode ={ 
				'`','~','!','@','#', '$','%','^','&','*',
				'(',')','-','_','+', '=','|','[',']','{',
				'}',';',':',',','.', '/'
		};
		// 숫자		
		char[] numCode = {'q','w','e','r','t', 'y','u','i','o','p'};
		
		String src = "abc123";  
		String result = "";		// = `~!wer --> 이값으로 들어가게 만드는 함수

		// 암호화 코드
		//incode()
		result = incode(src, abcCode, numCode);
		System.out.println("result::::::" + result);
		
		// 복호화
		String baseCode = "";
		// 복호화 코드
		baseCode =  deCode(result, abcCode, numCode);
		System.out.println("baseCode::::::" + baseCode);

	}
	static String incode(String str, char[] abcCode, char[] numCode) {
		int index;
		int val;
		String inco = "";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
//			int asc = (int)num.charAt(i); 첨부터 int로 해도됨
			//알파벳일때 로직
//			if (c >= 65 || c <= 90 || c >= 97 || c <= 122) {
//			if (c < 48 || c > 57) {
			if (c >= 97 && c <= 122) {
				System.out.println("c:::" + c);
				// 10진수 16 진수로 변환
				index = Character.getNumericValue(c);
				val = index % 10;
				// 해당 인덱스의 값을 result의 값으로 변경해준다
				inco += abcCode[val];
			} else if (c >= 48 && c <= 57) {
				//숫자일때 로직
				index = Character.getNumericValue(c);
				inco += numCode[index];
			}
		}
		return inco;
	}
	
	
	static String deCode(String str, char[] abcCode, char[] numCode) {
		String deco = "";
		// 알파벳 --> 숫자   index = index + 48 0 --> 48(0)
		//basecode = basecode + (char)index
		
		// 문자특문 --> 문자 index = index + 97
		//basecode = basecode + (char)index
		return deco;
	}
}
