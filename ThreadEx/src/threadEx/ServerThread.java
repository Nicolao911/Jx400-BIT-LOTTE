package threadEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.List;

public class ServerThread extends Thread {

	
	Socket socket;
	List<Socket> list;
	
	public ServerThread(Socket socket, List<Socket> list) {
		this.socket = socket;
		this.list = list;
	}

	@Override
	public void run() {
		super.run();
		try {
		//thread로해야됨
			while(true) {
				//수신(revc)
				BufferedReader reader;
			
				reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
				//넘어온 문자
				String str = reader.readLine();
				System.out.println("clinet로부터 받은 메시지 : " + str);
				//server응답 메시지
//				str = "반값습니다.";
				
				//송신(send)
				PrintWriter writer = new PrintWriter(socket.getOutputStream());
				writer.println(str);
				writer.flush();// 꼭 flush로 데이터 짜내줘야됨
				Thread.sleep(300);
			}
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}
