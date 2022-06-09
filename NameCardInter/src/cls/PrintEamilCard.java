package cls;

import inter.PrintNameInterface;

public class PrintEamilCard implements PrintNameInterface {


	@Override
	public void print(NameCard n) {
		// TODO Auto-generated method stub
		System.out.println("이름 : " + n.name);
		System.out.println("전화 : "  + n.phone);
		System.out.println("이메일 : "  + n.email);
	}

}
