package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Collection : 수집
		 * 
		 * List : 
		 * 	ArrayList, vector
		 * 		배열처럼 사용할 수 있는 컬렉션
		 * 		선형구조  o-o-o-o-o-o-o-o-o
		 * 		검색 속도가 빠르다
		 * 		index로 접근한다.
		 * 
		 * 	LinkedList -> fps 게임 탄환 리로드
		 * 		검색속도는 arrayList보다 조금 떨어지지만
		 * 		빈번한 노드의 추가 삭제의 속도는 빠르다
		 *  
		 *  
		 * Map : 
		 * 
		 */
		
//		ArrayList<Integer> list = new ArrayList<Integer>();
		List<Integer> list =new ArrayList<Integer>();
		
		// 추가
		Integer in = new Integer(111);
		list.add(in);
		
		list.add(222);
		
		list.add(new Integer(333));
		
		int len = list.size();
		System.out.println("목록의 크기 : " + len);
//		for (int i = 0; i < len; i++) {
//			System.out.println(list.get(i));
//		}
		
		//원하는 위치에 추가하기
		list.set(1, 200);
//		list.add(1, 201);
		
		for (Integer integer : list) {
			System.out.println(integer);
		}
		//삭제
//		list.remove(2);
//		for (Integer integer : list) {
//			System.out.println(integer);
//		}
		//검색
		int index = list.indexOf(333);
		System.out.println(index);//없으면 -1
		//스텐다드 검색
		index = -1;
		for (int i = 0; i < list.size(); i++) {
			Integer v = list.get(i);
			if (v == 200) {
				index = i;
				break;
			}
		}
		System.out.println(index);
		
		//수정
		list.set(2, 666);
		for (Integer integer : list) {
			System.out.println(integer);
		}
		
		List<MyData> objList = new ArrayList<MyData>();
		
		// 추가 5개 추가하기
		objList.add(0, new MyData(1, "테스터66"));
		objList.add(1, new MyData(2, "테스터2"));
		objList.add(2, new MyData(3, "테스터3"));
		objList.add(3, new MyData(4, "테스터4"));
		objList.add(new MyData(1, "테스터66"));
		
//		for (MyData myData : objList) {
//			System.out.println(myData);
//		}
//		System.out.println(objList.get(0));
		// 원하는 위치에 추가
		objList.set(3, new MyData(44, "테스터44"));
		for (MyData myData : objList) {
			System.out.println(myData);
		}
		// 검색 이름으로 검색하기 그사람 이름으로 찾으면 이름 출력(동명이인처리하기)
		//이름 입력 받기
		System.out.println("검색할 이름을 입력해 주세요 : ");
		Scanner sc = new Scanner(System.in);
		String searchName = sc.nextLine();
		List<MyData> findList = new ArrayList<MyData>();
		index = -1;
		for (int i = 0; i < objList.size(); i++) {
			MyData obj = objList.get(i);
			if (searchName.equals(obj.getName())) {
				index = i;
//				System.out.println(obj);
				findList.add(obj);
			}
		}
		
		for (MyData myData : findList) {
			System.out.println(myData);
		}
		// 수정
		objList.set(3, new MyData(3, "수정테스터3"));
		for (MyData myData : objList) {
			System.out.println(myData);
		}
		// 삭제
		objList.remove(3);
		for (MyData myData : objList) {
			System.out.println(myData);
		}
	}

}
