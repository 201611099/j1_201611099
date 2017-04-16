package assignment.week6.address;

import java.util.*;
import java.awt.*;
import javax.swing.*;

public class AddressBookMain{
  public static void main(String[] args) {
    AddressData addressData = new AddressData(); 
    AddressDisplay addressDisplay = new AddressDisplay(addressData);
    JFrame f = new JFrame();
    JPanel panel = new JPanel(new GridLayout(3,2));
    f.getContentPane().add(panel);
    JLabel label1 = new JLabel("Name");
    JLabel label2 = new JLabel("Phone Number");
    JLabel label3 = new JLabel("Email");
    
    JTextField areaTf1 = new JTextField(20);
    JTextField areaTf2 = new JTextField(20);
    JTextField areaTf3 = new JTextField(20); 
    
    JButton b1 = new JButton("Enter");
    JButton b2 = new JButton("Exit");
    panel.add(label1);
    panel.add(areaTf1);
    panel.add(label2);
    panel.add(areaTf2);
    panel.add(label3);
    panel.add(areaTf3);
    panel.add(b1);
    panel.add(b2);
    f.pack();
    f.setVisible(true);
  }
}