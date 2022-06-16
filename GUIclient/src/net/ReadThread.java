package net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.List;

import view.ClientFrame;

public class ReadThread extends Thread {

	Socket socket;
	ClientFrame cf;

	public ReadThread(Socket socket, ClientFrame cf) {
		this.socket = socket;
		this.cf = cf;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		try {
			while (true) {
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

				String str = br.readLine();
				// 전송 데이터 확인
				if (str == null) {
					System.out.println("접속끊김");
				}
				//최초 로드시 방 명단 init
				if (str.contains("/")) {
					String rList[] = str.split("/");
					for (String title : rList) {	
						cf.roomList.addElement("");
						cf.roomList.addElement(title);
					}
				} else if(str.contains("-"))  {
					String uList[] = str.split("-");
					for (String name : uList) {
						cf.allUserList.addElement("");//초기화
						cf.allUserList.addElement(name);
					}
				} else {
					cf.textA.append(str + "\n");
				}	
				Thread.sleep(300);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
