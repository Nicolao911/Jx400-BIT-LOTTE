package main;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

import threadEx.ReadThread;


public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new java.util.Scanner(System.in);
		

		// 1. 접속을 해야 할 server IP(주소)를 설정한다. --> Socket
		InetSocketAddress sockAddr = new InetSocketAddress("192.168.0.6", 9000);

		// 2. Socket 생성
		Socket socket = new Socket();

		// 3. Connection //10초동안 서버 못찾으면 통신종료
		try {
			socket.connect(sockAddr, 10000);
			InetAddress inetAddr;
			if ((inetAddr = socket.getInetAddress()) != null) {
				System.out.println("server 접속 성공!!");
			} else {
				System.out.println("server 접속 실패...");
			}
			
			new ReadThread(socket).start();
				while (true) {
					// 4. Packet 송/수신
					//송신(send) - 클라이언트는 먼저 보내야됨
					System.out.println("[보낼메시지] : ");
					String str = sc.nextLine();
					PrintWriter writer = new PrintWriter(socket.getOutputStream());
					writer.println(str);
					writer.flush();// 꼭 flush로 데이터 짜내줘야됨
					
					
	//				//수신(revc)
	//				BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	//				//넘어온 문자 여기 받을준비해야됨 클라이언트는 채팅을 항상 받을준비를 해야된다.
	//				//안해주면 한번 요청하고 나서부터만됨
	//				
	//				str = reader.readLine();
	//				System.out.println(socket.getPort() + "server로부터 받은 메시지 : " + str);
				}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
