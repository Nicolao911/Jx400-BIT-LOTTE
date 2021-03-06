package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
//배열 걷어내고 list로 바꾸기 dto도 다 만들고
public class AddressBook {
	String human[][];
	int humanCount = 0; 
	Scanner sc = new Scanner(System.in);
	List<AddressBookDTO> objList = new ArrayList<AddressBookDTO>();
	public void init() {
//		load(fileName);
		human = load("addressBook");
		address();
	}
	
	public void address() {
		for (int i = 0; i < human.length; i++) {
			if (human[i][0] != null && !human[i][0].equals("")) {
				humanCount++;
			}
		}
		while (true) {
			System.out.println("<< menu >>");
			System.out.println("1. 추가");
			System.out.println("2. 삭제");
			System.out.println("3. 검색");
			System.out.println("4. 수정");
			System.out.println("5. 모두 출력");
			System.out.println("6. 저장");
			System.out.println("7. 종료");
	
			System.out.println("메뉴번호를 입력해주십시오 >> ");
			int number = sc.nextInt();
	
			switch (number) {
				case 1: {
					insert();
					break;
				}
				case 2: {
					delete();
					break;
				}
				case 3: {
					select();
					break;
				}
				case 4: {
					update(human);
					break;
				}
				case 5: {
					print();
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
	}
	public void insert() {
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
		objList.add(new AddressBookDTO("addressBook", name, age, phone, address, memo));
	}
	
	public void print() {
		for (AddressBookDTO book : objList) {
			System.out.println(book);
		}
	}
	
	
	public void delete() {
		System.out.println("삭제하고 싶은 이름 = ");
		String name = sc.next();
		
		int index = search(name);
		if (index == -1) {
			System.out.println("회원 정보를 찾을 수 없습니다.");
			return; //종료
		} 
		
		objList.remove(index);
		System.out.println("정보를 삭제 하였습니다.");
	}
	
	/*
	 * 삭제를 위한 검색
	 */
	public int search(String name) {
		int index = -1; // -1이 나오면 못찾았단뜻

		for (int i = 0; i < objList.size(); i++) {
			AddressBookDTO obj = objList.get(i);
			if (name.equals(obj.getName())) {
				index = i;
			}
		}
		return index;
	}

	/*
	 * 검색
	 */
	public void select() {
		System.out.println("검색하고 싶은 이름 = ");
		String name = sc.next();
		
		//검색 결과
		List<AddressBookDTO> resultList = new ArrayList<AddressBookDTO>();
		
		resultList = searchAll(resultList, name);
		
		if (resultList.size() == 0) {
			System.out.println("정보를 찾을 수 없습니다.");
			return;
		}
		
		for (AddressBookDTO addressBookDTO : resultList) {
			System.out.println(resultList);
		}
	}
	
	private List<AddressBookDTO> searchAll(List<AddressBookDTO> resultList, String name) {
		//찾았을때 데이터 담기
		int count = 0;
		// 카운트
		for (int i = 0; i < objList.size(); i++) {
			AddressBookDTO obj = objList.get(i);
			if (name.equals(obj.getName())) {
				resultList.add(obj);
				count++;
			}
		}
		
		//아무도 못찾았을때
		if (count == 0) {
			return null;
		}
		return resultList;
	}

	public void save(String[][] human, String fileName) {
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
	
	public void update(String[][] human) {
		System.out.println("수정하고 싶은 이름 = ");
		String name = sc.next();

//		int index = search(human, name);
		int index = search(name);
		if (index == -1) {
			System.out.println("정보를 찾을 수 없습니다.");
			return;
		}
		
		System.out.println("수정할 전화번호 = ");
		String phone = sc.next();
		
		human[index][2] = phone;
		System.out.println("정상적으로 수정하였습니다.");
	}
	
	public String[][] load(String fileName) {
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
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return human;
	}
}
