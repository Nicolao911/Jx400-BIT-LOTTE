package sist_form;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class OrderClass extends Frame implements WindowListener, ActionListener {
	Label label;
	Button button1, button2;
	TextField textField = new TextField();
	Choice choice = new Choice();
	JRadioButton radio = new JRadioButton();
	JCheckBox check = new JCheckBox();
	Checkbox aCheck = new Checkbox();
	JRadioButton radio1 = new JRadioButton();
	
	public OrderClass() {
		setLayout(null);

		// 메뉴보기 버튼
		button1 = new Button("메뉴보기");
		button1.setBounds(400, 60, 200, 30);
		button1.setBackground(Color.blue);
		button1.addActionListener(this);
		add(button1);

		// select box
		choice.setBounds(80, 150, 400, 30);
		String menu[] = { "아이스 아메리카노1", "카라멜마끼야또2", "사과주스3", "망고주스4", "수박주스5", "키위주스6" };
		for (int i = 0; i < menu.length; i++) {
			choice.add(menu[i]);
		}
		add(choice);

		//메뉴 컬럼 그리기
		//크기
		label = new Label("크기");
		label.setBounds(50, 250, 50, 30);
		label.setBackground(Color.gray);
		add(label);
		//크기 옵션
		String radioOpt[] = {"Short", "Tall", "Grande"};
		radio.setBounds(50, 300, 100, 30);
		radio.setVisible(true);
		radio.setLabel("Short");
		add(radio);
		
		radio1 = new JRadioButton();
		radio1.setBounds(50, 330, 100, 30);
		radio1.setVisible(true);
		radio1.setLabel("Tall");
		add(radio1);
		
		radio = new JRadioButton();
		radio.setBounds(50, 360, 100, 30);
		radio.setVisible(true);
		radio.setLabel("Grande");
		add(radio);
		
		//왼,아래,오른쪽,위
		//시럽
		label = new Label("시럽");
		label.setBounds(250, 250, 50, 30);
		label.setBackground(Color.gray);
		add(label);
		
		radio = new JRadioButton();
		radio.setBounds(250, 300, 100, 30);
		radio.setVisible(true);
		radio.setBackground(Color.gray);
		radio.setLabel("바닐라");
		add(radio);
		
		radio = new JRadioButton();
		radio.setBounds(250, 330, 100, 30);
		radio.setVisible(true);
		radio.setBackground(Color.gray);
		radio.setLabel("캐러멜");
		add(radio);
		
		radio = new JRadioButton();
		radio.setBounds(250, 360, 100, 30);
		radio.setVisible(true);
		radio.setBackground(Color.gray);
		radio.setLabel("헤이즐넛");
		add(radio);
		
		
		//기타
		label = new Label("기타");
		label.setBounds(350, 250, 50, 30);
		label.setBackground(Color.gray);
		add(label);
		
		
		check.setLabel("샷추가");
		check.setBounds(350, 300, 100, 30);
		check.setBackground(Color.gray);
		add(check);
		
		aCheck.setLabel("휘핑크림");
		aCheck.setBounds(350, 330, 100, 30);
		add(aCheck);
		
		//몇잔 숫자 입력 공간
		textField.setBounds(150, 450, 50, 30);
		textField.setText("0");
		add(textField);
		
		//잔
		label = new Label("잔");
		label.setBounds(210, 450, 50, 30);
		label.setBackground(Color.gray);
		add(label);
		
		//주문하기
		button2 = new Button("주문하기");
		button2.setBounds(250, 450, 200, 35);
		button2.setBackground(Color.gray);
		button2.addActionListener(this);
		add(button2);
		
		// 창 만들기
		setSize(640, 580);
		setLocation(0, 0);
		setVisible(true);
		setBackground(Color.gray);
		
		addWindowListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 버튼 이벤트 확인영역
		Button btn = (Button)e.getSource();
		String btnName = btn.getLabel();
		String s = e.getActionCommand();
		
		if (btnName.equals("메뉴보기")) {
			System.out.println("menu!!");
			
		} else if (btnName.equals("주문하기")) {
			System.out.println("order!!"+ choice.getSelectedItem());
//			System.out.println("order!!"+);
		}
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent e) {
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
