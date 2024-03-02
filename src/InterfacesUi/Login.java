package InterfacesUi;


import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.*;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Login extends javax.swing.JFrame {

    
    public Login() {
        initComponents();
        /*
        ConnectionDB.getConnectionBD();
        ArrayList<Usuario> listaUsuarios = ArrayObjPassword();
        */
        this.setResizable(false);
        this.setLocationRelativeTo(null);
//        for (Usuario user : listaUsuarios){
//            System.out.println("ID: " + user.getId());
//            System.out.println("Username: " + user.getUsername());
//            System.out.println("Password: " + user.getPassword());
//            System.out.println("--------------------");
//        }

    }
    // array de usuarios que son traidos desde la bd xd
    public ArrayList ArrayObjPassword() {

        ArrayList ListUsers = new ArrayList();

//        Usuario objUsers = null;
/*
        try (Connection connection = ConnectionDB.getConnectionBD();
         PreparedStatement consulta = connection.prepareStatement("SELECT * FROM users");
         ResultSet resultad = consulta.executeQuery()) {   
            
//            PreparedStatement consulta = (PreparedStatement) this.connect.con.prepareStatement("SELECT * FROM users");
//            ResultSet resultado = consulta.executeQuery();

            while (resultad.next()) {
                objUsers = new Usuario();

                objUsers.setId_user(resultad.getInt("id_user"));
                objUsers.setUsername(resultad.getString("username"));
                objUsers.setPassword(resultad.getString("password_user"));
                
                ListUsers.add(objUsers);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
*/
        return ListUsers;
    }
    
    public int cantidad() {
        int cantUsers = 0; 

    try {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "1234");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT COUNT(*) AS total FROM users"); 
        if (rs.next()) {
            cantUsers = rs.getInt("total");
        }
        conn.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return cantUsers;
}
    
    public void limpiar() {
    txtUser.setText("");
    jpasswordUser.setText("");
    }
    
    public boolean validarDatos() {
        String user = txtUser.getText();
        String password = jpasswordUser.getText();
    /*
        ArrayList<Usuario> listaUsuarios = ArrayObjPassword(); 
    
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getUsername().equals(user) && usuario.getPassword().equals(password)) {  
            return true;
            }
        }
*/
//        JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtUser = new javax.swing.JTextField();
        jpasswordUser = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(111, 168, 220));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/imagenprincipal.png"))); // NOI18N

        jLabel2.setText("© 2024 The Old Code All rights reserved.");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Roboto", 1, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("RIAP");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel2)
                .addContainerGap(85, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel3)))
                .addGap(105, 105, 105))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(105, 105, 105)
                .addComponent(jLabel2)
                .addGap(24, 24, 24))
        );

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel4.setText("Welcome!");

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setText("User:");

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel6.setText("Password:");

        jButton1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jButton1.setText("Log in");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setForeground(new java.awt.Color(0, 0, 255));
        jButton2.setText("Do you not have an account? Click here.");
        jButton2.setBorder(null);

        txtUser.setForeground(new java.awt.Color(153, 153, 153));
        txtUser.setText("Username");
        txtUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUserFocusLost(evt);
            }
        });

        jpasswordUser.setForeground(new java.awt.Color(153, 153, 153));
        jpasswordUser.setText("************");
        jpasswordUser.setPreferredSize(new java.awt.Dimension(74, 24));
        jpasswordUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jpasswordUserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jpasswordUserFocusLost(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(298, 298, 298))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(143, 143, 143))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(306, 306, 306)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(149, 149, 149))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtUser)
                                .addComponent(jpasswordUser, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel4)
                .addGap(88, 88, 88)
                .addComponent(jLabel5)
                .addGap(14, 14, 14)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpasswordUser, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addGap(28, 28, 28)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusGained
        if (txtUser.getText().equals("Username")) {
           txtUser.setText("");
           txtUser.setForeground(new Color(153, 153, 153));
        } 
    }//GEN-LAST:event_txtUserFocusGained

    private void jpasswordUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jpasswordUserFocusGained
        if (jpasswordUser.getText().equals("************")) {
        jpasswordUser.setText("");
        jpasswordUser.setForeground(new Color(153, 153, 153));
    }
    }//GEN-LAST:event_jpasswordUserFocusGained

    private void txtUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusLost
        if (txtUser.getText().isEmpty()) {
        txtUser.setText("Username");
        txtUser.setForeground(new Color(153, 153, 153));
    }
    }//GEN-LAST:event_txtUserFocusLost

    private void jpasswordUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jpasswordUserFocusLost
        if (jpasswordUser.getText().isEmpty()) {
        jpasswordUser.setText("************");
        jpasswordUser.setForeground(new Color(153, 153, 153));
    }
    }//GEN-LAST:event_jpasswordUserFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                
//        app.setVisible(true);
//        this.dispose();
/*
        if (validarDatos() == true) {
            JOptionPane.showMessageDialog(this, "Bienvenido " + objUsers.getUsername());
            app.setVisible(true);
            this.dispose();
        }else {
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
            limpiar();
        }
*/
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        FlatIntelliJLaf.setup();
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jpasswordUser;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
