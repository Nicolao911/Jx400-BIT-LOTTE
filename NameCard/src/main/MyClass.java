package main;

import javax.security.auth.callback.NameCallback;

import cls.NameCard;
import cls.PrintNameCard;
import cls.PrintPhoneCard;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NameCard nCard = new NameCard("홍길동", "123", "hgd@naver.com");
		
		
		nCard.setPrintNameCard(new PrintNameCard());
		nCard.print();
		
		
		nCard.setPrintPhoneCard(new PrintPhoneCard());
		nCard.printPhone();
	}

}
