/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latkuispbo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
 *
 * @author User
 */
public class LoginPage extends JFrame implements ActionListener {
    JLabel usernameLabel = new JLabel("Username: ");
    JLabel passwordLabel = new JLabel("Password: ");
    
    JTextField usernameTextField = new JTextField();
    JPasswordField passwordTextField = new JPasswordField();
    
    JButton buttonLogin = new JButton("Login");
    JButton buttonReset = new JButton("Reset");
    
    public LoginPage() {
        setVisible(true);
        setSize(480,480);
        setTitle("Halaman Login");
        setLocationRelativeTo(null);
        setAlwaysOnTop(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        UIManager.put("Label.font", new Font("Aptos", Font.PLAIN, 16));
        UIManager.put("Button.font", new Font("Aptos", Font.PLAIN, 16));
        UIManager.put("TextField.font", new Font("Aptos", Font.PLAIN, 16));
        UIManager.put("PasswordField.font", new Font("Aptos", Font.PLAIN, 16));

        add(usernameLabel);
        add(passwordLabel);
        add(usernameTextField);
        add(passwordTextField);
        add(buttonLogin);
        add(buttonReset);

        usernameLabel.setBounds(20, 125, 300, 12);
        usernameTextField.setBounds(20, 141, 430, 32);
        
        passwordLabel.setBounds(20, 189, 440, 12);
        passwordTextField.setBounds(20, 205, 430, 32);

        buttonLogin.setBounds(20, 245, 340, 32);
        buttonLogin.setBackground(Color.LIGHT_GRAY);
        buttonLogin.setForeground(Color.BLACK);
        buttonLogin.addActionListener(this);

        buttonReset.setBounds(370, 245, 80, 32);
        buttonReset.setBackground(Color.LIGHT_GRAY);
        buttonReset.setForeground(Color.BLACK);
        buttonReset.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == buttonLogin) {
                String username = usernameTextField.getText();
                String password = new String(passwordTextField.getPassword()); // Mengambil password dari JPasswordField
            // Contoh validasi sederhana
            if (username.equals("a") && password.equals("a")) {
                JOptionPane.showMessageDialog(this, "Login Berhasil!");
                new HomePage(username);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Login Gagal! Periksa kembali username dan password.", "Login Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if(e.getSource() == buttonReset) {
            usernameTextField.setText("");
            passwordTextField.setText("");
        }

        } catch (Exception error) {
            JOptionPane.showMessageDialog(this, error.getMessage());
        }
    }
}
