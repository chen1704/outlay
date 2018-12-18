/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outlay3.code;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author core i5
 */
public class FormKategori extends javax.swing.JFrame {
    KategoriController control = new KategoriController();

    /**
     * Creates new form FormKategori
     */
    public FormKategori() {
        initComponents();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Checklist = new javax.swing.JButton();
        nama_ktgr = new javax.swing.JTextField();
        color_hitam = new javax.swing.JRadioButton();
        color_white = new javax.swing.JRadioButton();
        color_red = new javax.swing.JRadioButton();
        color_yellow = new javax.swing.JRadioButton();
        color_blue = new javax.swing.JRadioButton();
        kendaraan = new javax.swing.JRadioButton();
        keranjang = new javax.swing.JRadioButton();
        telepon = new javax.swing.JRadioButton();
        pin = new javax.swing.JRadioButton();
        baju = new javax.swing.JRadioButton();
        trashbin = new javax.swing.JRadioButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        TitikTiga = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("FormKategori");

        jLabel2.setText("nama");

        jLabel3.setText("warna");

        jLabel4.setText("icon");

        Checklist.setText("✔");
        Checklist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChecklistActionPerformed(evt);
            }
        });

        buttonGroup1.add(color_hitam);
        color_hitam.setText("Hitam");
        color_hitam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                color_hitamActionPerformed(evt);
            }
        });

        buttonGroup1.add(color_white);
        color_white.setText("Putih");
        color_white.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                color_whiteActionPerformed(evt);
            }
        });

        buttonGroup1.add(color_red);
        color_red.setText("Merah");
        color_red.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                color_redActionPerformed(evt);
            }
        });

        buttonGroup1.add(color_yellow);
        color_yellow.setText("Kuning");
        color_yellow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                color_yellowActionPerformed(evt);
            }
        });

        buttonGroup1.add(color_blue);
        color_blue.setText("Biru");
        color_blue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                color_blueActionPerformed(evt);
            }
        });

        buttonGroup2.add(kendaraan);
        kendaraan.setText("Kendaraan");

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

        TitikTiga.setText("...");
        TitikTiga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TitikTigaMouseClicked(evt);
            }
        });

        jMenuItem1.setText("Delete");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        TitikTiga.add(jMenuItem1);

        jMenuBar1.add(TitikTiga);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Checklist)
                .addGap(72, 72, 72))
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2))
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(color_red)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(color_hitam)
                            .addComponent(color_white))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(color_blue)
                            .addComponent(color_yellow)))
                    .addComponent(nama_ktgr, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kendaraan)
                            .addComponent(keranjang))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telepon)
                            .addComponent(pin))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(trashbin)
                            .addComponent(baju))))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nama_ktgr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(color_hitam)
                    .addComponent(color_yellow))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(color_white)
                    .addComponent(color_blue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(color_red)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(kendaraan)
                    .addComponent(telepon)
                    .addComponent(baju))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(keranjang)
                    .addComponent(pin)
                    .addComponent(trashbin))
                .addGap(21, 21, 21)
                .addComponent(Checklist)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TitikTigaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TitikTigaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TitikTigaMouseClicked

    private void color_hitamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_color_hitamActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_color_hitamActionPerformed

    private void color_whiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_color_whiteActionPerformed
        // TODO add your handling code here:
       // Kategori ktgr = new Kategori();
        //ktgr.setWarnaKategori("putih");
    }//GEN-LAST:event_color_whiteActionPerformed

    private void color_redActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_color_redActionPerformed
        // TODO add your handling code here:
        Kategori ktgr = new Kategori();
        //ktgr.setWarnaKategori("merah");
    }//GEN-LAST:event_color_redActionPerformed

    private void color_yellowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_color_yellowActionPerformed
        
    }//GEN-LAST:event_color_yellowActionPerformed

    private void color_blueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_color_blueActionPerformed
        
    }//GEN-LAST:event_color_blueActionPerformed

    private void ChecklistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChecklistActionPerformed
        // TODO add your handling code here:
        color_hitam.setActionCommand("hitam");
        color_white.setActionCommand("putih");
        color_red.setActionCommand("merah");
        color_yellow.setActionCommand("kuning");
        color_blue.setActionCommand("biru");
        
        kendaraan.setActionCommand("kendaraan");
        keranjang.setActionCommand("keranjang");
        telepon.setActionCommand("telepon");
        pin.setActionCommand("pin");
        baju.setActionCommand("baju");
        trashbin.setActionCommand("trashbin");
        
        Kategori kategori = new Kategori();
        String nama = nama_ktgr.getText();
        String warna = buttonGroup1.getSelection().getActionCommand();
        String icon = buttonGroup2.getSelection().getActionCommand();
        
        kategori.SetKategori(nama, warna, icon);
        control.addKategori(kategori);
        control.openHalamanKategori();
        this.setVisible(false);
       
        /*try{
            Connection cn = outlay2.db.connector.getConnection();
            String query = "insert into kategori(nama_kategori, warna_kategori, icon_kategori) values(?,?,?)";
            PreparedStatement ps = cn.prepareStatement(query);
            ps.setString(1, nama_ktgr.getText());
            ps.setString(2, buttonGroup1.getSelection().getActionCommand());
            ps.setString(3, buttonGroup2.getSelection().getActionCommand());
            ps.executeUpdate();
            
            
        }*/
    }//GEN-LAST:event_ChecklistActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(FormKategori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormKategori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormKategori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormKategori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormKategori().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Checklist;
    private javax.swing.JMenu TitikTiga;
    private javax.swing.JRadioButton baju;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JRadioButton color_blue;
    private javax.swing.JRadioButton color_hitam;
    private javax.swing.JRadioButton color_red;
    private javax.swing.JRadioButton color_white;
    private javax.swing.JRadioButton color_yellow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JRadioButton kendaraan;
    private javax.swing.JRadioButton keranjang;
    private javax.swing.JTextField nama_ktgr;
    private javax.swing.JRadioButton pin;
    private javax.swing.JRadioButton telepon;
    private javax.swing.JRadioButton trashbin;
    // End of variables declaration//GEN-END:variables
}
