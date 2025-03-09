/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latkuispbo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class HalamanPembelian extends JFrame implements ActionListener {
    JLabel labelJudul = new JLabel("Halaman Pembelian");
    JLabel labelKategori = new JLabel();
    JLabel labelHarga = new JLabel();
    JLabel labelJumlah = new JLabel("Jumlah: ");
    JTextField inputJumlah = new JTextField();
    JButton buttonBeli = new JButton("Beli");
    JButton buttonKembali = new JButton("Kembali");

    JLabel labelTotalPembelian = new JLabel("Total Pembelian");
    JLabel labelHargaSatuan = new JLabel("Harga Satuan: ");
    JLabel labelJumlahBeli = new JLabel("Jumlah: ");
    JLabel labelTotalHarga = new JLabel("Total Harga: ");

    JLabel valueHargaSatuan = new JLabel();
    JLabel valueJumlahBeli = new JLabel("-");
    JLabel valueTotalHarga = new JLabel("-");

    String username;
    String kategori;
    int hargaPerMajalah;

    HalamanPembelian(String username, String kategori, int hargaPerMajalah) {
        this.username = username;
        this.kategori = kategori;
        this.hargaPerMajalah = hargaPerMajalah;

        setVisible(true);
        setSize(480, 480);
        setTitle("Halaman Pembelian");
        setLocationRelativeTo(null);
        setAlwaysOnTop(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        add(labelJudul);
        add(labelKategori);
        add(labelHarga);
        add(labelJumlah);
        add(inputJumlah);
        add(buttonKembali);
        add(buttonBeli);
        add(labelTotalPembelian);
        add(labelHargaSatuan);
        add(valueHargaSatuan);
        add(labelJumlahBeli);
        add(valueJumlahBeli);
        add(labelTotalHarga);
        add(valueTotalHarga);

        labelJudul.setBounds(20, 20, 200, 25);

        labelKategori.setText("Kategori: " + kategori);
        labelKategori.setBounds(20, 40, 200, 25);

        labelHarga.setText("Harga: Rp. " + hargaPerMajalah + " /pcs");
        labelHarga.setBounds(20, 80, 200, 25);

        labelJumlah.setBounds(20, 120, 100, 25);
        inputJumlah.setBounds(120, 120, 100, 30);

        buttonKembali.setBounds(20, 170, 100, 32);
        buttonKembali.setBackground(Color.LIGHT_GRAY);
        buttonKembali.setForeground(Color.BLACK);
        buttonKembali.addActionListener(this);

        buttonBeli.setBounds(130, 170, 100, 32);
        buttonBeli.setBackground(Color.LIGHT_GRAY);
        buttonBeli.setForeground(Color.BLACK);
        buttonBeli.addActionListener(this);

        labelTotalPembelian.setBounds(20, 210, 200, 25);
        labelTotalPembelian.setFont(new Font("Arial", Font.BOLD, 14));

        labelHargaSatuan.setBounds(20, 240, 150, 25);
        valueHargaSatuan.setText("Rp. " + hargaPerMajalah);
        valueHargaSatuan.setBounds(180, 240, 200, 25);

        labelJumlahBeli.setBounds(20, 270, 150, 25);
        valueJumlahBeli.setBounds(180, 270, 200, 25);

        labelTotalHarga.setBounds(20, 300, 150, 25);
        valueTotalHarga.setBounds(180, 300, 200, 25);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonBeli) {
            try {
                int jumlah = Integer.parseInt(inputJumlah.getText().trim());

                if (jumlah <= 0) {
                    throw new NumberFormatException("Jumlah harus lebih dari 0");
                }

                int totalHarga = jumlah * hargaPerMajalah;
                valueJumlahBeli.setText(jumlah + " pcs");
                valueTotalHarga.setText("Rp. " + totalHarga);

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Masukkan jumlah yang valid!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == buttonKembali) {
            new HomePage(username);
            this.dispose();
        }
    }
}
