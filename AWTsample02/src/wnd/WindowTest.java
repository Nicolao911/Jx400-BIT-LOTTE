package wnd;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowTest extends Frame implements WindowListener {
	public WindowTest() {

//		setLayout(new FlowLayout());//옆으로 레이아웃 깐다.
//		setLayout(new GridLayout(3, 1));
			

		Label label = new Label();
		label.setText("레이블입니다.");
		label.setBounds(100, 100, 150, 30);
		label.setBackground(Color.red);
		add(label);

		Button btn = new Button();
		btn.setLabel("버튼");
		btn.setBounds(100, 200, 200, 100);
		add(btn);

		TextField textField = new TextField();
		textField.setBounds(100, 350, 150, 50);
		add(textField);

//		label = new Label();
//		label.setText("두번째 레이블입니다."); //덮어씌여짐. 전체영역이라서
//		label.setBackground(Color.red);
//		add(label);

		setSize(640, 480);
		setBackground(Color.gray);
		setLocation(0, 0);
		setVisible(true);

		addWindowListener(this);
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
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
