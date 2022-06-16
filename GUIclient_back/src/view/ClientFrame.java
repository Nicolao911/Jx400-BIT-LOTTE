package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import net.WriteClass;

/*
 * 실제 채팅 화면
 */
public class ClientFrame extends JFrame implements WindowListener, ActionListener {

	public Socket socket;
	WriteClass wc;

	// 대화방목록, 인원정보
	JList<String> chatRoomList, chatRoomUser;
	// scroll
	JScrollPane spChatRoomList, spchatRoomUser, scrPane;
	// 선택된 방
	String selectedRoom;
	// 채팅방 프레임
	ChatRoomFrame chatRoom;

	// 전송 버튼
	JButton btnTransfer = new JButton("send");
	// 닫기버튼
	JButton btnExit = new JButton("exit");
	// 방들어가기 버튼
	JButton createRoom = new JButton("방만들기");
	// 방들어가기 버튼
	JButton enterRoom = new JButton("방들어가기");
	// 생성된 방 목록
	public DefaultListModel roomList = new DefaultListModel();
	// 접속자 목록
	public DefaultListModel allUserList = new DefaultListModel();
	// 입력칸
	public JTextField textF = new JTextField(20);
	// 대화 화면
	public JTextArea textA = new JTextArea();

	JPanel panel = new JPanel();

	// 첫번째 전송여부
	public boolean isFirst = true;

	// msg
	List<String> serverMsg;

	// 채팅방 아이디
	int chatId = 0;

	public ClientFrame(Socket socket) {
		super("chatting"); // title
		this.socket = socket;

		wc = new WriteClass(socket, this);// 전체 대화 Write
		// 최초 대화Id입력 창
		new IdFrame(wc, this);

		// 인원정보
		chatRoomUser = new JList<String>(allUserList);
		chatRoomUser.setBorder(new TitledBorder("인원정보"));

		// 생성된 방목록
		chatRoomList = new JList<String>(roomList);
		chatRoomList.setBorder(new TitledBorder("방정보"));
		// 방 선택
		chatRoomList.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);

				selectedRoom = chatRoomList.getSelectedValue();
			}
		});

		// scroll
		spChatRoomList = new JScrollPane(chatRoomList);
		spchatRoomUser = new JScrollPane(chatRoomUser);
		scrPane = new JScrollPane(textA);
		scrPane.setPreferredSize(new Dimension(200, 120));

		// 위치 선정
		spChatRoomList.setBounds(10, 10, 300, 300);
		spchatRoomUser.setBounds(320, 10, 150, 300);
		scrPane.setBounds(10, 320, 300, 260);// 전체 채팅 목록

		// 버튼 위치
		createRoom.setBounds(320, 330, 150, 30);
		enterRoom.setBounds(320, 370, 150, 30);
		btnTransfer.setBounds(320, 600, 70, 30);
		btnExit.setBounds(400, 600, 70, 30);
		// 채팅입력바
		textF.setBounds(10, 600, 300, 30);

		// 추가
		panel.setLayout(null);
		panel.setBackground(Color.PINK);

		panel.add(spChatRoomList);
		panel.add(spchatRoomUser);
		panel.add(scrPane);
		panel.add(textF);
		panel.add(btnTransfer);
		panel.add(btnExit);
		panel.add(createRoom);
		panel.add(enterRoom);

		add(panel);

		// listener추가
		btnTransfer.addActionListener(this);
		btnExit.addActionListener(this);
		createRoom.addActionListener(this);
		enterRoom.addActionListener(this);

		setBounds(300, 100, 500, 700);

		setVisible(false);
		// focus
		textF.requestFocus();
		addWindowListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();

		if (obj == btnTransfer || obj == textF) {
			// 입력값이 공백이면 리턴
			if (textF.getText().trim().equals(""))
				return;
			String id = IdFrame.tf.getText();

			textA.append("[" + id + "]" + textF.getText() + "\n");

			// server 전송
			wc.sendMessage();
			textF.setText("");
		} else if (obj == btnExit) {// 닫기버튼
			this.dispose();
		} else if (obj == enterRoom) { // 방들어가기 버튼
			// 클릭된 녀석의 방으로 들어가기
			chatRoom = new ChatRoomFrame(socket, chatId, selectedRoom, wc);// 채팅방
			chatRoom.setTitle(selectedRoom);
			chatRoom.setVisible(true);
			setVisible(false);

		} else if (obj == createRoom) { // 방만들기
			String title = JOptionPane.showInputDialog(this, "방제목:");
			String userId = IdFrame.tf.getText();
			// 채팅방
			chatId++;
			serverMsg = new ArrayList<String>();
			serverMsg.add("100");
			serverMsg.add(title);
			serverMsg.add(chatId + "");
			serverMsg.add(userId + "");
			roomList.addElement(title);
			wc.sendCodeMessage(serverMsg);
		}
	}

	public void removeUser() {
		serverMsg = new ArrayList<String>();
		String userId = IdFrame.tf.getText();
		serverMsg.add("101");
		serverMsg.add("101");
		serverMsg.add("101");
		serverMsg.add(userId);
		wc.sendCodeMessage(serverMsg);
	}

	@Override
	public void windowOpened(WindowEvent e) {
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("x로 껏을떄");
		removeUser();
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("닫기 버튼으로 껏을때");
	}

	@Override
	public void windowIconified(WindowEvent e) {
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
	}

	@Override
	public void windowActivated(WindowEvent e) {
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
	}
}
