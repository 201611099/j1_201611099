package assignment.week6.address;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;

public class AddressListener implements ActionListener { 
  /*private String name;
  private String phone;
  private String email;
  
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }*/
  //private JTextField nameTextField, phoneTextField, emailTextField;
  public void actionPerformed(ActionEvent e) {
    //private JTextField nameTextField, phoneTextField, emailTextField;
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