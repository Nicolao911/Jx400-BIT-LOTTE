//package view;
//
//import java.awt.Dimension;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.WindowEvent;
//import java.awt.event.WindowListener;
//import java.net.Socket;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JList;
//import javax.swing.JPanel;
//import javax.swing.JScrollPane;
//import javax.swing.JTextArea;
//import javax.swing.JTextField;
//
//import net.WriteClass;
//
///*
// * 실제 채팅 화면
// */
//public class ClientFrame_save extends JFrame implements WindowListener, ActionListener {
//
//	public Socket socket;
//	WriteClass wc;
//
//	// 입력칸
//	public JTextField textF = new JTextField(20);
//	// 대화 화면
//	public JTextArea textA = new JTextArea();
//
//	// 전송 버튼
//	JButton btnTransfer = new JButton("send");
//	// 닫기버튼
//	JButton btnExit = new JButton("exit");
//
//	JPanel panel = new JPanel();
//
//	// scroll
//	JScrollPane scrPane;
//
//	// 첫번째 전송여부
//	public boolean isFirst = true;
//
//	public ClientFrame_save(Socket socket) {
//		super("chatting"); // title
//		this.socket = socket;
//		wc = new WriteClass(socket, this);
//
//		new IdFrame(wc, this);
//
//		// scroll
//		scrPane = new JScrollPane(textA);
//		scrPane.setPreferredSize(new Dimension(200, 120));
//
//		add("Center", scrPane);
//
//		panel.add(textF);
//		panel.add(btnTransfer);
//		panel.add(btnExit);
//
//		add("South", panel);
//		// listener추가
//		btnTransfer.addActionListener(this);
//		btnExit.addActionListener(this);
//
//		setBounds(200, 200, 450, 600);
//
//		setVisible(false);
//
//	}
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		Object obj = e.getSource();
//
//		if (obj == btnTransfer || obj == textF) {
//			// 입력값이 공백이면 리턴
//			if (textF.getText().trim().equals(""))
//				return;
//
//			String id = IdFrame.tf.getText();
//
//			textA.append("[" + id + "]" + textF.getText() + "\n");
//
//			// server 전송
//			wc.sendMessage();
//			textF.setText("");
//		} else if (obj == btnExit) {// 닫기버튼
//			this.dispose();
//		}
//
//	}
//
//	@Override
//	public void windowOpened(WindowEvent e) {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public void windowClosing(WindowEvent e) {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public void windowClosed(WindowEvent e) {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public void windowIconified(WindowEvent e) {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public void windowDeiconified(WindowEvent e) {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public void windowActivated(WindowEvent e) {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public void windowDeactivated(WindowEvent e) {
//		// TODO Auto-generated method stub
//
//	}
//}
