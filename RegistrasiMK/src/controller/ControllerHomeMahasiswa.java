/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Aplikasi;
import view.HomeMahasiswa;

/**
 *
 * @author M. Yuslan Abubakar
 */
public class ControllerHomeMahasiswa implements ActionListener {
    private Aplikasi app;
    private HomeMahasiswa view;
    
    public ControllerHomeMahasiswa() {
        app = new Aplikasi();
        view = new HomeMahasiswa();
        view.setVisible(true);
        view.addListener(this);
        view.setListKelas(view.getMahasiswa().getAllKelas().toArray(new String[0]));
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        
        String semester = Integer.toString(view.getMahasiswa().getSemester());
        view.setTxFieldNim(view.getMahasiswa().getID());
        view.setTxFieldNama(view.getMahasiswa().getNama());
        view.setTxFieldJurusan(view.getMahasiswa().getJurusan());
        view.setTxFieldSemester(semester);
        
        
    }
    
}
