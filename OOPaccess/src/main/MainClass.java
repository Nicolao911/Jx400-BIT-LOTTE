package main;

import cls.Human;
import dto.MemberDto;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human human = new Human();
//		human.number = 24;
		human.name = "홍길동";
//		human.height = 178.2;
		
		MemberDto arr[] = new MemberDto[3]; // 객체를 배열로 뽑아낼수도 있다.
		arr[0] = new MemberDto();
		arr[0].setId("AAAA");
		
		System.out.println(arr[0].getId());
		
		String Member[][] = {
				{"AAA", "111", "홍길동"},
				{"AAA", "111", "홍길동"},
				{"AAA", "111", "홍길동"},
				{"AAA", "111", "홍길동"}
		};
		
	}

}
