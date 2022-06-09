import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
	// 정렬할 숫자 변수  두군데 이상 필요로 하는것은 멤버 변수로 이렇게 가지고 간다
	int number[] = null;
	boolean updown;
	Scanner sc = new  Scanner(System.in);
	//처리
	//1. 초기화
	public void init() {
		updown = true;
		input();
	}
	//2. 입력
	public void input() {
		// 	총 갯수
		//	숫자들
		//	오름/내림
	
		int usrLength;
//	 	총 갯수
		System.out.println("총 개수");
		usrLength = sc.nextInt();
		
		
		int w = 0; //특정조건만큼 반복 연산 다되면 w++로 증가해줘야됨
		while(w < usrLength) {
			System.out.println( (w + 1) +"번째 수 = ");
			String numStr = sc.next();
			//validation
			boolean isStr = checkMethod(numStr);
			
			if (!isStr) {
				System.out.println("숫자만 입력해주세요!");
				continue; //뒤에 스킵 다시 간다
			} 
			number[w] = Integer.parseInt(numStr);
			w++;
		}
		
		
		// 오름 내림 입력
		System.out.println("1. 오름차순/ 2. 내림차순 선택하여 입력해주세요." );
		int type = sc.nextInt();
	}

	
	
	//3. 정렬
	public void sorting() {
		// 오름 내림 입력
		System.out.println("1. 오름차순/ 2. 내림차순 선택하여 입력해주세요." );
		int type = sc.nextInt();
		//정렬
		for (int i = 0; i < number.length -1; i++) {
			for (int j = i + 1; j < number.length; j++) {
				if (type == 1) {
					if (number[i] > number[j]) { // swap
						int temp = number[i];
						number[i] = number[j];
						number[j] = temp;	
					}
				} else {
					if (number[i] < number[j]) { // swap
						int temp = number[i];
						number[i] = number[j];
						number[i] = temp;
					}
				}
		
			}
		}
	}
	//4. 결과 출력
	public void result() {
		if(updown) {
			System.out.println("오름차순 정렬");
		} else {
			System.out.println("내림차순 성렬");
		}
		System.out.println(Arrays.toString(number));
	}
	
	public boolean checkMethod(String str) {
		boolean isStr = true;
		for (int i = 0; i < str.length(); i++) {
			int asc = (int)str.charAt(i);
			if (asc < 48 || asc > 57) { //숫자가 아닐때
				isStr = false;
				break;
			}
		}
		return isStr;
	}
	
	public void swap(int i , int j) {
		int temp = number[i];
		number[i] = number[j];
		number[j] = temp;	
	}
	
}