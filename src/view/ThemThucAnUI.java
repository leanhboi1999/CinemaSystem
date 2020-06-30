package view;

import controller.ThucPhamController;
import entity.ThucPham;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ThemThucAnUI extends javax.swing.JFrame {

    private String maquyen;
    private String manhanvien;
    private boolean isInsert;
    private ThucPham tp = null;

    public ThemThucAnUI(boolean isInsert, ThucPham tp, String maquyen, String manhanvien) {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        setTitle("App quản lý rạp phim");
        this.isInsert = isInsert;
        this.tp = tp;
        this.maquyen = maquyen;
        this.manhanvien = manhanvien;
        hienThi();
    }

    private ThemThucAnUI() {
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinField1 = new com.toedter.components.JSpinField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMaThucAn = new javax.swing.JTextField();
        txtTenThucAn = new javax.swing.JTextField();
        cbbTrangThai = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtDonGia = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jSpinSoLuong = new com.toedter.components.JSpinField();
        btnLuu = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));

        jLabel2.setBackground(new java.awt.Color(250, 250, 250));
        jLabel2.setText("Mã thức ăn:");

        jLabel3.setBackground(new java.awt.Color(250, 250, 250));
        jLabel3.setText("Tên thức ăn:");

        jLabel5.setBackground(new java.awt.Color(250, 250, 250));
        jLabel5.setText("Trạng thái:");

        jLabel7.setBackground(new java.awt.Color(250, 250, 250));
        jLabel7.setText("Số lượng: ");

        jLabel8.setBackground(new java.awt.Color(250, 250, 250));
        jLabel8.setText("Đơn giá:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jSpinSoLuong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtMaThucAn, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbbTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtTenThucAn, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaThucAn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenThucAn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jSpinSoLuong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 110, 450, 330);

        btnLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-save-20.png"))); // NOI18N
        btnLuu.setText("Lưu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });
        jPanel1.add(btnLuu);
        btnLuu.setBounds(200, 480, 110, 30);

        btnHuy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-delete-20.png"))); // NOI18N
        btnHuy.setText("Hủy bỏ");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });
        jPanel1.add(btnHuy);
        btnHuy.setBounds(320, 480, 110, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("RẠP CHIẾU PHIM ABC");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(100, 20, 230, 22);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Untitled.png"))); // NOI18N
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 450, 550);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        dispose();
        ThucAnUI ui = new ThucAnUI(maquyen, manhanvien);
        ui.setVisible(true);
    }//GEN-LAST:event_btnHuyActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        if (kiemTraDayDu()) {
            ThucPham thucpham = new ThucPham();
            thucpham.setMathucpham(txtMaThucAn.getText());
            thucpham.setTenthucpham(txtTenThucAn.getText());
            thucpham.setSoluong(jSpinSoLuong.getValue());
            thucpham.setDongia(Integer.parseInt(txtDonGia.getText()));

            if (cbbTrangThai.getSelectedItem().toString().equals("Còn bán")) {
                thucpham.setTrangthai(1);
            } else {
                thucpham.setTrangthai(0);
            }
            if (isInsert) {
                int kq;
                try {
                    kq = ThucPhamController.insertThucPham(thucpham);
                    if (kq > 0) {
                        JOptionPane.showMessageDialog(null, "Thành công");
                    } else {
                        JOptionPane.showMessageDialog(null, "That Bai");
                    }

                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            } else {
                try {
                    int kq1 = ThucPhamController.editThucPham(thucpham.getMathucpham(), thucpham.getTenthucpham(), (int) thucpham.getDongia(), thucpham.getSoluong(), thucpham.getTrangthai());
                    if (kq1 > 0) {
                        JOptionPane.showMessageDialog(null, "Thành công");
                    } else {
                        JOptionPane.showMessageDialog(null, "Thất bại");
                    }

                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }

            }
        } else {
            JOptionPane.showMessageDialog(null, "Bạn vui lòng diền đầy đủ thông tin");
        }
    }//GEN-LAST:event_btnLuuActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThemThucAnUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnLuu;
    private javax.swing.JComboBox<String> cbbTrangThai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private com.toedter.components.JSpinField jSpinField1;
    private com.toedter.components.JSpinField jSpinSoLuong;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtMaThucAn;
    private javax.swing.JTextField txtTenThucAn;
    // End of variables declaration//GEN-END:variables

    private void hienThi() {
        try {
            if (isInsert) {
                txtMaThucAn.setText(ThucPhamController.hienMa());
                txtMaThucAn.setEnabled(false);
                hienTrangThai();
            } else {
                txtMaThucAn.setText(tp.getMathucpham());
                txtMaThucAn.setEnabled(false);
                txtTenThucAn.setText(tp.getTenthucpham());
                jSpinSoLuong.setValue(tp.getSoluong());
                String sDonGia = Integer.toString((int) tp.getDongia());
                txtDonGia.setText(sDonGia);
                hienTrangThai();
                if (tp.getTrangthai() == 1) {
                    cbbTrangThai.setSelectedIndex(0);
                } else {
                    cbbTrangThai.setSelectedIndex(1);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private void hienTrangThai() {
        cbbTrangThai.addItem("Còn bán");
        cbbTrangThai.addItem("Dừng bán");
    }

    private boolean kiemTraDayDu() {
        if (txtMaThucAn.getText() == null || txtTenThucAn.getText() == null || txtDonGia.getText() == null) {
            return false;
        } else {
            return true;
        }
    }
}
