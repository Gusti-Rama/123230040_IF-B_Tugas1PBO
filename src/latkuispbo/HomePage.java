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
public class HomePage extends JFrame implements ActionListener {
        JLabel labelSelamatDatang = new JLabel();
        JLabel labelDeskripsi = new JLabel();
        JButton buttonAnak = new JButton("Majalah Anak");
        JButton buttonRemaja = new JButton("Majalah Remaja");
        JButton buttonDewasa = new JButton("Majalah Dewasa");
        
        String username;
        
        HomePage(String username) {
            this.username = username;
            setVisible(true);
            setSize(480,480);
            setTitle("Halaman Utama");
            setLocationRelativeTo(null);
            setAlwaysOnTop(true);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(null);

            add(labelSelamatDatang);
            add(labelDeskripsi);
            add(buttonAnak);
            add(buttonRemaja);
            add(buttonDewasa);
        
            labelSelamatDatang.setText("Selamat Datang, " + username);
            labelSelamatDatang.setBounds(20, 84, 440, 20);
            
            labelDeskripsi.setText("Silakan pilih menu di bawah untuk membeli majalah");
            labelDeskripsi.setFont(new Font("Aptos", Font.PLAIN, 14));
            labelDeskripsi.setBounds(20,100,400,20);
            
            buttonAnak.setBounds(20, 150, 430, 32);
            buttonAnak.setBackground(Color.LIGHT_GRAY);
            buttonAnak.setForeground(Color.BLACK);
            buttonAnak.addActionListener(this);
            
            buttonRemaja.setBounds(20, 200, 430, 32);
            buttonRemaja.setBackground(Color.LIGHT_GRAY);
            buttonRemaja.setForeground(Color.BLACK);
            buttonRemaja.addActionListener(this);
            
            buttonDewasa.setBounds(20, 250, 430, 32);
            buttonDewasa.setBackground(Color.LIGHT_GRAY);
            buttonDewasa.setForeground(Color.BLACK);
            buttonDewasa.addActionListener(this);
    }
    
@Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonAnak) {
            new HalamanPembelian(username,"Majalah Anak", 10800);
        } else if (e.getSource() == buttonRemaja) {
            new HalamanPembelian(username,"Majalah Remaja", 15200);
        } else if (e.getSource() == buttonDewasa) {
            new HalamanPembelian(username,"Majalah Dewasa", 25400);
        }
        this.dispose();
    }
}
