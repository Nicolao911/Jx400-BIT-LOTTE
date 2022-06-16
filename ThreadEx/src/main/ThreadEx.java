package main;

public class ThreadEx extends Thread {
	
	String msg;

	public ThreadEx(String msg) {
		this.msg = msg;
	}

	@Override
	public void run() {
		super.run();
		
		//for for for 가 각자 한번씩 공평하게 도는거랑 같다.1회전 다같이 2회전 다같이 ...
		
		for (int i = 0; i < 10; i++) {
			System.out.println(msg);
			try {
				Thread.sleep(1000); //천천히 돌아라 1초마다
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	
}
