package addressBook;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class MainClass2 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws Exception {
		/*
		 * 주소록 column : 이름, 나이, 전화번호, 주소, 메모
		 * 
		 * 2차원 배열로 : row = 100 --> list & class
		 * 
		 * 데이터 파일 불러오기 --> 2차원 배열에 넣기 함수만쓰세요
		 * 
		 * Menu 1. 추가 ---> 각각 함수로 정의 
		 * 2. 삭제 
		 * 3. 검색 이름, 전화번호, (동명이인도 검색되야겠지) 
		 * 4. 수정 
		 * 5. 모든 데이터 출력 
		 * 6. 데이터 파일 저장 
		 * 7. 종료
		 */
		//TODO : main
		
		//배열 선언은 뒤쪽이 보편적
//		String human[][] = new String[100][5];
		//테스트 할 떄 가데이터 넣고하면 귀찮은 테스트 생략가능
//		String human[][] = {
//				{"홍길동" , "23", "123456", "서울시", "친구"},
//				{"성춘향" , "16", "222522", "남원시", "동생"},
//				{"홍두께" , "22", "333456", "서울시", "동문"},
//				{"홍길동" , "27", "567888", "판교", "상사"}
//		};
		
		String human[][] = load("addressBook");
		int humanCount = 0; 
		
		for (int i = 0; i < human.length; i++) {
			if (human[i][0] != null && !human[i][0].equals("")) {
				humanCount++;
			}
		}
		while(true) {
			System.out.println("<< menu >>");
			System.out.println("1. 추가");
			System.out.println("2. 삭제");
			System.out.println("3. 검색");
			System.out.println("4. 수정");
			System.out.println("5. 모두 출력");
			System.out.println("6. 저장");
			System.out.println("7. 종료");
			
			System.out.println("메뉴번호흘 입력해주십시오 >> ");
			int number = sc.nextInt();
			
			switch (number) {
			case 1: {
				insert(human, humanCount);
				break;
			}
			case 2: {
				delete(human);
				break;
			}
			case 3: {
				select(human);
				break;
			}
			case 4: {
				update(human);
				break;
			}
			case 5: {
				print(human);
				break;
			}
			case 6: {
				save(human, "addressBook");
				break;
			}
			case 7: {
				System.exit(0);
				break;
			}
		}
		}		
		
//		insert(human, humanCount);
		
//		print(human);//변수명 별로 안좋음.
//		delete(human);
		
//		print(human);
//		select(human);
//		save(human, "addressBook");

	}
	//매개변수에선 배열을기호를 앞쪽에 쓰는게 직관적
	// CRUD
	// DAO --> CRUD하는 class
	static int insert(String[][] human, int humanCount) {
		System.out.println("이름 = ");
		String name = sc.next();
		
		System.out.println("나이 = ");
		int age = sc.nextInt();
		
		System.out.println("전화번호 = ");
		String phone = sc.next();
		
		System.out.println("주소 = ");
		String address = sc.next();
		
		System.out.println("메모 = ");
		String memo = sc.next();
		
		human[humanCount][0] = name;
		human[humanCount][1] = age + ""; // String으로 형변환
		human[humanCount][2] = phone;
		human[humanCount][3] = address;
		human[humanCount][4] = memo;
		humanCount++;
		
		return humanCount;
	}

	static void delete(String[][] human) {
		System.out.println("삭제하고 싶은 이름 = ");
		String name = sc.next();
		
		int index = search(human, name);
		if (index == -1) {
			System.out.println("회원 정보를 찾을 수 없습니다.");
			return; //없으면 튀어나감
		} 
		human[index][0] = "";
		human[index][1] = "";
		human[index][2] = "";
		human[index][3] = "";
		human[index][4] = "";
			
		System.out.println("정보를 삭제 하였습니다.");
			
	}

	static void select(String[][] human) {
		System.out.println("검색하고 싶은 이름 = ");
		String name = sc.next();
		
		String findMember[][] = searchAll(human, name);
		
		if (findMember == null) {
			System.out.println("정보를 찾을 수 없습니다.");
			return;
		}
		
		for (int i = 0; i < findMember.length; i++) {
			System.out.println(Arrays.toString(findMember[i]));
		}
	}

	static void update(String[][] human) {
		System.out.println("수정하고 싶은 이름 = ");
		String name = sc.next();

		int index = search(human, name);
		if (index == -1) {
			System.out.println("정보를 찾을 수 없습니다.");
			return;
		}
		
		System.out.println("수정할 전화번호 = ");
		String phone = sc.next();
		
		human[index][2] = phone;
		System.out.println("정상적으로 수정하였습니다.");
		
	}
	
	static int search(String[][] human, String name) {
		int index = -1; // -1이 나오면 못찾았단뜻

		for (int i = 0; i < human.length; i++) {
			if (human[i][0].equals(name)) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	static String[][] searchAll(String[][] human, String name) {
		//찾았을때 데이터 담기
		int count = 0;
		// 카운트
		for (int i = 0; i < human.length; i++) {
			if (human[i][0] != null && human[i][0].equals(name)) {
				count++;
			}
		}
		
		//아무도 못찾았을때
		if (count == 0) {
			return null;
		}
		// 할당
		String findMember[][] = new String[count][5];
		int cou = 0;
		
		// 데이터 저장	
		for (int i = 0; i < human.length; i++) {
			if (human[i][0] != null && human[i][0].equals(name)) {
				findMember[cou] = human[i];
				cou++;
			}
		}
		
		return findMember;
	}
	
	static void print(String[][] human) {
//		for (int i = 0; i < human.length; i++) {
//		for (int j = 0; j < human[i].length; j++) {
//			if (human[i][j].equals("") && human[i][j] != null) {
//				System.out.print(human[i][j] + " ");
//			}
//			
//		}
//		System.out.println();
//	}
		for (int i = 0; i < human.length; i++) {
			if (human[i][0] != null && !human[i][0].equals("")) {
				System.out.println(Arrays.toString(human[i]));
			}
		}
	}
	
	static void save(String[][] human , String fileName) {
		//TODO : save(String[][], String)
		
		int count = 0;
		// 카운트
		for (int i = 0; i < human.length; i++) {
			if (human[i][0] != null && !human[i][0].equals("")) {
				count++;
			}
		}
		
		// 할당
		String findMember[] = new String[count];
		int cou = 0;
		
		// 데이터 저장	
		for (int i = 0; i < human.length; i++) {
			if (human[i][0] != null && !human[i][0].equals("")) {
				findMember[cou] = human[i][0] + "-" + human[i][1] + "-" + human[i][2] + "-" + human[i][3] + "-"
						+ human[i][4]; //홍길동-23-123-456-서울시-친구
				cou++;
			}
		}
		//데이터하나도 없을때 처리는 해야됨
		
		
		
		File file = new File("c:\\Temp\\" + fileName + ".txt");
		
		try {
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));
			for (int i = 0; i < findMember.length; i++) {
				pw.println(findMember[i]);
			}
			
			pw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	static String[][] load(String fileName) throws IOException {
		File file = new File("c:\\Temp\\" + fileName + ".txt");
		String human[][] = new String[100][5];
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			String str = "";
			int count = 0;
			while((str = br.readLine()) != null) {
				String data[] = str.split("-");
				human[count][0] = data[0];
				human[count][1] = data[1];
				human[count][2] = data[2];
				human[count][3] = data[3];
				human[count][4] = data[4];
				
				count++;
			}
			br.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return human;
	}
}

