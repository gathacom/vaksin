/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author User
 */
public class ViewMainMenu extends JFrame{
    JLabel judul = new JLabel("Main Menu");
    public JButton btnTambah = new JButton("Tambah Data");
    public JButton btnLihat = new JButton("Lihat Data");

    public ViewMainMenu() {
        setTitle("Main Menu");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(250,250);
        setLocationRelativeTo(null);
        
        add(judul);
        judul.setBounds(70, 5, 100, 30);
        judul.setFont(new Font("Tahoma", 1, 18));
        
        add(btnTambah);
        btnTambah.setBounds(50, 50, 140, 30);
        
        add(btnLihat);
        btnLihat.setBounds(50, 100, 140,30);
    }
}
