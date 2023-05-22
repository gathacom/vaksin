/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javax.swing.*;
import com.toedter.calendar.JDateChooser;
import java.util.Date;

/**
 *
 * @author User
 */
public class ViewInputVaksin extends JFrame{
    JLabel lnik = new JLabel("NIK");
    JLabel lnama = new JLabel("Nama");
    JLabel lvaksinke = new JLabel("Vaksin Ke-");
    JLabel ljenisvak = new JLabel("Jenis Vaksin");
    JLabel ltanggal = new JLabel("Tanggal");
    
    public JTextField tfnik = new JTextField();
    public JTextField tfnama = new JTextField();
    public JTextField tfvaksinke = new JTextField();
    String [] jenisvaksin = {"Sinovac", "Astra Zeneca", "Moderna", "Pfizer", "Sinopharm" };
    public JComboBox<String> jenisvak = new JComboBox<String>(jenisvaksin);
    public JDateChooser tftanggal = new JDateChooser();
    
    
    public JButton btnSubmit = new JButton("Submit");
    public JButton btnReset = new JButton("Reset");
    public JButton btnKembali = new JButton("Kembali");

    public ViewInputVaksin() {
        setTitle("Input Data");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setLayout(null);
        setSize(240,440);
        setLocationRelativeTo(null);
        
        add(lnik);
        lnik.setBounds(10, 30, 80, 20);
        add(tfnik);
        tfnik.setBounds(90, 30, 120, 20);
        
        add(lnama);
        lnama.setBounds(10, 70, 80, 20);
        add(tfnama);
        tfnama.setBounds(90, 70, 120, 20);
        
        add(lvaksinke);
        lvaksinke.setBounds(10, 110, 80, 20);
        add(tfvaksinke);
        tfvaksinke.setBounds(90, 110, 120, 20);
        
        add(ljenisvak);
        ljenisvak.setBounds(10, 150, 80, 20);
        add(jenisvak);
        jenisvak.setBounds(90, 150, 120, 20);
        
        add(ltanggal);
        ltanggal.setBounds(10, 190, 80, 20);
        
        add(tftanggal);
        tftanggal.setBounds(90, 190, 120, 20);
        
        add(btnSubmit);
        btnSubmit.setBounds(10, 230, 100, 20);
        
        add(btnReset);
        btnReset.setBounds(110, 230, 100, 20);
        
        add(btnKembali);
        btnKembali.setBounds(10, 360, 200, 20);
    }
    
    public String getTfnik() {
        return tfnik.getText();
    }
    
    public String getTfnama() {
        
        return tfnama.getText();
    }

    public String getTfvaksinke() {
        return tfvaksinke.getText();
    }
    
    public String getTfjenisvak() {
        return (String) jenisvak.getSelectedItem();
    }

    public JDateChooser getTftanggal() {
        return tftanggal;
    }
}
