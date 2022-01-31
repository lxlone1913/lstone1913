package apackage.bswing;

import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout;

/****author lxlone1913@163.com
 ***Persistence is Victory
 */

public class BoxTest {
    public static void main(String[] args) {

        Frame frame = new Frame("zhi shi a Box");
        Box horizontalBox = Box.createHorizontalBox();
    horizontalBox.add(new Button("com1"));
    horizontalBox.add(new Button("com2"));
        Box verticalBox = Box.createVerticalBox();
verticalBox.add(new Button("com3"));
verticalBox.add(new Button("com4"));

frame.add(horizontalBox, BorderLayout.NORTH);
frame.add(verticalBox, BorderLayout.CENTER);

frame.pack();
frame.setVisible(true);


    }


}
