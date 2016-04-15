/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.Kelas;

/**
 *
 * @author dhivazhr
 */
public class HapusKelasMahasiswa extends javax.swing.JFrame {

    /**
     * Creates new form HapusKelasMahasiswa
     */
    public HapusKelasMahasiswa() {
        initComponents();
        setTitle("Hapus Kelas");
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        comboPilihKelas = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabKelas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Pilih Kelas  :");

        btnDelete.setText("DELETE");

        btnCancel.setText("CANCEL");

        comboPilihKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPilihKelasActionPerformed(evt);
            }
        });

        tabKelas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabKelas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(comboPilihKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboPilihKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboPilihKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPilihKelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboPilihKelasActionPerformed

    /**
     * @param args the command line arguments
     * @return 
     */
    public Object getBtnCancel() {
        return btnCancel;
    }
    
    public Object getBtnDelete() {
        return btnDelete;
    }
    
    public void addListener(ActionListener a) {
        btnDelete.addActionListener(a);
        btnCancel.addActionListener(a);
        comboPilihKelas.addActionListener(a);
    }
    
 public void setHeader() {
        String[] header = {"No","Kelas","Matakuliah","Dosen"};
        DefaultTableModel model = new DefaultTableModel(null, header);
        tabKelas.setModel(model);
    }
    
    public void inputData(ArrayList<Kelas> listKelas) {
        DefaultTableModel model = (DefaultTableModel) tabKelas.getModel();
        for (int i = 0; i < listKelas.size(); i++) {
            model.addRow(new String[] {(i+1)+"",listKelas.get(i).getNamaKelas(),
                listKelas.get(i).getMatakuliah().getnamaMK(),
                listKelas.get(i).getDosen().getNama()
            });
        }
    }
    
    public void setIsiComboBox(String namaKelas) {
        comboPilihKelas.addItem(namaKelas);
    }
    
    public String getIsiComboBox() {
        return comboPilihKelas.getSelectedItem().toString();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JComboBox comboPilihKelas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabKelas;
    // End of variables declaration//GEN-END:variables
}
