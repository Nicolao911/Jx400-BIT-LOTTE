package main;

import cls.NameCard;
import cls.PrintEamilCard;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		NameCard nCard = new NameCard("성춘향", "234", "sch@daum.net");
		
//		nCard.setPrintNameCard(new PrintNameCard());
//		nCard.setPrintNameCard(new PrintPhoneCard());
		nCard.setPrintNameCard(new PrintEamilCard());
		nCard.print();
		
	}

}
