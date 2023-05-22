/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import controller.ControllerLihatVaksin;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class ViewBarisData extends JFrame{
    ViewLihatVaksin vlv;
    
    JLabel lNIK = new JLabel("NIK");
    JLabel lNama = new JLabel("Nama");
    JLabel lVaksinke = new JLabel("Vaksin Ke-");
    JLabel lJenisvak = new JLabel("Jenis Vaksin");  
    JLabel lTanggal = new JLabel("Tanggal");
    
    JLabel ttkdua1 = new JLabel(":");
    JLabel ttkdua2 = new JLabel(":");
    JLabel ttkdua3 = new JLabel(":");
    JLabel ttkdua4 = new JLabel(":");
    JLabel ttkdua5 = new JLabel(":");
    
    public JLabel l2NIK = new JLabel();
    public JLabel l2Nama = new JLabel();
    public JLabel l2Vaksinke = new JLabel();
    public JLabel l2Jenisvak = new JLabel();
    public JLabel l2Tanggal = new JLabel(); 
    
    public JButton btnEdit = new JButton("Edit");   
    public JButton btnKembali = new JButton("Kembali");   
    public JButton btnHapus = new JButton("Hapus");   

    public ViewBarisData() {    
        
        setTitle("Data Edit");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(320,400);  
        setLocationRelativeTo(null);
        
        add(lNIK);
        lNIK.setBounds(60, 60, 90, 20);
        add(l2NIK);
        l2NIK.setBounds(190, 60, 120, 20);
        
        add(lNama);
        lNama.setBounds(60, 100, 90, 20);
        add(l2Nama);
        l2Nama.setBounds(190, 100, 120, 20);
        
        add(lVaksinke);
        lVaksinke.setBounds(60, 140, 90, 20);
        add(l2Vaksinke);
        l2Vaksinke.setBounds(190, 140, 120, 20);         
        
        add(lJenisvak);
        lJenisvak.setBounds(60, 180, 90, 20);
        add(l2Jenisvak);
        l2Jenisvak.setBounds(190, 180, 120, 20);
        
        add(lTanggal);
        lTanggal.setBounds(60, 220, 90, 20);
        add(l2Tanggal);
        l2Tanggal.setBounds(190, 220, 120, 20);
        
        add(btnEdit);
        btnEdit.setBounds(50, 290, 90, 20);
        
        add(btnKembali);
        btnKembali.setBounds(110, 320, 90, 20);
                     
        
        add(btnHapus);
        btnHapus.setBounds(160, 290, 90, 20);
        
        add(ttkdua1);
        ttkdua1.setBounds(180, 60, 10, 20);
        
        add(ttkdua2);
        ttkdua2.setBounds(180, 100, 10, 20);
        
        add(ttkdua3);
        ttkdua3.setBounds(180, 140, 10, 20);
        
        add(ttkdua4);
        ttkdua4.setBounds(180, 180, 10, 20);
        
        add(ttkdua5);
        ttkdua5.setBounds(180, 220, 10, 20);
                
    }   
    
}
