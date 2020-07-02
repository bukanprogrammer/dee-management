package com.dedeirwanto.app;

import java.awt.HeadlessException;
import java.util.Date;
import javax.swing.JOptionPane;

public class AddTransaksi extends javax.swing.JFrame {

    public AddTransaksi() {
        initComponents();
        setTitle("DeeManagement - Add Transaksi");
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        calTglTransaksi = new com.toedter.calendar.JDateChooser();
        cbJnsTransaksi = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNmlTransaksi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taKetTransaksi = new javax.swing.JTextArea();
        btnSmpnTransaksi = new javax.swing.JButton();
        batalTransaksi = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Tanggal");

        calTglTransaksi.setDateFormatString("dd-MM-y");

        cbJnsTransaksi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih--", "Pemasukan", "Pengeluaran" }));
        cbJnsTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbJnsTransaksiActionPerformed(evt);
            }
        });

        jLabel3.setText("Jenis");

        jLabel4.setText("Nominal (Rp.)");

        txtNmlTransaksi.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNmlTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNmlTransaksiActionPerformed(evt);
            }
        });

        jLabel5.setText("Keterangan");

        taKetTransaksi.setColumns(20);
        taKetTransaksi.setRows(5);
        jScrollPane1.setViewportView(taKetTransaksi);

        btnSmpnTransaksi.setText("Simpan");
        btnSmpnTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSmpnTransaksiActionPerformed(evt);
            }
        });

        batalTransaksi.setText("Batal");
        batalTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalTransaksiActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel2.setText("INPUT TRANSAKSI");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSmpnTransaksi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(batalTransaksi)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(377, 377, 377))
                    .addComponent(calTglTransaksi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(404, 404, 404))
                    .addComponent(cbJnsTransaksi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(342, 342, 342))
                    .addComponent(txtNmlTransaksi)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(297, 297, 297))
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {batalTransaksi, btnSmpnTransaksi});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(calTglTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbJnsTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNmlTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSmpnTransaksi)
                    .addComponent(batalTransaksi))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {batalTransaksi, btnSmpnTransaksi});

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jMenu1.setText("Transaksi");

        jMenuItem3.setText("Input");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Daftar/Cetak");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Jurnal");

        jMenuItem1.setText("Umum");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Khusus");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void txtNmlTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNmlTransaksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNmlTransaksiActionPerformed

    private void batalTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalTransaksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_batalTransaksiActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void cbJnsTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbJnsTransaksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbJnsTransaksiActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        new ListTransaksi().setVisible(true);
        AddTransaksi at = new AddTransaksi();
        at.setVisible(false);
        dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void btnSmpnTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSmpnTransaksiActionPerformed
        // Simpan transaksi
        try {        
            Integer jenis = null;
            
            // Get value from field
            Date tglTransaksi = calTglTransaksi.getDate();

            String jnsTransaksi = cbJnsTransaksi.getSelectedItem().toString();

            String nmlTransaksi = txtNmlTransaksi.getText();
            
            String ketTransaksi = taKetTransaksi.getText();
            
            // Initialized TransaksiDao class
            TransaksiDao td = new TransaksiDao();            
            
            // Field verification
            if(tglTransaksi == null) {
                JOptionPane.showMessageDialog(null, "Tanggal transaksi harus diisi","Gagal!", JOptionPane.ERROR_MESSAGE);
            } else if(jnsTransaksi == null || "--Pilih--".equals(jnsTransaksi)) {
                JOptionPane.showMessageDialog(null, "Jenis transaksi harus dipilih","Gagal!", JOptionPane.ERROR_MESSAGE);
            } else if(nmlTransaksi.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Nominal transaksi harus diisi","Gagal!", JOptionPane.ERROR_MESSAGE);
            } else if(ketTransaksi.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Keterangan transaksi harus diisi","Gagal!", JOptionPane.ERROR_MESSAGE);
            } else {
                
                // convert jnsTransaksi to integer with condition
                switch(jnsTransaksi) {
                    case "Pemasukan":
                        jenis = 1;
                        break;
                    case "Pengeluaran":
                        jenis = 2;
                        break;
                }
                
                // Add transaksi to database
                td.addTransaksi(tglTransaksi, jenis, nmlTransaksi, ketTransaksi); 
                
                // Success message
                JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan!", "Berhasil!", JOptionPane.CLOSED_OPTION);
            
                // Clear field
                calTglTransaksi.setDate(null);
                cbJnsTransaksi.setSelectedItem(null);
                txtNmlTransaksi.setText("");
                taKetTransaksi.setText("");
            }            
            
        } catch(HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
    }//GEN-LAST:event_btnSmpnTransaksiActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AddTransaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton batalTransaksi;
    private javax.swing.JButton btnSmpnTransaksi;
    private com.toedter.calendar.JDateChooser calTglTransaksi;
    private javax.swing.JComboBox<String> cbJnsTransaksi;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea taKetTransaksi;
    private javax.swing.JTextField txtNmlTransaksi;
    // End of variables declaration//GEN-END:variables

}
