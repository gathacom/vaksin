/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import view.*;
import model.*;
/**
 *
 * @author User
 */
public class ControllerLihatVaksin {
    ViewLihatVaksin vlv;
    ModelVaksin mv;

    public ControllerLihatVaksin(ViewLihatVaksin vlv, ModelVaksin mv) {
        this.vlv = vlv;
        this.mv = mv;
        if (mv.getBanyakData()!=0) {
            String dataVaksin[][] = mv.readVaksin();
            vlv.tabel.setModel((new JTable(dataVaksin, vlv.namaKolom)).getModel());
        }
        else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }
        
        
        vlv.btnKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {                               
                ViewMainMenu vmm=new ViewMainMenu();
                vlv.setVisible(false);
                ControllerMainMenu mmc=new ControllerMainMenu(vmm);
            }
        });
        
        vlv.tabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                int row = vlv.tabel.getSelectedRow();                

                String dataterpilih = vlv.tabel.getValueAt(row, 0).toString();

                System.out.println(dataterpilih);
                ViewBarisData vbb=new ViewBarisData();
                vlv.setVisible(false);
                ControllerBarisData bbc=new ControllerBarisData(vbb,dataterpilih,mv);
                
                                                                            
            }
        }
        );
    }
}
