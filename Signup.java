package train;

import java.sql.*;
import javax.swing.JOptionPane;

public class Signup extends javax.swing.JFrame {

    Connection cn;
    Statement st;
    ResultSet rs;
    int i = 0;

    public void MyConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost;instance=lallyinfosys;databaseName=Trains;user=mk;password=123";
            cn = DriverManager.getConnection(url);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }

    public Signup() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPass1 = new javax.swing.JPasswordField();
        jPass2 = new javax.swing.JPasswordField();
        jText1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jCombo = new javax.swing.JComboBox<>();
        jText2 = new javax.swing.JTextField();
        jText3 = new javax.swing.JTextField();
        jText4 = new javax.swing.JTextField();
        jText5 = new javax.swing.JTextField();
        jregister = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 150));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("User Registeration");

        jLabel2.setText("Username");

        jLabel3.setText("Password");

        jLabel4.setText("Retype Password");

        jLabel5.setText("Hint Question");

        jLabel6.setText("Hint Password");

        jLabel7.setText("Email Id");

        jLabel8.setText("Pincode");

        jLabel9.setText("Mobile No.");

        jCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What is Your Nickname?", "Which is Your Fav. Colour?", "Who is Your Best Friend?" }));
        jCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboActionPerformed(evt);
            }
        });

        jText3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText3ActionPerformed(evt);
            }
        });

        jregister.setText("Register");
        jregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jregisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jText1, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                .addComponent(jPass1)
                                .addComponent(jPass2))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jCombo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jText5, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jText4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jText3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jText2, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jregister, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jPass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jText2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jText3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jText4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jText5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jregister)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jregisterActionPerformed

        try {
            MyConnection();
            st = cn.createStatement();
            String n = new String(jPass1.getPassword());
            String o = new String(jPass2.getPassword());
            if ((jText1.getText().equals("")) || (jText2.getText().equals("")) || (jText3.getText().equals(""))
                    || (jText4.getText().equals("")) || (jText5.getText().equals(""))
                    || (n.equals("")) || (o.equals(""))) {
                JOptionPane.showMessageDialog(this, "Please enter all fields");

            } else {

                if (n.equals(o)) {
                    //String sql = "Select * From Register";
                    //rs = st.executeQuery(sql);

                    String checkemail = "Select * From Register where Email='" + jText3.getText() + "'";
                    rs = st.executeQuery(checkemail);
                    if (!rs.next()) {

                        String checkuser = "Select * From Register where Username='" + jText1.getText() + "'";
                        rs = st.executeQuery(checkuser);
                        if (rs.next()) {
                            JOptionPane.showMessageDialog(this, "Username existing");
                            jText1.setText("");
                            jText1.grabFocus();
                        } else {
                            st.executeUpdate("insert into Register(UserName,Password,HintQuestion,HintPassword,Email,Pincode,Mobile) values ('" + jText1.getText() + "',"
                                    + "'" + n + "','" + jCombo.getSelectedItem() + "','" + jText2.getText() + "','" + jText3.getText() + "' ,'" + jText4.getText() + "','" + jText5.getText() + "')");
                            JOptionPane.showMessageDialog(this, "Record Inserted");
                            this.setVisible(false);
                            new User().setVisible(true);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Email existing");
                        jText3.setText("");
                        jText3.grabFocus();
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Please enter same password ");
                }

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        } finally {
            try {
                rs.close();
                cn.close();
            } catch (Exception e) {
            }
        }

    }//GEN-LAST:event_jregisterActionPerformed

    private void jText3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText3ActionPerformed

    private void jComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboActionPerformed

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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPass1;
    private javax.swing.JPasswordField jPass2;
    private javax.swing.JTextField jText1;
    private javax.swing.JTextField jText2;
    private javax.swing.JTextField jText3;
    private javax.swing.JTextField jText4;
    private javax.swing.JTextField jText5;
    private javax.swing.JButton jregister;
    // End of variables declaration//GEN-END:variables
}
