package apackage.bswing;

import javax.swing.*;

/****author lxlone1913@163.com
 ***Persistence is Victory
 */

public class SwingDemo001 {
    private static void creatAndShowGUI() {
        JFrame myfram = new JFrame("A simple Swing Application");
        myfram.setSize(275, 100);
        myfram.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        JLabel jLabel = new JLabel("hello java GUI.");
        myfram.getContentPane().add(jLabel);
        myfram.setVisible(true);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                creatAndShowGUI();
            }
        });
    }

}


