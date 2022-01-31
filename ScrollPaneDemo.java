package apackage.bswing;

import java.awt.*;

/****author lxlone1913@163.com
 ***Persistence is Victory
 */

public class ScrollPaneDemo {
    public static void main(String[] args) {

        Frame frame = new Frame("my scroll pane");
        Panel p = new Panel();

        p.add(new Button("java java!!!!!!!!!!!"));
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 30));
        for (int i = 0; i < 100; i++) {
            frame.add(new Button(" an niu" + i));
        }
        ScrollPaneDemo sp = new ScrollPaneDemo();
        frame.setBounds(100, 100, 500, 300);
        frame.setVisible(true);

    }

}
