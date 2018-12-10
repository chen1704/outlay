/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outlay3.code;

/**
 *
 * @author core i5
 */
public class FormEditKategori extends javax.swing.JFrame {

    private Kategori kategori;
    private Integer idn;
    private String warna;
    private String icon;
    KategoriController control = new KategoriController();
    
    public void setKategori(Kategori ktgr){
        kategori = ktgr;
        id_field.setText(kategori.getIdKategori().toString());
        nama_ktgr.setText(kategori.getNamaKategori());
        warna_field.setText(kategori.getWarnaKategori());
        icon_field.setText(kategori.getIconKategori());
    }
    /**
     * Creates new form FormEditKategori
     */
    public FormEditKategori() {
        initComponents();
        initField();
    }
    private void initField(){
        id_field.setEditable(false);
        warna_field.setEditable(false);
        icon_field.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nama_ktgr = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        color_hitam = new javax.swing.JRadioButton();
        color_putih = new javax.swing.JRadioButton();
        color_red = new javax.swing.JRadioButton();
        color_yellow = new javax.swing.JRadioButton();
        color_blue = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        kendaraan = new javax.swing.JRadioButton();
        keranjang = new javax.swing.JRadioButton();
        telepon = new javax.swing.JRadioButton();
        pin = new javax.swing.JRadioButton();
        baju = new javax.swing.JRadioButton();
        trashbin = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        warna_field = new javax.swing.JTextField();
        icon_field = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        id_field = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("FormKategori");

        jLabel2.setText("nama");

        nama_ktgr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nama_ktgrActionPerformed(evt);
            }
        });

        jLabel3.setText("warna");

        buttonGroup1.add(color_hitam);
        color_hitam.setText("Hitam");
        color_hitam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                color_hitamActionPerformed(evt);
            }
        });

        buttonGroup1.add(color_putih);
        color_putih.setText("Putih");

        buttonGroup1.add(color_red);
        color_red.setText("Merah");
        color_red.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                color_redActionPerformed(evt);
            }
        });

        buttonGroup1.add(color_yellow);
        color_yellow.setText("Kuning");

        buttonGroup1.add(color_blue);
        color_blue.setText("Biru");

        jLabel4.setText("icon");

        buttonGroup2.add(kendaraan);
        kendaraan.setText("Kendaraan");
        kendaraan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kendaraanActionPerformed(evt);
            }
        });

        buttonGroup2.add(keranjang);
        keranjang.setText("Keranjang");

        buttonGroup2.add(telepon);
        telepon.setText("Telepon");

        buttonGroup2.add(pin);
        pin.setText("Pin");

        buttonGroup2.add(baju);
        baju.setText("Baju");

        buttonGroup2.add(trashbin);
        trashbin.setText("Trashbin");

        jButton1.setText("✔");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("id");

        jMenu1.setText("...");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Delete");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(kendaraan)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(id_field)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nama_ktgr, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(color_putih)
                                            .addComponent(color_hitam))
                                        .addGap(40, 40, 40)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(color_yellow)
                                            .addComponent(color_blue)))
                                    .addComponent(color_red)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(keranjang)
                                        .addGap(22, 22, 22)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(pin)
                                            .addComponent(telepon))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(trashbin)
                                            .addComponent(baju)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(icon_field, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(warna_field, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 60, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(id_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(nama_ktgr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(warna_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(color_hitam)
                    .addComponent(color_yellow))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(color_putih)
                    .addComponent(color_blue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(color_red)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(icon_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telepon)
                    .addComponent(kendaraan)
                    .addComponent(baju))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(keranjang)
                    .addComponent(trashbin)
                    .addComponent(pin))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nama_ktgrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nama_ktgrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nama_ktgrActionPerformed

    private void color_hitamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_color_hitamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_color_hitamActionPerformed

    private void color_redActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_color_redActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_color_redActionPerformed

    private void kendaraanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kendaraanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kendaraanActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        color_hitam.setActionCommand("hitam");
        color_putih.setActionCommand("putih");
        color_red.setActionCommand("merah");
        color_yellow.setActionCommand("kuning");
        color_blue.setActionCommand("biru");
        
        kendaraan.setActionCommand("kendaraan");
        keranjang.setActionCommand("keranjang");
        telepon.setActionCommand("telepon");
        pin.setActionCommand("pin");
        baju.setActionCommand("baju");
        trashbin.setActionCommand("trashbin");
        
        Integer id = Integer.parseInt(id_field.getText());
        String nama = nama_ktgr.getText();
        String color = buttonGroup1.getSelection().getActionCommand();
        String ikon = buttonGroup2.getSelection().getActionCommand();
        
        Kategori kat = new Kategori();
        kat.setId(id);
        kat.SetKategori(nama, color, ikon);
        control.editKategori(kat);
        control.openHalamanKategori();
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        Integer id = Integer.parseInt(id_field.getText());
        control.deleteKategori(id);
        control.openHalamanKategori();
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormEditKategori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormEditKategori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormEditKategori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormEditKategori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormEditKategori().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton baju;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JRadioButton color_blue;
    private javax.swing.JRadioButton color_hitam;
    private javax.swing.JRadioButton color_putih;
    private javax.swing.JRadioButton color_red;
    private javax.swing.JRadioButton color_yellow;
    private javax.swing.JTextField icon_field;
    private javax.swing.JTextField id_field;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JRadioButton kendaraan;
    private javax.swing.JRadioButton keranjang;
    private javax.swing.JTextField nama_ktgr;
    private javax.swing.JRadioButton pin;
    private javax.swing.JRadioButton telepon;
    private javax.swing.JRadioButton trashbin;
    private javax.swing.JTextField warna_field;
    // End of variables declaration//GEN-END:variables
}