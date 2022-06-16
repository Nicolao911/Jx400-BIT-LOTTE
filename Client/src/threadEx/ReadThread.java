package threadEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ReadThread extends Thread{
	Socket socket;

	public ReadThread(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		try {
			while(true) {
				//넘어온 문자 여기 받을준비해야됨 클라이언트는 채팅을 항상 받을준비를 해야된다.
				//안해주면 한번 요청하고 나서부터만됨
				//수신(revc)
				BufferedReader reader;
				reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String str = reader.readLine();
				System.out.println(socket.getPort() + "server로부터 받은 메시지 : " + str);
				
				Thread.sleep(300);
			}
		} catch (IOException | InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
}
