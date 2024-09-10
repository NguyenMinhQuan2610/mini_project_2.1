/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Demo;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Administrator
 */
public class TinhToanDonGian extends JFrame {

    private JLabel lb1, lb2, lb3;
    private JTextField txtso1, txtso2, txtso3;
    private JButton btncong, btntru, btnnhan, btnchia;

    public TinhToanDonGian() {
        setTitle("Tính toán đơn giản");
        taoGiaoDien();
        pack();
        setLocationRelativeTo(null);

    }

    private void taoGiaoDien() {
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(3, 2, 5, 5));
        p1.add(lb1 = new JLabel("Số 1"));
        p1.add(txtso1 = new JTextField());
        p1.add(lb2 = new JLabel("Số 2"));
        p1.add(txtso2 = new JTextField());
        p1.add(lb3 = new JLabel("Kết quả"));
        p1.add(txtso3 = new JTextField());

        JPanel p2 = new JPanel();
        p2.add(btncong = new JButton("Cộng"));
        p2.add(btntru = new JButton("Trừ"));
        p2.add(btnnhan = new JButton("Nhân"));
        p2.add(btnchia = new JButton("Chia"));
        
        setLayout(new BorderLayout());
        add(p1,BorderLayout.CENTER);
        add(p2,BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        TinhToanDonGian tt=new TinhToanDonGian();
        tt.setVisible(true);
    }

}
