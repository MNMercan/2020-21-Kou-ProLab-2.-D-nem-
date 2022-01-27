
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author numan
 */
public class SanatciTablosu extends javax.swing.JDialog {

    DefaultTableModel model;
    SanatciIslemleri islemler = new SanatciIslemleri();

    /**
     * Creates new form SanatciTablosu
     */
    public SanatciTablosu(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        model = (DefaultTableModel) sanatci_tablosu.getModel();
        sanatcilariGoruntule();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        sanatci_tablosu = new javax.swing.JTable();
        arama_cubugu = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sanatci_adi = new javax.swing.JTextField();
        ulke = new javax.swing.JTextField();
        sanatciEkleButon = new javax.swing.JButton();
        sanatciGuncelleButon = new javax.swing.JButton();
        sanatciSilButon = new javax.swing.JButton();
        mesaj_yazisi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(450, 250, 0, 0));

        sanatci_tablosu.setBackground(new java.awt.Color(153, 153, 153));
        sanatci_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "sanatci_adi", "ulke"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        sanatci_tablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sanatci_tablosuMouseClicked(evt);
            }
        });
        sanatci_tablosu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sanatci_tablosuKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(sanatci_tablosu);
        if (sanatci_tablosu.getColumnModel().getColumnCount() > 0) {
            sanatci_tablosu.getColumnModel().getColumn(0).setResizable(false);
            sanatci_tablosu.getColumnModel().getColumn(1).setResizable(false);
            sanatci_tablosu.getColumnModel().getColumn(2).setResizable(false);
        }

        arama_cubugu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arama_cubuguActionPerformed(evt);
            }
        });
        arama_cubugu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                arama_cubuguKeyReleased(evt);
            }
        });

        jLabel1.setText("Sanatci adi :");

        jLabel2.setText("Sanatci ulkesi :");

        sanatci_adi.setBackground(new java.awt.Color(255, 204, 204));

        ulke.setBackground(new java.awt.Color(255, 204, 204));

        sanatciEkleButon.setBackground(new java.awt.Color(255, 204, 153));
        sanatciEkleButon.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        sanatciEkleButon.setText("Sanatci Ekle");
        sanatciEkleButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sanatciEkleButonActionPerformed(evt);
            }
        });

        sanatciGuncelleButon.setBackground(new java.awt.Color(255, 204, 153));
        sanatciGuncelleButon.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        sanatciGuncelleButon.setText("Sanatci Guncelle");
        sanatciGuncelleButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sanatciGuncelleButonActionPerformed(evt);
            }
        });

        sanatciSilButon.setBackground(new java.awt.Color(255, 204, 153));
        sanatciSilButon.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        sanatciSilButon.setText("Sanatci Sil");
        sanatciSilButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sanatciSilButonActionPerformed(evt);
            }
        });

        mesaj_yazisi.setForeground(new java.awt.Color(204, 0, 0));
        mesaj_yazisi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mesaj_yazisi.setText("--------------------");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ulke, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(sanatci_adi, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(sanatciGuncelleButon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sanatciEkleButon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sanatciSilButon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 47, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(mesaj_yazisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1)
                            .addComponent(arama_cubugu, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(arama_cubugu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(sanatci_adi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(ulke, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(sanatciEkleButon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sanatciGuncelleButon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sanatciSilButon)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(mesaj_yazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void arama_cubuguActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arama_cubuguActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arama_cubuguActionPerformed

    public void dinamikAra(String ara) {

        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);

        sanatci_tablosu.setRowSorter(tr);

        tr.setRowFilter(RowFilter.regexFilter(ara));

    }

    private void arama_cubuguKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_arama_cubuguKeyReleased
        String ara = arama_cubugu.getText();

        dinamikAra(ara);
    }//GEN-LAST:event_arama_cubuguKeyReleased

    private void sanatciEkleButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sanatciEkleButonActionPerformed
          mesaj_yazisi.setText("");
          
          String sanatciAdi = sanatci_adi.getText();
          String sanatciUlke = ulke.getText();
          
          islemler.sanatciEkle(sanatciAdi,sanatciUlke);
          
          sanatcilariGoruntule();
          mesaj_yazisi.setText("Yeni sanatci eklendi");
    }//GEN-LAST:event_sanatciEkleButonActionPerformed

    private void sanatci_tablosuKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sanatci_tablosuKeyReleased
        
    }//GEN-LAST:event_sanatci_tablosuKeyReleased

    private void sanatci_tablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sanatci_tablosuMouseClicked
        int selected_row = sanatci_tablosu.getSelectedRow();
        
        sanatci_adi.setText(model.getValueAt(selected_row, 1).toString());
        ulke.setText(model.getValueAt(selected_row, 2).toString());
    }//GEN-LAST:event_sanatci_tablosuMouseClicked

    private void sanatciGuncelleButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sanatciGuncelleButonActionPerformed
        String sanatciAdi = sanatci_adi.getText();
        String sanatciUlke = ulke.getText();
        
        int selected_row = sanatci_tablosu.getSelectedRow();
        if (selected_row == -1) {
            if (model.getRowCount() == 0) {
                mesaj_yazisi.setText("Tablo suan da bos");
            } else {
                mesaj_yazisi.setText("Lutfen tablodan guncellenek sanatci secin");
            }
        }else{
            int id = (int) model.getValueAt(selected_row, 0);
            islemler.sanatciGuncelle(id, sanatciAdi, sanatciUlke);
            sanatcilariGoruntule();
            mesaj_yazisi.setText("Sanatci bilgileri guncellenmistir");
        }
    }//GEN-LAST:event_sanatciGuncelleButonActionPerformed

    private void sanatciSilButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sanatciSilButonActionPerformed
        mesaj_yazisi.setText("");

        int selectedrow = sanatci_tablosu.getSelectedRow();

        if (selectedrow == -1) {
            if (model.getRowCount() == 0) {
                mesaj_yazisi.setText("Sanatci tablosu suan bos");
            } else {
                mesaj_yazisi.setText("Silicenek sanatciyi secin");
            }
        }else{
            int id = (int) model.getValueAt(selectedrow, 0);
            
            islemler.sanatciSil(id);
            sanatcilariGoruntule();
            mesaj_yazisi.setText("Sanatci silinmistir");
        }
    }//GEN-LAST:event_sanatciSilButonActionPerformed

    /**
     * @param args the command line arguments
     */
    public void sanatcilariGoruntule() {
        model.setRowCount(0);

        ArrayList<Sanatcilar> sanatcilar = new ArrayList<Sanatcilar>();

        sanatcilar = islemler.sanatcilariGetir();

        if (sanatcilar != null) {

            for (Sanatcilar sanatci : sanatcilar) {
                Object[] eklenecek = {sanatci.getId(), sanatci.getSanatci_adi(), sanatci.getUlke()};
                model.addRow(eklenecek);
            }

        }

    }

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
            java.util.logging.Logger.getLogger(SanatciTablosu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SanatciTablosu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SanatciTablosu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SanatciTablosu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SanatciTablosu dialog = new SanatciTablosu(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField arama_cubugu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel mesaj_yazisi;
    private javax.swing.JButton sanatciEkleButon;
    private javax.swing.JButton sanatciGuncelleButon;
    private javax.swing.JButton sanatciSilButon;
    private javax.swing.JTextField sanatci_adi;
    private javax.swing.JTable sanatci_tablosu;
    private javax.swing.JTextField ulke;
    // End of variables declaration//GEN-END:variables
}
