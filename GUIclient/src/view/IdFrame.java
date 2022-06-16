package view;
/*
 * Id 입력받는 화면
 */

import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import net.WriteClass;

public class IdFrame extends JFrame implements ActionListener {
	// 입력 필드
	public static TextField tf = new TextField(8);// int값은 칸 수 이다.

	// 등록버튼
	JButton btn = new JButton("등록");

	ClientFrame cf;
	//WriteClass 추가
	WriteClass wc;
	
	public IdFrame(WriteClass wc, ClientFrame cf) {

		this.cf = cf;
		this.wc = wc;
		
		setTitle("ID input");
		setLayout(null);

		JLabel label = new JLabel("id:");
		label.setBounds(50, 60, 30, 30);
		add(label);

		tf.setBounds(80, 60, 100, 30);
		add(tf);

		btn.setBounds(80, 110, 100, 30);
		btn.addActionListener(this);
		add(btn);
		
		setBounds(300, 300, 250, 200);
		setBackground(Color.green);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//id 전송
		wc.sendMessage();
		// 첫번째 전송 후
		cf.isFirst = false;
		// 두번째 ClientFrame을 시각화
		cf.setVisible(true);
		//현재창 닫기
		this.dispose();
	}

}
