package view;

import controller.PhimController;
import controller.SuatChieuController;
import entity.Phim;
import entity.SuatChieu;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class BanVeUI extends javax.swing.JFrame {

    //Khúc này để lấy mã nhân viên đăng nhập vào hệ thống
    private String manhanvien;
    private String maquyen;

    public BanVeUI() {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
        setTitle("App quản lý rạp phim");
        //this.manhanvien = manhanvien;
        try {
            ArrayList<Phim> arr = PhimController.taiPhimDangChieu();
            hienThi(arr);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableSuatChieu = new javax.swing.JTable();
        btnChon = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnTimKiem = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePhim = new javax.swing.JTable();
        txtTtenPhim = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jPanel10.setBackground(new java.awt.Color(250, 250, 250));
        jPanel10.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jTableSuatChieu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã suất chiếu", "Mã phòng chiếu", "Giờ chiếu", "Định dạng", "Ngôn ngữ", "Hình thức"
            }
        ));
        jTableSuatChieu.setFocusable(false);
        jTableSuatChieu.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTableSuatChieu.setRowHeight(25);
        jTableSuatChieu.setSelectionBackground(new java.awt.Color(232, 57, 95));
        jTableSuatChieu.setShowVerticalLines(false);
        jTableSuatChieu.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableSuatChieu);

        btnChon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-select-20.png"))); // NOI18N
        btnChon.setText("Chọn");
        btnChon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 818, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnChon, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(btnChon, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel10);
        jPanel10.setBounds(330, 112, 842, 430);

        jPanel3.setBackground(new java.awt.Color(250, 250, 250));
        jPanel3.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        btnTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-search-20.png"))); // NOI18N
        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.setMinimumSize(new java.awt.Dimension(83, 30));
        btnTimKiem.setPreferredSize(new java.awt.Dimension(83, 25));
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        jTablePhim.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã phim", "Tên phim"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablePhim.setFocusable(false);
        jTablePhim.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTablePhim.setRowHeight(25);
        jTablePhim.setSelectionBackground(new java.awt.Color(232, 57, 95));
        jTablePhim.setShowVerticalLines(false);
        jTablePhim.getTableHeader().setReorderingAllowed(false);
        jTablePhim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePhimMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTablePhim);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtTtenPhim, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTtenPhim, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 112, 340, 430);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Dashboard.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1170, 545);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1170, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
            String tenphim = txtTtenPhim.getText();
            //Controller tìm tên phim có suất chiếu (trạng thái đang chiếu)
            //ArrayList<Phim> arr = PhimController.timKiem(tenphim);
            //Load phim lên jtable
            //hienThi(arr);
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void jTablePhimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePhimMouseClicked
        int row = jTablePhim.getSelectedRow();
        TableModel model = jTablePhim.getModel();
        String maphim = model.getValueAt(row, 1).toString();
        ArrayList<SuatChieu> arr = SuatChieuController.taiSuatChieu(maphim);
        loadSuatChieu(arr);
    }//GEN-LAST:event_jTablePhimMouseClicked

    private void btnChonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChonActionPerformed
        //Xử lý chọn suất chiếu
        int row = jTableSuatChieu.getSelectedRow();
        String masuatchieu = jTableSuatChieu.getModel().getValueAt(row, 2).toString();
        //New UI ghế, tiếp theo tại ghế new UI vé mới.
        //Chờ controller
    }//GEN-LAST:event_btnChonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BanVeUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChon;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablePhim;
    private javax.swing.JTable jTableSuatChieu;
    private javax.swing.JTextField txtTtenPhim;
    // End of variables declaration//GEN-END:variables

    private void hienThi(ArrayList<Phim> arr) {
        DefaultTableModel table = (DefaultTableModel) jTablePhim.getModel();
        table.getDataVector().removeAllElements();
        Object row[] = new Object[2];
        for (Phim item : arr) {
            row[0] = item.getMaphim();
            row[1] = item.getTenphim();
            table.addRow(row);
        }
    }

    private void loadSuatChieu(ArrayList<SuatChieu> arr) {
        DefaultTableModel table = (DefaultTableModel) jTablePhim.getModel();
        table.getDataVector().removeAllElements();
        Object row[] = new Object[7];
        int i = 0;
        for (SuatChieu item : arr) {
            i++;
            row[0] = i;
            row[1] = item.getMasuatchieu();
            row[2] = item.getMaphong();
            row[3] = item.getThoigianchieu();
            row[4] = item.getDinhdang();
            row[5] = item.getNgonngu();
            row[6] = item.getHinhthuc();
            table.addRow(row);
        }
    }
}
