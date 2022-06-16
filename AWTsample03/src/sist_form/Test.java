package sist_form;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Test extends JFrame implements ActionListener{
    JPanel panel = new JPanel();
    
    JRadioButton radio[] = new JRadioButton[5];
    
    String radio_name[] = {"1점", "2점", "3점", "4점", "5점"}; 
    
    public Test(){
        ButtonGroup group = new ButtonGroup();
        
        for(int i=0; i<radio.length; i++){
            radio[i] = new JRadioButton(radio_name[i]);
            group.add(radio[i]);
            panel.add(radio[i]);
            radio[i].addActionListener(this);
        }
        
        this.add(panel);
        this.setTitle("RadioButton Example");
        this.setVisible(true);
        this.setSize(400, 80);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
 
    @Override
    public void actionPerformed(ActionEvent e){
        String s = e.getActionCommand();
        
        if(s.equals(radio[0].getText())){
            JOptionPane.showMessageDialog(null,"선택 점수 : "+radio[0].getText());
        }
        else if(s.equals(radio[1].getText())){
            JOptionPane.showMessageDialog(null,"선택 점수 : "+radio[1].getText());
        }
        else if(s.equals(radio[2].getText())){
            JOptionPane.showMessageDialog(null,"선택 점수 : "+radio[2].getText());
        }
        else if(s.equals(radio[3].getText())){
            JOptionPane.showMessageDialog(null,"선택 점수 : "+radio[3].getText());
        }
        else if(s.equals(radio[4].getText())){
            JOptionPane.showMessageDialog(null,"선택 점수 : "+radio[4].getText());
        }
    }
}
