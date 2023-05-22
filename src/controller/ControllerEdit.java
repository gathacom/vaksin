/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import view.*;
import model.*;
/**
 *
 * @author User
 */
public class ControllerEdit {
    ViewInputVaksin viv;
    ModelVaksin mv;
    String nik;

    public ControllerEdit(ViewInputVaksin viv, ModelVaksin mv, String nik) throws ParseException {
        this.viv = viv;
        this.mv = mv;
        this.nik = nik;
        
        String detailVaksin[]=mv.detailVaksin(nik); 
                viv.tfnik.setText(nik);
                viv.tfnik.setEnabled(false);
                viv.tfnama.setText(detailVaksin[1]);
                viv.tfvaksinke.setText(detailVaksin[2]);
                viv.jenisvak.setSelectedItem(detailVaksin[3]);
                SimpleDateFormat date = new SimpleDateFormat("yyyy-M-dd");
                
                java.util.Date tanggal = date.parse(detailVaksin[4]);
               
                viv.tftanggal.setDate(tanggal);
        viv.btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                java.sql.Date tanggal = new java.sql.Date(viv.tftanggal.getDate().getTime());
                int Vaksinke = Integer.parseInt(viv.getTfvaksinke());
                mv.updateData(viv.getTfnik(), viv.getTfnama(), Vaksinke, viv.getTfjenisvak(), tanggal);   
                ViewLihatVaksin vlb=new ViewLihatVaksin();
                viv.setVisible(false);
                ControllerLihatVaksin Start=new ControllerLihatVaksin(vlb, mv);
            }
        });
        
        viv.btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                viv.tfnik.setText("");
                viv.tfnama.setText("");
                viv.tfvaksinke.setText("");
            }
        });
        
        viv.btnKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ViewLihatVaksin vlv=new ViewLihatVaksin();
                viv.setVisible(false);
                ControllerLihatVaksin Start=new ControllerLihatVaksin(vlv, mv);
            }
        });
    }
}
