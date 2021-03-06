package threadEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ServerThread extends Thread {

	Socket socket;
	List<Socket> list;
	List<String> roomList;
	List<String> usrList;

	public ServerThread(Socket socket, List<Socket> list, List<String> roomList, List<String> usrList) {
		this.socket = socket;
		this.list = list;
		this.roomList = roomList;
		this.usrList = usrList;
	}

	@Override
	public void run() {
		super.run();
		try {
			while (true) {
				// 수신(revc)
				BufferedReader reader;
				PrintWriter writer;
				reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				// 넘어온 문자
				String str = reader.readLine();
				if (str.contains("/")) {
					String arr[] = str.split("/");
					String title = arr[0];
					String userId = arr[1];
					// 사용자 추가
					usrList.add(userId);
					roomList.add(title);
				} else {
					System.out.println("clinet로부터 받은 메시지 : " + str);
					if (str.contains("로그인")) {
						//id 추출
						String s = str;
						Pattern p = Pattern.compile("\\[(.*?)\\]");
						Matcher m = p.matcher(s);
						String name = null;
						while (m.find()) {
							name = m.group(1);
						}
						usrList.add(name);
						writer = new PrintWriter(socket.getOutputStream());
						String listMsg = "";
						String usrMsg = "";
						// 사람 목록
						for (int i = 0; i < usrList.size(); i++) {
							usrMsg += usrList.get(i) + "-";
						}
						write(writer, usrMsg);

						// 방 목록
						if (!roomList.isEmpty()) {
							for (int i = 0; i < roomList.size(); i++) {
								System.out.println("방목록이야!!!");
								System.out.println(roomList.get(i));
								listMsg += roomList.get(i) + "/";
							}
							write(writer, listMsg);
						}
					}
				}

				// 송신(send)
				for (int i = 0; i < list.size(); i++) {
					Socket listSocket = list.get(i);
					if (socket.getPort() != listSocket.getPort()) {
						writer = new PrintWriter(listSocket.getOutputStream());
						write(writer, str);
					}
				}
			}
		} catch (Exception e) {
			System.out.println("클라이언트 연결이 종료 되었습니다..." + socket.getInetAddress());
			list.remove(socket);

			// 접속되어 있는 남아있는 클라이언트 출력
			for (Socket s : list) {
				System.out.println("접속되어 있는 IP : " + s.getInetAddress() + "PORT : " + s.getPort());
			}

			try {
				socket.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}

	/**
	 * client로 msg를 보낸다
	 * 
	 * @param writer
	 * @param msg
	 * @throws InterruptedException
	 */
	public void write(PrintWriter writer, String msg) throws InterruptedException {
		writer.println(msg);
		writer.flush();
		Thread.sleep(300);
	}
}
