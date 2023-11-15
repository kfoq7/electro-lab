package views;

import controllers.LoginController;
import java.sql.SQLException;
import lib.utils.ErrorHandler;
import models.User;

public class Login extends javax.swing.JFrame {

    private User user;
    private MainFrame mainFrame;
    private LoginController loginController;

    public Login() throws SQLException {
        initComponents();

        loginController = new LoginController();

        setResizable(false);
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

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        UCV = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        LabelInit = new javax.swing.JLabel();
        LabelPass = new javax.swing.JLabel();
        textUsername = new javax.swing.JTextField();
        LabelUSer = new javax.swing.JLabel();
        textPassword = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        loginButton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(30, 29, 38));

        jPanel2.setBackground(new java.awt.Color(30, 29, 38));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(664, 629));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Noto Sans", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(48, 42, 42));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CÉSAR VALLEJO");
        jLabel3.setAlignmentX(724.0F);
        jLabel3.setAlignmentY(167.0F);
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 470, -1));

        UCV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image 20.png"))); // NOI18N
        jPanel3.add(UCV, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 20, 170, 120));

        jLabel4.setFont(new java.awt.Font("Noto Sans", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(48, 42, 42));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ELECTRONICA");
        jLabel4.setAlignmentX(724.0F);
        jLabel4.setAlignmentY(167.0F);
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 470, -1));

        jLabel5.setFont(new java.awt.Font("Noto Sans", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(48, 42, 42));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("UNIVERSIDAD");
        jLabel5.setAlignmentX(724.0F);
        jLabel5.setAlignmentY(167.0F);
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 470, -1));

        jLabel6.setFont(new java.awt.Font("Noto Sans", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(48, 42, 42));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("LABORATORIO DE");
        jLabel6.setAlignmentX(724.0F);
        jLabel6.setAlignmentY(167.0F);
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 470, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image 24.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        LabelInit.setFont(new java.awt.Font("Noto Sans", 1, 96)); // NOI18N
        LabelInit.setForeground(new java.awt.Color(255, 255, 255));
        LabelInit.setText("Bienvenido");
        LabelInit.setAlignmentX(724.0F);
        LabelInit.setAlignmentY(23.0F);
        LabelInit.setPreferredSize(new java.awt.Dimension(530, 137));
        jPanel2.add(LabelInit, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 560, -1));

        LabelPass.setFont(new java.awt.Font("Noto Sans", 0, 32)); // NOI18N
        LabelPass.setForeground(new java.awt.Color(255, 255, 255));
        LabelPass.setText("Contraseña");
        LabelPass.setAlignmentX(724.0F);
        LabelPass.setAlignmentY(167.0F);
        jPanel2.add(LabelPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(724, 314, -1, -1));

        textUsername.setBackground(new java.awt.Color(30, 29, 38));
        textUsername.setForeground(new java.awt.Color(255, 255, 255));
        textUsername.setAlignmentX(724.0F);
        textUsername.setAlignmentY(218.0F);
        textUsername.setPreferredSize(new java.awt.Dimension(515, 69));
        jPanel2.add(textUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(724, 218, -1, -1));

        LabelUSer.setFont(new java.awt.Font("Noto Sans", 0, 32)); // NOI18N
        LabelUSer.setForeground(new java.awt.Color(255, 255, 255));
        LabelUSer.setText("Usuario");
        LabelUSer.setAlignmentX(724.0F);
        LabelUSer.setAlignmentY(167.0F);
        jPanel2.add(LabelUSer, new org.netbeans.lib.awtextra.AbsoluteConstraints(724, 167, -1, -1));

        textPassword.setBackground(new java.awt.Color(30, 29, 38));
        textPassword.setForeground(new java.awt.Color(255, 255, 255));
        textPassword.setPreferredSize(new java.awt.Dimension(515, 69));
        jPanel2.add(textPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(724, 365, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 124, 195));

        loginButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginButton.setText("Login");
        loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loginButtonMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginButton, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginButton, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 490, 230, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1307, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMousePressed
        String username = textUsername.getText();
        String password = textPassword.getText();

        try {
            user = loginController.login(username, password);

            mainFrame = new MainFrame(user);
            mainFrame.setVisible(true);
            dispose();
        } catch (Exception ex) {
            ErrorHandler.formException(ex);
        }
    }//GEN-LAST:event_loginButtonMousePressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Login().setVisible(true);
                } catch (SQLException ex) {
                    ErrorHandler.formException(ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelInit;
    private javax.swing.JLabel LabelPass;
    private javax.swing.JLabel LabelUSer;
    private javax.swing.JLabel UCV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel loginButton;
    private javax.swing.JPasswordField textPassword;
    private javax.swing.JTextField textUsername;
    // End of variables declaration//GEN-END:variables
}
