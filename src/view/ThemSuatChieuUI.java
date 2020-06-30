package view;

import controller.PhimController;
import controller.PhongChieuController;
import controller.SuatChieuController;
import controller.SuatPhimController;
import entity.Phim;
import entity.PhongChieu;
import entity.SuatPhim;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ThemSuatChieuUI extends javax.swing.JFrame {

    private String maquyen;
    private String manhanvien;
    private String tenphim = "";
    SimpleDateFormat fm = new SimpleDateFormat("dd/MM/yyyy");

    public ThemSuatChieuUI(String maquyen, String manhanvien) {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("App quản lý rạp phim");
        this.maquyen = maquyen;
        this.manhanvien = manhanvien;
        hienthi();
    }

    private ThemSuatChieuUI() {}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtMaSuatChieu = new javax.swing.JTextField();
        cbbPhong = new javax.swing.JComboBox<>();
        cbbTrangThai = new javax.swing.JComboBox<>();
        cbbPhim = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableSuatPhim = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        cbbMaSuatPhim = new javax.swing.JComboBox<>();
        txtDate = new com.toedter.calendar.JDateChooser();
        Gio = new javax.swing.JTextField();
        btnHuy = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(250, 250, 250));
        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel3.setFocusable(false);

        jLabel2.setBackground(new java.awt.Color(250, 250, 250));
        jLabel2.setText("Mã suất chiếu:");

        jLabel3.setBackground(new java.awt.Color(250, 250, 250));
        jLabel3.setText("Tên phim:");

        jLabel4.setBackground(new java.awt.Color(250, 250, 250));
        jLabel4.setText("Giờ:");

        jLabel9.setBackground(new java.awt.Color(250, 250, 250));
        jLabel9.setText("Phòng:");

        jLabel10.setBackground(new java.awt.Color(250, 250, 250));
        jLabel10.setText("Thời gian:");

        jLabel11.setBackground(new java.awt.Color(250, 250, 250));
        jLabel11.setText("Trạng thái:");

        cbbPhim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbPhimActionPerformed(evt);
            }
        });

        jTableSuatPhim.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã suất phim", "Định dạng", "Hình thức", "Ngôn ngữ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableSuatPhim.setRowHeight(25);
        jTableSuatPhim.setSelectionBackground(new java.awt.Color(232, 57, 95));
        jScrollPane1.setViewportView(jTableSuatPhim);

        jLabel5.setBackground(new java.awt.Color(250, 250, 250));
        jLabel5.setText("Mã suất phim:");

        Gio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtMaSuatChieu, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbbPhim, javax.swing.GroupLayout.Alignment.LEADING, 0, 155, Short.MAX_VALUE)
                            .addComponent(cbbMaSuatPhim, javax.swing.GroupLayout.Alignment.LEADING, 0, 1, Short.MAX_VALUE)
                            .addComponent(Gio, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbbTrangThai, 0, 155, Short.MAX_VALUE)
                            .addComponent(cbbPhong, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtMaSuatChieu)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbbPhong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbbPhim, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Gio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbMaSuatPhim, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 100, 580, 420);

        btnHuy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-delete-20.png"))); // NOI18N
        btnHuy.setText("Hủy bỏ");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });
        jPanel1.add(btnHuy);
        btnHuy.setBounds(450, 530, 100, 30);

        btnLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-save-20.png"))); // NOI18N
        btnLuu.setText("Lưu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });
        jPanel1.add(btnLuu);
        btnLuu.setBounds(340, 530, 90, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("RẠP CHIẾU PHIM ABC");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(100, 42, 230, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Untitled.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 580, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbbPhimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbPhimActionPerformed
        if (cbbPhim.getSelectedIndex() != -1) {
            tenphim = cbbPhim.getItemAt(cbbPhim.getSelectedIndex());
            loadSuatPhim(tenphim);
        }
    }//GEN-LAST:event_cbbPhimActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        dispose();
        SuatChieuUI ui = new SuatChieuUI(maquyen, manhanvien);
        ui.setVisible(true);
    }//GEN-LAST:event_btnHuyActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        if (kiemTraDayDu()) {
            String maSuatChieu = txtMaSuatChieu.getText();
            String tenPhong = cbbPhong.getSelectedItem().toString();
            String maSuatPhim = cbbMaSuatPhim.getSelectedItem().toString();
            String gio = Gio.getText();
            String ngaychieu = fm.format(txtDate.getDate());
            System.out.println(ngaychieu);
            try {
                if (SuatChieuController.them(maSuatChieu, tenPhong, maSuatPhim, gio, ngaychieu)) {
                    JOptionPane.showMessageDialog(null, "Thêm thành công");
                } else {
                    JOptionPane.showMessageDialog(null, "Thêm thất bại");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Vui lòng điền đầy đủ dữ liệu");
        }

    }//GEN-LAST:event_btnLuuActionPerformed

    private void GioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GioActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThemSuatChieuUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Gio;
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnLuu;
    private javax.swing.JComboBox<String> cbbMaSuatPhim;
    private javax.swing.JComboBox<String> cbbPhim;
    private javax.swing.JComboBox<String> cbbPhong;
    private javax.swing.JComboBox<String> cbbTrangThai;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableSuatPhim;
    private com.toedter.calendar.JDateChooser txtDate;
    private javax.swing.JTextField txtMaSuatChieu;
    // End of variables declaration//GEN-END:variables

    private void hienthi() {
        hienPhong();
        hienTrangThai();
        hienPhim();
        try {
            txtMaSuatChieu.setText(SuatChieuController.hiemNa());
            txtMaSuatChieu.setEnabled(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    private void hienPhong() {
        try {
            ArrayList<PhongChieu> arr = PhongChieuController.taiTatCa();
            cbbPhong.removeAllItems();
            for (PhongChieu item : arr) {
                cbbPhong.addItem(item.getTenphong());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private void hienTrangThai() {
        cbbTrangThai.addItem("Còn chỗ");
        cbbTrangThai.addItem("Hết chỗ");
        cbbTrangThai.setSelectedIndex(0);
    }

    private void hienPhim() {
        cbbPhim.removeAllItems();
        try {
            ArrayList<Phim> arr = PhimController.taiPhimDangChieu();
            for (Phim item : arr) {
                cbbPhim.addItem(item.getTenphim());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private void loadSuatPhim(String tenphim) {
        try {
            ArrayList<Phim> arr = PhimController.taiPhimDangChieu();
            for (Phim item : arr) {
                if (item.getTenphim().equals(tenphim)) {
                    ArrayList<SuatPhim> arrSuatPhim = SuatPhimController.taiDanhSach(item.getMaphim());
                    DefaultTableModel table = (DefaultTableModel) jTableSuatPhim.getModel();
                    table.getDataVector().removeAllElements(); //reset dữ liệu table về rỗng
                    cbbMaSuatPhim.removeAllItems();
                    Object row[] = new Object[4];
                    for (SuatPhim sp : arrSuatPhim) {
                        row[0] = sp.getMasuatphim();
                        row[1] = sp.getTendinhdang();
                        row[2] = sp.getTenhinhthuc();
                        row[3] = sp.getTenngonngu();
                        table.addRow(row);
                        cbbMaSuatPhim.addItem(sp.getMasuatphim());
                    }
                }
            }
        } catch (Exception e) {
        }
    }

    private boolean kiemTraDayDu() {
        if (txtDate.getDate() == null || Gio.getText() == null || cbbMaSuatPhim.getSelectedItem().toString() == null || cbbPhim.getSelectedItem().toString() == null || cbbPhong.getSelectedItem().toString() == null || cbbTrangThai.getSelectedItem().toString() == null) {
            return false;
        } else {
            return true;
        }
    }
}
