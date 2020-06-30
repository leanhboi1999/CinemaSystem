package view;

import controller.TaiKhoanController;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class LoginUI extends javax.swing.JFrame {

    public static String kn_manhanvien;

    public LoginUI() {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
        setTitle("App quản lý rạp phim");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        txtUserName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        kButton1 = new keeptoo.KButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));

        txtUserName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtUserName.setForeground(new java.awt.Color(102, 102, 102));
        txtUserName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("<html> Login <br> For a free account </html>");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Email");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Password");

        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(102, 102, 102));
        txtPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));

        kButton1.setText("LOGIN");
        kButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        kButton1.setkAllowGradient(false);
        kButton1.setkBackGroundColor(new java.awt.Color(153, 255, 255));
        kButton1.setkEndColor(new java.awt.Color(255, 51, 51));
        kButton1.setkHoverColor(new java.awt.Color(255, 51, 51));
        kButton1.setkHoverEndColor(new java.awt.Color(255, 51, 51));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel8)
                                .addComponent(txtUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                                .addComponent(txtPassword))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        kGradientPanel1.add(jPanel1);
        jPanel1.setBounds(720, 90, 380, 420);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(jLabel1);
        jLabel1.setBounds(130, 210, 370, 48);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(jLabel2);
        jLabel2.setBounds(140, 100, 200, 0);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 153, 255));
        kGradientPanel1.add(jLabel4);
        jLabel4.setBounds(130, 170, 200, 40);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/grap.png"))); // NOI18N
        kGradientPanel1.add(jLabel9);
        jLabel9.setBounds(130, 200, 360, 200);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(jLabel11);
        jLabel11.setBounds(130, 70, 200, 0);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1308, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        if (evt.getSource() == kButton1) {
            String username = txtUserName.getText();
            kn_manhanvien = txtUserName.getText();
            String password = txtPassword.getText();

            if ("".equals(username) || "".equals(password)) {
                JOptionPane.showMessageDialog(null, "Hey, nhập thông tin đầy đủ coi nào");
            } else if (TaiKhoanController.DangNhap(username, password) == true) {
                try {
                    String quyen = TaiKhoanController.GetQuyen(username);
                    if (quyen.equalsIgnoreCase("PQ00001") || quyen.equalsIgnoreCase("PQ00004") || quyen.equalsIgnoreCase("PQ00005")) {
                        dispose();
                        HomeUI ui = new HomeUI(quyen, username);
                        ui.setVisible(true);
                        ui.setLocationRelativeTo(null);
                    } else if (quyen.equalsIgnoreCase("PQ00002")) {
                        dispose();
                        BanVeUI ui = new BanVeUI();
                        ui.setVisible(true);
                        ui.setLocationRelativeTo(null);
                    } else if (quyen.equalsIgnoreCase("PQ00003")) {
                        dispose();
                        BanThucAnUI ui = new BanThucAnUI(quyen, username);
                        ui.setVisible(true);
                        ui.setLocationRelativeTo(null);
                    } else if (quyen.equalsIgnoreCase("PQ00006")) {
                        dispose();
                        ListBaoCaoUI ui = new ListBaoCaoUI(quyen, username);
                        ui.setVisible(true);
                        ui.setLocationRelativeTo(null);
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(null, "Sai mật khẩu hoặc tài khoản");
            }
        }


    }//GEN-LAST:event_kButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private keeptoo.KButton kButton1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
