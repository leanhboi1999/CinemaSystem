/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.GheController;
import entity.Ghe;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import keeptoo.KGradientPanel;

/**
 *
 * @author admin
 */
public class GheUI extends JFrame implements MouseListener, ActionListener {
    private static String masuatchieu;
    private static int count = 0;

    /*private static void hienThi() {
        try {
            ArrayList<Ghe> arr = GheController.taiTatCa(masuatchieu);
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
    }*/
    
    JFrame f = new JFrame();
    JButton[][] btnArray = new JButton[8][8];
    int size = 8;
    int i = 1;

    JPanel panel = new JPanel();
    JPanel panel2 = new JPanel();

    KGradientPanel kgPanel = new KGradientPanel();

    /*panel cho screen cenima*/
    String font = "Arial Rounded MT Bold";
    JPanel panel3 = new JPanel();

    JLabel left = new JLabel();
    ImageIcon iconScreen = new ImageIcon("image/concert2.png");

    JLabel right = new JLabel();

    JLabel center = new JLabel();

    public GheUI() {
        f.setSize(1200, 800);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.setLayout(null);
        f.setExtendedState(this.MAXIMIZED_BOTH);

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
        JButton btnRs = new JButton("Reset");
        btnRs.addActionListener(this);
        btnRs.setActionCommand("resetbtn");
        btnRs.setBounds(1070, 720, 100, 30);

        /*Chọn và đặt ghế, chuyển sang thanh toán, hoàn tất đặt ghế*/
        JButton btnNext = new JButton("Next");
        btnNext.addActionListener(this);
        btnNext.setActionCommand("Nextbtn");
        btnNext.setBounds(10, 720, 100, 30);

        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {

                btnArray[r][c] = new JButton();

                btnArray[r][c].setText("" + i++);
                btnArray[r][c].setBackground(Color.WHITE);
                btnArray[r][c].setPreferredSize(new Dimension(10, 10));
                btnArray[r][c].addMouseListener(this);

                if (c <= size / 2 - 1) {
                    panel.add(btnArray[r][c]);

                } else {
                    panel2.add(btnArray[r][c]);
                }

            }
        }

        /*Làm hết rồi mới thêm từng cái panel vô - panel ghế trái - panel ghế phải - panel screen*/
        f.add(panel);
        f.add(panel2);
        f.add(panel3);
        f.add(btnRs);
        f.add(btnNext);
    }


    /*@Override
    public void actionPerformed(ActionEvent e) {

        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                if (e.getSource() == btnArray[r][c]) {
                    //btnArray[r][c].setEnabled(false);
                    btnArray[r][c].setBackground(Color.RED);
                    btnArray[r][c].setForeground(new Color(255, 255, 255));
                }
            }
        }

        if ("resetbtn".equals(e.getActionCommand())) {
            for (int r = 0; r < size; r++) {
                for (int c = 0; c < size; c++) {
                    btnArray[r][c].setEnabled(true);
                    btnArray[r][c].setBackground(null);
                    btnArray[r][c].setForeground(Color.BLACK);
                }
            }
        }
    }*/
    public static void main(String[] args) {
        new GheUI();
        //hienThi();
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("resetbtn".equals(e.getActionCommand())) {
            for (int r = 0; r < size; r++) {
                for (int c = 0; c < size; c++) {
                    btnArray[r][c].setEnabled(true);
                    btnArray[r][c].setBackground(Color.WHITE);
                    btnArray[r][c].setForeground(Color.BLACK);
                }
            }
        }

        if ("Nextbtn".equals(e.getActionCommand())) {
            for (int r = 0; r < size; r++) {
                for (int c = 0; c < size; c++) {
                    if (btnArray[r][c].getBackground() == Color.RED) {
                        btnArray[r][c].setEnabled(false);
                        btnArray[r][c].setBackground(Color.DARK_GRAY);
                        btnArray[r][c].setForeground(Color.BLACK);
                    }
                }
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        /*for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                if (e.getSource() == btnArray[r][c] && (e.getClickCount() + 1) % 2 == 0) {
                    //btnArray[r][c].setEnabled(false);
                    btnArray[r][c].setBackground(Color.RED);
                    btnArray[r][c].setForeground(new Color(255, 255, 255));
                } else if (e.getSource() == btnArray[r][c] && e.getClickCount() % 2 == 0) {
                    btnArray[r][c].setBackground(null);
                    btnArray[r][c].setForeground(Color.BLACK);
                }
            }
        }*/
        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                if (e.getSource() == btnArray[r][c] && btnArray[r][c].getBackground() == Color.WHITE) {
                    //btnArray[r][c].setEnabled(false);
                    btnArray[r][c].setBackground(Color.RED);
                    btnArray[r][c].setForeground(new Color(255, 255, 255));
                    setCount(- 1);

                } else if (e.getSource() == btnArray[r][c] && btnArray[r][c].getBackground() == Color.RED) {
                    btnArray[r][c].setBackground(Color.WHITE);
                    btnArray[r][c].setForeground(Color.BLACK);
                    setCount(+1);
                }
            }
        }

    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        GheUI.count = count;
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

}
