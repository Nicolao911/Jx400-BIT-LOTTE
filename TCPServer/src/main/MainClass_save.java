//package main;
//
//import java.io.IOException;
//import java.net.ServerSocket;
//import java.net.Socket;
//import java.util.ArrayList;
//import java.util.List;
//
//import threadEx.ServerThread;
//
//public class MainClass_save {
////	public static int port = 9000;// 새로 생성 될 때 port번호를 1개씩 증가
//	public static void main(String[] args) {
//		/*
//		 * TCP : Transmission Control Protocol
//		 * 			전송 			제어 		규약
//		 * 
//		 * Server : TCP, Web(tomcat), Database
//		 * 
//		 * 종단시스템 : host -> 요청이 날라오면 제일 끝에서 받고 더 나가지 않는 부분 말단부분
//		 * -> PC, Smart Phone, Scanner, printer
//		 * 
//		 * Router : hardware 중간 기기
//		 * 			host간의 상호 데이터를 교환할 수 있도록 하는 장비
//		 * 
//		 * Inter Network : 포괄적인 통신망
//		 * 
//		 * 통신규약
//		 * TCP = Transmission Control Protocol 동기 통신 : 한쪽에서 보낼준비 하면 한쪽에서 받으려고 대기하고 있어야됨
//		 * UDP = User Datagram Protocol 비동기 통신 
//		 * 
//		 * 7 Layer
//		 * 1계층 - Physical Layer			물리 계층
//		 * 2계층 - Data Link Layer 		주소를 헤더에 첨부 - 어디서 보낸다를 표현(전화를 걸면 상대방에게 내 번호가 찍힘)
//		 * 3계층 - Network Layer 			네트워크 IP -> Address
//		 * 4계층 - Transport Layer 		네트워크 Port 
//		 * 5계층 - Session Layer 			서버의 저장공간
//		 * 6계층 - Presentation Layer 	보안, 압축, 확장
//		 * 7계층 - Application Layer 		프로그램
//		 * 
//		 * people don't need those stupid packets anyways
//		 * 
//		 * TCP
//		 * 신사적인 Protocol, 신뢰할 수 있는 규약
//		 * 전화 -> 상대방이 받지 않으면 연결 안됨 -> 받고 연결 -> 통신 start
//		 * 동기화 : send -> Receive 처리 순서가 맞아야한다
//		 * 데이터의 경계가 없다. 용량 제한이 없다.
//		 * 채팅, object전송 
//		 * 
//		 * UDP
//		 * 비 연결형 Protocol
//		 * 편지, 지상파방송
//		 * 데이터의 경계가 있다.
//		 * 용량 제한이 있다. 넘치면 잘라서 보내야됨.
//		 * 1 대 1 (unicast)
//		 * 1 대 다 (broadcast)
//		 * 다 대 다 (multicast)
//		 * 
//		 * Packet(묶음)
//		 * 제어정보, 데이터(문자열, object) 결합된 형태로 전송
//		 * IP(어디로 보낼지), Port, String :
//		 * 
//		 * IP : Internet Protocol -> 주소
//		 * 
//		 * Ipv4 : xxx.xxx.xxx.xxx -> 0 ~ 225
//		 * Ipv6 : xxx.xxx.xxx.xxx.xxx.xxx
//		 * 
//		 * 127.0.0.1 -> 자기 자신의 접속 주소
//		 * 
//		 * Port Number : 각각의 프로세스를 구별할 수 있는 번호
//		 * IP 주소는 Internet에 존재하는 host(PC)를 식별할 수 있으나, 
//		 * 최종 주체인 Process(program)을 식별하지 못하기 때문에
//		 * process를 구별하기 위해 지정된 수치(가능한한 중복을 피하기 위해 0~1024 외의 숫자를 지정한다.)
//		 * 
//		 * Socket(IP주소만 가지고있다. TCP/UDP정보를 가지고 있다.) : 통신을 위해서 기본적으로 장착 되어있어야하는 것
//		 * unix는 socet통신이 아니라 file통신이다.
//		 * -> 소켓은 통신을 하기 위한 object이다. 통신의 주체
//		 * IP,TCP/UDP
//		 * 
//		 * 통신 순서  
//		 * 		server 					client
//		 * 1.	Socket 버전 확인			Socket 버전 확인 
//		 * 2.	Binding ->IP, Potr설정
//		 * 3.	Listener 동작
//		 * 4.	Accept 준비 <----------- 2. Connect
//		 * 
//		 * 		1) Receive <------------- 	send(write)
//		 * 		2) Send   ----------------> Receive(read)
//		 * 
//		 * DNS(Domain Name System) Server -> 웹브라우져로 접속했을때 문자(도메인)로 바꿔줌
//		 * ip들어오면 domain으로 꺽어준다
// 		 * 
//		 */
//		
//		//포트번호를 담아둘 list
//		List<Integer> portList = new ArrayList<Integer>();
//		
//		
//		Socket clientSocket = null;// 이건 서버내부에 있는 담당자 소켓. 문지기를 통해 들어와서 받아들이는 소켓 올라와있는 프로그램의 소켓이 아니라
//		// 클라이언트 서버에서 날라온 요청을 전담으로 받아주는 소켓 클라이언트 서버 대수에 따라 개수가 늘어난다.
//		// 담당자 소켓의 port는 server가 자동 할당	
//		
//		try {
//			//문지기 소켓. 최초에 서버에 들어오는 소켓 서버소켓이지. //9000
//			ServerSocket serverSocket = new ServerSocket(9000); //port를 static에 올려둬서 방만들기가 나오면 숫자를 하나씩 증가 시킨다.
//			List<Socket> list = new ArrayList<Socket>();
//			
//			while (true) { //Accept 상태를 유지해야함
//				//버전확인, binding, listen   192.168.0.6:9000
//				System.out.println("접속 대기중 ....");
//				clientSocket = serverSocket.accept();
//				
//				list.add(clientSocket);//담당자 소캣을 계속 넣어서 보관 해준다. 다른 client가 오면 덮어써지니까 유지 위해 저장해둠
//				
//				// 접속 client 확인
//				System.out.println("client IP : " + clientSocket.getInetAddress() + " Port: "
//												  + clientSocket.getPort());
//			//thread로해야됨
////				//수신(revc)
////				BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
////				//넘어온 문자
////				String str = reader.readLine();
////				System.out.println("clinet로부터 받은 메시지 : " + str);
////				//server응답 메시지
////				str = "반값습니다.";
////				
////				//송신(send)
////				PrintWriter writer = new PrintWriter(clientSocket.getOutputStream());
////				writer.println(str);
////				writer.flush();// 꼭 flush로 데이터 짜내줘야됨
//				new ServerThread(clientSocket, list).start();
//				
//			}
//
////			clientSocket.close();
////			serverSocket.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//
//}
