package apackage.bswing;

import javax.swing.*;
import java.awt.*;

/****author lxlone1913@163.com
 ***Persistence is Victory
 */

public class PanelDemo {
    public static void main(String[] args) {

        Frame frame = new Frame("my window chang kou");
        Panel p = new Panel();
p.add(new TextField("jjjjjjjj"));
p.add(new Button("zhi li shi yi ge che shi an nu!!!!"));
frame.add(p);
frame.setBounds(100,100,110,110);
frame.setVisible(true);
frame.pack();





    }







}
