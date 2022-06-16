package cls;

import java.util.Observable;

public class MyClass extends Observable{
	private String password;
	
	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	private String perArg = null;
	
	// 일반 메소드
	
	@Override
	public void notifyObservers(Object arg) {
		// TODO Auto-generated method stub
		
		String str = (String)arg;
		
		// 변화가 없을떄
		if (str.equals(perArg)) return;
		
		perArg = str;
		
		setChanged(); // reset
		
		super.notifyObservers(arg);
	}
	


}
