package apackage.bswing;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

/****author lxlone1913@163.com
 ***Persistence is Victory
 */

public class BoxLayout {

    public static void main(String[] args) {

        Frame frame = new Frame("zhi li che shi boxlayout");


        frame.setBounds(400,400,500,300);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }

            @Override
            public void windowClosed(WindowEvent e) {
                super.windowClosed(e);
            }

            @Override
            public void windowActivated(WindowEvent e) {
                super.windowActivated(e);
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                super.windowDeactivated(e);
            }
        });



        javax.swing.BoxLayout boxLayout =
                new javax.swing.BoxLayout
                        (frame, javax.swing.BoxLayout.Y_AXIS);
        frame.setLayout((LayoutManager) boxLayout);
    frame.add(new Button("comand1"));
    frame.add(new Button("comand2"));
    frame.pack();
    frame.setVisible(true);





    }


}
