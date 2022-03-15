/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joji
 */

import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  
import java.lang.Exception;  

public class Main
{  
    public static void main(String arg[])  
    {  
        loginForm frame = new loginForm();  
        frame.pack(); 
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }  
}

class loginForm extends JFrame
{  
    JButton login, cancel;  
    JPanel panel;  
    JLabel username, password;  
    final JTextField  textFieldUsername, textFieldPassword;  
      
    loginForm()  
    {     
        // buat label untuk username
        username = new JLabel();  
        username.setText("Username: "); 
        // buat text field untuk username agar bisa diinput user
        textFieldUsername = new JTextField(15); 
  
        // buat label untuk password
        password = new JLabel();  
        password.setText("Password: ");          
        // buat text field untuk password agar bisa diinput user
        textFieldPassword = new JPasswordField(15);
          
        // buat tombol login dan cancel
        login = new JButton("Login");
        cancel = new JButton("Cancel");
          
        panel = new JPanel(new GridLayout(3, 1));  
        panel.add(username);
        panel.add(textFieldUsername);
        panel.add(password);
        panel.add(textFieldPassword);
        panel.add(login);
        panel.add(cancel);
          
        add(panel, BorderLayout.CENTER);  
        setTitle("Login"); 
    }  
}