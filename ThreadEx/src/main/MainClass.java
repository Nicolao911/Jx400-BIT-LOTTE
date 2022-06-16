package main;

public class MainClass {

	public static void main(String[] args) {
		
		Thread thread = new ThreadEx("퐁");//상속받았으니까 부모인스턴스형으로 자식 클래스로 구현할수 있다.
		Thread thread2 = new ThreadEx("당");
		Thread thread3 = new ThreadEx("!!");
		
		thread.start();
		thread2.start();
		thread3.start();
		
		
		

	}

}
