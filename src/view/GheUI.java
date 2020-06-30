/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.GheController;
import entity.Ghe;
import view.BanVeUI;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.ArrayList;
import static java.util.Objects.toString;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import keeptoo.KGradientPanel;
import org.w3c.dom.css.RGBColor;

/**
 *
 * @author admin
 */
public class GheUI extends JFrame {

    public static String mave;
    private int count = 0;
    public static String kn_soghe;
    public static int kn_giave;
    public int arrgiave[][] = new int[8][8];
    JFrame f = new JFrame();
    JButton[][] btnArray = new JButton[8][8];
    int size = 8;
    int i = 1;

    JPanel panel = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();

    KGradientPanel kgPanel = new KGradientPanel();

    JLabel left = new JLabel();
    JLabel right = new JLabel();
    JLabel center = new JLabel();

    JButton btnRs = new JButton("Back");
    JButton btnNext = new JButton("Next");

    private void ThemGhe() {
        /*panel cho screen cenima*/
        String font = "Arial Rounded MT Bold";

        ImageIcon iconScreen = new ImageIcon("image/concert2.png");

        /*Screen Cenima*/
        panel3.setBounds(150, 0, 900, 140);
        panel3.setLayout(null);

        left.setBounds(0, 0, 128, 128);
        left.setIcon(iconScreen);

        right.setBounds(900 - 128, 0, 128, 128);
        right.setIcon(iconScreen);

        center.setText("Screen Cenima");
        center.setFont(new Font(font, Font.BOLD, 48));
        center.setBounds(150 + 107, 0, 430, 105);

        kgPanel.setBounds(150 + 50, 10 + 105, 500, 5);
        kgPanel.setkEndColor(new Color(204, 204, 255));
        kgPanel.setkStartColor(new Color(153, 153, 255));

        panel3.add(left);
        panel3.add(right);
        panel3.add(center);
        panel3.add(kgPanel);

        /*Ghe*/
        panel.setBounds(150, 170, 800 / 2, 550);
        panel.setLayout(new GridLayout(8, 8, 40, 5));
        panel2.setBounds(650, 170, 400, 550);
        panel2.setLayout(new GridLayout(8, 8, 40, 5));

        /*Reset Đã đặt*/
        //btnRs.addActionListener(this);
        //btnRs.setActionCommand("resetbtn");
        btnRs.setBounds(10, 720, 100, 30);
        /*Chọn và đặt ghế, chuyển sang thanh toán, hoàn tất đặt ghế*/
        //btnNext.addActionListener(this);
        //btnNext.setActionCommand("Nextbtn");
        btnNext.setBounds(1070, 720, 100, 30);

        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {

                btnArray[r][c] = new JButton();
                btnArray[r][c].setText("" + i++);
                btnArray[r][c].setBackground(Color.WHITE);
                btnArray[r][c].setPreferredSize(new Dimension(10, 10));
                //btnArray[r][c].addMouseListener(this);

                if (c <= size / 2 - 1) {
                    panel.add(btnArray[r][c]);

                } else {
                    panel2.add(btnArray[r][c]);
                }

            }
        }

        /*Làm hết rồi mới thêm từng cái panel vô - panel ghế trái - panel ghế phải - panel screen*/
        f.setSize(1200, 800);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.add(panel);
        f.add(panel2);
        f.add(panel3);
        f.add(btnRs);
        f.add(btnNext);
        f.setVisible(true);
    }

    public GheUI(String masuatchieu) {
        f.setSize(1300, 900);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        ThemGhe();
        LoadGhe();
        addEvent();

    }

    private void LoadGhe() {
        try {
            ArrayList<Ghe> arr = GheController.taiTatCa(BanVeUI.kt_masuatchieu);
            for (Ghe item : arr) {
                for (int r = 0; r < size; r++) {
                    for (int c = 0; c < size; c++) {
                        if (btnArray[r][c].getText().equals(item.getMaghe())) {
                            btnArray[r][c].setEnabled(false);
                            btnArray[r][c].setBackground(Color.DARK_GRAY);
                            btnArray[r][c].setForeground(Color.BLACK);
                        }
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private void addEvent() {
        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                btnArray[r][c].addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent e) {

                    }

                    @Override
                    public void mousePressed(MouseEvent e) {
                        for (int r = 0; r < size; r++) {
                            for (int c = 0; c < size; c++) {
                                if (e.getSource() == btnArray[r][c] && btnArray[r][c].getBackground() == Color.WHITE) {
                                    //btnArray[r][c].setEnabled(false);
                                    btnArray[r][c].setBackground(Color.RED);
                                    btnArray[r][c].setForeground(new Color(255, 255, 255));
                                    try {
                                        setgiave(BanVeUI.kt_masuatchieu);
                                    } catch (SQLException ex) {
                                        JOptionPane.showMessageDialog(null, ex.getMessage());
                                    }
                                    JOptionPane.showMessageDialog(null, arrgiave[r][c]);
                                    setCount(count + 1);

                                } else if (e.getSource() == btnArray[r][c] && btnArray[r][c].getBackground() == Color.RED) {
                                    btnArray[r][c].setBackground(Color.WHITE);
                                    btnArray[r][c].setForeground(Color.BLACK);
                                    setCount(count - 1);
                                }
                            }
                        }
                    }

                    @Override
                    public void mouseReleased(MouseEvent e) {

                    }

                    @Override
                    public void mouseEntered(MouseEvent e) {

                    }

                    @Override
                    public void mouseExited(MouseEvent e) {

                    }
                });
            }
        }

        btnRs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                BanVeUI a=new BanVeUI();
                a.setVisible(true);
            }
        });

        btnNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timghe();
                if (count > 1) {
                    JOptionPane.showMessageDialog(null, "Chỉ được chọn một ghế");
                } else {
                    xuLyLuu();
                    dispose();
                    ChiTietVeUI ui = new ChiTietVeUI();
                    ui.setVisible(true);
                }
            }
        });
    }

    public void timghe() {
        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                if (btnArray[r][c].getBackground() == Color.RED) {
                    kn_soghe = btnArray[r][c].getText();
                    kn_giave = arrgiave[r][c];

                }
            }

        }
    }

    private void xuLyLuu() {
        int soghe = Integer.parseInt(kn_soghe);
        Ghe tam = null;
        String maghe;
        try {
            tam = GheController.timKiemGhe(BanVeUI.kt_maphong, soghe);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ghe sai");
        }

        try {
            mave = GheController.hienMa();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "sai ma ghe");
        }

        maghe = tam.getMaghe();
        try {
            int ketqua = GheController.themVe(mave, BanVeUI.kt_masuatchieu, LoginUI.kn_manhanvien, BanVeUI.kt_makhachhang, maghe, kn_giave);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "khong them duoc");
        }
    }

    public void setgiave(String masuatchieu) throws SQLException {
        int giave = GheController.giave(masuatchieu);
        for (int r = 0; r < size; r++) {
            arrgiave[r][3] = giave + 15000;
            arrgiave[r][4] = giave + 15000;
            arrgiave[r][2] = giave + 10000;
            arrgiave[r][5] = giave + 10000;
            arrgiave[r][1] = giave + 5000;
            arrgiave[r][6] = giave + 5000;
            arrgiave[r][7] = giave;
            arrgiave[r][0] = giave;
        }
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public static void main(String[] args) {
        GheUI gheUI = new GheUI(BanVeUI.kt_masuatchieu);
    }

}
