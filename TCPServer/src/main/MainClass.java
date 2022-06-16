package main;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import threadEx.ServerThread;

public class MainClass {
	public static void main(String[] args) {
		
		List<String> roomList = new ArrayList<String>();
		List<String> usrList = new ArrayList<String>();
		Socket clientSocket = null;
		
		try {
			ServerSocket serverSocket = new ServerSocket(9000);
			List<Socket> list = new ArrayList<Socket>();
			
			while (true) {
				//버전확인, binding, listen   192.168.0.6:9000
				System.out.println("접속 대기중 ....");
				clientSocket = serverSocket.accept();
				
				list.add(clientSocket);//담당자 소캣을 계속 넣어서 보관 해준다. 다른 client가 오면 덮어써지니까 유지 위해 저장해둠
				
				// 접속 client 확인
				System.out.println("client IP : " + clientSocket.getInetAddress() + " Port: "
												  + clientSocket.getPort());
				
				new ServerThread(clientSocket, list, roomList, usrList).start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
