package cls;

import inter.PrintNameInterface;

public class PrintNameCard implements PrintNameInterface {

	@Override
	public void print(NameCard n) {
		// TODO Auto-generated method stub
		System.out.println("이름 : " + n.name);
	}


}
