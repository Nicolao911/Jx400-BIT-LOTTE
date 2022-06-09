//package addressBook;
//
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.PrintWriter;
//import java.util.HashSet;
//import java.util.Scanner;
//
//public class MainClass {
//
//	public static void main(String[] args) throws Exception {
//		// TODO Auto-generated method stub
//		
//		/*
//		 * 주소록 
//		 * 
//		 * 
//		 * column : 이름, 나이, 전화번호, 주소, 메모
//		 * 
//		 * 2차원 배열로 : row = 100
//		 * 
//		 * 데이터 파일 불러오기 --> 2차원 배열에 넣기 함수만쓰세요 
//		 * 
//		 * Menu 
//		 * 1. 추가 ---> 각각 함수로 정의
//		 * 2. 삭제
//		 * 3. 검색  이름, 전화번호, (동명이인도 검색되야겠지) 
//		 * 4. 수정
//		 * 5. 모든 데이터 출력
//		 * 6. 데이터  파일 저장
//		 * 7. 종료
//		 * 
//		 */
//		
//		int count = 0;
//		File file = new File("c:\\Temp\\newfile.txt");
//		
//		// 0	1		2		3						4
//		// 이름   나이  전화번호  		주소  				메모
//		// 김비트  20  010-1111-2222  서울시 강남구 테헤란로 	메모메모
//		// 김비트  20  010-1111-2222  서울시 강남구 테헤란로 	메모메모
//		//반복문 돌려서 칸 두개 넣기
//		StringBuffer sb = new StringBuffer();
//		while(true) {
//			//입력 받기 함수로 해야됨
//			Scanner sc = new Scanner(System.in);
//			
//			System.out.println("insert your name : ");
//			String name = sc.nextLine();
//			sb = appendText(name, sb);
//			
//			System.out.println("insert your age : ");
//			String age = sc.nextLine();
//			sb = appendText(age, sb);
//			
//			System.out.println("insert your phone_number : ");
//			String phone_number = sc.nextLine();
//			sb = appendText(phone_number, sb);
//			
//			System.out.println("insert your address : ");
//			String address = sc.nextLine();
//			sb = appendText(address, sb);
////			sc.nextLine();
//			
//			System.out.println("insert your ect : ");
//			String ect = sc.nextLine();
//			sb = appendText(ect, sb);
//			System.out.println(sb);
//			//2차원 배열 
//			//김비트/20/010-1111-2222/서울시 강남구 테헤란로/메모메모
//			String arrStr[] = sb.toString().split("/");
//			 for (int i = 0; i < arrStr.length; i++) {
//					System.out.println(arrStr[i]);
//				}
//				
//				String arr[][] = new String [100][arrStr.length];
//				for (int i = 0; i < arr.length; i++) {
//					for (int j = 0; j < arrStr.length; j++) {
//						arr[i][j] = arrStr[j];
//					}
//				}
//			 
//		}
//		
//		
//		
//		
//	
//		
//		
//		//파일 저장
//		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));
//		pw.println(sb);
//		pw.close();
//
//	}
//	// 입력값을 한줄로 만들기
//	static StringBuffer appendText(String str, StringBuffer sb) {
//		sb.append(str);
//		sb.append("/");
//		
//		return sb;
//	}
//	
//	// 삭제
//	
//	// 검색  이름, 전화번호 
//	
//	// 수정
//	
//	// 모든 데이터 출력
//	// 문장으로 읽기
////	BufferedReader br = new BufferedReader(new FileReader(file));
////	String str = "";
////
////	while ((str = br.readLine()) != null) {
////		System.out.println(str);
////	}
////	br.close();
//	// 데이터  파일 저장
//	
//
//}
