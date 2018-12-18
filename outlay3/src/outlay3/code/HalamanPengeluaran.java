/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outlay3.code;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author core i5
 */
public class HalamanPengeluaran extends javax.swing.JFrame {
    private static final String USERNAME="root";
    private static final String PASSWORD="";
    private static final String CONN_STRING="jdbc:mysql://localhost:3306/outlay";
    PengeluaranControl control = new PengeluaranControl();
    /**
     * Creates new form HalamanPengeluaran
     */
    public HalamanPengeluaran() {
        initComponents();
        show_table();
    }

    private void show_table(){
        Connection conn;
        try {
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            //stmt = conn.createStatement();
            String sql = "select pengeluaran.id_pengeluaran, pengeluaran.nominal_pengeluaran, kategori.nama_kategori, deskripsi.detail_deskripsi, pengeluaran.date from pengeluaran, deskripsi, kategori where pengeluaran.id_deskripsi = deskripsi.id_deskripsi and pengeluaran.date = CURDATE() and kategori.id_kategori = pengeluaran.id_kategori";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            pengeluaran_today.setModel(DbUtils.resultSetToTableModel(rs));
            
           
        } catch(SQLException e){
            System.err.println(e);
        }   
    }
    
    private void show_tableweek(){
        Connection conn;
        try {
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            //stmt = conn.createStatement();
            String sql = "select pengeluaran.id_pengeluaran, pengeluaran.nominal_pengeluaran, kategori.nama_kategori, deskripsi.detail_deskripsi, pengeluaran.date from pengeluaran, deskripsi, kategori where pengeluaran.id_deskripsi = deskripsi.id_deskripsi and YEARWEEK(pengeluaran.date) = YEARWEEK(SYSDATE()) and kategori.id_kategori = pengeluaran.id_kategori";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            pengeluaran_today.setModel(DbUtils.resultSetToTableModel(rs));
            
           
        } catch(SQLException e){
            System.err.println(e);
        }   
    }
    
    private void show_tablemonth(){
        Connection conn;
        try {
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            //stmt = conn.createStatement();
            String sql = "select pengeluaran.id_pengeluaran, pengeluaran.nominal_pengeluaran, kategori.nama_kategori, deskripsi.detail_deskripsi, pengeluaran.date from pengeluaran, deskripsi, kategori where pengeluaran.id_deskripsi = deskripsi.id_deskripsi and EXTRACT(MONTH from pengeluaran.date) = EXTRACT(MONTH from SYSDATE()) and kategori.id_kategori = pengeluaran.id_kategori";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            pengeluaran_today.setModel(DbUtils.resultSetToTableModel(rs));
            
           
        } catch(SQLException e){
            System.err.println(e);
        }   
    }
    
    private void show_tableall(){
        Connection conn;
        try {
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            //stmt = conn.createStatement();
            String sql = "select pengeluaran.id_pengeluaran, pengeluaran.nominal_pengeluaran, kategori.nama_kategori, deskripsi.detail_deskripsi, pengeluaran.date from pengeluaran, deskripsi, kategori where pengeluaran.id_deskripsi = deskripsi.id_deskripsi and kategori.id_kategori = pengeluaran.id_kategori";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            pengeluaran_today.setModel(DbUtils.resultSetToTableModel(rs));
            
           
        } catch(SQLException e){
            System.err.println(e);
        }   
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
        jScrollPane1 = new javax.swing.JScrollPane();
        pengeluaran_today = new javax.swing.JTable();
        back = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        Week = new javax.swing.JMenu();
        Month = new javax.swing.JMenu();
        List = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("HalamanPengeluaran");

        pengeluaran_today.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nominal", "Kategori", "Deskripsi", "Waktu"
            }
        ));
        pengeluaran_today.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pengeluaran_todayMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(pengeluaran_today);

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        Week.setText("Week");
        Week.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WeekMouseClicked(evt);
            }
        });
        jMenuBar1.add(Week);

        Month.setText("Month");
        Month.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MonthMouseClicked(evt);
            }
        });
        jMenuBar1.add(Month);

        List.setText("List");
        List.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListMouseClicked(evt);
            }
        });
        jMenuBar1.add(List);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(back))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pengeluaran_todayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pengeluaran_todayMouseClicked
        // TODO add your handling code here:
        int idx = pengeluaran_today.getSelectedRow();
        TableModel model = pengeluaran_today.getModel();
        String id_pengeluaran = model.getValueAt(idx, 0).toString();
        control.openFormDeskripsi(id_pengeluaran);
        this.setVisible(false);
    }//GEN-LAST:event_pengeluaran_todayMouseClicked

    private void MonthMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MonthMouseClicked
        // TODO add your handling code here:
        show_tablemonth();
    }//GEN-LAST:event_MonthMouseClicked

    private void WeekMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WeekMouseClicked
        // TODO add your handling code here:
        show_tableweek();
    }//GEN-LAST:event_WeekMouseClicked

    private void ListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListMouseClicked
        // TODO add your handling code here:
        show_tableall();
    }//GEN-LAST:event_ListMouseClicked

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        control.openHalamanUtama();
        this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(HalamanPengeluaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HalamanPengeluaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HalamanPengeluaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HalamanPengeluaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HalamanPengeluaran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu List;
    private javax.swing.JMenu Month;
    private javax.swing.JMenu Week;
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable pengeluaran_today;
    // End of variables declaration//GEN-END:variables
}
