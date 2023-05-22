/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import view.*;
import model.*;

/**
 *
 * @author User
 */
public class ControllerInputVaksin {
    ViewInputVaksin viewinputvaksin;
    ModelVaksin modelvaksin;

    public ControllerInputVaksin(ViewInputVaksin viewinputvaksin, ModelVaksin modelvaksin) {
        this.viewinputvaksin = viewinputvaksin;
        this.modelvaksin = modelvaksin;
        
        viewinputvaksin.btnKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {                               
                ViewMainMenu viewmainmenu =new ViewMainMenu();
                viewinputvaksin.setVisible(false);
                ControllerMainMenu Start=new ControllerMainMenu(viewmainmenu);
            }
        });
        
        viewinputvaksin.btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(viewinputvaksin.getTfnik().isEmpty()){
                    JOptionPane.showMessageDialog(null, "NIK Tidak Boleh Kosong");
                }
                else if(viewinputvaksin.getTfnama().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Nama Tidak Boleh Kosong");
                }
                else if(viewinputvaksin.getTfvaksinke().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Jumlah Vaksin Tidak Boleh Kosong");
                }
                
                else{
                    Date tanggal = viewinputvaksin.getTftanggal().getDate();
                    java.sql.Date sqlDate = new java.sql.Date(tanggal.getTime());
                    int Vaksinke = Integer.parseInt(viewinputvaksin.getTfvaksinke());
                    modelvaksin.insertData(viewinputvaksin.getTfnik(), viewinputvaksin.getTfnama(), Vaksinke, viewinputvaksin.getTfjenisvak(), sqlDate);
                }
                
            }
        });
        
        viewinputvaksin.btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {                               
                viewinputvaksin.tfnik.setText("");
                viewinputvaksin.tfnama.setText("");
                viewinputvaksin.tfvaksinke.setText("");
            }
        });
    }
}
