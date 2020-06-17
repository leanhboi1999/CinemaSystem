package view;

import controller.DinhDangController;
import controller.HinhThucController;
import controller.NgonNguController;
import controller.PhimController;
import controller.SuatPhimController;
import entity.DinhDang;
import entity.HinhThuc;
import entity.NgonNgu;
import entity.Phim;
import entity.SuatPhim;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ThemPhimUI extends javax.swing.JFrame {

    private boolean isInsert;
    private String maphim;
    private Phim newPhim = new Phim();
    private ArrayList<SuatPhim> aSuatPhim = new ArrayList<SuatPhim>();

    public ThemPhimUI(boolean isInsert, String maphim) {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("App quản lý rạp");
        this.isInsert = isInsert;
        this.maphim = maphim;
        hienthi();
    }

    private ThemPhimUI() {
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtMaPhim = new javax.swing.JTextField();
        cbbTrangThai = new javax.swing.JComboBox<>();
        spnThoiLuong = new javax.swing.JSpinner();
        cbbGioiHanTuoi = new javax.swing.JComboBox<>();
        cbbNuocSX = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtTomTat = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtTenPhim = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtDienVien = new javax.swing.JTextArea();
        txtNamSX = new javax.swing.JTextField();
        txtNhaSX = new javax.swing.JTextField();
        dateNgayChieu = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        cbbHinhThuc = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        cbbNgonNgu_suatphim = new javax.swing.JComboBox<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTableSuatPhim = new javax.swing.JTable();
        cbbDinhDang_suatphim = new javax.swing.JComboBox<>();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jTabbedPane1.setBackground(new java.awt.Color(250, 250, 250));
        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

        jPanel4.setBackground(new java.awt.Color(250, 250, 250));
        jPanel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel4.setFocusable(false);

        jLabel15.setBackground(new java.awt.Color(250, 250, 250));
        jLabel15.setText("Mã phim:");

        jLabel16.setBackground(new java.awt.Color(250, 250, 250));
        jLabel16.setText("Tên phim:");

        jLabel17.setBackground(new java.awt.Color(250, 250, 250));
        jLabel17.setText("Thời lượng:");

        jLabel18.setBackground(new java.awt.Color(250, 250, 250));
        jLabel18.setText("Năm sản xuất:");

        jLabel19.setBackground(new java.awt.Color(250, 250, 250));
        jLabel19.setText("Giới hạn tuổi:");

        jLabel20.setBackground(new java.awt.Color(250, 250, 250));
        jLabel20.setText("Ngày chiếu:");

        jLabel21.setBackground(new java.awt.Color(250, 250, 250));
        jLabel21.setText("Tóm tắt:");

        jLabel22.setBackground(new java.awt.Color(250, 250, 250));
        jLabel22.setText("Trạng thái:");

        jLabel23.setBackground(new java.awt.Color(250, 250, 250));
        jLabel23.setText("Diễn viên:");

        jLabel24.setBackground(new java.awt.Color(250, 250, 250));
        jLabel24.setText("Nước sản xuất:");

        jLabel26.setBackground(new java.awt.Color(250, 250, 250));
        jLabel26.setText("Nhà sản xuất:");

        cbbTrangThai.setBackground(new java.awt.Color(250, 250, 250));
        cbbTrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đang chiếu", "Sắp chiếu", "Đã chiếu", " " }));

        cbbGioiHanTuoi.setBackground(new java.awt.Color(250, 250, 250));
        cbbGioiHanTuoi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "12", "16", "18" }));
        cbbGioiHanTuoi.setPreferredSize(new java.awt.Dimension(42, 25));

        cbbNuocSX.setBackground(new java.awt.Color(250, 250, 250));
        cbbNuocSX.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VIỆT NAM", "USA", "NHẬT BẢN", "THÁI LAN" }));

        txtTomTat.setColumns(20);
        txtTomTat.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtTomTat.setRows(5);
        jScrollPane4.setViewportView(txtTomTat);

        txtTenPhim.setColumns(20);
        txtTenPhim.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtTenPhim.setRows(5);
        jScrollPane5.setViewportView(txtTenPhim);

        txtDienVien.setColumns(20);
        txtDienVien.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtDienVien.setRows(5);
        jScrollPane6.setViewportView(txtDienVien);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel19)))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(txtMaPhim, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(spnThoiLuong)
                            .addComponent(cbbGioiHanTuoi, 0, 134, Short.MAX_VALUE)
                            .addComponent(txtNamSX, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel24))
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dateNgayChieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(cbbTrangThai, 0, 134, Short.MAX_VALUE)
                            .addComponent(cbbNuocSX, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNhaSX, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))))
                .addGap(24, 24, 24))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbbTrangThai)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtMaPhim, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(spnThoiLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbbNuocSX, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNamSX, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNhaSX, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbbGioiHanTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dateNgayChieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(117, 117, 117))
        );

        jTabbedPane1.addTab("Phim", jPanel4);

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));

        jLabel28.setBackground(new java.awt.Color(250, 250, 250));
        jLabel28.setText("Định dạng:");

        cbbHinhThuc.setBackground(new java.awt.Color(250, 250, 250));

        jLabel29.setBackground(new java.awt.Color(250, 250, 250));
        jLabel29.setText("Hình thức:");

        jLabel30.setBackground(new java.awt.Color(250, 250, 250));
        jLabel30.setText("Ngôn ngữ:");

        cbbNgonNgu_suatphim.setBackground(new java.awt.Color(250, 250, 250));

        jTableSuatPhim.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Ngôn ngữ", "Định dạng", "Hình thức"
            }
        ));
        jTableSuatPhim.setRowHeight(25);
        jTableSuatPhim.setSelectionBackground(new java.awt.Color(232, 57, 95));
        jScrollPane7.setViewportView(jTableSuatPhim);

        cbbDinhDang_suatphim.setBackground(new java.awt.Color(250, 250, 250));

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-save-20.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-delete-20.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbbNgonNgu_suatphim, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbDinhDang_suatphim, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbbHinhThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbbDinhDang_suatphim, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbbHinhThuc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnXoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbbNgonNgu_suatphim, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Suất phim", jPanel2);

        jPanel1.add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 110, 580, 440);
        jTabbedPane1.getAccessibleContext().setAccessibleDescription("");

        btnHuy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-delete-20.png"))); // NOI18N
        btnHuy.setText("Hủy bỏ");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });
        jPanel1.add(btnHuy);
        btnHuy.setBounds(450, 560, 100, 30);

        btnLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-save-20.png"))); // NOI18N
        btnLuu.setText("Lưu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });
        jPanel1.add(btnLuu);
        btnLuu.setBounds(350, 560, 90, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("RẠP CHIẾU PHIM ABC");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(100, 32, 230, 50);

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

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        PhimUI PhimUI;
        PhimUI = new PhimUI();
        dispose();
        PhimUI.setVisible(true);
    }//GEN-LAST:event_btnHuyActionPerformed

    //Xử lý lưu nè, đau đầu quá
    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        if (isInsert) {
            themPhim();
        } else {
            suaPhim();
        }
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        themSuatPhim();
    }//GEN-LAST:event_btnThemActionPerformed

    //Xử lý xóa suất phim trong hệ thống
    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        //Chưa tìm ra cách xử lý
        int row = jTableSuatPhim.getSelectedRow();
        String masuatphim = jTableSuatPhim.getValueAt(row, 0).toString();
        Iterator<SuatPhim> iter = aSuatPhim.iterator();
        if (row == -1) {
            JOptionPane.showMessageDialog(null, "Không click chọn có mà hiển thị bằng niềm tin", "Null Error", JOptionPane.ERROR_MESSAGE);
        } else {
            int p = JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa dữ liệu không?", "Delete", JOptionPane.YES_NO_OPTION);
            if (p == 0) {
                try {
                    if (SuatPhimController.xoaSuatPhim(masuatphim)) { 
                        JOptionPane.showMessageDialog(null, "Xóa thành công");
                        taiSuatPhim();
                    } else {
                        JOptionPane.showMessageDialog(null, "Xóa thất bại");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
    }//GEN-LAST:event_btnXoaActionPerformed
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThemPhimUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbbDinhDang_suatphim;
    private javax.swing.JComboBox<String> cbbGioiHanTuoi;
    private javax.swing.JComboBox<String> cbbHinhThuc;
    private javax.swing.JComboBox<String> cbbNgonNgu_suatphim;
    private javax.swing.JComboBox<String> cbbNuocSX;
    private javax.swing.JComboBox<String> cbbTrangThai;
    private com.toedter.calendar.JDateChooser dateNgayChieu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableSuatPhim;
    private javax.swing.JSpinner spnThoiLuong;
    private javax.swing.JTextArea txtDienVien;
    private javax.swing.JTextField txtMaPhim;
    private javax.swing.JTextField txtNamSX;
    private javax.swing.JTextField txtNhaSX;
    private javax.swing.JTextArea txtTenPhim;
    private javax.swing.JTextArea txtTomTat;
    // End of variables declaration//GEN-END:variables

    private void hienthi() {
        Date date = new Date();
        taiNgonNgu();
        taiDinhDang();
        taiHinhThuc();
        try {
            if (isInsert) {
                hienma();
                txtMaPhim.setEnabled(false);
                cbbTrangThai.setSelectedIndex(0);
                txtTenPhim.setText("");
                txtDienVien.setText("");
                spnThoiLuong.setValue(100);
                cbbNuocSX.setSelectedIndex(0);
                txtNamSX.setText("");
                cbbGioiHanTuoi.setSelectedIndex(0);
                txtNhaSX.setText("");
                dateNgayChieu.setDate(date);
                txtTomTat.setText("");
            } else {
                taiPhim();
                taiSuatPhim();
                txtMaPhim.setEnabled(false);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private void taiNgonNgu() {

        cbbNgonNgu_suatphim.removeAllItems();
        try {
            ArrayList<NgonNgu> aNgonNgu = NgonNguController.taiTatCa();
            for (NgonNgu item : aNgonNgu) {

                cbbNgonNgu_suatphim.addItem(item.getTenngonngu());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private void taiDinhDang() {
        cbbDinhDang_suatphim.removeAllItems();
        try {
            ArrayList<DinhDang> aDinhDang = DinhDangController.taiTatCa();
            for (DinhDang item : aDinhDang) {
                cbbDinhDang_suatphim.addItem(item.getTendinhdang());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private void hienma() {
        try {
            txtMaPhim.setText(PhimController.hienMa());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private void taiPhim() throws SQLException {
        Phim p = PhimController.getPhim(maphim);
        txtMaPhim.setText(p.getMaphim());
        txtMaPhim.setEnabled(false);
        txtTenPhim.setText(p.getTenphim());
        cbbTrangThai.setSelectedItem(p.getTrangthai());
        txtDienVien.setText(p.getDienvien());
        spnThoiLuong.setValue(p.getThoiluong());
        cbbNuocSX.setSelectedItem(p.getNuocsanxuat().toString());
        txtNamSX.setText(p.getNamsanxuat() + "");
        cbbGioiHanTuoi.setSelectedItem(p.getGioihantuoi() + "");
        txtNhaSX.setText(p.getNhasanxuat());
        dateNgayChieu.setDate(p.getNgaykhoichieu());
        txtTomTat.setText(p.getTomtat());

    }

    private void taiSuatPhim() {
        try {
            aSuatPhim.clear();
            ArrayList<SuatPhim> aSP = SuatPhimController.taiDanhSach(maphim);
            DefaultTableModel table = (DefaultTableModel) jTableSuatPhim.getModel();
            table.getDataVector().removeAllElements();
            Object row[] = new Object[4];
            for (SuatPhim sp : aSP) {
                row[0] = sp.getMasuatphim();
                row[1] = sp.getTenngonngu();
                row[2] = sp.getTendinhdang();
                row[3] = sp.getTenhinhthuc();
                table.addRow(row);
                aSuatPhim.add(new SuatPhim(sp.getMasuatphim(), sp.getTenngonngu(), sp.getTendinhdang(), maphim, sp.getTenhinhthuc()));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    private void themPhim() {
        if (check()) {
            /*System.out.println(check());
            System.out.println(isInsert);*/
            themMaPhim_SuatPhim();
            taoPhim();
            try {
                if (PhimController.them(newPhim, aSuatPhim)) {
                    JOptionPane.showMessageDialog(null, "Thêm thành công");
                } else {
                    JOptionPane.showMessageDialog(null, "Thêm thất bại");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }

    private boolean check() {
        if (txtTenPhim.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Quên tên phim kìa thánh");
            return false;
        }
        if (jTableSuatPhim.getRowCount() != 1) {
            JOptionPane.showMessageDialog(null, "Quên thêm suất phim cho phim");
            return false;
        }
        return true;
    }

    private void taoPhim() {
        newPhim.setMaphim(txtMaPhim.getText());
        newPhim.setTrangthai((String) cbbTrangThai.getSelectedItem());
        newPhim.setTenphim(txtTenPhim.getText());
        newPhim.setDienvien(txtDienVien.getText());
        newPhim.setThoiluong((int) spnThoiLuong.getValue());
        newPhim.setNuocsanxuat((String) cbbNuocSX.getSelectedItem());
        newPhim.setNamsanxuat(Integer.parseInt(txtNamSX.getText()));
        newPhim.setGioihantuoi((Integer.parseInt((String) cbbGioiHanTuoi.getSelectedItem())));
        newPhim.setNhasanxuat(txtNhaSX.getText());
        newPhim.setNgaykhoichieu(dateNgayChieu.getDate());
        newPhim.setTomtat(txtTomTat.getText());
    }

    private void taiHinhThuc() {
        try {
            ArrayList<HinhThuc> arr = HinhThucController.taiTatCa();
            for (HinhThuc item : arr) {
                cbbHinhThuc.addItem(item.getTenhinhthuc());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    private void themSuatPhim() {
        if (themMang((String) cbbNgonNgu_suatphim.getSelectedItem(), (String) cbbDinhDang_suatphim.getSelectedItem(), (String) cbbHinhThuc.getSelectedItem())) {
            if (!isInsert) {
                SuatPhim temp = aSuatPhim.get(aSuatPhim.size() - 1);
                try {
                    //Controller load
                    if (SuatPhimController.them(temp)) {
                        JOptionPane.showMessageDialog(null, "Thêm thành công");
                    } else {
                        JOptionPane.showMessageDialog(null, "Thêm thất bại");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            } else {
                try {
                    DefaultTableModel table = (DefaultTableModel) jTableSuatPhim.getModel();
                    table.getDataVector().removeAllElements();
                    Object row[] = new Object[4];
                    row[0] = SuatPhimController.hienMa();
                    row[1] = cbbNgonNgu_suatphim.getSelectedItem();
                    row[2] = cbbDinhDang_suatphim.getSelectedItem();
                    row[3] = cbbHinhThuc.getSelectedItem();
                    table.addRow(row);
                    //table.setRowCount(0);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }

            }
        } else {
            JOptionPane.showMessageDialog(null, "Suất phim đã tồn tại");
        }

    }

    private boolean themMang(String maNN, String maDD, String maHT) {
        for (SuatPhim sp : aSuatPhim) {
            if (sp.getMangonngu().equals(maNN) && sp.getMadinhdang().equals(maDD) && sp.getMahinhthuc().equals(maHT)) {
                return false;
            }
        }
        aSuatPhim.add(new SuatPhim(null, maNN, maDD, maphim, maHT));
        return true;

    }

    private void suaPhim() {
        if (check()) {
            try {
                taoPhim();
                //Controller khởi chạy
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }

    private void themMaPhim_SuatPhim() {
        for (SuatPhim sp : aSuatPhim) {
            sp.setMaphim(txtMaPhim.getText());
        }
    }
}
