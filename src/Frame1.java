/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Faiqoh
 */
public class Frame1 extends javax.swing.JFrame {

    /**
     * Creates new form Frame1
     */
    public Frame1() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jcdokter = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jtxtnama = new javax.swing.JTextField();
        jtxtalamat = new javax.swing.JTextField();
        jtxtusia = new javax.swing.JTextField();
        jtxtjenis = new javax.swing.JTextField();
        jtxtgol = new javax.swing.JTextField();
        jtxtstatus = new javax.swing.JTextField();
        jtxtkewar = new javax.swing.JTextField();
        jtxtspesial = new javax.swing.JTextField();
        jtxtwaktu = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();

        jPanel2.setBackground(new java.awt.Color(51, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("IDENTITAS"));
        jPanel2.setName(""); // NOI18N
        jPanel2.setLayout(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 255));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Pemilihan Dokter");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 20, 180, 40);

        jcdokter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih Salah Satu --", "Dr. Jessica", "Dr. Robi", "Dr. Faradia" }));
        jcdokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcdokterActionPerformed(evt);
            }
        });
        getContentPane().add(jcdokter);
        jcdokter.setBounds(160, 70, 160, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Pilih Dokter");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 80, 90, 20);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Deskripsi"));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Alamat");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 80, 90, 29);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Nama");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 30, 90, 36);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Usia");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 123, 90, 34);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Jenis Kelamin");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 170, 90, 35);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Golongan Darah");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 214, 90, 35);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Status");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 261, 90, 34);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Kewarganegaraan");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 306, 106, 36);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Waktu Praktek");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(10, 353, 90, 36);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Waktu Spesialis");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(10, 400, 90, 40);

        jtxtnama.setEnabled(false);
        jPanel1.add(jtxtnama);
        jtxtnama.setBounds(134, 28, 156, 35);

        jtxtalamat.setEnabled(false);
        jPanel1.add(jtxtalamat);
        jtxtalamat.setBounds(134, 74, 156, 38);

        jtxtusia.setEnabled(false);
        jPanel1.add(jtxtusia);
        jtxtusia.setBounds(134, 123, 156, 34);

        jtxtjenis.setEnabled(false);
        jPanel1.add(jtxtjenis);
        jtxtjenis.setBounds(134, 168, 156, 35);

        jtxtgol.setEnabled(false);
        jPanel1.add(jtxtgol);
        jtxtgol.setBounds(134, 214, 156, 35);

        jtxtstatus.setEnabled(false);
        jPanel1.add(jtxtstatus);
        jtxtstatus.setBounds(134, 260, 156, 35);

        jtxtkewar.setEnabled(false);
        jPanel1.add(jtxtkewar);
        jtxtkewar.setBounds(134, 306, 156, 36);

        jtxtspesial.setEnabled(false);
        jPanel1.add(jtxtspesial);
        jtxtspesial.setBounds(134, 353, 156, 36);

        jtxtwaktu.setEnabled(false);
        jPanel1.add(jtxtwaktu);
        jtxtwaktu.setBounds(134, 401, 156, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(50, 120, 300, 458);

        jPanel3.setBackground(new java.awt.Color(102, 255, 255));
        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 400, 600);

        setBounds(0, 0, 418, 633);
    }// </editor-fold>//GEN-END:initComponents

    private void jcdokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcdokterActionPerformed
        // TODO add your handling code here:
        if(jcdokter.getSelectedItem().equals("Dr. Jessica")){   
            jtxtnama.setText("Dr. Jessica");  
            jtxtalamat.setText("Jl. Surabaya 16, Malang"); 
            jtxtusia.setText("20 Tahun");
            jtxtjenis.setText("Perempuan");  
            jtxtgol.setText("A"); 
            jtxtstatus.setText("Belum Menikah ");   
            jtxtkewar.setText("Indonesia"); 
            jtxtspesial.setText("Dokter Umum");  
            jtxtwaktu.setText(" Pagi (07.00-15.00)");}
        else if(jcdokter.getSelectedItem().equals("Dr. Robi")){             
                jtxtnama.setText("Dr. Robi");             
                jtxtalamat.setText("Jl. Veteran 3, Malang");             
                jtxtusia.setText("20 Tahun");             
                jtxtjenis.setText("Laki-Laki");             
                jtxtgol.setText("O");             
                jtxtstatus.setText("Belum Menikah"); 
                jtxtkewar.setText("Indonesia");             
                jtxtspesial.setText("Dokter Gigi");             
                jtxtwaktu.setText(" Sore (16.00-22.00)");}
        else if(jcdokter.getSelectedItem().equals("Dr. Faradia")){             
             jtxtnama.setText("Dr. Faradia ");
             jtxtalamat.setText("Jl. Bandung 9, Malang"); 
             jtxtusia.setText("20 Tahun");            
             jtxtjenis.setText("Perempuan"); 
             jtxtgol.setText("O");    
             jtxtstatus.setText("Belum Menikah"); 
             jtxtkewar.setText("Indonesia");             
             jtxtspesial.setText("Dokter Gizi"); 
             jtxtwaktu.setText(" Malam (22.00-06.00)");         }   
    }//GEN-LAST:event_jcdokterActionPerformed

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
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JComboBox<String> jcdokter;
    private javax.swing.JTextField jtxtalamat;
    private javax.swing.JTextField jtxtgol;
    private javax.swing.JTextField jtxtjenis;
    private javax.swing.JTextField jtxtkewar;
    private javax.swing.JTextField jtxtnama;
    private javax.swing.JTextField jtxtspesial;
    private javax.swing.JTextField jtxtstatus;
    private javax.swing.JTextField jtxtusia;
    private javax.swing.JTextField jtxtwaktu;
    // End of variables declaration//GEN-END:variables
}
