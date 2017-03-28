package com.sd.gui;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPanel;
public class CalcAreaGUIMain {
  public static void main(String[] args) {
    JFrame f=new JFrame();
    JPanel panel=new JPanel(new GridLayout(3,2));
    f.getContentPane().add(panel);
    JLabel label1=new JLabel("¹ÝÁö¸§");
    JLabel label2=new JLabel("¸éÀû");
    JTextField radiusTf1=new JTextField(20);
    JTextField areaTf2=new JTextField(20);
    JButton b1=new JButton("°è»ê");
    JButton b2=new JButton("Ãë¼Ò");
    b1.addActionListener(new CalcAreaListener()); 
    panel.add(label1);
    panel.add(radiusTf1);
    panel.add(label2);
    panel.add(areaTf2);
    panel.add(b1);
    panel.add(b2);
    f.pack();
    f.setVisible(true);
  }   
}
