/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.*;
import model.*;
/**
 *
 * @author User
 */
public class ControllerBarisData {
    ViewBarisData vehv;
    String nik;
    ModelVaksin mv;

    public ControllerBarisData(ViewBarisData vehv, String nik, ModelVaksin mv) {
        this.vehv = vehv;
        this.nik = nik;
        this.mv = mv;
        String detailVaksin[]=mv.detailVaksin(nik);
                vehv.l2NIK.setText(nik);
                vehv.l2Nama.setText(detailVaksin[1]);
                vehv.l2Vaksinke.setText(detailVaksin[2]);
                vehv.l2Jenisvak.setText(detailVaksin[3]);
                vehv.l2Tanggal.setText(detailVaksin[4]);
                
        vehv.btnKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {                               
                ViewLihatVaksin vlv=new ViewLihatVaksin();
                vehv.setVisible(false);
                ControllerLihatVaksin Start=new ControllerLihatVaksin(vlv, mv);
            }
        });
        vehv.btnHapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {                               
                int input = JOptionPane.showConfirmDialog(null,
                        "Apa anda ingin menghapus data Vaksin dengan NIK " + nik + "?", "Pilih Opsi...", JOptionPane.YES_NO_OPTION);

                if (input == 0) {
                    mv.deleteData(nik);    
                    ViewLihatVaksin vlv=new ViewLihatVaksin();
                    vehv.setVisible(false);
                    ControllerLihatVaksin lbc=new ControllerLihatVaksin(vlv, mv);
                } else {
                    JOptionPane.showMessageDialog(null, "Tidak Jadi Dihapus");
                }
            }
        });
        
        vehv.btnEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {                               
                ViewInputVaksin vib=new ViewInputVaksin();
                
                vehv.setVisible(false);
                try {
                    ControllerEdit editController = new ControllerEdit(vib,mv,nik);
                } catch (ParseException ex) {
                    Logger.getLogger(ControllerBarisData.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
}
