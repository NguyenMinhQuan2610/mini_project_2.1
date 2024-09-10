/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Demo;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Administrator
 */
public class MayTinhDonGian extends JFrame {

    private JTextField txtDisPlay;
    private JButton btReset;
    private JButton[] bt = new JButton[16];
    private String[] str = {"7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "*", "0", ".", "=", "/"};

    public MayTinhDonGian() {
        setTitle("Máy Tính");
        TaoGiaoDien();
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void TaoGiaoDien() {
        JPanel p1=new JPanel();
        p1.add(txtDisPlay=new JTextField());
        p1.add(btReset=new JButton("C"));
        
        JPanel p2=new JPanel();
        p2.setLayout(new GridLayout(4,4,5,5));
        for(int i=0;i<bt.length;i++){
            bt[i]=new JButton(str[i]);
            p2.add(bt[i]);
        }
        
        setLayout(new BorderLayout());
        add(p1,BorderLayout.NORTH);
        add(p2,BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        MayTinhDonGian mt=new MayTinhDonGian();
        mt.setVisible(true);
    }

}
