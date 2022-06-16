package net;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.List;
import view.ChatRoomFrame;
import view.ClientFrame;
import view.IdFrame;

/*
 * 전송. 전송은 thread 로 체크할 필요없다.
 */
public class WriteClass /* implements WindowListener */ {
	Socket socket;
	ClientFrame cf;
	String userId;

	public WriteClass(Socket socket, ClientFrame cf) {
		super();
		this.socket = socket;
		this.cf = cf;
	}

	public void sendMessage() {
		try {
			PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
			String msg = "";
			String id = IdFrame.tf.getText();
			// 첫번째 전송(id)
			if (cf.isFirst) {
				InetAddress iaddr = socket.getLocalAddress();
				String ip = iaddr.getHostAddress(); // 첫번째 전송에 ip를 보낼 것

				msg = "[" + id + "] 님 로그인(" + ip + ")";
			} else {// 두번쨰 전송(내용전달)
				msg = "[" + id + "]" + cf.textF.getText();
			}
			// server로 전송
			pw.println(msg);
			pw.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	//서버로 코드값을 보낸다.
	public void sendCodeMessage(List<String> serverMsg) {
		PrintWriter pw;
		try {
			pw = new PrintWriter(socket.getOutputStream(), true);
			if (serverMsg != null && serverMsg.size() > 0) {
				String code = serverMsg.get(0);
				String title = serverMsg.get(1);
				String chatId = serverMsg.get(2);
				String userId = serverMsg.get(3);
				String serverCode = code +"/" + title +"/" + chatId + "/" + userId;
				pw.println(serverCode);
				pw.flush();
				switch (code) {	
					case "100": {
						System.out.println("여기 클라이언트 :::" + code);
						break;
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
