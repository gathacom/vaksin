/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.ModelVaksin;
import login.*;
import view.*;
/**
 *
 * @author User
 */
public class ControllerMainMenu {
    ViewMainMenu viewmainmenu;

    public ControllerMainMenu(ViewMainMenu viewmainmenu) {
        this.viewmainmenu = viewmainmenu;
        
        viewmainmenu.btnTambah.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {                               
                ModelVaksin modelvaksin = new ModelVaksin();
                ViewInputVaksin inputvaksin= new ViewInputVaksin();
                viewmainmenu.setVisible(false);
                ControllerInputVaksin inputvaksinController=new ControllerInputVaksin(inputvaksin,modelvaksin);
            }
        });
        
        viewmainmenu.btnLihat.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) { 
                ViewLihatVaksin lihatvaksin= new ViewLihatVaksin();
                ModelVaksin modelvaksin = new ModelVaksin();
                viewmainmenu.setVisible(false);
                ControllerLihatVaksin lihatvaksinController =new ControllerLihatVaksin(lihatvaksin,modelvaksin);
            }
        });
    }
}
