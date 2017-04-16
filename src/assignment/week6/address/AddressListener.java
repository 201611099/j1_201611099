package assignment.week6.address;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;

public class AddressListener implements ActionListener { 
  public void actionPerformed(ActionEvent e) {
    JButton b = (JButton)e.getSource();
    String cmd = e.getActionCommand();
    JTextField nameTextField = new JTextField(25);
    JTextField phoneTextField = new JTextField(25);
    JTextField emailTextField = new JTextField(25);
    
    if (cmd.equals("Enter")) {
      String display = nameTextField.getText() + "\n";
      display += phoneTextField.getText() + "\n";
      display += emailTextField.getText();
      
      nameTextField.setText("");
      phoneTextField.setText("");
      emailTextField.setText("");
    }
    else {
      System.exit(0);
    }
  }
}
