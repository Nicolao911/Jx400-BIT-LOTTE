package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.net.Socket;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import net.WriteClass;

/*
 * 채팅방 내부 화면
 */
public class ChatRoomFrame extends JFrame implements WindowListener, ActionListener {

	public Socket socket;
	WriteClass wc;
	
	// 입력칸
	public JTextField textF = new JTextField(20);
	// 대화 화면
	JTextArea textA;
	// 전송 버튼
	JButton btnTransfer = new JButton("send");
	// 닫기버튼
	JButton btnExit = new JButton("exit");

	JPanel panel = new JPanel();

	// msg 컴포넌트명
	JLabel laMsg = new JLabel("Message");

	// 대화목록 scroll
	JScrollPane scrPane;

	// 참여자 목록리스트
	JList<String> chatList;
	
	// msg
	List<String> serverMsg;
	
	//체팅방의 고유한 값
	String title;

	public ChatRoomFrame(Socket socket, /* int chatId, */ String title, WriteClass wc, JTextArea textA) {
		this.socket = socket;
		this.title = title;
		this.wc = wc;
		this.textA = textA;

		// TextArea 가로길이를 벗어나는 text발생시 자동 줄바꿈
		textA.setLineWrap(true);
		// 대화방 list
		chatList = new JList<String>();
		// scroll
		scrPane = new JScrollPane(textA);
		scrPane.setPreferredSize(new Dimension(200, 120));

		// 위치 잡아주기
		scrPane.setBounds(10, 10, 380, 390);
		laMsg.setBounds(10, 410, 60, 30);
		textF.setBounds(70, 410, 320, 30);
		btnTransfer.setBounds(400, 410, 65, 30);
		btnExit.setBounds(470, 410, 60, 30);

		// panel 설정
		panel.setLayout(null);
		panel.setBackground(Color.MAGENTA);
		// 요소 추가
		panel.add(scrPane);
		panel.add(laMsg);
		panel.add(textF);
		panel.add(btnTransfer);
		panel.add(btnExit);

		add(panel);

		// focus
		textF.requestFocus();

		// listener추가
		btnTransfer.addActionListener(this);
		btnExit.addActionListener(this);

		// 창크기
		setBounds(300, 200, 550, 500);
		// 방 입장시 visible하게
		setVisible(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();

		if (obj == btnTransfer || obj == textF) {
			// 입력값이 공백이면 리턴
			if (textF.getText().trim().equals("")) return;
			
			String id = IdFrame.tf.getText();
			//입력 출력부분
			textA.append("[" + id + "]" + textF.getText() + "\n");
			// server 전송
			wc.sendMessage(textF.getText());
			textF.setText("");
		} else if (obj == btnExit) {// 닫기버튼
			this.dispose();
		}
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

}
