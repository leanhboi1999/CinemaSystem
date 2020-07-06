/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import keeptoo.KGradientPanel;

/**
 *
 * @author admin
 */
public class HomeUI extends javax.swing.JFrame {

    private String maquyen;
    private String manhanvien;
    private KGradientPanel kGradientPanel6;
    private KGradientPanel kGradientPane1l3;

    public HomeUI(String maquyen, String manhanvien) {
        initComponents();
        setTitle("App quản lí rạp phim");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.maquyen = maquyen;
        this.manhanvien = manhanvien;
    }

    private HomeUI() {
    }

    void moveColor(JPanel panel) {
        panel.setBackground(new Color(64, 43, 100));
    }

    void setBtnColor(JPanel panel) {
        panel.setBackground(new Color(85, 65, 118));
    }

    void resetBtnColor(JPanel panel) {
        panel.setBackground(new Color(54, 33, 89));
    }

    void newAnotherMoveColor(KGradientPanel kgPanel) {
        kgPanel.setkFillBackground(true);
        kgPanel.setBackground(null);
        kgPanel.setkEndColor(new Color(66, 250, 242));
        kgPanel.setkStartColor(new Color(174, 20, 232));
        kgPanel.setkGradientFocus(10);
    }

    void newAnotherResetColor(KGradientPanel kgPanel) {
        kgPanel.setkFillBackground(true);
        kgPanel.setBackground(null);
        kgPanel.setkEndColor(new Color(0, 0, 255));
        kgPanel.setkStartColor(new Color(255, 0, 255));
        kgPanel.setkGradientFocus(500);
    }

    void newPressAnotherColor(KGradientPanel kgPanel) {
        kgPanel.setkFillBackground(true);
        kgPanel.setBackground(null);
        kgPanel.setkEndColor(new Color(0, 255, 255));
        kgPanel.setkStartColor(new Color(255, 255, 255));
        kgPanel.setkGradientFocus(500);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btn1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btn3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btn4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btn5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        kGradientPanel11 = new keeptoo.KGradientPanel();
        jPanel8 = new javax.swing.JPanel();
        kGradientPanel10 = new keeptoo.KGradientPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        kGradientPanel9 = new keeptoo.KGradientPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        kGradientPanel8 = new keeptoo.KGradientPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        kGradientPanel7 = new keeptoo.KGradientPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        kGradientPanel5 = new keeptoo.KGradientPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        kGradientPanel13 = new keeptoo.KGradientPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        kGradientPanel12 = new keeptoo.KGradientPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        kGradientPanel14 = new keeptoo.KGradientPanel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(54, 33, 89));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn1.setBackground(new java.awt.Color(54, 33, 89));
        btn1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                btn1MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn1MouseMoved(evt);
            }
        });
        btn1.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                btn1MouseWheelMoved(evt);
            }
        });
        btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn1MousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 19)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Trang Chủ");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fontHome.png"))); // NOI18N

        javax.swing.GroupLayout btn1Layout = new javax.swing.GroupLayout(btn1);
        btn1.setLayout(btn1Layout);
        btn1Layout.setHorizontalGroup(
            btn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn1Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel5)
                .addContainerGap(166, Short.MAX_VALUE))
        );
        btn1Layout.setVerticalGroup(
            btn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn1Layout.createSequentialGroup()
                .addGroup(btn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 375, 50));

        btn2.setBackground(new java.awt.Color(54, 33, 89));
        btn2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn2MouseMoved(evt);
            }
        });
        btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn2MousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn2MouseExited(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 19)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Xem");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fontView.png"))); // NOI18N

        javax.swing.GroupLayout btn2Layout = new javax.swing.GroupLayout(btn2);
        btn2.setLayout(btn2Layout);
        btn2Layout.setHorizontalGroup(
            btn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn2Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel8)
                .addContainerGap(224, Short.MAX_VALUE))
        );
        btn2Layout.setVerticalGroup(
            btn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 375, 50));

        btn3.setBackground(new java.awt.Color(54, 33, 89));
        btn3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn3MouseMoved(evt);
            }
        });
        btn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn3MousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn3MouseExited(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 19)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Bắt Đầu");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fontStart.png"))); // NOI18N

        javax.swing.GroupLayout btn3Layout = new javax.swing.GroupLayout(btn3);
        btn3.setLayout(btn3Layout);
        btn3Layout.setHorizontalGroup(
            btn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn3Layout.createSequentialGroup()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel9)
                .addContainerGap(192, Short.MAX_VALUE))
        );
        btn3Layout.setVerticalGroup(
            btn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 375, 50));

        btn4.setBackground(new java.awt.Color(54, 33, 89));
        btn4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn4MouseMoved(evt);
            }
        });
        btn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn4MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn4MousePressed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 1, 19)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Liên hệ góp ý");

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/font-Contact.png"))); // NOI18N

        javax.swing.GroupLayout btn4Layout = new javax.swing.GroupLayout(btn4);
        btn4.setLayout(btn4Layout);
        btn4Layout.setHorizontalGroup(
            btn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn4Layout.createSequentialGroup()
                .addComponent(jLabel18)
                .addGap(30, 30, 30)
                .addComponent(jLabel10)
                .addContainerGap(140, Short.MAX_VALUE))
        );
        btn4Layout.setVerticalGroup(
            btn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 375, 50));

        btn5.setBackground(new java.awt.Color(54, 33, 89));
        btn5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn5MouseMoved(evt);
            }
        });
        btn5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn5MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn5MousePressed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 1, 19)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Thông tin");

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fontInfo.png"))); // NOI18N

        javax.swing.GroupLayout btn5Layout = new javax.swing.GroupLayout(btn5);
        btn5.setLayout(btn5Layout);
        btn5Layout.setHorizontalGroup(
            btn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn5Layout.createSequentialGroup()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel11)
                .addContainerGap(176, Short.MAX_VALUE))
        );
        btn5Layout.setVerticalGroup(
            btn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 375, 50));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ABC CENIMA");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Chào mừng đến");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 290, 80));

        kGradientPanel11.setBackground(new java.awt.Color(54, 33, 89));
        kGradientPanel11.setkBorderRadius(5);
        kGradientPanel11.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel11.setkStartColor(new java.awt.Color(153, 153, 255));
        kGradientPanel11.setLayout(null);
        jPanel2.add(kGradientPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 360, 5));

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 375, 700);

        kGradientPanel10.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                kGradientPanel10MouseMoved(evt);
            }
        });
        kGradientPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                kGradientPanel10MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                kGradientPanel10MousePressed(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel35.setText("Suất Chiếu");

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/clapperboard (2).png"))); // NOI18N

        javax.swing.GroupLayout kGradientPanel10Layout = new javax.swing.GroupLayout(kGradientPanel10);
        kGradientPanel10.setLayout(kGradientPanel10Layout);
        kGradientPanel10Layout.setHorizontalGroup(
            kGradientPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel10Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(kGradientPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35)
                    .addGroup(kGradientPanel10Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        kGradientPanel10Layout.setVerticalGroup(
            kGradientPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel10Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel35)
                .addGap(40, 40, 40))
        );

        kGradientPanel9.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                kGradientPanel9MouseMoved(evt);
            }
        });
        kGradientPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                kGradientPanel9MousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                kGradientPanel9MouseExited(evt);
            }
        });
        kGradientPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search (1).png"))); // NOI18N
        kGradientPanel9.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 30, 130, 130));

        jLabel33.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel33.setText("Thống Kê");
        kGradientPanel9.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        kGradientPanel8.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                kGradientPanel8MouseMoved(evt);
            }
        });
        kGradientPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                kGradientPanel8MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                kGradientPanel8MousePressed(evt);
            }
        });

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cinema (2).png"))); // NOI18N

        jLabel29.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel29.setText("Bán vé");

        javax.swing.GroupLayout kGradientPanel8Layout = new javax.swing.GroupLayout(kGradientPanel8);
        kGradientPanel8.setLayout(kGradientPanel8Layout);
        kGradientPanel8Layout.setHorizontalGroup(
            kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel8Layout.createSequentialGroup()
                .addGroup(kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel8Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel8Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel29)))
                .addGap(33, 33, 33))
        );
        kGradientPanel8Layout.setVerticalGroup(
            kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel8Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jLabel29)
                .addContainerGap())
        );

        kGradientPanel7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                kGradientPanel7MouseMoved(evt);
            }
        });
        kGradientPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                kGradientPanel7MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                kGradientPanel7MousePressed(evt);
            }
        });

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cinema (1).png"))); // NOI18N

        jLabel27.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel27.setText("Thực Phẩm");

        javax.swing.GroupLayout kGradientPanel7Layout = new javax.swing.GroupLayout(kGradientPanel7);
        kGradientPanel7.setLayout(kGradientPanel7Layout);
        kGradientPanel7Layout.setHorizontalGroup(
            kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel7Layout.createSequentialGroup()
                .addGroup(kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel7Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel27)))
                .addGap(79, 79, 79))
        );
        kGradientPanel7Layout.setVerticalGroup(
            kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel7Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel27)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        kGradientPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                kGradientPanel1MouseMoved(evt);
            }
        });
        kGradientPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kGradientPanel1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                kGradientPanel1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                kGradientPanel1MousePressed(evt);
            }
        });

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/clapperboard (4).png"))); // NOI18N

        jLabel21.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel21.setText("Phim");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addGap(35, 35, 35))
        );

        kGradientPanel5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                kGradientPanel5MouseMoved(evt);
            }
        });
        kGradientPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                kGradientPanel5MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                kGradientPanel5MousePressed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel25.setText("Nhân Viên");

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/login.png"))); // NOI18N

        javax.swing.GroupLayout kGradientPanel5Layout = new javax.swing.GroupLayout(kGradientPanel5);
        kGradientPanel5.setLayout(kGradientPanel5Layout);
        kGradientPanel5Layout.setHorizontalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel25)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        kGradientPanel5Layout.setVerticalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel5Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jLabel25)
                .addGap(36, 36, 36))
        );

        kGradientPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                kGradientPanel2MouseMoved(evt);
            }
        });
        kGradientPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                kGradientPanel2MousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                kGradientPanel2MouseExited(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel23.setText("Hội Viên");

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/group.png"))); // NOI18N

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel23)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        kGradientPanel13.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                kGradientPanel13MouseMoved(evt);
            }
        });
        kGradientPanel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                kGradientPanel13MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                kGradientPanel13MousePressed(evt);
            }
        });

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cinema (1).png"))); // NOI18N

        jLabel31.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        jLabel31.setText("Bán Thực Phẩm");

        javax.swing.GroupLayout kGradientPanel13Layout = new javax.swing.GroupLayout(kGradientPanel13);
        kGradientPanel13.setLayout(kGradientPanel13Layout);
        kGradientPanel13Layout.setHorizontalGroup(
            kGradientPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel13Layout.createSequentialGroup()
                .addGroup(kGradientPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel13Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel31))
                .addGap(45, 45, 45))
        );
        kGradientPanel13Layout.setVerticalGroup(
            kGradientPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel13Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel31)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        kGradientPanel12.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                kGradientPanel12MouseMoved(evt);
            }
        });
        kGradientPanel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                kGradientPanel12MousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                kGradientPanel12MouseExited(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel41.setText("HĐTP");

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/income.png"))); // NOI18N

        javax.swing.GroupLayout kGradientPanel12Layout = new javax.swing.GroupLayout(kGradientPanel12);
        kGradientPanel12.setLayout(kGradientPanel12Layout);
        kGradientPanel12Layout.setHorizontalGroup(
            kGradientPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel12Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel12Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(jLabel41)
                .addGap(56, 56, 56))
        );
        kGradientPanel12Layout.setVerticalGroup(
            kGradientPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel12Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel41)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        kGradientPanel14.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                kGradientPanel14MouseMoved(evt);
            }
        });
        kGradientPanel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                kGradientPanel14MousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                kGradientPanel14MouseExited(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel43.setText("Vé");

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/validating-ticket.png"))); // NOI18N

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/validating-ticket.png"))); // NOI18N

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/validating-ticket.png"))); // NOI18N

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/validating-ticket.png"))); // NOI18N

        javax.swing.GroupLayout kGradientPanel14Layout = new javax.swing.GroupLayout(kGradientPanel14);
        kGradientPanel14.setLayout(kGradientPanel14Layout);
        kGradientPanel14Layout.setHorizontalGroup(
            kGradientPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel14Layout.createSequentialGroup()
                .addGroup(kGradientPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel14Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel43))
                    .addGroup(kGradientPanel14Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(kGradientPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel14Layout.createSequentialGroup()
                                .addComponent(jLabel45)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel47))
                            .addGroup(kGradientPanel14Layout.createSequentialGroup()
                                .addComponent(jLabel44)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel46)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel14Layout.setVerticalGroup(
            kGradientPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel14Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(kGradientPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel44)
                    .addComponent(jLabel46))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel43)
                        .addGap(35, 35, 35))
                    .addGroup(kGradientPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel47)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kGradientPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kGradientPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kGradientPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kGradientPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kGradientPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                    .addComponent(kGradientPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(kGradientPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                    .addComponent(kGradientPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(kGradientPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(kGradientPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(kGradientPanel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(kGradientPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                        .addComponent(kGradientPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                        .addComponent(kGradientPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(kGradientPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE))
                    .addComponent(kGradientPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel8);
        jPanel8.setBounds(370, 110, 1170, 600);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel36.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 30)); // NOI18N
        jLabel36.setText("ABC CENIMA");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel36)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(470, 10, 240, 90);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ABCLOGO.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(400, 20, 60, 70);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(370, 0, 1170, 700);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1540, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_btn1MouseDragged

    private void btn1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseMoved
        // TODO add your handling code here:
        moveColor(btn1);
    }//GEN-LAST:event_btn1MouseMoved

    private void btn1MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_btn1MouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_btn1MouseWheelMoved

    private void btn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseExited
        // TODO add your handling code here:
        resetBtnColor(btn1);
    }//GEN-LAST:event_btn1MouseExited

    private void btn1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MousePressed
        // TODO add your handling code here:
        resetBtnColor(btn2);
        resetBtnColor(btn3);
        resetBtnColor(btn4);
        resetBtnColor(btn5);
        setBtnColor(btn1);
    }//GEN-LAST:event_btn1MousePressed

    private void btn2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2MouseMoved
        // TODO add your handling code here:
        moveColor(btn2);
    }//GEN-LAST:event_btn2MouseMoved

    private void btn2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2MouseExited
        // TODO add your handling code here:
        resetBtnColor(btn2);
    }//GEN-LAST:event_btn2MouseExited

    private void btn2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2MousePressed
        // TODO add your handling code here:
        resetBtnColor(btn1);
        resetBtnColor(btn3);
        resetBtnColor(btn4);
        resetBtnColor(btn5);
        setBtnColor(btn2);
    }//GEN-LAST:event_btn2MousePressed

    private void btn3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3MouseMoved
        // TODO add your handling code here:
        moveColor(btn3);
    }//GEN-LAST:event_btn3MouseMoved

    private void btn3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3MouseExited
        // TODO add your handling code here:
        resetBtnColor(btn3);
    }//GEN-LAST:event_btn3MouseExited

    private void btn3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3MousePressed
        // TODO add your handling code here:
        resetBtnColor(btn1);
        resetBtnColor(btn2);
        resetBtnColor(btn4);
        resetBtnColor(btn5);
        setBtnColor(btn3);
    }//GEN-LAST:event_btn3MousePressed

    private void btn4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4MouseMoved
        // TODO add your handling code here:
        moveColor(btn4);
    }//GEN-LAST:event_btn4MouseMoved

    private void btn4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4MouseExited
        // TODO add your handling code here:
        resetBtnColor(btn4);
    }//GEN-LAST:event_btn4MouseExited

    private void btn4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4MousePressed
        // TODO add your handling code here:
        resetBtnColor(btn1);
        resetBtnColor(btn2);
        resetBtnColor(btn3);
        resetBtnColor(btn5);
        setBtnColor(btn4);
    }//GEN-LAST:event_btn4MousePressed

    private void btn5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn5MouseMoved
        // TODO add your handling code here:
        moveColor(btn5);
    }//GEN-LAST:event_btn5MouseMoved

    private void btn5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn5MouseExited
        // TODO add your handling code here:
        resetBtnColor(btn5);
    }//GEN-LAST:event_btn5MouseExited

    private void btn5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn5MousePressed
        // TODO add your handling code here:
        resetBtnColor(btn1);
        resetBtnColor(btn2);
        resetBtnColor(btn3);
        resetBtnColor(btn4);
        setBtnColor(btn5);
    }//GEN-LAST:event_btn5MousePressed

    private void kGradientPanel10MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel10MouseMoved
        // TODO add your handling code here:
        newAnotherMoveColor(kGradientPanel10);
    }//GEN-LAST:event_kGradientPanel10MouseMoved

    private void kGradientPanel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel10MouseExited
        // TODO add your handling code here:
        newAnotherResetColor(kGradientPanel10);
    }//GEN-LAST:event_kGradientPanel10MouseExited

    private void kGradientPanel10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel10MousePressed
        newPressAnotherColor(kGradientPanel10);
        if (maquyen.equalsIgnoreCase("PQ00001") || maquyen.equalsIgnoreCase("PQ00004")) {
            SuatChieuUI ui = new SuatChieuUI(maquyen, manhanvien);
            ui.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Bạn không có quyền truy cập chức năng này");
        }

    }//GEN-LAST:event_kGradientPanel10MousePressed

    private void kGradientPanel9MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel9MouseMoved
        // TODO add your handling code here:
        newAnotherMoveColor(kGradientPanel9);
    }//GEN-LAST:event_kGradientPanel9MouseMoved

    private void kGradientPanel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel9MouseExited
        // TODO add your handling code here:
        newAnotherResetColor(kGradientPanel9);
    }//GEN-LAST:event_kGradientPanel9MouseExited

    private void kGradientPanel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel9MousePressed
        newPressAnotherColor(kGradientPanel9);
        if (maquyen.equalsIgnoreCase("PQ00001") || maquyen.equalsIgnoreCase("PQ00006")) {
            dispose();
            ListBaoCaoUI ui = new ListBaoCaoUI(maquyen, manhanvien);
            ui.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Bạn không có quyền truy cập chức năng này");
        }
    }//GEN-LAST:event_kGradientPanel9MousePressed

    private void kGradientPanel8MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel8MouseMoved
        // TODO add your handling code here:
        newAnotherMoveColor(kGradientPanel8);
    }//GEN-LAST:event_kGradientPanel8MouseMoved

    private void kGradientPanel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel8MouseExited
        // TODO add your handling code here:
        newAnotherResetColor(kGradientPanel8);
    }//GEN-LAST:event_kGradientPanel8MouseExited

    private void kGradientPanel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel8MousePressed
        newPressAnotherColor(kGradientPanel8);
        if (maquyen.equalsIgnoreCase("PQ00001") || maquyen.equalsIgnoreCase("PQ00004")) {
            dispose();
            BanVeUI ui = new BanVeUI();
            ui.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Bạn không có quyền truy cập chức năng này");
        }

    }//GEN-LAST:event_kGradientPanel8MousePressed

    private void kGradientPanel7MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel7MouseMoved
        // TODO add your handling code here:
        newAnotherMoveColor(kGradientPanel7);
    }//GEN-LAST:event_kGradientPanel7MouseMoved

    private void kGradientPanel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel7MouseExited
        // TODO add your handling code here:
        newAnotherResetColor(kGradientPanel7);
    }//GEN-LAST:event_kGradientPanel7MouseExited

    private void kGradientPanel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel7MousePressed
        newPressAnotherColor(kGradientPanel7);
        if (maquyen.equalsIgnoreCase("PQ00001") || maquyen.equalsIgnoreCase("PQ00005")) {
            dispose();
            ThucAnUI ui = new ThucAnUI(maquyen, manhanvien);
            ui.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Bạn không có quyền truy cập chức năng này");
        }
    }//GEN-LAST:event_kGradientPanel7MousePressed

    private void kGradientPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel1MouseMoved
        // TODO add your handling code here:
        newAnotherMoveColor(kGradientPanel1);
    }//GEN-LAST:event_kGradientPanel1MouseMoved

    private void kGradientPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_kGradientPanel1MouseClicked

    private void kGradientPanel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel1MouseExited
        // TODO add your handling code here:
        newAnotherResetColor(kGradientPanel1);

    }//GEN-LAST:event_kGradientPanel1MouseExited

    private void kGradientPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel1MousePressed
        newPressAnotherColor(kGradientPanel1);
        if (maquyen.equalsIgnoreCase("PQ00001") || maquyen.equalsIgnoreCase("PQ00004")) {
            PhimUI ui = new PhimUI(maquyen, manhanvien);
            dispose();
            ui.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Bạn không có quyền truy cập chức năng này");
        }
    }//GEN-LAST:event_kGradientPanel1MousePressed

    private void kGradientPanel5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel5MouseMoved
        // TODO add your handling code here:
        newAnotherMoveColor(kGradientPanel5);
    }//GEN-LAST:event_kGradientPanel5MouseMoved

    private void kGradientPanel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel5MouseExited
        // TODO add your handling code here:
        newAnotherResetColor(kGradientPanel5);
    }//GEN-LAST:event_kGradientPanel5MouseExited

    private void kGradientPanel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel5MousePressed
        newPressAnotherColor(kGradientPanel5);
        if (maquyen.equalsIgnoreCase("PQ00001")) {
            NhanVienUI ui = new NhanVienUI(maquyen, manhanvien);
            dispose();
            ui.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Bạn không có quyền truy cập chức năng này");
        }
    }//GEN-LAST:event_kGradientPanel5MousePressed

    private void kGradientPanel2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel2MouseMoved
        // TODO add your handling code here:
        newAnotherMoveColor(kGradientPanel2);
    }//GEN-LAST:event_kGradientPanel2MouseMoved

    private void kGradientPanel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel2MouseExited
        // TODO add your handling code here:
        newAnotherResetColor(kGradientPanel2);
    }//GEN-LAST:event_kGradientPanel2MouseExited

    private void kGradientPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel2MousePressed
        newPressAnotherColor(kGradientPanel2);
        if (maquyen.equalsIgnoreCase("PQ00001")) {
            dispose();
            KhachHangUI ui = new KhachHangUI(maquyen, manhanvien);
            ui.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Bạn không có quyền truy cập chức năng này");
        }
    }//GEN-LAST:event_kGradientPanel2MousePressed

    private void kGradientPanel13MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel13MouseMoved
        newAnotherMoveColor(kGradientPanel13);
    }//GEN-LAST:event_kGradientPanel13MouseMoved

    private void kGradientPanel13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel13MouseExited
         newAnotherResetColor(kGradientPanel13);
    }//GEN-LAST:event_kGradientPanel13MouseExited

    private void kGradientPanel13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel13MousePressed
        newPressAnotherColor(kGradientPanel13);
        if (maquyen.equalsIgnoreCase("PQ00001") || maquyen.equalsIgnoreCase("PQ00005")) {
            dispose();
            BanThucAnUI ui = new BanThucAnUI(maquyen, manhanvien);
            ui.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Bạn không có quyền truy cập chức năng này");
        }
    }//GEN-LAST:event_kGradientPanel13MousePressed

    private void kGradientPanel12MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel12MouseMoved
        // TODO add your handling code here:
        newAnotherMoveColor(kGradientPanel12);
    }//GEN-LAST:event_kGradientPanel12MouseMoved

    private void kGradientPanel12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel12MousePressed
        // TODO add your handling code here:
        newPressAnotherColor(kGradientPanel12);
        if (maquyen.equalsIgnoreCase("PQ00001") || maquyen.equalsIgnoreCase("PQ00005")) {
            dispose();
            HoaDonUI ui = new HoaDonUI(maquyen, manhanvien);
            ui.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Bạn không có quyền truy cập chức năng này");
        }
    }//GEN-LAST:event_kGradientPanel12MousePressed

    private void kGradientPanel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel12MouseExited
        // TODO add your handling code here:
         newAnotherResetColor(kGradientPanel12);
    }//GEN-LAST:event_kGradientPanel12MouseExited

    private void kGradientPanel14MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel14MouseMoved
        // TODO add your handling code here:
        newAnotherMoveColor(kGradientPanel14);
    }//GEN-LAST:event_kGradientPanel14MouseMoved

    private void kGradientPanel14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel14MousePressed
        // TODO add your handling code here:
        newPressAnotherColor(kGradientPanel14);
        if (maquyen.equalsIgnoreCase("PQ00001") || maquyen.equalsIgnoreCase("PQ00004")) {
            dispose();
            VeUI ui = new VeUI(maquyen, manhanvien);
            ui.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Bạn không có quyền truy cập chức năng này");
        }
    }//GEN-LAST:event_kGradientPanel14MousePressed

    private void kGradientPanel14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel14MouseExited
        // TODO add your handling code here:
        newAnotherResetColor(kGradientPanel14);
    }//GEN-LAST:event_kGradientPanel14MouseExited

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
            java.util.logging.Logger.getLogger(HomeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn1;
    private javax.swing.JPanel btn2;
    private javax.swing.JPanel btn3;
    private javax.swing.JPanel btn4;
    private javax.swing.JPanel btn5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel10;
    private keeptoo.KGradientPanel kGradientPanel11;
    private keeptoo.KGradientPanel kGradientPanel12;
    private keeptoo.KGradientPanel kGradientPanel13;
    private keeptoo.KGradientPanel kGradientPanel14;
    private keeptoo.KGradientPanel kGradientPanel2;
    private keeptoo.KGradientPanel kGradientPanel3;
    private keeptoo.KGradientPanel kGradientPanel4;
    private keeptoo.KGradientPanel kGradientPanel5;
    private keeptoo.KGradientPanel kGradientPanel7;
    private keeptoo.KGradientPanel kGradientPanel8;
    private keeptoo.KGradientPanel kGradientPanel9;
    // End of variables declaration//GEN-END:variables
}
